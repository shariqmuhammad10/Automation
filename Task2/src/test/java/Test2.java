/**
 * Created by shariq.muhammad on 4/22/2016.
 */


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import Pages.PageObject;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.util.PropertyExpander;


public class Test2 {

    WebDriver driver;
    WebDriverWait wait;
    private PageObject pageObject;


    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        pageObject = new PageObject(driver, wait);

        pageObject.navigatetoBasicPage();
        driver.manage().window().maximize();

    }

    @Test
    public void fillUpForm() {

        PageObject pageObject = new PageObject(driver, wait);
        pageObject.clickTrainingOption();
        pageObject.clickOnDemandTraining();
        pageObject.pageTitleVerification();
        pageObject.setFirstName();
        pageObject.setLastName();
        pageObject.setEmail();
        pageObject.setPhoneNumber();
        pageObject.setCompany();
        pageObject.setJobTitle();
        pageObject.setProvince();
        pageObject.selectCourse();
        pageObject.insertMessage();
        pageObject.clickSubmitbutton();
        pageObject.TYpageTitleVerification();
        pageObject.verifyThankYouMsg();

    }

    @After
    public void tearDown() {
        driver.quit();

    }
}








