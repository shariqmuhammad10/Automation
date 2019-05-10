package com.aptafund.test.pages.commonPages;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by smuhammad on 11/21/2016.
 */
public class ChangeDatabasePage extends WaitActions{

    @FindBy (id = "defaultDatabaseName")
    private WebElementFacade databaseNameLink;

    @FindBy (css =".NavigationHeaderLink.NavigationHeaderLink[data-id=\"103\"]")
    private WebElementFacade thayerDB;

    public void clickDatabaseLink(){
        databaseNameLink.waitUntilClickable();
        databaseNameLink.click();
        waitABit(5000);
    }

    public void changeDB(){
        thayerDB.waitUntilClickable();
        thayerDB.click();
        waitABit(5000);
    }


}
