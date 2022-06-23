Feature: Realizar un pedido en la app
  Como usuario de la app quiero realizar
  un pedido

  @RealizarPedido
  Scenario Outline: Intento de pedido, caso exitoso
    Given Juan abre la app de SurtiMax
    And Iniciar sesion con sus datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    When realiza un pedido en la app
    Examples:
      | usuario    | clave       |
      | 0969947002 | 0969947002  |