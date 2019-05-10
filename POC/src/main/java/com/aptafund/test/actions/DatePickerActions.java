package com.aptafund.test.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by smuhammad on 12/6/2016.
 */
public class DatePickerActions extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(DatePickerActions.class);

    WaitActions waitActions;

    @FindBy(id = "BirthDate")
    private WebElementFacade birthDate;

    @FindBy (css = ".k-link.k-nav-fast.k-state-hover")
    private WebElementFacade yearselection;

    @FindBy (css = ".k-icon.k-i-calendar")
    private WebElementFacade calendarIcon;

    @FindBy(id = "HireDate")
    private WebElementFacade hireDate;

    @FindBy(id = "EligibilityDate")
    private WebElementFacade eligibilityDate;

    @FindBy(id = "TerminationDate")
    private WebElementFacade terminationDate;

    @FindBy(id = "RetirementDate")
    private WebElementFacade retirenentDate;

    public void setRetirementDate()
    {
        waitUntilLoaded(retirenentDate);
        retirenentDate.click();
        retirenentDate.sendKeys("10/12/2020");
        waitABit(5000);
    }


    public void setEligibilityDate()
    {
        waitUntilLoaded(eligibilityDate);
        eligibilityDate.click();
        eligibilityDate.sendKeys("10/12/2015");
        waitABit(5000);

    }

    public void setTerminationDate()
    {
        waitUntilLoaded(terminationDate);
        terminationDate.click();
        terminationDate.sendKeys("10/12/2020");
        waitABit(5000);
    }

    public void setHireDate()
    {
        waitUntilLoaded(hireDate);
        hireDate.click();
        hireDate.sendKeys("10/12/2015");
        waitABit(5000);

    }


    public void setBirthDate() {
        waitActions.waitUntilLoaded(birthDate);
        birthDate.click();
        birthDate.sendKeys("06/12/2010");
        waitABit(5000);



        // We set Current Date as Start Date Here
//        logger.info("Set Birth Date");
//        calendarIcon.waitUntilVisible();
//        waitActions.waitUntilLoaded(calendarIcon);
//        calendarIcon.sendKeys("");
//        calendarIcon.click();

//        WebElement dateWidget = getDriver().findElements(By.cssSelector(".k-icon.k-i-calendar")).get(0);
//        waitActions.waitUntilLoaded(dateWidget);
//        WebElement currentDate = dateWidget.findElement(By.cssSelector(".day.active"));
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", currentDate);
//        currentDate.click();

    }




    public String getPreviouseDate() {

        // This Method Takes the System Current Date and Add 4 days and return
        LocalDate date = new LocalDate().now().minusDays(10);
        DateTimeFormatter formatDate = DateTimeFormat.forPattern("d");
        String dateToString = date.toString(formatDate);
//        logger.info(dateToString);
        return dateToString;
    }

    public void setStartDate(String dateType) {
        WebElement dateNew1 = getDriver().findElements(By.cssSelector(".datepicker")).get(1);
        waitUntilLoaded(dateNew1);
        List<WebElement> rows = dateNew1.findElements(By.cssSelector(".datepicker-days .next"));

        if (dateType.equalsIgnoreCase("future")) {

            for (WebElement row : rows) {
                if (row.getText().equalsIgnoreCase("›")) {
                    row.click();
                    break;
                }
            }
            List<WebElement> columns = dateNew1.findElements(By.tagName("td"));
            for (WebElement cell : columns) {
                //This Method Select advance Date
                if (cell.getText().equals(getModifiedDate())) {
                    cell.click();
                    break;
                }
            }
        } else {
            WebElement currentDate = dateNew1.findElement(By.cssSelector(".day.active"));
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", currentDate);
            currentDate.click();
        }
    }


    public String getModifiedDate() {

        // This Method Takes the System Current Date and Add 4 days and return
        LocalDate date = new LocalDate().now().plusDays(10);
        DateTimeFormatter formatDate = DateTimeFormat.forPattern("d");
        String dateToString = date.toString(formatDate);
        logger.info(dateToString);
        return dateToString;
    }

    public void setSessionStartDate() {
        // We set Current Date as Start Date Here
        logger.info("Set Session Start Date");
        calendarIcon.waitUntilVisible();
        calendarIcon.sendKeys("");
        calendarIcon.click();
        WebElement dateWidget = getDriver().findElements(By.cssSelector(".datepicker")).get(4);
        waitActions.waitUntilLoaded(dateWidget);
        WebElement currentDate = dateWidget.findElement(By.cssSelector(".day.active"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", currentDate);
        currentDate.click();
    }





}
