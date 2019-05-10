package com.aptafund.test.pages.MyAptaFund;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAptaFundForApp2HomePage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(MyAptaFundForApp2HomePage.class);


    @FindBy(id = "menuheader0")
    private WebElementFacade myAptaFund;


    @FindBy(css = ".menulink[href=\"/QAAutom/Purchasing/RequisitionApproval/Manage\"]")
    private WebElementFacade myPurchaseRequisitionApprovalsForApp2Link;


    public void navigateToMyPurchaseRequisitionApprovalsForApp2() {
        myPurchaseRequisitionApprovalsForApp2Link.waitUntilPresent();
        myPurchaseRequisitionApprovalsForApp2Link.waitUntilVisible();
        myPurchaseRequisitionApprovalsForApp2Link.waitUntilEnabled();
        myPurchaseRequisitionApprovalsForApp2Link.waitUntilClickable();
        myPurchaseRequisitionApprovalsForApp2Link.click();

    }


    public void navigateToMyAptaFundForApp2() {
        myAptaFund.waitUntilVisible();
        myAptaFund.waitUntilClickable();
        myAptaFund.click();

    }

}