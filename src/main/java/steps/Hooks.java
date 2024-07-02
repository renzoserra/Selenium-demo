package steps;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.browser_manager.WebDriverFactory;



public class Hooks {
    public static WebDriver driver;
    public static String Tag_ID_Running;
    String browser = "chromegithubactions";
    @Before
    public void setup() {
        driver = WebDriverFactory.createWebDriver(browser);
        driver.manage().window().maximize();
    }
    @Before
    public void beforeScenario(Scenario scenario) {
        Tag_ID_Running = obtenerTagDelEscenario(scenario);
    }
    private String obtenerTagDelEscenario(Scenario scenario) {
        return String.join(", ", scenario.getSourceTagNames());
    }
    @After
    public void tearDown() {
        if (browser.contains("githubactions")){
            return;
        }
        if (driver != null) {
            driver.quit();
            System.out.println("Cierre correcto de browser");
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
