package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by smuhammad on 9/26/2016.
 */
public class LoginPage {

    public String baseURL = "https://test.aptafund.com";
    WebDriver driver;
    WebDriverWait wait;



    By loginName = By.id("loginName");
    By passWord = By.id("Password");
    By loginButton = By.id("LoginButtonBox");





    public LoginPage (WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void launchAptaFundSite(){
        driver.get(baseURL);
        }

        public void loginUser(){
            wait.until(ExpectedConditions.elementToBeClickable(loginButton));
            driver.findElement(loginName).sendKeys("smuhammad@harriscomputer.com");
            driver.findElement(passWord).sendKeys("$M@2016!");
            driver.findElement(loginButton).click();

        }





}
