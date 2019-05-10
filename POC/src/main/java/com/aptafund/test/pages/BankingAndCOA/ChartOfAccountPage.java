package com.aptafund.test.pages.BankingAndCOA;

import com.aptafund.test.actions.WaitActions;
import com.aptafund.test.pages.PurchasingAndPayables.PurchaseRequisitionPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChartOfAccountPage extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseRequisitionPage.class);


    @FindBy (css =".k-icon.k-i-arrow-60-down")
    private WebElementFacade accountTypeGroup;


    @FindBy (css = "ul#ddlAccountTypeGroup_listbox li:nth-of-type(3)")
    private WebElementFacade accoutTypeGroupValue;


    @FindBy (xpath = ".//*[@id='RenderBody']/div[2]/span[2]/span/span[1]")
    private WebElementFacade accountTypeGroupDD;

    @FindBy (id = "btnAdd__ChartOfAccountsDataView")
    private WebElementFacade accountCodeAddButton;






    public void selectAccountTypeGroup() {
        accountTypeGroupDD.waitUntilVisible();
        accountTypeGroupDD.waitUntilClickable();
        accountTypeGroupDD.click();
        accoutTypeGroupValue.waitUntilClickable();
        accoutTypeGroupValue.click();
        waitABit(9000);


    }


    public void clickOnAddAccountCount() {
        accountCodeAddButton.waitUntilVisible();
        accountCodeAddButton.waitUntilClickable();
        accountCodeAddButton.click();

    }
}
