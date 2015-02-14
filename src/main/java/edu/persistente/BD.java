package edu.persistente;

import java.util.ArrayList;
import java.util.List;

import edu.dto.Solicitud;

public class BD {

	public static List<Solicitud> solicitudes;
	public static List<Integer> idsSolicitudes;
	
	{
		solicitudes = new ArrayList<Solicitud>();
		idsSolicitudes= new ArrayList<Integer>();
		
	}
}
