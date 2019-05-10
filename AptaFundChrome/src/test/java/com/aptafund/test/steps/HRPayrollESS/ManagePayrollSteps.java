package com.aptafund.test.steps.HRPayrollESS;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aptafund.test.pages.hrPayrollESS.ManagePayrollPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by smuhammad on 10/10/2016.
 */
public class ManagePayrollSteps extends ScenarioSteps {

    private static final Logger logger = LoggerFactory.getLogger(ManagePayrollSteps.class);

    ManagePayrollPage managePayrollPage;


    @Step
    public void clickVerifyOption(){
        logger.info("Click Verify Option after Print and check in pending status");
        managePayrollPage.clickVerifyOption();
    }

    @Step
    public void clickPrintOption(){
        logger.info("Click Verify Option after Print and check in pending status");
        managePayrollPage.clickPrintPayCheckButton();
    }

    @Step
    public void clickOkVerifyOption(){
        logger.info("Define the description of the Register");
        managePayrollPage.clickOkVerifyOption();
    }

    @Step
    public void openPayrollCycle(){
        logger.info("Selecting the value from the Payroll Cycle");
        managePayrollPage.openPayRollCycle();
        logger.info("Value of Biweekly has been selected from Payroll Cycle dropdown.");
    }


    @Step
    public void selectBiweeklyValue(){
        logger.info("Selecting the Biweekly value from the Payroll Cycle List Box");
        managePayrollPage.selectBiWeekly();

    }

    @Step
    public void openPayrollPeriod(){
        logger.info("Selecting the value from the Payroll Cycle");
        managePayrollPage.openPayRollPeriodForRemove();
        logger.info("Value of Biweekly has been selected from Payroll Cycle dropdown.");
    }


    @Step
    public void selectPayrollPeriodValue(){
        logger.info("Selecting the Biweekly value from the Payroll Cycle List Box");
        waitABit(6000);
        managePayrollPage.selectSepValue();

    }

    @Step
    public void selectPayrollPeriodValueForRemove(){
        logger.info("Selecting the Biweekly value from the Payroll Cycle List Box");
        waitABit(6000);
        managePayrollPage.selectJulyValueToRemove();

    }


    @Step
    public void selectPayrollPeriodValueForVoid(){
        logger.info("Selecting the Biweekly value from the Payroll Cycle List Box");
        waitABit(6000);
        managePayrollPage.selectJulyValueForVoid();

    }


    @Step
    public void openRegisterType(){
        logger.info("Open the Register Drop down");
        managePayrollPage.openRegisterType();
        logger.info("Value of Biweekly has been selected from Payroll Cycle dropdown.");
    }


    @Step
    public void selectRegisterTypeValue(){
        logger.info("Selecting the Register value from the Register Type  List Box");
        waitABit(6000);
        managePayrollPage.selectSpecialRegistor();

    }

    @Step
    public void selectNorRegisterTypeValue(){
        logger.info("Selecting the Register value from the Register Type  List Box");
        waitABit(6000);
        managePayrollPage.selectNormalRegistor();

    }

    @Step
    public void setRegisterDescription(){
        logger.info("Define the description of the Register");
        managePayrollPage.setRegisterDescription();
    }

    @Step
    public void setNorRegisterDescription(){
        logger.info("Define the description of the Register");
        managePayrollPage.setNorRegisterDescription();
    }

    @Step
    public void clickClosePayCheckAfterPrinting(){
        logger.info("Clcik on Close button After Print Paychecks");
        managePayrollPage.clickClosePayCheckDialog();
    }


    @Step
    public void cancelAddingRegister() {
        logger.info("Hit Cancle add register option");
        managePayrollPage.cancelAddRegister();
    }

    @Step

    public void saveAddRegister(){
        logger.info("Hit Save add register option");
        managePayrollPage.saveAddRegistor();

    }

    @Step
    public void saveAfterAddJobToRegistor(){
        logger.info("Hit Save After add Job to register option");
        managePayrollPage.clickSaveAfterAddJobToRegistor();
    }

    @Step
    public void selectEmployeeFromAddJobReg(){
        logger.info("select employee value from Employee DD from add register");
        managePayrollPage.selectEmpFromAddJobReg();

    }

    @Step
    public void selectJobFromAddJobReg(){
        logger.info("select Job from Job Name DD from add register");
        managePayrollPage.selectJobNameFromAddJobReg();

    }


    @Step
    public void selectJobFromRemoveJobReg(){
        logger.info("select Job from Job Name DD from add register");
        managePayrollPage.selectJobNameFromRemoveJobReg();

    }

    @Step
    public void addJobToRegister() {
        logger.info("Hit add Job to Registor");
        managePayrollPage.clickAddJobToRegistor();
    }

    @Step
    public void saveAddJobToRegister() {
        logger.info("Saving add Job to Registor");
        managePayrollPage.clickOnSaveAddJobToRegister();
        waitABit(5000);
    }

    @Step
    public void selectCheckAllCheckboxForJobs() {
        logger.info("Select Check for Check box selection in Job to Registor");
        managePayrollPage.clickOnSelectAllCheckBox();
    }

    @Step
    public void selectReturnToSearch() {
        logger.info("Click on Return to Search option to get back on Main search page.");
        managePayrollPage.clickReturnToSearch();
    }

    @Step
    public void selectRegisterNumber() {
        logger.info("Capture Currently added Registor number.");
        managePayrollPage.captureRegisterNumber();
    }

    @Step
    public void selectNorRegisterNumber() {
        logger.info("Capture Currently added Registor number.");
        managePayrollPage.captureNorRegisterNumber();
    }

    @Step
    public void searchRegister() {
        logger.info("Hit add Job to Registor");
        managePayrollPage.searchRegisterNumber();
    }

