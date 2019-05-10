package com.aptafund.test.steps.MyAptaFund;

import com.aptafund.test.pages.MyAptaFund.MyAptaFundForApp1HomePage;
import com.aptafund.test.pages.MyAptaFund.MyAptaFundForApp2HomePage;
import com.aptafund.test.pages.MyAptaFund.MyPurchaseRequisitionApprovalsPage;
import com.aptafund.test.pages.PurchasingAndPayables.PurchaseRequisitionPage;
import com.aptafund.test.pages.PurchasingAndPayables.PurchasingAndPayablesHomePage;
import com.aptafund.test.steps.HRPayrollESS.ManagePayrollSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyPRApprovalSteps extends ScenarioSteps{

    private static final Logger logger = LoggerFactory.getLogger(MyPRApprovalSteps.class);

    PurchaseRequisitionPage purchaseRequisitionPage;
    PurchasingAndPayablesHomePage purchasingAndPayablesHomePage;
    MyPurchaseRequisitionApprovalsPage myPurchaseRequisitionApprovalsPage;
    MyAptaFundForApp1HomePage myAptaFundForApp1HomePage;
    MyAptaFundForApp2HomePage myAptaFundForApp2HomePage;


    @Step
    public void navigateToMyPRApprovals(){
        logger.info("Click on the My Purchase Requisition Approvals link");
        myPurchaseRequisitionApprovalsPage.navigateToMyPurchaseRequisitionApprovals();
    }


    public void navigateToMyPRApprovalsForApp2() {

        myAptaFundForApp2HomePage.navigateToMyPurchaseRequisitionApprovalsForApp2();
    }
}
