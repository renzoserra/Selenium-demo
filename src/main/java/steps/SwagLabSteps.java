package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.BasePage;
import utils.TestBase;

public class SwagLabSteps extends TestBase {
    @Then("Visualizo que estoy en la web con el endpoint {string}")
    public void visualizoQueEstoyEnLaWebConElEndpoint(String arg0) {
        BasePage.validateUrl(arg0);
    }

    @And("Hago click en el boton {string}")
    public void hagoClickEnElBoton(String arg0) {
        loginSwagLabPage.botonHiLo(true);
    }

    @And("Visualizo listado de productos ordenados por precios de mayor a menor")
    public void visualizoListadoDeProductosOrdenadosPorPreciosDeMayorAMenor() {
        loginSwagLabPage.productosOrdenadosMayorMenor();
    }
}
