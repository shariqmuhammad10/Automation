package com.aptafund.test.features.login.HumanResource;

import com.aptafund.test.pages.hrPayrollESS.EmployeeJobsPage;
import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;
import com.aptafund.test.steps.HRPayrollESS.EmployeeJobsSteps;
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
 * Created by smuhammad on 12/29/2016.
 */


@RunWith(SerenityRunner.class)

public class EmployeeJobsTest  {

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    EmployeeJobsSteps employeeJobsSteps;

    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-Test"),
                    @WithTag("Priority:High")
            }
    )

        public void verifyAddEmployeeSalaryJob(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();

            hrManagePayrollHomeSteps.navigateToPayroll();
            employeeJobsSteps.navigateToEmployeeJobs();
            employeeJobsSteps.addNewEmployeeJob();
            employeeJobsSteps.verifySalary();
            employeeJobsSteps.verifyFullTimePayRate();
            employeeJobsSteps.approveEmployeeJob();
            employeeJobsSteps.submitJobToPayroll();
        }



    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )

    public void verifyEditEmployeeSalaryJob() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        employeeJobsSteps.navigateToEmployeeJobs();
        employeeJobsSteps.addNewEmployeeJob();
        employeeJobsSteps.verifySalary();
        employeeJobsSteps.verifyFullTimePayRate();
        employeeJobsSteps.editComments();
    }

    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )

    public void deleteEmployeeSalaryJob() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        employeeJobsSteps.navigateToEmployeeJobs();
        employeeJobsSteps.addNewEmployeeJob();
        employeeJobsSteps.verifySalary();
        employeeJobsSteps.clickOnCancelButton();
        employeeJobsSteps.clickSortJobStatus();
        employeeJobsSteps.clickDeleteButton();
    }


    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 1"),
                    @WithTag("Priority:High")
            }
    )
    public void verifyAddEmployeeHourlyJob(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        employeeJobsSteps.navigateToEmployeeJobs();
        employeeJobsSteps.addNewHourlyEmployeeJob();
        }


}
