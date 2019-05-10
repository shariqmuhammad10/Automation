package com.aptafund.test.steps.BankingAndCOA;

import com.aptafund.test.pages.BankingAndCOA.ChartOfAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChartOfAccountsSteps extends ScenarioSteps {


        private static final Logger logger = LoggerFactory.getLogger(ChartOfAccountsSteps.class);

        ChartOfAccountPage chartOfAccountPage;

    @Step
    public void selectAccountTypeGroup() {
        waitABit(5000);
        chartOfAccountPage.selectAccountTypeGroup();

    }

    @Step
    public void AddAccountCode() {
        waitABit(5000);
        chartOfAccountPage.clickOnAddAccountCount();
    }
}
