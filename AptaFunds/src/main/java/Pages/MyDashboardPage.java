package Pages;

import com.sun.jna.platform.win32.OaIdl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by smuhammad on 9/29/2016.
 */
public class MyDashboardPage {

    WebDriver driver;
    WebDriverWait wait;

    By hrPayrollHeader = By.id("menuheader5");
    By loadConfigure = By.id("btnConfigure__Index");

    public MyDashboardPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;

    }



    public void clickPayrollHeader(){
        wait.until(ExpectedConditions.presenceOfElementLocated(hrPayrollHeader));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadConfigure));
        wait.until(ExpectedConditions.elementToBeClickable(hrPayrollHeader));
        driver.findElement(hrPayrollHeader).sendKeys("");
        driver.findElement(hrPayrollHeader).click();

    }




}
