package edu;

import org.junit.Assert;
import org.junit.Test;

import edu.model.Model;

public class SupportDeskTest {

	
	@Test
	public void crearSolicitudUno(){
		crearSolicitud(1,"area1","titulo1","descripcion1");
	}
	
	@Test
	public void crearSolicituddos(){
		crearSolicitud(2,"area2","titulo2","descripcion2");
	}
	
    
    public void crearSolicitud(Integer idEsperado,String area, String titulo, String descripcion){
    	Model m= new Model();
    	Integer result =m.createSolicitud(area, titulo, descripcion);
    	
    	Assert.assertNotEquals(null, result);
    	Assert.assertEquals(idEsperado, result);
    }
   

}
