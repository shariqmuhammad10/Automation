package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.refreshed;

/**
 * Created by shariq.muhammad on 4/22/2016.
 */
public class PageObject {

    public String baseURL = "http://www.quickstart.com/";
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    By trainingOptions = By.linkText("Training Options");
    By onDemandTraining = By.linkText("On Demand Training");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By company = By.name("company");
    By job = By.name("job");
    By phoneNumber = By.name("phone");
    By message = By.name("message");
    By submitButton = By.id("main_C015_ctl00_ctl00_SubmitButton");
    By courseSelection = By.xpath(".//span[@aria-owns='course_listbox']/span");
    By selectDropDownProvince = By.xpath(".//span[@aria-owns='stateCountry_listbox']/span");
    By sateProvinceListBox = By.id("stateCountry_listbox");
    By stateProvinceList = By.xpath(".//ul[@id='stateCountry_listbox']/li");
    By selectDropDownCourseList = By.xpath(".//span[@aria-owns='course_listbox']/span");
    By courseListBox = By.id("course-list");
    By courseList = By.xpath(".//ul[@id='course_listbox']/li");
    By thankYoumessage = By.id("main_TFC896E0F016_Col00");


    public void selectCourse() {
        WebElement courseWebElement = wait.until(ExpectedConditions.elementToBeClickable(selectDropDownCourseList));
        action.moveToElement(courseWebElement).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(courseListBox));
        List<WebElement> courseListWebElements = driver.findElements(courseList);
        for (WebElement webElement : courseListWebElements) {
            if (webElement.getText().equalsIgnoreCase("AWS")) {
                webElement.click();
            }
        }

    }




    public PageObject(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;
        action = new Actions(driver);

    }

    public void setProvince() {

        WebElement stateProvinceWebElement = wait.until(ExpectedConditions.elementToBeClickable(selectDropDownProvince));
        action.moveToElement(stateProvinceWebElement).click().perform();
       WebElement stateProvinceListWebElement = wait.until(ExpectedConditions.elementToBeClickable(sateProvinceListBox));
        List<WebElement> stateProvinceListWebElements = driver.findElements(stateProvinceList);
        for (WebElement webElement : stateProvinceListWebElements) {
            if (webElement.getText().equalsIgnoreCase("Texas")) {
                webElement.click();
            }
        }

    }

    public void navigatetoBasicPage() {

        //Hit the desired URL
        driver.get(baseURL);
        //Store the desired URL in a parameter called url
        String url = driver.getCurrentUrl();
        //Print Current URL
        System.out.println("Current Page URL :" + url);
        //Apply Assertion to confirm the current url
        Assert.assertTrue(baseURL.equals(url));
        System.out.println("Current URL Verification perform successfully.");

    }

    public void pageTitleVerification() {

        String actualPageTitle = "On Demand Training";
        wait.until(ExpectedConditions.titleIs(actualPageTitle));
        String pageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, pageTitle);
        System.out.println("Current Page Title is :" + pageTitle);
    }


    public void clickTrainingOption() {
        wait.until(ExpectedConditions.presenceOfElementLocated(trainingOptions));
        driver.findElement(trainingOptions).click();

    }

    public void clickOnDemandTraining() {

        wait.until(ExpectedConditions.presenceOfElementLocated(onDemandTraining));
        driver.findElement(onDemandTraining).click();
    }

    public void setFirstName() {
        wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys("Shariq");

    }

    public void setLastName() {
        wait.until(ExpectedConditions.presenceOfElementLocated(lastName));
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys("Muhammad");
    }

    public void setEmail() {
        wait.until(ExpectedConditions.presenceOfElementLocated(email));
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("shariq.Muhammad@Hotmail.com");
    }

    public void setCompany() {
        wait.until(ExpectedConditions.presenceOfElementLocated(company));
        driver.findElement(company).clear();
        driver.findElement(company).sendKeys("360Training.com");
    }

    public void setPhoneNumber() {
        wait.until(ExpectedConditions.presenceOfElementLocated(phoneNumber));
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys("1111111111");
    }

    public void setJobTitle() {

        wait.until(ExpectedConditions.presenceOfElementLocated(job));
        driver.findElement(job).clear();
        driver.findElement(job).sendKeys("SQA");
    }


    public void insertMessage() {

        wait.until(ExpectedConditions.presenceOfElementLocated(message));
        driver.findElement(message).clear();
        driver.findElement(message).sendKeys("New message");
    }

    public void clickSubmitbutton() {

        wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
        driver.findElement(submitButton).click();

    }

    public void setCourseSelection() {

        wait.until(ExpectedConditions.presenceOfElementLocated(courseSelection));
        driver.findElement(courseSelection);

    }

    public void verifyThankYouMsg() {

        By thankYou = By.cssSelector("#main_TFC896E0F016_Col00 h1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(thankYou));
        WebElement TYWebElement = driver.findElement(thankYou);
        Assert.assertEquals(TYWebElement.getText(), "Thank you for your request for more information");
        String msgValue = TYWebElement.getText();
        System.out.println("The Message is :" + msgValue);

    }

    public void TYpageTitleVerification() {

        String actualPageTitleTY = "Thank You | Contact Us";
        wait.until(ExpectedConditions.titleIs(actualPageTitleTY));
        String pageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitleTY, pageTitle);
        System.out.println("Current Page Title is :" + pageTitle);
    }

}

