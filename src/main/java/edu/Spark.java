package edu;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.model.Model;
import edu.dto.Solicitud;
import static spark.Spark.get;
import static spark.Spark.post;

public class Spark {

    public static void main(String[] args) {

    	get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Bienvenidos al sistema de tickets");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());
    	
    	get("/crearSolicitud", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Creación de Solicitudes");
            return new ModelAndView(model, "crearsolicitud.wm");
        }, new VelocityTemplateEngine());
    	
    	get("/solicitudesRegistradas", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Creación de Solicitudes");
            return new ModelAndView(model, "solicitudesRegistradas.wm");
        }, new VelocityTemplateEngine());
    	
    	post("/versolicitud", (request, response) -> {
        	
        	String area = request.queryParams("area");
        	String titulo = request.queryParams("titulo");
        	String descripcion = request.queryParams("descripcion");
        	        	
        	Model m = new Model();
        	Integer idSolicitud=m.createSolicitud(area, titulo, descripcion);
        	
        	
        	Map<String, Object> model = new HashMap<>();
        	
        	if(idSolicitud != null){
	        	model.put("tituloSolicitud", "Información de la solicitud");
	        	model.put("idSolicitud", idSolicitud);
	       		model.put("area", area);
	       		model.put("titulo", titulo);
	       		model.put("descripcion", descripcion);
        	}else{
        		model.put("mensaje", "La solicitud no fue creada.");
        		
        	}
       		return new ModelAndView(model, "versolicitud.wm");
            
        }, new VelocityTemplateEngine()); 
    	
    	
    	get("/verlistado", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            
            Model m = new Model();
            List<Solicitud> listado = m.getSolicitudes(); 
            
            model.put("welcome", "Listado de Solicitudes");
            
            if(listado.isEmpty()){
            	model.put("mensaje", "No hay solicitudes registradas.");
            }else{
            	model.put("listado", listado);
            }
            
            
            return new ModelAndView(model, "listadosolicitudes.wm");
        }, new VelocityTemplateEngine());

    }

}
