package com.aptafund.test.steps.PurchasingAndPayables;

import com.aptafund.test.pages.PurchasingAndPayables.PurchasingAndPayablesHomePage;
import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 4/11/2017.
 */
public class PurchasingAndPayableSteps extends ScenarioSteps {

    private static final Logger logger = LoggerFactory.getLogger(PurchasingAndPayableSteps.class);

    PurchasingAndPayablesHomePage purchasingAndPayablesHomePage;


    @Step
    public void navigateToPurchaseAndPayable(){
        purchasingAndPayablesHomePage.clickPurchaseAndPayablesHeader();
    }


    @Step
    public void navigateToPurchasingAndPayable() {
        logger.info("Click on the Purchasing and Payable Header");
        purchasingAndPayablesHomePage.clickOnPurchasingAndPayble();
    }
    @Step
    public void navigateToPurchasingAndPayableForApp1() {
        logger.info("Click on the Purchasing and Payable Header For Approver 1");
        purchasingAndPayablesHomePage.clickOnPurchasingAndPaybleForApp1();
    }
}
