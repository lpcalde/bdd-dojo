Feature:
	como cliente del sistema de tickets
	quiero ingresar al sistema de tickets
	para registrar una solicitud o visualizar solicitudes creadas
	
Scenario: Bienvenida al sistema de tickets
	Given ingreso al sistema de tickets
	When deseo ingresar al sistema 
	Then visualizar "Bienvenidos al sistema de tickets" y "Crear Solicitud" y "Ver Solicitudes Registradas"
	
