package com.aptafund.test.pages.commonPages;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by omii on 8/17/2016.
 */

//@DefaultUrl("")
public class AptaLoginPage extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(AptaLoginPage.class);


    @FindBy(id = "login")
    private WebElementFacade pageTitle;

    @FindBy(id = "loginName")
    private WebElementFacade loginName;

    @FindBy (id = "btnLogout")
    private WebElementFacade logOutButton;

    @FindBy(id = "Password")
    private WebElementFacade password;

    @FindBy(css = ".login-button")
    private WebElementFacade loginButton;


    @FindBy(css = "k-loading-image")
    private WebElementFacade loadingImage;


    @FindBy (id = "divPayCheck")
    private WebElementFacade verifyLoginApplication;

    public void loginIntoApta(String userName, String passwordId) {
        waitUntilLoaded(loginName);
        loginName.clear();
        loginName.sendKeys(userName);

        password.clear();
        password.sendKeys(passwordId);

        waitUntilLoaded(loginButton);
        loginButton.click();

    }

    public boolean verifyPageIsOpen() {
        logger.info("Verifying the title of the Home Page");
        return pageTitle.isDisplayed();

    }

    public void verifyAptaLogin(){
        verifyLoginApplication.isDisplayed();

    }


    public void logOut() {
        logger.info("Waiting for Logout button to display");
        waitUntilLoaded(logOutButton);
        //loadingImage.waitUntilNotVisible();
        waitABit(5000);
        logger.info("Clicking on Logout button ");
        logOutButton.click();
        waitABit(5000);
        logger.info("Logout successfully");
        //logger.info("Click on Log out");
    }
}
