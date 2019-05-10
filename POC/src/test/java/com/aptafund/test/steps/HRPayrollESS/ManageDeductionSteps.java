package com.aptafund.test.steps.HRPayrollESS;

import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;
import com.aptafund.test.pages.hrPayrollESS.ManageDeductionsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.assertTrue;

/**
 * Created by smuhammad on 1/4/2017.
 */
public class ManageDeductionSteps extends ScenarioSteps {

    HrPayrollEssHomePage hrPayrollEssHomePage;
    ManageDeductionsPage manageDeductionsPage;


    @Step

    public void navigateToPayroll()
    {
        hrPayrollEssHomePage.clickHrPayrollESSHeader();
    }

    @Step
    public void navigateToManageDeduction(){
        manageDeductionsPage.clickOnManageDeduction();
            }

    @Step
    public void addManageDeduction(){
        manageDeductionsPage.addDeduction();
        manageDeductionsPage.setDeductionNameData();
        manageDeductionsPage.setDeductionTypeOption();
        manageDeductionsPage.setCalculationTypeOption();
        manageDeductionsPage.setDeductOrderTypeOption();
        manageDeductionsPage.openVendorDD();
        manageDeductionsPage.openHSASupport();
        manageDeductionsPage.setComment();
        manageDeductionsPage.clickonEPP();
        manageDeductionsPage.setLiabilityElementValue();
        manageDeductionsPage.setEmployerPayPeriod();
        manageDeductionsPage.setExpenditureElementValue();
        manageDeductionsPage.setEmployerLiabilityElementValue();
        manageDeductionsPage.setSaveDeduction();


    }

    @Step
    public void addManageDeductionUsingPercentageCalculation(){
        manageDeductionsPage.addDeduction();
        manageDeductionsPage.setDeductionNameForPercentageData();
        manageDeductionsPage.setDeductionTypeOption();
        manageDeductionsPage.setCalculationUsingPercentage();
        manageDeductionsPage.setDeductOrderTypeOption();
        manageDeductionsPage.openVendorDD();
        manageDeductionsPage.openHSASupport();
        manageDeductionsPage.setComment();
        manageDeductionsPage.clickonPPP();
        manageDeductionsPage.setLiabilityElementValueForPercentageCalculation();
        manageDeductionsPage.setEmployerPayPeriodForPercentage();
        manageDeductionsPage.setExpenditureElementValueForPercent();
        manageDeductionsPage.setEmployerLiabilityElementValueForPercentage();
        manageDeductionsPage.setSaveDeduction();


    }

    @Step
    public void searchDeductionSet(){
        manageDeductionsPage.clickOnSearchBox();
        manageDeductionsPage.searchNewlyCreatedDeduction();

    }

    @Step
    public void searchDeductionSetForPercentageCalculation(){
        manageDeductionsPage.clickOnSearchBox();
        manageDeductionsPage.searchNewlyCreatedDeductionForPercentage();

    }

    @Step
    public void searchDeductionSetToDisable(){
        manageDeductionsPage.clickOnSearchBox();
        manageDeductionsPage.searchNewlyCreatedDeduction();

    }

    @Step
    public void enableNewlyCreatedDeduction(){
        manageDeductionsPage.enableNewlyCreatedDeduction();
    }

    @Step
    public void callConfirmationMsg(){
        manageDeductionsPage.clickYesToConfirm();
    }

    @Step
    public void callConfirmationMsg1(){
        manageDeductionsPage.clickYesToConfirmForDisable();
    }

    @Step
            public void disableDeductionAssignment()
    {
        manageDeductionsPage.disableDeductionSet();

    }

    @Step
    public void navigateToSystemDedcution() {
        manageDeductionsPage.clickOnMoreButton();
        manageDeductionsPage.selectCreateSystemDeduction();
        //manageDeductionsPage.clickYesToConfirm();

    }

    @Step
    public void addSystemDeduction() {
        manageDeductionsPage.createSystemDeductionAZ();

    }

    public void reloadManageDeductionPage() {
        manageDeductionsPage.reloadPageForDisableDeduction();
    }

    @Step
    public void clickEditButton() {
        manageDeductionsPage.clickEditButton();
    }

    @Step
    public void verifyEmployeePayPeriodAmountValue() {
        assertTrue(manageDeductionsPage.verifyEmpPayPeriodAmountValue());
    }

    @Step
    public void refreshPage() {
        manageDeductionsPage.callRefreshPage();
       waitABit(5000);
    }

    @Step
    public void verifyEmployerPayPeriodAmountValue() {
        assertTrue(manageDeductionsPage.verifyEmployerPayPeriodAmountValue());
    }

    @Step
    public void updateCommentsField() {
        manageDeductionsPage.updateComments();
    }

    @Step
    public void savededuction() {
        manageDeductionsPage.setSaveDeduction();
    }
}
