Feature:
  Como cliente
  quiero visualizar la información de una solicitud
  para revisar el estado en que se encuentra

  Scenario:
    Given estoy en la pantalla ver solicitud
    When y recibo el identificador "idSolicitud"
    Then valido que el identificador "idSolicitud" no este vacio
    
  Scenario:
    Given estoy en la pantalla ver solicitud
    When y recibo el identificador "idSolicitud"
    Then verifico que "idSolicitud" exista en la lista de solicitudes
    


    