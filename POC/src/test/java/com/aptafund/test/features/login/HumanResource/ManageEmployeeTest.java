package com.aptafund.test.features.login.HumanResource;

import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.HRPayrollESS.ManageEmplopyeeSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
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
 * Created by smuhammad on 11/23/2016.
 */

@RunWith(SerenityRunner.class)

public class ManageEmployeeTest {


    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    ManageEmplopyeeSteps manageEmplopyeeSteps;

    @WithTag(type = "release", name = "Smoke-test")
    //@Ignore
    @Test
    public void verifyNavigateToManageEmployee(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageEmplopyeeSteps.navigateToManageEmployee();

    }

    //@Ignore
    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )



    public void verifyAddNewEmployee(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageEmplopyeeSteps.navigateToManageEmployee();
        manageEmplopyeeSteps.addNewEmployee();
        manageEmplopyeeSteps.closeEmployeePopup();
        manageEmplopyeeSteps.searchNewlyCreatedEmployee();
        manageEmplopyeeSteps.sortEmployee();
        //manageEmplopyeeSteps.selectCheckBox();
        //manageEmplopyeeSteps.clickOnEnableEmployee();

    }


}
