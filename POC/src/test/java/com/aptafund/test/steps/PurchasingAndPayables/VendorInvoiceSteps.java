package com.aptafund.test.steps.PurchasingAndPayables;


import com.aptafund.test.pages.PurchasingAndPayables.PurchasingAndPayablesHomePage;
import com.aptafund.test.pages.PurchasingAndPayables.VendorInvoicePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 3/31/2017.
 */
public class VendorInvoiceSteps extends ScenarioSteps {

    VendorInvoicePage vendorInvoicePage;
    PurchasingAndPayablesHomePage purchasingAndPayablesHomePage;


    private static final Logger logger = LoggerFactory.getLogger(VendorInvoiceSteps.class);

    @Step
    public void navigateToPurchaseAndPayables() {
        logger.info("Click on the Purchase And Payable Link to navigate");
        purchasingAndPayablesHomePage.clickPurchaseAndPayablesHeader();

    }

    @Step
    public void navigateToVendorInvoice(){
        logger.info("Click on the Vendor Invoice Link to navigate");
        vendorInvoicePage.clickVendorInvoice();
    }

    @Step
    public void clickOnAddButton(){
        logger.info("Click on Add button to add Vendor Invoice");
        waitABit(5000);
        vendorInvoicePage.clickOnAddbutton();
        vendorInvoicePage.setOrderingVendor();
        //vendorInvoicePage.setInvoiceComments();
        vendorInvoicePage.setInvoiceNumberValue();
    }

    @Step
    public void clickOnSaveButton(){
        logger.info("Click on Save button to Save Vendor Invoice");
        vendorInvoicePage.saveVendorInvoice();

    }

    @Step
    public void searchVendorInvoice(){
        logger.info("Search the Vendor Invoice to Edit Vendor Invoice");
        vendorInvoicePage.clickAndSearchVendorInvoice();
    }

    @Step
    public void clickEditButton(){
        logger.info("Search the Vendor Invoice to Edit Vendor Invoice");
        vendorInvoicePage.checkInCheckBox();
        vendorInvoicePage.clickEditButton();
    }

    @Step
    public void provideInvoiceComments() {
        logger.info("Provide comments in Vendor Invoice");
        vendorInvoicePage.comments();
    }
    @Step
    public void clickOnReturnToInvoice() {
        logger.info("Click on Return to Vendor Invoice");
        vendorInvoicePage.clickReturnToVendorInvoice();
    }
}
