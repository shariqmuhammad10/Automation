package com.aptafund.test.pages.employeeSelfServices;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 10/10/2016.
 */
public class MyDocumentPage extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(MyDocumentPage.class);

    @FindBy (css = "$('.kendo-data-row>td').get(1)")
    private WebElementFacade employeeConfidentialDoc;

    @FindBy (css = "$('.kendo-data-row>td').get(9)")
    private WebElementFacade responsibleUsePolicy;

}
