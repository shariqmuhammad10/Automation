package aptafund;

import Pages.LoginPage;
import Pages.Payroll.ManagePayrollPage;
import Pages.MyDashboardPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by smuhammad on 9/26/2016.
 */
public class VerifyLogin {

    WebDriver driver ;
    WebDriverWait wait ;
    private LoginPage loginPage;
    private MyDashboardPage myDashboard;
    private ManagePayrollPage managePayrollPage;



    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,50);
        loginPage = new LoginPage(driver, wait);
        myDashboard = new MyDashboardPage(driver, wait);
        managePayrollPage = new ManagePayrollPage(driver, wait);

    }


    @Test

    public void launchBrowser()
    {
    loginPage.launchAptaFundSite();
    //driver.findElement(By.id(""));
        loginPage.loginUser();
        myDashboard.clickPayrollHeader();
        managePayrollPage.clickManagePayroll();
        managePayrollPage.clickAdd();
       }

    /*  @Test

        public void setPayroll(){
        myDashboard.clickPayrollHeader();

    }*/



}
