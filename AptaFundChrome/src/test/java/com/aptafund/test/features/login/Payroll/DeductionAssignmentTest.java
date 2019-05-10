package com.aptafund.test.features.login.Payroll;

import com.aptafund.test.steps.HRPayrollESS.DeductionAssignmentSteps;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by smuhammad on 2/2/2017.
 */


@RunWith(SerenityRunner.class)

public class DeductionAssignmentTest {

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    DeductionAssignmentSteps deductionAssignmentSteps;

    //@Ignore
    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )



    public void verifyAddFixedAmountDeduction() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        deductionAssignmentSteps.navigateToDeductionAssignment();
        deductionAssignmentSteps.addNewDeductionSet();
    }



    //@Ignore
    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )



    public void verifyEditFixedAmountDeduction() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        deductionAssignmentSteps.navigateToDeductionAssignment();
        deductionAssignmentSteps.addNewDeductionSet();
        deductionAssignmentSteps.editDeductionSet();
    }

    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )

    public void AddDirectDepositWithPercentage(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        deductionAssignmentSteps.navigateToDeductionAssignment();
        deductionAssignmentSteps.searchNewDedAssignment();
        deductionAssignmentSteps.editDedAssignment();
        deductionAssignmentSteps.clickOnDirectDeposit();
        deductionAssignmentSteps.addDirectDepositPercentage();
    }



    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )

    public void AddDirectDepositWithAmount(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        deductionAssignmentSteps.navigateToDeductionAssignment();
        deductionAssignmentSteps.searchNewDedAssignment();
        deductionAssignmentSteps.editDedAssignment();
        deductionAssignmentSteps.clickOnDirectDeposit();
        deductionAssignmentSteps.addDirectDepositAmount();

    }

    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )

    public void AddNonVariableDeductionForPercentage(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        deductionAssignmentSteps.navigateToDeductionAssignment();
        deductionAssignmentSteps.searchNewDedAssignment();
        deductionAssignmentSteps.editDedAssignment();
        deductionAssignmentSteps.clickOnPercentage();
        deductionAssignmentSteps.addPercentage();

    }

    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )

    public void deleteNonVariableDeductionForPercentage(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        deductionAssignmentSteps.navigateToDeductionAssignment();
        deductionAssignmentSteps.searchNewDedAssignment();
        deductionAssignmentSteps.editDedAssignment();
        deductionAssignmentSteps.clickOnPercentage();
        deductionAssignmentSteps.addPercentageToDelete();
        deductionAssignmentSteps.deletePercetage();
    }

}
