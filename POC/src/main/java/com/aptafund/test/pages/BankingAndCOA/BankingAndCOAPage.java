package com.aptafund.test.pages.BankingAndCOA;

import com.aptafund.test.actions.WaitActions;
import com.aptafund.test.pages.hrPayrollESS.HrPayrollEssHomePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankingAndCOAPage extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(BankingAndCOAPage.class);

    @FindBy(id = "menuheader2")
    private WebElementFacade bankingAndCOAHeader;

    @FindBy (css = "[href=\"/QAAutom/ChartofAccountsAdministration/ChartofAccounts/Manage\"]" )
    private WebElementFacade chartOfAccountsLink;





    public void clickOnBankingAndCOA(){
        waitABit(5000);
        bankingAndCOAHeader.waitUntilVisible();
        bankingAndCOAHeader.waitUntilEnabled();
        bankingAndCOAHeader.waitUntilClickable();
        bankingAndCOAHeader.click();

    }


    public void clickOnChartOfAccounts() {
        chartOfAccountsLink.waitUntilVisible();
        chartOfAccountsLink.waitUntilEnabled();
        chartOfAccountsLink.waitUntilClickable();
        chartOfAccountsLink.click();
    }







}



