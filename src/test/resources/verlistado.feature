Feature:
	como administrador del sistema de tickets
	quiero visualizar el listado de solicitudes
	para revisar el estado en que se encuentran dichas solicitudes
	
Scenario: Visualizar solicitud 
	Given en la pantalla principal
	When presiono en el item "ver Solicitudes"	
	Then visualizo las solicitudes registradas con su respectivo titulo, descripcion y estado
	
