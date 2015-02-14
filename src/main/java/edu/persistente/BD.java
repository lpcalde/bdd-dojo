package edu.persistente;

import java.util.ArrayList;
import java.util.List;

import edu.dto.Solicitud;

public class BD {

	private static List<Solicitud> solicitudes;
	private static List<Integer> idsSolicitudes;

	public static List<Solicitud> getSolicitudes() {
		if (solicitudes == null) {
			solicitudes = new ArrayList<Solicitud>();
		}
		return solicitudes;
	}

	public static List<Integer> getIdsSolicitudes() {
		if (idsSolicitudes == null) {
			idsSolicitudes = new ArrayList<Integer>();
		}
		return idsSolicitudes;
	}

	public static void addSolicitud(Solicitud solicitud) {
		getSolicitudes().add(solicitud);

	}

	public static void addIdSolicitud(Integer id) {
		getIdsSolicitudes().add(id);

	}
}
