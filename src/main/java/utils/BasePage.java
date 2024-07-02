package utils;

import com.aventstack.extentreports.ExtentTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Hooks;

import java.time.Duration;
public class BasePage {
    private static WebDriver driver;
    private static WebDriverWait wait;
    public static ExtentTest test;
    public BasePage() {
            this.driver = Hooks.getDriver();
    }

    public boolean esperarElemento(WebElement elemento, int tiempoMaximoSegundos) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoMaximoSegundos));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(elemento));
            System.out.println("El elemento se encuentra disponible");
            Assert.assertNotNull("El elemento esperado no es nulo", element);
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
            return false;
        }
        return true;
    }

    public static void typeInput(WebElement element, String txtType) {
        try {
            element.sendKeys(txtType);
            System.out.println("Se escribe correctamente el texto: " + txtType);
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
    }

    public static void click(WebElement element) {
        try {
            element.click();
            System.out.println("Se hizo click correctamente en el elemento");
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
    }
    public static void validateElementText(WebElement element, String txt) {
        try {
            String actualText = element.getText();
            Assert.assertEquals("El texto del elemento no coincide con lo esperado.\n" +
                            "Texto obtenido: " + actualText + "\n" +
                            "Texto esperado: " + txt,
                    txt, actualText);
        } catch (Exception e) {
            Assert.fail("Ocurrió un error, no se encuentra el elemento disponible: " + e.getMessage());
        }
    }

    public static void validateUrl(String txtURL) {
        String urlCurrent = driver.getCurrentUrl();
        Assert.assertTrue("La URL actual no contiene el texto esperado:\n" +
                        "URL actual: " + urlCurrent + "\n" +
                        "Texto esperado: " + txtURL,
                urlCurrent.contains(txtURL));
    }


    public static void goToUrl(String url){
        driver.get(url);
    }
}
