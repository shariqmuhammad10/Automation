package com.aptafund.test.features.login.BankingAndCOA;


import com.aptafund.test.features.login.PurchasingAndPayables.PurchaseRequisitionTest;
import com.aptafund.test.pages.BankingAndCOA.BankingAndCOAPage;
import com.aptafund.test.steps.BankingAndCOA.BankingAndCOASteps;
import com.aptafund.test.steps.BankingAndCOA.ChartOfAccountsSteps;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.HRPayrollESS.ManagePayrollSteps;
import com.aptafund.test.steps.MyAptaFund.MyAptaFundHomeSteps;
import com.aptafund.test.steps.MyAptaFund.MyPRApprovalSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchaseRequisitionSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchasingAndPayableSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ChartOfAccountTest {


    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(PurchaseRequisitionTest.class);

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    ManagePayrollSteps managePayrollSteps;

    @Steps
    PurchasingAndPayableSteps purchasingAndPayableSteps;

    @Steps
    PurchaseRequisitionSteps purchaseRequisitionSteps;

    @Steps
    MyPRApprovalSteps myPRApprovalSteps;

    @Steps
    MyAptaFundHomeSteps myAptaFundHomeSteps;

    @Steps
    BankingAndCOASteps bankingAndCOASteps;

    @Steps
    ChartOfAccountsSteps chartOfAccountsSteps;



    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyNavigateToChartOfAccounts() {


        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<-- Verify Navigate to Chart of Accounts Link ----->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        bankingAndCOASteps.navigateToBankingAndCOA();
        bankingAndCOASteps.navigateToChartOfAccounts();

    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),

            }
    )

    public void addAccountCode(){

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<------------ Verify Add new Account Code ------------>");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        bankingAndCOASteps.navigateToBankingAndCOA();
        bankingAndCOASteps.navigateToChartOfAccounts();
        chartOfAccountsSteps.selectAccountTypeGroup();
        chartOfAccountsSteps.AddAccountCode();


    }


}

