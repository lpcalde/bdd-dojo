Feature:
	como cliente del sistema de tickets
	quiero crear una solicitud
	para que sea revisada para su estimación de tiempos y solución
	
Scenario: Crear solicitud
	Given creo una solicitud
	When seleccione el area que involucra la solucion "TI" 
	And ingrese el titulo de la solicitud "Instalación de App xy"
	And digitar la descripcion de la solicitud "Requiero la instalacion en mi equipo la aplicacion xy"
	Then se registrara el ticket
	
