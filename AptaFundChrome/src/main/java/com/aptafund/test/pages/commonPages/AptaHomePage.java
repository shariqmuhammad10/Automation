package com.aptafund.test.pages.commonPages;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by omii on 8/17/2016.
 */
public class AptaHomePage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(AptaHomePage.class);

    @FindBy (id = "btnLogout")
    private WebElementFacade homePageTitle;


    @FindBy (id = "divPayCheck")
    private WebElementFacade verifyLoginApplication;

    public boolean homePageIsDisplayed(){
        logger.info("Verifying the Title of Home Page ");
        return homePageTitle.isDisplayed();

    }

}
