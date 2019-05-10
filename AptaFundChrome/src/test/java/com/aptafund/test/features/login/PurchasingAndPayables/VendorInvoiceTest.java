package com.aptafund.test.features.login.PurchasingAndPayables;

import com.aptafund.test.actions.WaitActions;
import com.aptafund.test.steps.HRPayrollESS.DeductionAssignmentSteps;
import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchasingAndPayableSteps;
import com.aptafund.test.steps.PurchasingAndPayables.VendorInvoiceSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by smuhammad on 3/31/2017.
 */

@RunWith(SerenityRunner.class)

public class VendorInvoiceTest {

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    PurchasingAndPayableSteps purchasingAndPayableSteps;

    @Steps
    VendorInvoiceSteps vendorInvoiceSteps;


    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyAddDirectTypeVendorInvoice() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        vendorInvoiceSteps.navigateToPurchaseAndPayables();
        vendorInvoiceSteps.navigateToVendorInvoice();
        vendorInvoiceSteps.clickOnAddButton();
        vendorInvoiceSteps.clickOnSaveButton();

    }


    @Test
    @WithTags(
            {
                    @WithTag(type = "release", name = "Smoke-test"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyEditDirectTypeVendorInvoice() {
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoApta();
        vendorInvoiceSteps.navigateToPurchaseAndPayables();
        vendorInvoiceSteps.navigateToVendorInvoice();
        vendorInvoiceSteps.clickOnAddButton();
        vendorInvoiceSteps.clickOnSaveButton();
        //vendorInvoiceSteps.clickOnReturnToInvoice();
        //vendorInvoiceSteps.searchVendorInvoice();
        //vendorInvoiceSteps.clickEditButton();
        vendorInvoiceSteps.provideInvoiceComments();
        vendorInvoiceSteps.clickOnSaveButton();

    }

}
