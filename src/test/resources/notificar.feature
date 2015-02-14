Feature:
  Como agente disparador
  quiero enviar una notificación del registro de una solicitud
  para informar al cliente los datos de la solicitud registrados

  Scenario: envio correo con notificación de registro de una solicitud
    Given soy un agente disparador a la espera de peticiones
    When recibo los datos de una nueva solicitud
    Then construyo el mensaje de la notificación
    And busco el correo electronico del cliente de la solicitud
    And envio el mensaje construido al correo electronico
