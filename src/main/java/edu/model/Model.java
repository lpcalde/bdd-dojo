package edu.model;

import edu.dto.Solicitud;
import edu.persistente.BD;

public class Model {

	public Solicitud getSolicitud(String idSolicitud){		
		
		
		return null;
	}
	
	public Integer createSolicitud(String area, String titulo, String descripcion){
		try{
				
			int idSolicitud=getNextIdSolicitud();
			Solicitud solicitud=new Solicitud();
			solicitud.setIdSolicitud(idSolicitud);
			solicitud.setArea(area);
			solicitud.setTitulo(titulo);
			solicitud.setDescripcion(descripcion);
			
			BD.addSolicitud(solicitud);
			
			return idSolicitud;
		
		}catch(Exception e){
			return null;
		}
		
	}
	
	public int getNextIdSolicitud(){
		int id=	BD.getIdsSolicitudes().size()+1;
		BD.addIdSolicitud(id);
		return id;
	}
}
