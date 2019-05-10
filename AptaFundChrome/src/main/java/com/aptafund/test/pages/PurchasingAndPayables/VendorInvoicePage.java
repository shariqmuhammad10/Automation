package com.aptafund.test.pages.PurchasingAndPayables;

import com.aptafund.test.actions.WaitActions;
import com.github.javafaker.Faker;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smuhammad on 4/11/2017.
 */
public class VendorInvoicePage extends WaitActions{

    private static final Logger logger = LoggerFactory.getLogger(VendorInvoicePage.class);



    @FindBy (id = "btnAdd__VendorInvoiceDataView")
    private WebElementFacade addVendorInvoice;

    @FindBy (xpath = ".//*[@id='GeneralTab']/div[4]/span[1]/span/span[2]/span")
    private WebElementFacade orderingVendor;

    @FindBy (css = "ul#OrderingVendorId_listbox li:nth-of-type(4)")
    private WebElementFacade selectVendor;



    @FindBy (id = "VendorInvoiceNumber")
    private WebElementFacade invoiceNumber;

    @FindBy (css = ".k-input.ElementControlComboBox[name=\"OrderingVendorId_input\"]")
    private WebElementFacade orderVendorName;

    @FindBy (id = "btnSave__VendorInvoiceDataView")
    private WebElementFacade saveVendorInvoice;

    @FindBy (id = "SearchText__VendorInvoiceDataView")
            private WebElementFacade searchVendorInvoice;

    @FindBy (css = ".check_row__VendorInvoiceDataView")
            private WebElementFacade checkToSelect;

    @FindBy (id ="btnEdit__VendorInvoiceDataView")
    private  WebElementFacade clickOnEditButton;

    @FindBy (id = "InvoiceComment")
            private WebElementFacade comments;

    @FindBy (id ="InvoiceComment")
            private WebElementFacade vendorInvoiceComment;

    @FindBy (xpath = ".//*[@id='NavigationPanel']/div/a")
            private WebElementFacade returnToVendorInvoice;

    @FindBy(css = ".menulink[href=\"/QAAutom/AccountsPayable/VendorInvoice/Manage\"]")
    private WebElementFacade vendorInvoiceTitle;


    Faker faker = new Faker();
    String invoiceNum = faker.finance().creditCard();






    public void clickVendorInvoice(){

        vendorInvoiceTitle.waitUntilVisible();
        vendorInvoiceTitle.waitUntilEnabled();
        vendorInvoiceTitle.waitUntilClickable();
        vendorInvoiceTitle.click();
           }



    public void clickOnAddbutton(){
        waitUntilLoaded(addVendorInvoice);
        addVendorInvoice.waitUntilClickable();
        addVendorInvoice.click();
        waitABit(8000);
    }

    public void setOrderingVendor(){
        waitUntilLoaded(orderingVendor);

        orderingVendor.click();
        waitABit(5000);
        orderVendorName.sendKeys("3wire.com");
        waitABit(5000);


    }

    public void setInvoiceNumberValue(){

        invoiceNumber.waitUntilEnabled();
        invoiceNumber.click();
        invoiceNumber.sendKeys(invoiceNum);
        waitABit(9000);
    }

    public void saveVendorInvoice(){
        saveVendorInvoice.waitUntilClickable();
        saveVendorInvoice.click();
        waitABit(5000);


    }

    public void clickAndSearchVendorInvoice(){
        searchVendorInvoice.waitUntilEnabled();
        searchVendorInvoice.waitUntilClickable();
        searchVendorInvoice.click();
        searchVendorInvoice.typeAndEnter(invoiceNum);

    }


    public void checkInCheckBox() {
        checkToSelect.waitUntilVisible();
        checkToSelect.waitUntilEnabled();
        checkToSelect.waitUntilClickable();
        waitABit(5000);
        checkToSelect.click();

    }

    public void clickEditButton() {
        clickOnEditButton.waitUntilVisible();
        clickOnEditButton.waitUntilEnabled();
        clickOnEditButton.waitUntilClickable();
        clickOnEditButton.click();

    }

    public void comments() {
        comments.waitUntilVisible();
        comments.waitUntilVisible();
        comments.waitUntilClickable();
        comments.clear();
        comments.click();
        comments.sendKeys("Automated comments for Editing");

    }

    public void clickReturnToVendorInvoice() {
        waitABit(9000);
        returnToVendorInvoice.waitUntilVisible();
        returnToVendorInvoice.waitUntilEnabled();
        returnToVendorInvoice.waitUntilClickable();
        returnToVendorInvoice.click();
        waitABit(9000);
    }

    public void setInvoiceComments() {
        vendorInvoiceComment.click();

    }
}
