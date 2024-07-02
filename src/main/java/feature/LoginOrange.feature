Feature: Login

  @orangehrm
  Scenario: Login en Orange
    Given Ingreso a la web "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Ingreso credenciales validas "Admin" y "admin123"
    And  Presiono boton login
    Then  Inicio sesion exitosamente
    And   Visualizo boton "Dashboard"