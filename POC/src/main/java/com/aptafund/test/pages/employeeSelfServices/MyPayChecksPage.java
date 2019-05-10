package com.aptafund.test.pages.employeeSelfServices;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 10/10/2016.
 */
public class MyPayChecksPage extends WaitActions{
    private final static Logger logger = LoggerFactory.getLogger(MyPayChecksPage.class);

    @FindBy(id ="lnk_navigatetomypaychecks")
    private WebElementFacade myPayChecks;


}
