package pages.orangeHrm.Dashboard;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement opcionSubMenuDashboard;

    public void visualizoSubMenuDashboard(String txt){
        Assert.assertTrue("Botón login esta disponible",esperarElemento(opcionSubMenuDashboard,10));
        validateElementText(opcionSubMenuDashboard,txt);
    }


}
