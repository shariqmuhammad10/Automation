package com.aptafund.test.features.login.Payroll;

import com.aptafund.test.steps.HRPayrollESS.ManagePayrollSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 10/10/2016.
 */


@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagePayrollTest {

    private static final Logger logger = LoggerFactory.getLogger(ManagePayrollTest.class);


    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    ManagePayrollSteps managePayrollSteps;

    @Ignore
    @Test

    @WithTags(
            {       @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )
    public void verifyNavigateToManagePayroll(){

        logger.info("<---------------------------------------------------->");
        logger.info("<-- Verify Navigate to Manage Payroll Link-->");
        logger.info("<---------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManagePayroll();

        logger.info("<------------------------------------------------------>");
        logger.info("<---- Navigate to Manage Payroll Link Successfully.---->");
        logger.info("<------------------------------------------------------>");

    }

    //@Ignore
    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyAddJobToRegister() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManagePayroll();
        hrManagePayrollHomeSteps.addPayrollRegister();
        managePayrollSteps.openPayrollCycle();
        managePayrollSteps.selectBiweeklyValue();
        managePayrollSteps.openPayrollPeriod();
        managePayrollSteps.selectPayrollPeriodValue();
        managePayrollSteps.addRegisterNumber();
        managePayrollSteps.openRegisterType();
        managePayrollSteps.selectRegisterTypeValue();
        managePayrollSteps.setRegisterDescription();
        managePayrollSteps.saveAddRegister();
        managePayrollSteps.selectRegisterNumber();
        managePayrollSteps.selectReturnToSearch();
        managePayrollSteps.searchRegister();
        managePayrollSteps.selectCheckboxRegister();
        managePayrollSteps.clickEditButton();
        managePayrollSteps.addJobToRegister();
        managePayrollSteps.selectEmployeeFromAddJobReg();
        managePayrollSteps.selectJobFromAddJobReg();
        managePayrollSteps.verifyFullTimePayRate();

        managePayrollSteps.saveAddJobToRegister();
        managePayrollSteps.selectCheckBoxToSelectJob();
        managePayrollSteps.clickEditButton();
        managePayrollSteps.clickAndSetJobHours();
        managePayrollSteps.verifyGrossPay();

        managePayrollSteps.saveJobEditHours();
        managePayrollSteps.selectReturnToSearch();
        managePayrollSteps.searchRegister();
        managePayrollSteps.clickSubmitRegButton();
        managePayrollSteps.clickYesConfirmMsg();
        managePayrollSteps.clickApproveReg();
        managePayrollSteps.clickYesConfirmMsgForApproval();
        managePayrollSteps.clickOnMoreButton();

        managePayrollSteps.clickPrintPayrollCheck();
        managePayrollSteps.payCheckAmountVerification();

        managePayrollSteps.clickOnCheckBoxToSelectRegularPayment();
        managePayrollSteps.clickPrintPayCheck();
        managePayrollSteps.clickPrintPDF();
        managePayrollSteps.clickVerifyOption();
        managePayrollSteps.clickClosePayCheckAfterPrinting();
        //managePayrollSteps.clickClosePayCheckPrintingWindoeAfterPrinting();
    }

    /*@Ignore
    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyPrintPayChecks() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManagePayroll();
        managePayrollSteps.searchFixRegister();
        managePayrollSteps.selectCheckboxRegister();
        managePayrollSteps.clickOnMoreButton();

        managePayrollSteps.clickPrintPayrollCheck();
        managePayrollSteps.payCheckAmountVerification();


    }*/

    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyAddNormalRegister() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManagePayroll();
        hrManagePayrollHomeSteps.addPayrollRegister();
        managePayrollSteps.openPayrollCycle();
        managePayrollSteps.selectBiweeklyValue();
        managePayrollSteps.openPayrollPeriod();
        managePayrollSteps.selectPayrollPeriodValue();
        managePayrollSteps.addNormalRegisterNumber();
        managePayrollSteps.openRegisterType();
        managePayrollSteps.selectNorRegisterTypeValue();
        managePayrollSteps.setNorRegisterDescription();
        managePayrollSteps.saveAddRegister();
        managePayrollSteps.selectNorRegisterNumber();
        managePayrollSteps.selectReturnToSearch();
        managePayrollSteps.searchNorRegister();
        managePayrollSteps.selectCheckboxRegister();
        managePayrollSteps.deleteRegister();
        managePayrollSteps.deleteConfirmMessage();

    }




    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyRemoveJobToRegister() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManagePayroll();
        hrManagePayrollHomeSteps.addPayrollRegister();
        managePayrollSteps.openPayrollCycle();
        managePayrollSteps.selectBiweeklyValue();
        managePayrollSteps.openPayrollPeriod();
        managePayrollSteps.selectPayrollPeriodValueForRemove();
        managePayrollSteps.addRegisterNumber();
        managePayrollSteps.openRegisterType();
        managePayrollSteps.selectRegisterTypeValue();
        managePayrollSteps.setRegisterDescription();
        managePayrollSteps.saveAddRegister();
        managePayrollSteps.addJobToRegister();
        managePayrollSteps.selectEmployeeFromAddJobReg();
        managePayrollSteps.selectJobFromAddJobReg();
        managePayrollSteps.saveAddJobToRegister();
        managePayrollSteps.selectCheckBoxToSelectJob();
        managePayrollSteps.removeJobFromRegister();
        managePayrollSteps.closeConfirmMessage1();
        managePayrollSteps.closeTheSuccessWindow();
        managePayrollSteps.selectRegisterNumber();
        managePayrollSteps.selectReturnToSearch();
        managePayrollSteps.searchRegister();
        managePayrollSteps.selectCheckboxRegister();
        managePayrollSteps.deleteRegister();
        managePayrollSteps.deleteConfirmMessage();


    }

    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void voidRegister() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManagePayroll();
        hrManagePayrollHomeSteps.addPayrollRegister();
        managePayrollSteps.openPayrollCycle();
        managePayrollSteps.selectBiweeklyValue();
        managePayrollSteps.openPayrollPeriod();
        managePayrollSteps.selectPayrollPeriodValueForVoid();
        managePayrollSteps.addRegisterNumber();
        managePayrollSteps.openRegisterType();
        managePayrollSteps.selectRegisterTypeValue();
        managePayrollSteps.setRegisterDescription();
        managePayrollSteps.saveAddRegister();
        //managePayrollSteps.selectRegisterNumber();
        //managePayrollSteps.selectReturnToSearch();
       // managePayrollSteps.searchRegister();
        //managePayrollSteps.selectCheckboxRegister();
        //managePayrollSteps.clickEditButton();
        managePayrollSteps.addJobToRegister();
        managePayrollSteps.selectEmployeeFromAddJobReg();
        managePayrollSteps.selectJobFromAddJobReg();
        managePayrollSteps.saveAddJobToRegister();
        managePayrollSteps.selectCheckBoxToSelectJob();
        managePayrollSteps.clickEditButton();
        managePayrollSteps.clickAndSetJobHours();
        managePayrollSteps.saveJobEditHours();
        managePayrollSteps.selectRegisterNumber();
        managePayrollSteps.selectReturnToSearch();
        managePayrollSteps.searchRegister();
        managePayrollSteps.selectCheckboxRegister();
        managePayrollSteps.clickSubmitRegButton();
        managePayrollSteps.clickYesConfirmMsg();
        managePayrollSteps.clickApproveReg();
        managePayrollSteps.clickYesConfirmMsgForApproval();
        managePayrollSteps.clickOnMoreButton();
        managePayrollSteps.clickVoidRegister();
        managePayrollSteps.clickYesConfirmMsgToVoid();

    }

    @Ignore
        @Test

        @WithTags(
                {
                        @WithTag(type = "release", name = "Smoke-test"),
                        @WithTag("Priority:High")
                }
        )
        public void verifySubmitAndPrintSpecialPayrollRegister(){
            aptaLoginSteps.navigateToLoginPage();
            aptaLoginSteps.loginIntoApta();
            hrManagePayrollHomeSteps.navigateToPayroll();
            hrManagePayrollHomeSteps.navigateToManagePayroll();
            managePayrollSteps.searchRegister();
            managePayrollSteps.selectCheckBoxToSelectAppReg();
            managePayrollSteps.clickOnMoreButton();
            managePayrollSteps.clickPrintPayrollCheck();
            managePayrollSteps.clickOnCheckBoxToSelectRegularPayment();
            managePayrollSteps.clickPrintPayCheck();
            managePayrollSteps.clickPrintPDF();
            managePayrollSteps.clickVerifyOption();
            managePayrollSteps.clickClosePayCheckAfterPrinting();
            managePayrollSteps.clickClosePayCheckPrintingWindoeAfterPrinting();


    }
    //@Ignore
    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )

    public void verifyNavigateToManageDeductions(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToManageDeductions();
    }

    //@Ignore
    @Test

    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyNavigateToDeductionAssignment(){
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        hrManagePayrollHomeSteps.navigateToPayroll();
        hrManagePayrollHomeSteps.navigateToDeductionAssignment();
    }


}
