package com.aptafund.test.steps.MyAptaFund;

import com.aptafund.test.pages.MyAptaFund.MyAptaFundForApp1HomePage;
import com.aptafund.test.pages.MyAptaFund.MyAptaFundForApp2HomePage;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAptaFundHomeSteps extends ScenarioSteps {

    private static final Logger logger = LoggerFactory.getLogger(MyAptaFundHomeSteps.class);

    MyAptaFundForApp1HomePage myAptaFundForApp1HomePage;
    MyAptaFundForApp2HomePage myAptaFundForApp2HomePage;



    @Step
    public void navigateToMyPRApprovals(){
        logger.info("Click on the My Purchase Requisition Approvals link");
        myAptaFundForApp1HomePage.navigateToMyPurchaseRequisitionApprovals();
    }


    @Step
    public void navigateToMyAptaFundForApp1(){
        logger.info("Click on the My Apta Fund for Approver level 1 link");
        myAptaFundForApp1HomePage.navigateToMyAptaFundForApp1();
    }

    @Step
    public void navigateToMyAptaFundForApp2(){
        logger.info("Click on the My Apta Fund for Approver level 2 link");
        myAptaFundForApp2HomePage.navigateToMyAptaFundForApp2();
    }


}
