package com.aptafund.test.steps.HRPayrollESS;

import com.aptafund.test.actions.DatePickerActions;
import com.aptafund.test.pages.hrPayrollESS.ManageEmployeesPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 11/23/2016.
 */
public class ManageEmplopyeeSteps extends ScenarioSteps{

    private static final Logger logger = LoggerFactory.getLogger(ManageEmplopyeeSteps.class);

    ManageEmployeesPage manageEmployeesPage;
    DatePickerActions datePickerActions;

    @Step
    public void navigateToManageEmployee(){
        manageEmployeesPage.clickManageEmployee();
    }


 /*   @Step

    public void addNewEmployeeData(){
        logger.info("Selecting the value from the Payroll Cycle");
        manageEmployeesPage.setLastNameData();
        manageEmployeesPage.setFirstNameData();
        manageEmployeesPage.setMiddleNameData();
        //manageEmployeesPage.setFullNameData();
        manageEmployeesPage.setSSNValueData();

        logger.info("Value of Biweekly has been selected from Payroll Cycle dropdown.");
    }
*/
    @Step

    public void addNewEmployee(){
        logger.info("Selecting the value from the Payroll Cycle");
        manageEmployeesPage.clickAddManageEmployees();
        manageEmployeesPage.setLastNameData();
        manageEmployeesPage.setFirstNameData();
        manageEmployeesPage.setMiddleNameData();
        manageEmployeesPage.setSSNValueData();
        datePickerActions.setBirthDate();
        manageEmployeesPage.setGender();
        manageEmployeesPage.setEthenticity();
        manageEmployeesPage.setComments();
        datePickerActions.setHireDate();
        datePickerActions.setEligibilityDate();
        datePickerActions.setTerminationDate();
        datePickerActions.setRetirementDate();
        manageEmployeesPage.setClassification();
        manageEmployeesPage.setSite();
        manageEmployeesPage.setDepartment();
        manageEmployeesPage.setGroup();
        manageEmployeesPage.setTerminationReason();
        manageEmployeesPage.saveEmployee();

    }

    @Step

    public void searchNewlyCreatedEmployee(){
        logger.info("Search the newly created Employed");
        manageEmployeesPage.searchNewEmployee();
        waitABit(6000);

    }

    @Step

    public void sortEmployee(){
        logger.info("Sort Employee by ID to find the latest added Employee");
        waitABit(12000);
        manageEmployeesPage.setSortEmployeeByNumber();


    }

    @Step

    public void selectCheckBox(){
        logger.info("Select the Check box to chose the newly Added Employee");
        manageEmployeesPage.selectCheckBox();
        waitABit(6000);

    }
    @Step

    public void clickOnEnableEmployee(){
        logger.info("Click the Enable Employee Button after newly Added Employee");
        manageEmployeesPage.clickOnEnableEmployee();
        waitABit(6000);

    }

    @Step
    public void closeEmployeePopup() {
        logger.info("Click the Cancel Button after newly Added Employee");
        manageEmployeesPage.closeEmployee();
    }

}



