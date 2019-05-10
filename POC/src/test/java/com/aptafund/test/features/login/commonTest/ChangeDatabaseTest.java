package com.aptafund.test.features.login.commonTest;

import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import com.aptafund.test.steps.commonSteps.ChangeDatabaseSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by smuhammad on 11/21/2016.
 */


@RunWith(SerenityRunner.class)

public class ChangeDatabaseTest {

    @Managed
    WebDriver driver;

    @Steps
    ChangeDatabaseSteps changeDatabaseSteps;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @WithTag (type = "release", name = "Smoke-Test")

    @Ignore
    @Test
    public void verifyChangeDatabase(){

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        changeDatabaseSteps.changeTheDatabase();
        aptaLoginSteps.logoutApplication();
    }



}
