package com.aptafund.test.pages.PurchasingAndPayables;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.scheduling.ThucydidesFluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 3/31/2017.
 */
public class PurchasingAndPayablesHomePage extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(PurchasingAndPayablesHomePage.class);


    @FindBy(id = "menuheader3")
    private WebElementFacade purchaseAndPayablesHeaderForHarrisUser;

    @FindBy(id = "menuheader0")
    private WebElementFacade purchaseAndPayablesHeader;

    @FindBy(id = "menuheader3")
    private WebElementFacade purchaseAndPayablesHeaderForAdminPR;

    @FindBy(id = "menuheader1")
    private WebElementFacade purchaseAndPayablesHeaderForApprover1;

    @FindBy(id = "menuheader1")
    private WebElementFacade purchaseAndPayablesHeaderForMyPRAdmin;

    @FindBy(id = "menuheader3")
    private WebElementFacade purchaseAndPayablesHeaderForMyPRAdmin1;

    @FindBy(id = "menuwrapper")
    private WebElementFacade menuHeaders;

    @FindBy(id = "divMyQuickLinks")
    private WebElementFacade myQuickLinks;

    @FindBy(id = "divJobQueue")
    private WebElementFacade divJobQueue;

    @FindBy(css = "div#menuheader5.menuheader")
    private WebElementFacade hrPayrollESSHeader;

    @FindBy (css = ".k-i-loading")
    private WebElementFacade loadingWheel;



    @FindBy(css = "[href=\"/QAAutom/AccountsPayable/VendorInvoice/Manage\"]")
    private WebElementFacade vendorInvoiceTitle;


    public void clickPurchaseAndPayableForMyPRAdmin(){
        logger.info("Waiting for Purchase And Payables For My PR admin");
        purchaseAndPayablesHeaderForMyPRAdmin1.waitUntilPresent();
        purchaseAndPayablesHeaderForMyPRAdmin1.waitUntilVisible();
        purchaseAndPayablesHeaderForMyPRAdmin1.waitUntilEnabled();
        purchaseAndPayablesHeaderForMyPRAdmin1.waitUntilClickable();
        waitABit(5000);
        purchaseAndPayablesHeaderForMyPRAdmin1.click();




    }





    public void clickPurchaseAndPayablesHeader() {

        logger.info("Waiting for Purchase And Payables");
        //waitUntilLoaded(purchaseAndPayablesHeader);
        //purchaseAndPayablesHeader.sendKeys("");
        //getDriver().navigate().refresh();
        waitABit(3000);
        divJobQueue.waitUntilVisible();
        myQuickLinks.waitUntilVisible();
        myQuickLinks.waitUntilEnabled();
        menuHeaders.waitUntilPresent();
        hrPayrollESSHeader.waitUntilClickable();
        hrPayrollESSHeader.click();
        //waitFor(ExpectedConditions(shouldBeVisible());
        purchaseAndPayablesHeaderForHarrisUser.waitUntilPresent();
        purchaseAndPayablesHeaderForHarrisUser.waitUntilVisible();
        purchaseAndPayablesHeaderForHarrisUser.waitUntilEnabled();
        purchaseAndPayablesHeaderForHarrisUser.waitUntilClickable();
        purchaseAndPayablesHeaderForHarrisUser.click();

        logger.info("Clicked on Purchasing & Payables");
        logger.info("Purchasing & Payables link has been clicked");
        waitABit(9000);

    }




    public void clickOnPurchasingAndPayble() {
        waitABit(5000);
        waitUntilLoaded(purchaseAndPayablesHeader);
        purchaseAndPayablesHeader.waitUntilVisible();
        purchaseAndPayablesHeader.waitUntilPresent();
        purchaseAndPayablesHeader.waitUntilClickable();
        purchaseAndPayablesHeader.click();
    }

    public void clickOnPurchasingAndPaybleForAdminPR() {
        waitABit(9000);
        //customWaitUntilUnLoaded(loadingWheel);

        purchaseAndPayablesHeaderForAdminPR.waitUntilVisible();
        purchaseAndPayablesHeaderForAdminPR.waitUntilPresent();
        purchaseAndPayablesHeaderForAdminPR.waitUntilClickable();
        waitABit(5000);
        purchaseAndPayablesHeaderForAdminPR.click();

        //purchaseAndPayablesHeaderForAdminPR.click();
    }


    public void clickOnPurchasingAndPaybleForApp1() {
        purchaseAndPayablesHeaderForApprover1.waitUntilVisible();
        purchaseAndPayablesHeaderForApprover1.waitUntilPresent();
        purchaseAndPayablesHeaderForApprover1.waitUntilClickable();
        purchaseAndPayablesHeaderForApprover1.click();
    }
}
