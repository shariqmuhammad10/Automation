package com.aptafund.test.steps.HRPayrollESS;

import com.aptafund.test.pages.hrPayrollESS.EmployeeJobsPage;
import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;


/**
 * Created by smuhammad on 12/29/2016.
 */
public class EmployeeJobsSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeJobsSteps.class);

    HrPayrollEssHomePage hrPayrollEssHomePage;
    EmployeeJobsPage employeeJobsPage;

    String TotalSalary = "$196.02";

    @Step

    public void navigateToPayroll()
    {
        hrPayrollEssHomePage.clickHrPayrollESSHeader();
    }


    @Step
    public void navigateToEmployeeJobs(){
        waitABit(3000);
        employeeJobsPage.clickOnEmployeeJobs();
    }

    @Step
    public void addNewEmployeeJob() {
        employeeJobsPage.clickAddNewEmployeeJobButton();
        //employeeJobsPage.switchToEmployeeJobFrame();
        employeeJobsPage.openEmployeeDD();
        employeeJobsPage.selectEmployeeValue();
        employeeJobsPage.openJobNameDD();
        employeeJobsPage.setJobNameDDSelect();
        employeeJobsPage.setSalary();
        employeeJobsPage.setAddEmployeeJobComments();
        employeeJobsPage.openAccountCodeDD();
        employeeJobsPage.selectAccountCode();
        employeeJobsPage.openContributionType();
        employeeJobsPage.selectContributionType();
        employeeJobsPage.clickOnSaveButton();
    }

    @Step
    public void addNewHourlyEmployeeJob() {
        employeeJobsPage.clickAddNewEmployeeJobButton();
        //employeeJobsPage.switchToEmployeeJobFrame();
        employeeJobsPage.openEmployeeDD();
        employeeJobsPage.selectEmployeeValue();
        employeeJobsPage.openJobNameDDForHourly();
        employeeJobsPage.setHourlyJobNameDDSelect();
        //employeeJobsPage.setSalary();
        employeeJobsPage.setAddEmployeeJobComments();
        employeeJobsPage.openAccountCodeDD();
        employeeJobsPage.selectAccountCode();
        employeeJobsPage.openContributionType();
        employeeJobsPage.selectContributionType();
        employeeJobsPage.clickOnSaveButton();
    }

    @Step
    public void verifySalary() {
        assertTrue(employeeJobsPage.getCycleSalary());
    }

    @Step
    public void verifyFullTimePayRate() {
        assertTrue(employeeJobsPage.getFullTimePayRate());
    }

    @Step
    public void editComments(){
        employeeJobsPage.updateComments();
        employeeJobsPage.clickOnSaveButton();
    }

    @Step
    public void approveEmployeeJob() {
        employeeJobsPage.clickApproveEmployeeJob();
        employeeJobsPage.clickApproveJobConfirmation();
    }

    @Step
    public void submitJobToPayroll(){

        employeeJobsPage.clickSubmitJobToPayroll();
        employeeJobsPage.clickOkForSubmitConfirmationYes();
        //employeeJobsPage.clickSubmitOkButton();
        //employeeJobsPage.clickRemoveSubmitButton();

    }

    @Step
    public void clickOnCancelButton() {
        employeeJobsPage.clickCancelButton();
    }


    @Step
    public void clickSortJobStatus() {
        employeeJobsPage.clickToSortJob();
        employeeJobsPage.applyCheckToSelect();
    }

    @Step
    public void clickDeleteButton() {
        employeeJobsPage.clickDelete();
        employeeJobsPage.clickConfirmationMsg();
    }



    /*@Step
    public void openEmployeeDropDown(){
        logger.info("Selecting the value from the Payroll Cycle");
        employeeJobsPage.openEmployeeDD();
        logger.info("Value of Biweekly has been selected from Payroll Cycle dropdown.");
    }*/


}
