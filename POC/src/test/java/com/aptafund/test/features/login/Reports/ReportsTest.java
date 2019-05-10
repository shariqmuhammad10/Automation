package com.aptafund.test.features.login.Reports;


import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.HRPayrollESS.ManagePayrollSteps;
import com.aptafund.test.steps.MyAptaFund.MyAptaFundHomeSteps;
import com.aptafund.test.steps.MyAptaFund.MyPRApprovalSteps;
import com.aptafund.test.steps.MyAptaFund.ReportSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchaseRequisitionSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchasingAndPayableSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
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
import org.slf4j.LoggerFactory;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class ReportsTest {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(ReportsTest.class);

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    PurchasingAndPayableSteps purchasingAndPayableSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    ManagePayrollSteps managePayrollSteps;

    @Steps
    ReportSteps reportSteps;

    @Steps
    PurchaseRequisitionSteps purchaseRequisitionSteps;




    @Steps
    MyPRApprovalSteps myPRApprovalSteps;

    @Steps
    MyAptaFundHomeSteps myAptaFundHomeSteps;



    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createAPAgingDetailReport() {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<---------Create A/P Aging Detail Reports ------------>");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createAPAgingDetailReport();

    }


    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createAPAgingSummaryReport() {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<---------Create A/P Aging Summary Reports------------>");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createAPAgingSummaryReport();
    }

    @Ignore
    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createAccountActivityByPurchaseOrderReport() {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<--Create Account Activity by Purchase Order Reports-->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createAccountActivityByPurchaseOrderReport();
    }



    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createAccountActivityByWarrantReport () {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<--Create Account Activity by Warrant Reports--------->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createAccountActivityByWarrantReport();
    }


    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createAccountsPayableVoucherFormReport () {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<--Create Accounts Payable Voucher Form Reports--------->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createAccountsPayableVoucherFormReport1();
    }

    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createAPWarrantTransferFormReport () {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<--Create AP Warrant Transfer Form Reports--------->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createAPWarrantTransferFormReport();
    }

    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createCheckListingReport () {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<---------Create Check Listing Report Reports--------->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createCheckListingReport();
    }

    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createCheckReport () {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<---------Create Check Listing Report Reports--------->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createCheckReport();
    }


    @Test
    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 3"),
                    @WithTag("Priority:High")
            }
    )

    public void createPurchaseOrderInquiryReport() {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<---------Create Purchase Order Inquiry Reports------->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginForReportsTest();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        reportSteps.navigateToReports();
        reportSteps.createPurchaseOrderInquiryReport();
    }

}
