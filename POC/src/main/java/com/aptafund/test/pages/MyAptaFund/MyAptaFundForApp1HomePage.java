package com.aptafund.test.pages.MyAptaFund;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyBoolean;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAptaFundForApp1HomePage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(MyAptaFundForApp1HomePage.class);

    @FindBy(id = "menuheader0")
    private WebElementFacade myAptaFund;

    @FindBy (id ="lnk_navigatetonewleaverequest")
    private WebElementFacade newLeaveRequest;

    @FindBy(css = "[href=\"/QAAutom/Purchasing/RequisitionApproval/Manage\"]")
    private WebElementFacade myPurchaseRequisitionApprovalsLink;


    public void navigateToMyPurchaseRequisitionApprovals() {
        myPurchaseRequisitionApprovalsLink.waitUntilPresent();
        myPurchaseRequisitionApprovalsLink.waitUntilVisible();
        myPurchaseRequisitionApprovalsLink.waitUntilEnabled();
        myPurchaseRequisitionApprovalsLink.waitUntilClickable();
        myPurchaseRequisitionApprovalsLink.click();

    }



    public void navigateToMyAptaFundForApp1() {
        waitABit(9000);
        myAptaFund.waitUntilVisible();
        myAptaFund.waitUntilEnabled();
        myAptaFund.waitUntilClickable();
        waitABit(9000);
        myAptaFund.click();

        //evaluateJavascript($'((setInterval(function(){ alert("Hello"); }, 3000)))');
       /*     newLeaveRequest.shouldBePresent();
        for (int i = 0; i <= 0; i++) {
            if (newLeaveRequest.isPresent()) {
                waitABit(3000);
                myAptaFund.click();
            } else {
                System.out.println("Reach to My purchase Requisition link");

            }
        }
    }*/


    }


    }







