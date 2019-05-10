package com.aptafund.test.features.login.Payroll;

import com.aptafund.test.steps.HRPayrollESS.EmployeeJobsSteps;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.HRPayrollESS.ManageDeductionSteps;
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
 * Created by smuhammad on 1/4/2017.
 */


@RunWith(SerenityRunner.class)

public class ManageDeductionTest {

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    ManageDeductionSteps manageDeductionSteps;


    @Test
    //@Ignore
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyAddFixedAmountCalculationDeduction() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageDeductionSteps.navigateToManageDeduction();
        manageDeductionSteps.addManageDeduction();
        manageDeductionSteps.searchDeductionSet();
    }

    @Test
    //@Ignore
    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyEidtFixedAmountDeduction() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageDeductionSteps.navigateToManageDeduction();
        manageDeductionSteps.addManageDeduction();
        manageDeductionSteps.searchDeductionSet();
        //manageDeductionSteps.enableNewlyCreatedDeduction();
        //manageDeductionSteps.callConfirmationMsg();
        manageDeductionSteps.refreshPage();
        manageDeductionSteps.clickEditButton();
        manageDeductionSteps.updateCommentsField();
        manageDeductionSteps.verifyEmployeePayPeriodAmountValue();
        manageDeductionSteps.verifyEmployerPayPeriodAmountValue();
        manageDeductionSteps.savededuction();

    }

    @Test
    //@Ignore
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyAddPercentageCalculationDeduction() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageDeductionSteps.navigateToManageDeduction();
        manageDeductionSteps.addManageDeductionUsingPercentageCalculation();
        manageDeductionSteps.searchDeductionSetForPercentageCalculation();
    }

    @Test
    //@Ignore
    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyDisableFixedAmountDeduction() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageDeductionSteps.navigateToManageDeduction();
        manageDeductionSteps.addManageDeduction();
        //manageDeductionSteps.searchDeductionSet();
        manageDeductionSteps.searchDeductionSetToDisable();
        manageDeductionSteps.enableNewlyCreatedDeduction();
        manageDeductionSteps.callConfirmationMsg();
        //manageDeductionSteps.searchDeductionSetToDisable();
        manageDeductionSteps.reloadManageDeductionPage();
        manageDeductionSteps.disableDeductionAssignment();
        manageDeductionSteps.callConfirmationMsg1();


    }

    //@Ignore
    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )



    public void verifyAddSystemDeduction()
    {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        manageDeductionSteps.navigateToManageDeduction();
        manageDeductionSteps.navigateToSystemDedcution();
        manageDeductionSteps.addSystemDeduction();
    }

}
