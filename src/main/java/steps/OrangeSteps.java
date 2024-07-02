package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TestBase;

public class OrangeSteps extends TestBase {

    @Given("Ingreso credenciales validas {string} y {string}")
    public void ingresoCredencialesValidasY(String arg0, String arg1) {
        switch (Hooks.Tag_ID_Running){
            case "@swagLab":
                loginSwagLabPage.inputUsername(arg0);
                loginSwagLabPage.inputPassword(arg1);
                break;
            case "@orangehrm":
                loginOrangeHrmPage.inputUserPass(arg0,arg1);
                break;
            default:
                System.out.println("Metodo no tiene cobertura para el caso");
                break;
        }
    }


    @When("Presiono boton login")
    public void presionoBotonLogin() {
        switch (Hooks.Tag_ID_Running){
            case "@swagLab":
                loginSwagLabPage.botonLogin(true);
                break;
            case "@orangehrm":
                loginOrangeHrmPage.botonLogin(true);
                break;
            default:
                System.out.println("Metodo no tiene cobertura para el caso");
                break;
        }

    }

}
