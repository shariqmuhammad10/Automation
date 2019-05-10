package com.aptafund.test.features.login.commonTest;

import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by omii on 8/17/2016.
 */

@RunWith(SerenityRunner.class)
public class AptaLoginTest {
    private static final Logger logger = LoggerFactory.getLogger(AptaLoginTest.class);

    @Managed
    WebDriver driver;


    @Steps
    AptaLoginSteps aptaLoginSteps;

    @WithTag(type = "release", name = "Smoke-test")
    //@Ignore
    @Test
    public void verifyLoginPageIsAppearing() {
        aptaLoginSteps.navigateToLoginPage();

    }

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test")
            }
    )

    //@Ignore
    @Test
    public void VerifyLoginIntoSite(){

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();

    }

    @WithTag(type = "release", name = "Smoke-test")
    //@Ignore
    @Test
    public void VerifyLogout(){

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        aptaLoginSteps.logoutApplication();

    }


    

}