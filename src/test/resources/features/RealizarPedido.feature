Feature: Realizar un pedido en la app
  Como usuario de la app quiero realizar
  un pedido

  @RealizarPedido
  Scenario Outline: Intento de pedido, caso exitoso
    Given Juan abre la app de SurtiMax
    And Iniciar sesion con sus datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    When realiza un pedido en la app con la info del pedido
      | observacion   | fecha   |
      | <observacion> | <fecha> |
    Then al finalizar el pedido, ve su nombre en la pantalla de cliente
      | nombreCliente   |
      | <nombreCliente> |
    Examples:
      | usuario    | clave       | observacion        | fecha         | nombreCliente             |
      | 0969947002 | 0969947002  | esto es una prueba | 24 junio 2022 | HERRERA HINCAPIE MAURICIO |