package actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 10/4/2016.
 */
public class CommonButtonActions extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(CommonButtonActions.class);

    @FindBy(id = "loginName")
    private WebElementFacade loginButton;

    public void saveChanges() {
        loginButton.click();
        logger.info("Click Login Button");
    }
}
