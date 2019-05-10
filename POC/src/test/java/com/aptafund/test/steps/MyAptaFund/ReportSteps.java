package com.aptafund.test.steps.MyAptaFund;

import com.aptafund.test.pages.Reports.ReportsPage;
import com.aptafund.test.steps.PurchasingAndPayables.PurchasingAndPayableSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportSteps extends ScenarioSteps {


        private static final Logger logger = LoggerFactory.getLogger(PurchasingAndPayableSteps.class);

        ReportsPage reportsPage;


        @Step
        public void navigateToReports() {
            logger.info("Click on the Purchasing and Payable Header");
            reportsPage.clickOnReports();
        }

        @Step
        public void createAPAgingDetailReport() {
            logger.info("Create AP Aging Detail Report");
            reportsPage.selectAPAgingDetailReportsValue();
            reportsPage.clickOnReportToXLS();
            reportsPage.compareOutputMessage();

            }

        @Step
        public void createAPAgingSummaryReport() {
        logger.info("Create AP Aging Summary report");
        reportsPage.selectAPAgingSummaryReportsValue();
        reportsPage.clickOnReportToXLS();
        reportsPage.compareOutputMessage();
            }

        @Step
        public void createAccountActivityByPurchaseOrderReport() {
            logger.info("Create Account Activity By Purchase Order report");
            reportsPage.selectAccountActivityByPurchaseOrderValue();
            reportsPage.clickOnReportToXLSForAAbyPO();
            reportsPage.compareOutputMessage();


            }
        @Step
        public void createAccountActivityByWarrantReport() {
        logger.info("Create Account Activity By Warran report");
        reportsPage.selectAccountActivityByWarrantValue();
        reportsPage.clickOnReportToXLS();
        reportsPage.compareOutputMessage();


    }

    @Step
    public void createAccountsPayableVoucherFormReport1() {
        logger.info("Create Accounts Payable Voucher Form report");
        reportsPage.selectAccountsPayableVoucherFormValue();
        reportsPage.clickOnReportToXLS();
        reportsPage.compareOutputMessage();


    }

    @Step
    public void createAPWarrantTransferFormReport() {
        logger.info("Create AP Warrant Transfer Form report");
        reportsPage.selectAPWarrantTransferFormValue();
        reportsPage.clickOnReportToXLS();
        reportsPage.compareOutputMessage();

    }

    @Step
    public void createCheckListingReport() {
        logger.info("Create Check Listing report");
        reportsPage.selectCheckListingValue();
        reportsPage.clickOnReportToXLS();
        reportsPage.compareOutputMessage();


    }
    @Step
    public void createCheckReport() {
        logger.info("Create Check report");
        reportsPage.selectCheckReportValue();
        reportsPage.clickOnReportToXLS();
        reportsPage.compareOutputMessage();


    }

    @Step
    public void createPurchaseOrderInquiryReport() {
        logger.info("Create Purchase Order Inquiry");
        reportsPage.selectPurchaseOrderInquiry();
        reportsPage.selectPurchaseOrderDropDownValue();
        reportsPage.clickOnReportToXLS();

        //reportsPage.compareOutputMessage();
    }
}

