package Pages.Payroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by smuhammad on 9/29/2016.
 */
public class ManagePayrollPage {

    WebDriver driver;
    WebDriverWait wait;

    By managePayrollLink = By.cssSelector(".menulink[href=\"/tst01/Payroll/Payroll/Manage\"]");
    By managePayrollAddbutton = By.id("btnAdd__PayrollManagementDataView");
    By loadConfigure = By.id("btnConfigure__Index");


    public ManagePayrollPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;


    }

    public void clickManagePayroll(){
        wait.until(ExpectedConditions.elementToBeClickable(loadConfigure));
        wait.until(ExpectedConditions.presenceOfElementLocated(managePayrollLink));
        wait.until(ExpectedConditions.elementToBeClickable(managePayrollLink));
        driver.findElement(managePayrollLink).sendKeys("");

        driver.findElement(managePayrollLink).click();

    }

    public void clickAdd(){
        wait.until(ExpectedConditions.elementToBeClickable(managePayrollAddbutton));
        driver.findElement(managePayrollAddbutton).click();

    }


}
