Feature: Realizar una nota de credito en la app
  Como usuario de la app quiero realizar
  un nota de credito

  @RealizarNotaCredito
  Scenario Outline: Intento de nota de credito, caso exitoso
    Given Juan abre la app de SurtiMax
    And Iniciar sesion con sus datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    When realiza una nota de credito en la app
    Examples:
      | usuario    | clave       |
      | 0969947002 | 0969947002  |