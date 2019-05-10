package com.aptafund.test.steps.commonSteps;

import com.aptafund.test.pages.commonPages.ChangeDatabasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 11/21/2016.
 */
public class ChangeDatabaseSteps extends ScenarioSteps{
    private static final Logger logger = LoggerFactory.getLogger(ChangeDatabaseSteps.class);

    ChangeDatabasePage changeDatabasePage;

    @Step
    public void changeTheDatabase() {
        logger.info("Click on the Database link to change Database");
        changeDatabasePage.clickDatabaseLink();
        changeDatabasePage.changeDB();
    }
}
