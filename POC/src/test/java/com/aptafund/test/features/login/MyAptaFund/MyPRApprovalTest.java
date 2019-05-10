package com.aptafund.test.features.login.MyAptaFund;


import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

@RunWith(SerenityRunner.class)

public class MyPRApprovalTest {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(MyPRApprovalTest.class);

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;


}
