package pages.swagLab;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoginSwagLabPage extends BasePage {
    @FindBy(xpath = "//input[@data-test=\"username\"]")
    private WebElement usernameInput;
    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[@data-test=\"login-button\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//option[@value=\"hilo\"]")
    private WebElement botonHiLo;
    @FindBy(xpath = "//div[@class=\"inventory_item_price\"]")
    private static List<WebElement> ListaPreciosProductos;

    public void inputUsername(String username) {
        Assert.assertTrue("Campo username esta disponible",esperarElemento(usernameInput,10));
        typeInput(usernameInput, username);
    }

    public void inputPassword(String pass) {
        Assert.assertTrue("Campo password esta disponible",esperarElemento(passwordInput,10));
        typeInput(passwordInput, pass);
    }

    public void botonLogin(boolean click) {
        if (click) {
            Assert.assertTrue("Campo botón login esta disponible",esperarElemento(loginButton,10));
            click(loginButton);
        } else {
            Assert.assertTrue("Campo botón login esta disponible",esperarElemento(loginButton,10));
        }
    }

    public void botonHiLo(boolean click) {
        if (click) {
            Assert.assertTrue("Campo botón Hi-Low esta disponible",esperarElemento(botonHiLo,10));
            click(botonHiLo);
        } else {
            Assert.assertTrue("Campo botón Hi-Low esta disponible",esperarElemento(botonHiLo,10));        }
    }

    public static void productosOrdenadosMayorMenor() {
        List<Double> valoresNumericos = new ArrayList<>();
        for (WebElement precio : ListaPreciosProductos) {
            String precioTexto = precio.getText().replace("$", "").replace(",", ""); // Eliminar caracteres no numéricos
            double valorNumerico = Double.parseDouble(precioTexto);
            valoresNumericos.add(valorNumerico);
        }

        // Verificar si la lista está ordenada de mayor a menor
        for (int i = 0; i < valoresNumericos.size() - 1; i++) {
            Assert.assertTrue("Los productos no están ordenados de mayor a menor",
                    valoresNumericos.get(i) >= valoresNumericos.get(i + 1));
        }
    }
}