    @Step
    public void searchFixRegister() {
        logger.info("Hit add Job to Registor");
        managePayrollPage.searchFixRegisterNumber();
    }

    @Step
    public void searchNorRegister() {
        logger.info("Hit add Job to Registor");
        managePayrollPage.searchNorRegisterNumber();
    }


    @Step
    public void selectCheckBoxToSelectJob() {
        logger.info("Select Check Box to select the Job");
        managePayrollPage.clickToSelectCheckBoxToSelectJob();
    }

    @Step
    public void selectCheckBoxToSelectAppReg() {
        logger.info("Select Check Box to select the Job");
        managePayrollPage.clickToSelectCheckBoxToSelectApprovedReg();
    }

    @Step
    public void clickEditButton() {
        logger.info("Click on the Edit button to Edit the Job");
        waitABit(5000);
        managePayrollPage.clickEditButtonToEditJob();

    }

    @Step
    public void clickAndSetJobHours() {
        logger.info("Edit and Set the Job Hours");
        managePayrollPage.setJobHoursInEditJob();

    }

    @Step
    public void saveJobEditHours() {
        logger.info("Save the Hours from Edit the Job");
        managePayrollPage.clickSaveAfterAddHoursToJob();

    }

    @Step
    public void selectCheckboxRegister(){
        logger.info("Apply Check in the Checkbox for selecting the newly added Register");
        waitABit(3000);
        managePayrollPage.selectCheckBoxToSelectNewAddedRegister();
    }

    @Step
    public void clickSubmitRegButton(){
        logger.info("Click Submit Register button to select the newly added Register");
        managePayrollPage.clickSubmitRegisterButton();
    }

    @Step
    public void clickYesConfirmMsg(){
        logger.info("Click Yes to Confirm that submit the Register1");
        managePayrollPage.clickYesToConfirm();

    }


    @Step
    public void clickYesConfirmMsgForApproval(){
        logger.info("Click Yes to Confirm to Approve the Register");
        managePayrollPage.clickYesToConfirmForApproval();

    }

    @Step
    public void clickYesConfirmMsgToVoid(){
        logger.info("Click Yes to Confirm to Void the Register");
        managePayrollPage.clickYesToConfirmVoid();

    }

    @Step
    public void clickApproveReg(){
        logger.info("Click approve button to Approve Register");
        managePayrollPage.clickApproveRegister();
    }

    @Step
    public void clickOnMoreButton() {
        logger.info("Click On MORE button to select Print Payroll Checks");
        managePayrollPage.clickOnMoreButton();
    }

    @Step
    public void clickPrintPayrollCheck() {
        logger.info("Select check to Print Payroll Checks");
        managePayrollPage.clickPrintPayrollChecks();
    }

    @Step
    public void clickPrintPayCheck() {
        logger.info("Click On Print Payroll to print Checks");
        managePayrollPage.clickPrintPayCheckButton();
    }

    @Step
    public void clickOnCheckBoxToSelectRegularPayment(){
        logger.info("Apply Check Box For the Regular Payment in print Checks");
        managePayrollPage.selectRegularPaymentCheckBox();
    }

    @Step
    public void clickPrintPDF() {
        logger.info("Click On MORE button to select Print Payroll Checks");
        managePayrollPage.clickOnPrintPDFButton();
    }
    @Step
    public void clickOkConfirmMsg() {
        logger.info("Click Ok to confirm message");
        managePayrollPage.clickOkButtonSubmitReg();

    }

    @Step
    public void clickClosePayCheckPrintingWindoeAfterPrinting() {

        logger.info("Click Cancle to Close the print Pay check window After printing complete");
        managePayrollPage.clickOkCancelAfterPrintingComplete();
    }

    @Step
    public void clickVoidRegister() {

        logger.info("Click Void to Void the Register");
        managePayrollPage.clickVoidMenu();
    }

    @Step
    public void removeJobFromRegister() {
        logger.info("Click Remove job to Remove Job from Register");
        managePayrollPage.clickRemoveJobFromRegister();
    }

    @Step
    public void closeTheSuccessWindow() {
        logger.info("Click Close to close the success message popup");
        managePayrollPage.clickCloseButton();

    }

    public void closeConfirmMessage() {
        logger.info("Click on the confirm message");
        managePayrollPage.clickYesToConfirm();
    }
    @Step
    public void closeConfirmMessage1() {

        logger.info("Click on the confirm message");
        managePayrollPage.clickYesToConfirm1();
    }
    @Step
    public void deleteRegister() {
        logger.info("Click on Delete Register button");
        managePayrollPage.clickOnDeleteRegister();
    }
    @Step
    public void deleteConfirmMessage() {
        logger.info("Click on OK button to confirm Deletion");
        managePayrollPage.clickDeleteConfirmMessage();
    }

    @Step
    public void addRegisterNumber() {
        logger.info("Click on Number to generate Register Number");
        managePayrollPage.setRegNameData();
    }

    @Step
    public void addNormalRegisterNumber() {
        logger.info("Click on Number to generate Normal Register Number");
        managePayrollPage.setNormalRegNameData();
    }

    @Step
    public void clickDeleteButton() {
        logger.info("Click on delete button to delete newly created Normal Register");
        managePayrollPage.deleteNormalRegister();
    }

    @Step
    public void verifyFullTimePayRate() {
            assertTrue(managePayrollPage.getFullTimePayRate());
        }

    @Step
    public void verifyGrossPay() {
        assertTrue(managePayrollPage.getGrossPay());
        }


    @Step
    public void payCheckAmountVerification() {
        assertTrue(managePayrollPage.getPayCheckAmount());
    }
}


