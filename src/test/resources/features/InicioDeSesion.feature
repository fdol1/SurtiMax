Feature: Realizar el inicio de sesion en la app
  Como usuario de la app quiero realizar
  una autenticacion con mis credenciales

  @InicioDeSesion
  Scenario Outline: Intento de autenticacion, caso exitoso
    Given Juan abre la app de SurtiMax
    And Iniciar sesion con sus datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    Then Verifica el mensaje en el menu principal: Fuerza de Venta
    Examples:
      | usuario | clave |
      | 0969947002    | 0969947002  |