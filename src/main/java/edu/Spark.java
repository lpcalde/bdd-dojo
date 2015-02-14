package edu;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class Spark {

    public static void main(String[] args) {

    	get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Creación de Solicitudes");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());
    	
    	post("/versolicitud", (request, response) -> {
        	
        	String area = request.queryParams("area");
        	String titulo = request.queryParams("titulo");
        	String descripcion = request.queryParams("descripcion");
        	        	
        	Map<String, Object> model = new HashMap<>();
       		model.put("area", area);
       		model.put("titulo", titulo);
       		model.put("descripcion", descripcion);
       		return new ModelAndView(model, "versolicitud.wm");
            
        }, new VelocityTemplateEngine());

    }

}
