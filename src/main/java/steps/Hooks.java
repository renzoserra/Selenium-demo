package steps;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.browser_manager.WebDriverFactory;



public class Hooks {
    public static WebDriver driver;
    public static String Tag_ID_Running;
    String browser = "chrome";
    @Before
    public void setup() {
//        String browser = System.getProperty("browser", "chrome"); // Por defecto, usa Chrome
        driver = WebDriverFactory.createWebDriver(browser);
        driver.manage().window().maximize();
    }
//    @AfterStep
//    public static void takeScreenshot(Scenario scenario) {
//        if (driver instanceof TakesScreenshot) {
//            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png","image" );
//        }
//    }
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
