package com.aptafund.test.steps.HRPayrollESS;

import com.aptafund.test.pages.hrPayrollESS.DeductionAssignmentPage;
import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 2/2/2017.
 */
public class DeductionAssignmentSteps extends ScenarioSteps {

    private static final Logger Logger = LoggerFactory.getLogger(DeductionAssignmentSteps.class);


    HrPayrollEssHomePage hrPayrollEssHomePage;
    DeductionAssignmentPage deductionAssignmentPage;


    @Step

    public void navigateToPayroll()
    {
        hrPayrollEssHomePage.clickHrPayrollESSHeader();
    }


    @Step
    public void navigateToDeductionAssignment(){
        waitABit(2000);
        deductionAssignmentPage.clickDeductionAssingment();
    }

    @Step
    public void addNewDeductionSet(){
        deductionAssignmentPage.clickAddNewDeductionAssignmentButton();
        deductionAssignmentPage.selectEmployeeValueDD();
        deductionAssignmentPage.addComments();
        deductionAssignmentPage.selectStateValueDD();
        deductionAssignmentPage.saveDeductionSet();
        deductionAssignmentPage.selectFillingStatus();
        //deductionAssignmentPage.saveDeductionDetails();
        deductionAssignmentPage.clickAddFixedAmountDeduction();
        deductionAssignmentPage.selectDeductionValueDD();
        //deductionAssignmentPage.addFixedAmountDeductionComments();
        deductionAssignmentPage.saveFixedAmountDeductionSet();

    }

    @Step
    public void searchNewDedAssignment() {
        deductionAssignmentPage.searchNewAssignment();
        deductionAssignmentPage.applyCheckInCheckBox();



    }

    @Step
    public void editDedAssignment() {
        Logger.info("Click on Edit button of Direct Deposit for Percentage ");
        deductionAssignmentPage.editDeductionAssignment();
    }

    @Step
    public void clickOnDirectDeposit() {
        Logger.info("Click on Direct Deposit Tab");
        deductionAssignmentPage.clickDirectDepositTab();
        Logger.info("Click Successfully on Direct Deposit Tab");
    }

    @Step
    public void clickOnPercentage() {
        Logger.info("Click on Percentage Tab");
        deductionAssignmentPage.clickPercentageTab();
        Logger.info("Click Successfully on Percentage Tab");
    }

    @Step
    public void addPercentage() {
        Logger.info("Click on Add Percentage Button");
        deductionAssignmentPage.clickOnAddPercentage();
        Logger.info("Click Successfully on Add Percentage Button");
        deductionAssignmentPage.selectDeductionDD();
        deductionAssignmentPage.setDeductionValue();
        deductionAssignmentPage.setComments();
        deductionAssignmentPage.saveNonVariablePercentage();

    }

    @Step
    public void addPercentageToDelete() {
        Logger.info("Click on Add Percentage Button");
        deductionAssignmentPage.clickOnAddPercentage();
        Logger.info("Click Successfully on Add Percentage Button");
        deductionAssignmentPage.selectDeductionDD();
        deductionAssignmentPage.setDeductionValueForDelete();
        deductionAssignmentPage.setComments();
        deductionAssignmentPage.saveNonVariablePercentage();

    }

    @Step
    public void addDirectDepositPercentage() {
        Logger.info("Click on Add Direct Deposit");
        deductionAssignmentPage.addDirectDepositInDeduction();
        deductionAssignmentPage.setBankName();
        deductionAssignmentPage.setRoutingNumber();
        deductionAssignmentPage.setAccountNumber();
        deductionAssignmentPage.setAccountType();
        deductionAssignmentPage.setPreNotification();
        deductionAssignmentPage.setPrimaryLocation();
        deductionAssignmentPage.setPercentValue();
        deductionAssignmentPage.saveDirectDeposit();
    }




    @Step
    public void addDirectDepositUsingPercentage() {
        Logger.info("Click on Add Direct Deposit using Percentage");
        deductionAssignmentPage.addDirectDepositInDeduction();
        deductionAssignmentPage.setBankName();
        deductionAssignmentPage.setRoutingNumber();
        deductionAssignmentPage.setAccountNumber();
        deductionAssignmentPage.setAccountType();
        deductionAssignmentPage.setPreNotification();
        deductionAssignmentPage.setPrimaryLocation();
        deductionAssignmentPage.setPercentValue();
        deductionAssignmentPage.saveDirectDeposit();




    }


    @Step
    public void addDirectDepositAmount() {
        Logger.info("Click on Add Direct Deposit");
        deductionAssignmentPage.addDirectDepositInDeduction();
        deductionAssignmentPage.setBankName();
        deductionAssignmentPage.setRoutingNumber();
        deductionAssignmentPage.setAccountNumber();
        deductionAssignmentPage.setAccountType();
        deductionAssignmentPage.setPreNotification();
        deductionAssignmentPage.setPrimaryLocation();
        deductionAssignmentPage.setAmountValue();
        deductionAssignmentPage.saveDirectDeposit();
    }

    @Step
    public void deletePercetage() {
        Logger.info("Click on Delete Percentage Button");
        deductionAssignmentPage.applyCheckForNewlyAddedDeduction();
        deductionAssignmentPage.clickOnDeleteButton();

    }
    @Step
    public void editDeductionSet() {
        Logger.info("Click on Edit Fixed Amount Deduction Button");
        deductionAssignmentPage.applyCheckToEditDeductionDetails();
        Logger.info("Edit button is clicked waiting for POP up");
        deductionAssignmentPage.clickOnEditButton();
        Logger.info("Waiting for updating the comments");
        deductionAssignmentPage.updateCommentsToCheckEditFunctionality();
        Logger.info("Comments has been updated");
    }
}
