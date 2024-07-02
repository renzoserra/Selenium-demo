Feature: Boton ordenar de mayor a menor

  @swagLab
  Scenario: Validar comportamiento delbotón ordenar items de mayor a menor
    Given Ingreso a la web "https://www.saucedemo.com/"
    When Ingreso credenciales validas "standard_user" y "secret_sauce"
    And  Presiono boton login
    Then  Visualizo que estoy en la web con el endpoint "inventory"
    And   Hago click en el boton "Price (high to low)"
    And   Visualizo listado de productos ordenados por precios de mayor a menor