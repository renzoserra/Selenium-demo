package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.TestBase;

public class DashboardSteps extends TestBase {

    @Then("Inicio sesion exitosamente")
    public void inicioSesionExitosamente() {
        System.out.println("Se inició sesion exitosamente ");
    }

    @And("Visualizo boton {string}")
    public void visualizoBoton(String arg0) {
        DashboardPage.visualizoSubMenuDashboard(arg0);
    }
}
