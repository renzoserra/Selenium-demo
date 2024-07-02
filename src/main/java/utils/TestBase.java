package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.orangeHrm.Dashboard.DashboardPage;
import pages.orangeHrm.LoginOrangePage;
import pages.swagLab.LoginSwagLabPage;
import steps.Hooks;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected LoginOrangePage loginOrangeHrmPage = PageFactory.initElements(driver, LoginOrangePage.class);
    protected DashboardPage DashboardPage = PageFactory.initElements(driver, pages.orangeHrm.Dashboard.DashboardPage.class);
    protected LoginSwagLabPage loginSwagLabPage =  PageFactory.initElements(driver, LoginSwagLabPage.class);

}
