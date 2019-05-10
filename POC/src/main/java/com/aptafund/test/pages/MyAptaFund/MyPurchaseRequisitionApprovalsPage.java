package com.aptafund.test.pages.MyAptaFund;

import com.aptafund.test.actions.WaitActions;
import com.aptafund.test.pages.PurchasingAndPayables.PurchaseRequisitionPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyPurchaseRequisitionApprovalsPage extends WaitActions {

        private static final Logger logger = LoggerFactory.getLogger(PurchaseRequisitionPage.class);


    @FindBy(css = "[href=\"/QAAutom/Purchasing/RequisitionApproval/Manage\"]")
    private WebElementFacade myPurchaseRequisitionApprovalsLink;




    public void navigateToMyPurchaseRequisitionApprovals() {
        waitABit(8000);
        myPurchaseRequisitionApprovalsLink.waitUntilPresent();
        myPurchaseRequisitionApprovalsLink.waitUntilVisible();
        myPurchaseRequisitionApprovalsLink.waitUntilEnabled();
        myPurchaseRequisitionApprovalsLink.waitUntilClickable();
        myPurchaseRequisitionApprovalsLink.click();


    }
}
