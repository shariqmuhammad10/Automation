package com.aptafund.test.steps.BankingAndCOA;

import com.aptafund.test.pages.BankingAndCOA.BankingAndCOAPage;
import com.aptafund.test.pages.BankingAndCOA.ChartOfAccountPage;
import com.aptafund.test.steps.HRPayrollESS.DeductionAssignmentSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankingAndCOASteps extends ScenarioSteps {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(BankingAndCOASteps.class);

    BankingAndCOAPage bankingAndCOAPage;
    ChartOfAccountPage chartOfAccountPage;


    @Step
    public void navigateToBankingAndCOA(){
        waitABit(5000);
        bankingAndCOAPage.clickOnBankingAndCOA();

    }


    @Step
    public void navigateToChartOfAccounts() {
        waitABit(5000);
        bankingAndCOAPage.clickOnChartOfAccounts();
    }


}
