package pages.orangeHrm;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;


public class LoginOrangePage extends BasePage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void inputUserPass(String username, String pass){
        Assert.assertTrue("Campo username esta disponible",esperarElemento(usernameInput,10));
        Assert.assertTrue("Campo password esta disponible",esperarElemento(passwordInput,10));
        BasePage.typeInput(usernameInput,username);
        BasePage.typeInput(passwordInput,pass);
    }

    public void botonLogin(boolean onclick){
        if (onclick){
            Assert.assertTrue("Botón login esta disponible",esperarElemento(loginButton,10));
            click(loginButton);
        }else {
            Assert.assertTrue("Botón login esta disponible",esperarElemento(loginButton,10));
        }
    }

}
