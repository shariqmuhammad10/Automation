package com.aptafund.test.features.login.Payroll;

import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


/**
 * Created by smuhammad on 10/10/2016.
 */

@RunWith(SerenityRunner.class)

public class PayrollHomeTest {

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    //@Ignore
    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyNavigateToPayroll(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        }


}
