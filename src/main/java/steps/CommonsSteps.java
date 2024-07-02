package steps;

import io.cucumber.java.en.Given;
import utils.BasePage;
import utils.TestBase;

public class CommonsSteps extends TestBase {

    @Given("Ingreso a la web {string}")
    public void ingresoALaWeb(String arg0) {
        BasePage.goToUrl(arg0);
    }
}
