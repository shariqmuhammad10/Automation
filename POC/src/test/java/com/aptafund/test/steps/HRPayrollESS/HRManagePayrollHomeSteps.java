package com.aptafund.test.steps.HRPayrollESS;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;

/**
 * Created by smuhammad on 10/10/2016.
 */
public class HRManagePayrollHomeSteps extends ScenarioSteps{

    private static final Logger logger = LoggerFactory.getLogger(HRManagePayrollHomeSteps.class);

    HrPayrollEssHomePage hrPayrollEssHomePage;


    @Step
    public void navigateToPayroll(){
        waitABit(6000);
        hrPayrollEssHomePage.clickHrPayrollESSHeader();
        }

    @Step
    public void navigateToManagePayroll(){
        hrPayrollEssHomePage.clickManagePayroll();
    }

    @Step
    public void addPayrollRegister(){
        hrPayrollEssHomePage.clickAddPayrollManagement();

    }


    @Step
    public void navigateToManageDeductions(){
        hrPayrollEssHomePage.clickManageDeductions();
    }

    @Step
    public void navigateToDeductionAssignment(){
        hrPayrollEssHomePage.clickDeductionAssignment();
    }


}
