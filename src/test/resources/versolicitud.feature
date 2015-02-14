Feature:
  Como cliente
  quiero visualizar la información de una solicitud
  para revisar el estado en que se encuentra

  Scenario:
    Given estoy en la pantalla ver solicitud
    When y recibo el identificador "idSolicitud", "titulo", "descripcion"
    Then visualizo los datos en la pantalla
    
 


    