package com.aptafund.test.pages.PurchasingAndPayables;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.dc.pr.PRError;

import java.util.List;

public class PurchaseRequisitionPage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(PurchaseRequisitionPage.class);


    String reqNumber ;
    String id;


    @FindBy(css = ".menulink[href=\"/QAAutom/Purchasing/AdminRequisition/Manage\"]")
    private WebElementFacade purchaseRequisitionLink;



    @FindBy(id = "menuheader3")
    private WebElementFacade purchaseAndPayable;

    @FindBy (id = "lblHeading")
    private WebElementFacade requisitionNumber;

    @FindBy (id = "btnCancel__PurchaseRequisitionView")
    private WebElementFacade cancelPurchaseReq;

    @FindBy (id = "SearchText__AdminPurchaseRequisitionsDataView")
    private WebElementFacade searchPR;

    @FindBy (id = "SearchText__PRApprovalsDataView")
    private WebElementFacade searchPRForApp1;

    @FindBy (id = "SearchText__PRApprovalsDataView")
    private WebElementFacade searchPRForApp2;


    @FindBy (id = "btnEdit__PRApprovalsDataView")
    private WebElementFacade editPR;


    @FindBy (id= "btnDelete__PRApprovalsDataView")
    private WebElementFacade deletePR;

    @FindBy(id = "PRComments")
    private WebElementFacade comments;

    @FindBy (id ="Comments")
    private WebElementFacade disapproveComments;

    @FindBy(id = "PRTerms")
    private WebElementFacade prTerms;

    @FindBy (id="PRItemDescription")
    private WebElementFacade setItemDescription;

    @FindBy(id = "btnSave__PurchaseRequisitionView")
    private WebElementFacade savePurchaseReqButton;

    @FindBy (id ="btnSave__PurchaseRequisitionItemDataView")
    private WebElementFacade saveItemLine;

    @FindBy(id = "btnAdd__PRApprovalsDataView")
    private WebElementFacade addPurchaseRequisition;

    @FindBy(id = "btnAdd__PurchaseRequisitionItemDataView")
    private WebElementFacade addItemLine;

    @FindBy(id = "btnEdit__PurchaseRequisitionItemDataView")
    private WebElementFacade itemLineEditButton;

    @FindBy(id = "btnCancel__PurchaseRequisitionItemDataView")
    private WebElementFacade itemLineCancelButton;


    @FindBy(id = "btnSaveAndSubmit__PurchaseRequisitionView")
    private WebElementFacade submitPRButton;

    @FindBy(id = "btnApprove_PRApprovalsDataView")
    private WebElementFacade ApprovePRButtonForApp1;

    @FindBy (id = "btnDisapprove_PRApprovalsDataView")
    private WebElementFacade disApproveButton;

    @FindBy(id = "btnDelete__PurchaseRequisitionItemDataView")
    private WebElementFacade deleteLineItem;

    @FindBy(id = "btnMoreButtons")
    private WebElementFacade moreButton;

    @FindBy (id ="btnCancelRequisition__PRApprovalsDataView")
    private WebElementFacade cancelPRButton;



    @FindBy (id = "dialog-confirm")
    private WebElementFacade clickYesToConfirm;

    @FindBy (id ="btnOk__RequisitionApproval")
    private WebElementFacade clickOKButton;

    @FindBy(xpath = ".//*[@id='RequisitionItemDetailsPopup']/div/div[1]/div[1]/span[1]/span/input[1]")
    private WebElementFacade lineItemQty;

    @FindBy(xpath = ".//*[@id='GeneralTab']/div[6]/span[1]/span/span[2]/span")
    private WebElementFacade suggestingOrderingVendor;

    @FindBy(xpath = ".//*[@id='GeneralTab']/div[5]/span[1]/span/span[2]")
    private WebElementFacade prTypeDD;


    @FindBy(xpath = ".//*[@id='AdminPurchaseRequisitionsDataView']/div[4]/table/tbody/tr/td[1]/input")
    private WebElementFacade selectCheckBox;

    @FindBy(xpath = ".//*[@id='AdminPurchaseRequisitionsDataView']/div[4]/table/tbody/tr/td[1]/input")
    private WebElementFacade selectCheckBoxForPR;

    @FindBy (xpath =".//*[@id='tabstripPRFINSUITabStripItemAttachedFiles']/span[2]")
    private  WebElementFacade attachFileTab;

    @FindBy (id ="btnAdd__AttachmentFrameworkDataView__PurchaseRequisition")
    private  WebElementFacade addAttachFileTab;

    @FindBy (id ="fileUploaded__PurchaseRequisition")
    private  WebElementFacade selectFileToAttach;

    @FindBy (id ="FileDescription")
    private  WebElementFacade attachFileDescription;

    @FindBy (id ="btnSave__frmAttachment__PurchaseRequisition")
    private  WebElementFacade attachFileSave;


    @FindBy (css = ".selectAll__PurchaseRequisitionItemDataView")
    private WebElementFacade selectAllCheckBox;

    @FindBy(css = ".check_row__PRApprovalsDataView")
    private WebElementFacade selectCheckBoxForPRForApp1;

    @FindBy(css = ".check_row__PRApprovalsDataView")
    private WebElementFacade selectCheckBoxForPRForApp2;

    @FindBy (xpath = ".//*[@id='RequisitionItemDetailsPopup']/div/div[3]/div[1]/span[1]/span/input[1]")
    private WebElementFacade setUnitPrice;


    @FindBy (xpath = ".//*[@id='AccountCodeBox_PRItemDetailsacTextBox']/div/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade clickAccountCodeDD;

    @FindBy (css = ".check_row__PurchaseRequisitionItemDataView")
    private WebElementFacade checkBoxLineItem;


    @FindBy(css = "input[name=\"SuggestedOrderingVendorId_input\"]")
    private WebElementFacade suggestVendorDD;


    @FindBy(css = "#SuggestedOrderingVendorId_label .k-icon.k-i-arrow-60-down")
    private List<WebElementFacade> suggestedVendorDD;


    @FindBy(css = "ul#PayrollPeriodId_listbox li:nth-of-type(6)")
    private WebElementFacade payrollPeriodValue;

    @FindBy(css = "ul#PRType_listbox li:nth-of-type(2)")
    private WebElementFacade dollarPRType;

    @FindBy(css = "ul#tbAccountCodeEdit_PRItemDetailsacTextBox_listbox li:nth-of-type(7)")
    private WebElementFacade setAccountCode;

    @FindBy(css = "ul#tbAccountCodeEdit_PRItemDetailsacTextBox_listbox li:nth-of-type(5)")
    private WebElementFacade setOverBudgetAccountCode;

    @FindBy(css = "ul#SuggestedOrderingVendorId_listbox li:nth-of-type(6)")
    private WebElementFacade selectSuggestedVendor;


    @FindBy(css = "ul#RegisterType_listbox li:nth-of-type(1)")
    private WebElementFacade normalRegValue;


    public void clickPurchaseRequisition() {
        waitABit(9000);
        purchaseRequisitionLink.waitUntilVisible();
        purchaseRequisitionLink.waitUntilEnabled();
        purchaseRequisitionLink.click();
    }

    public void clickOnPurchasingAndPayable() {
        waitUntilLoaded(purchaseAndPayable);
        purchaseAndPayable.waitUntilVisible();
        purchaseAndPayable.waitUntilPresent();
        purchaseAndPayable.waitUntilClickable();
        purchaseAndPayable.click();
    }

    public void clickOnAddButton() {
        addPurchaseRequisition.waitUntilVisible();
        addPurchaseRequisition.waitUntilPresent();
        addPurchaseRequisition.waitUntilClickable();
        waitABit(9000);
        addPurchaseRequisition.click();
        waitABit(5000);
    }

    public void selectSuggestingOrderingVendorForOB() {
        suggestVendorDD.waitUntilClickable();
        suggestVendorDD.click();
        waitABit(5000);
        suggestVendorDD.sendKeys("3wire.com");
        waitABit(3000);

    }

    public void selectSuggestingOrderingVendor() {
        suggestVendorDD.waitUntilClickable();
        suggestVendorDD.click();
        waitABit(5000);
        suggestVendorDD.sendKeys("A bee King");
        waitABit(3000);

    }


    public void saveNewPurchaseRequisition() {
        savePurchaseReqButton.waitUntilVisible();
        savePurchaseReqButton.waitUntilEnabled();
        savePurchaseReqButton.waitUntilClickable();
        savePurchaseReqButton.click();
        waitABit(16000);
    }

    public void selectDollarFromPRType() {
        prTypeDD.waitUntilPresent();
        prTypeDD.waitUntilVisible();
        prTypeDD.waitUntilClickable();
        prTypeDD.click();
        waitABit(5000);
        dollarPRType.waitUntilClickable();
        dollarPRType.click();

    }

    public void addCommentForPR() {
        waitABit(5000);
        comments.waitUntilClickable();
        comments.sendKeys("Create new Purchase Requisition using automation.");
        waitABit(5000);
    }

    public void addPRTerms() {
        waitABit(5000);
        prTerms.waitUntilClickable();
        prTerms.waitUntilPresent();
        prTerms.click();
        prTerms.sendKeys("PR Terms to show the PR is update to edit.");
    }

    public void getRequisitionNumber(){
        requisitionNumber.waitUntilPresent();
        requisitionNumber.waitUntilVisible();

        requisitionNumber.waitUntilClickable();
        waitABit(8000);
        requisitionNumber.click();
        waitABit(9000);
        reqNumber = requisitionNumber.getTextValue();
        System.out.println("This is the Purchase Requisition Number: " + reqNumber);
        //waitUntilLoaded(submitPRButton);
        submitPRButton.waitUntilVisible();
        id = reqNumber.substring(20);
        System.out.println(id);
        //int perReqCount = reqNumber.codePointCount(0,3);
        //System.out.println(perReqCount);
        waitABit(9000);
    }

    public void closePurchaseReqPopup() {
        waitABit(5000);
        cancelPurchaseReq.waitUntilPresent();
        cancelPurchaseReq.waitUntilVisible();
        cancelPurchaseReq.waitUntilClickable();
        cancelPurchaseReq.click();

    }

    public void searchNewPurchaseRequisition() {
        waitABit(8000);
        searchPR.waitUntilVisible();
        searchPR.waitUntilEnabled();
        searchPR.waitUntilClickable();
        searchPR.click();
        searchPR.typeAndEnter(id);
        waitABit(12000);
    }


    public void searchNewPurchaseRequisitionForApp1() {
        waitABit(8000);
        searchPRForApp1.waitUntilVisible();
        searchPRForApp1.waitUntilEnabled();
        searchPRForApp1.waitUntilClickable();
        searchPRForApp1.click();
        searchPRForApp1.typeAndEnter(id);
        waitABit(8000);
    }




    public void applyCheckToSelectRecord() {
        selectCheckBox.waitUntilVisible();
        selectCheckBox.waitUntilEnabled();
        selectCheckBox.waitUntilClickable();
        waitABit(8000);
        selectCheckBox.click();
    }

    public void editPurchaseRequisition() {
        waitABit(5000);
        editPR.waitUntilVisible();
        editPR.waitUntilEnabled();
        editPR.waitUntilClickable();
        editPR.click();

    }

    public void deletePurchaseRequisition() {
        deletePR.waitUntilVisible();
        deletePR.waitUntilEnabled();
        deletePR.waitUntilClickable();
        deletePR.click();

    }

    public void clickYesToConfirmDelete() {
        evaluateJavascript("$('.delete-confirm').last().click()");
        waitABit(8000);
    }

    public void clickAddButtonToAddLineItem() {
        addItemLine.waitUntilEnabled();
        addItemLine.waitUntilPresent();
        addItemLine.waitUntilClickable();
        waitABit(3000);
        addItemLine.click();
    }

    public void setLineItemQty() {
        waitABit(5000);
        lineItemQty.waitUntilPresent();
        //lineItemQty.waitUntilEnabled();
        lineItemQty.waitUntilClickable();
        lineItemQty.clear();
        //lineItemQty.click();
        lineItemQty.sendKeys("2");

    }

    public void setUnitPrice() {
        setUnitPrice.waitUntilPresent();
        setUnitPrice.waitUntilEnabled();
        setUnitPrice.waitUntilClickable();
        setUnitPrice.clear();
        setUnitPrice.click();
        setUnitPrice.sendKeys("2");
    }

    public void setAccountCode() {
        clickAccountCodeDD.waitUntilPresent();
        clickAccountCodeDD.waitUntilEnabled();
        clickAccountCodeDD.waitUntilClickable();
        clickAccountCodeDD.click();
        waitABit(5000);
        setAccountCode.waitUntilClickable();
        setAccountCode.click();
    }


    public void setOBAccountCode() {
        clickAccountCodeDD.waitUntilPresent();
        clickAccountCodeDD.waitUntilEnabled();
        clickAccountCodeDD.waitUntilClickable();
        clickAccountCodeDD.click();
        waitABit(5000);
        setOverBudgetAccountCode.waitUntilClickable();
        setOverBudgetAccountCode.click();
    }


    public void setItemDescription() {
        setItemDescription.waitUntilClickable();
        setItemDescription.sendKeys("These Items are requested using Automated script.");
    }

    public void clickSaveItemLine() {
        saveItemLine.waitUntilPresent();
        saveItemLine.waitUntilEnabled();
        saveItemLine.waitUntilClickable();
        saveItemLine.click();


    }


    public void clickOnEditLineItem() {
        itemLineEditButton.waitUntilPresent();
        itemLineEditButton.waitUntilEnabled();
        itemLineEditButton.waitUntilClickable();
        itemLineEditButton.click();
    }

    public void selectItemLineCheckBox() {
        checkBoxLineItem.waitUntilVisible();
        checkBoxLineItem.waitUntilEnabled();
        checkBoxLineItem.waitUntilClickable();
        waitABit(5000);
        checkBoxLineItem.click();
    }

    public void updateItemLineDesc() {
        setItemDescription.waitUntilClickable();
        setItemDescription.clear();
        waitABit(3000);
        setItemDescription.sendKeys("Item Line description has been updated.");
        waitABit(5000);

    }

    public void clickCancelToCloseIL() {
        itemLineCancelButton.waitUntilVisible();
        itemLineCancelButton.waitUntilEnabled();
        itemLineCancelButton.waitUntilClickable();
        itemLineCancelButton.click();
        waitABit(5000);


    }

    public void clickSubmitForPurchseRequisition() {
        submitPRButton.waitUntilVisible();
        submitPRButton.waitUntilEnabled();
        submitPRButton.waitUntilClickable();
        waitABit(5000);
        submitPRButton.click();
        waitABit(8000);
    }

    public void clickYesToConfirmSubmit() {
        clickYesToConfirm.waitUntilVisible();
        clickYesToConfirm.waitUntilEnabled();
        clickYesToConfirm.waitUntilClickable();
        waitABit(5000);
        clickYesToConfirm.click();
        waitABit(8000);

    }



    public void clickYesToConfirmOverBudgetPR() {
        evaluateJavascript("$('.delete-confirm').last().click()");
        waitABit(8000);
    }

    public void applyCheckToPRForApprovalLevel1() {
        selectCheckBoxForPRForApp1.waitUntilVisible();
        selectCheckBoxForPRForApp1.waitUntilPresent();
        selectCheckBoxForPRForApp1.waitUntilClickable();
        waitABit(5000);
        selectCheckBoxForPRForApp1.click();

    }

    public void clickApproveButtonForApp1() {
        ApprovePRButtonForApp1.waitUntilPresent();
        ApprovePRButtonForApp1.waitUntilVisible();
        ApprovePRButtonForApp1.waitUntilClickable();
        ApprovePRButtonForApp1.click();
        waitABit(5000);

    }

    public void searchNewPurchaseRequisitionForApp2() {
        waitABit(8000);
        searchPRForApp2.waitUntilVisible();
        searchPRForApp2.waitUntilEnabled();
        searchPRForApp2.waitUntilClickable();
        searchPRForApp2.click();
        searchPRForApp2.typeAndEnter(id);
        waitABit(8000);



    }

    public void applyCheckToPRForApprovalLevel2() {
        selectCheckBoxForPRForApp1.waitUntilVisible();
        selectCheckBoxForPRForApp1.waitUntilPresent();
        selectCheckBoxForPRForApp1.waitUntilClickable();
        selectCheckBoxForPRForApp1.click();

    }

    public void clickDeleteToRemoveLineItem() {
        deleteLineItem.waitUntilVisible();
        deleteLineItem.waitUntilEnabled();
        deleteLineItem.waitUntilClickable();
        deleteLineItem.click();
        waitABit(5000);
    }

    public void clickConfirmDeleteItem() {
        clickYesToConfirm.waitUntilClickable();
        waitABit(5000);
        clickYesToConfirm.click();
        waitABit(5000);
    }

    public void applyCheckForCheckAll() {
        selectAllCheckBox.waitUntilVisible();
        selectAllCheckBox.waitUntilEnabled();
        selectAllCheckBox.waitUntilClickable();
        selectAllCheckBox.click();


    }

    public void clickOnDisapproveButton() {
        disApproveButton.waitUntilVisible();
        disApproveButton.waitUntilEnabled();
        disApproveButton.waitUntilClickable();
        disApproveButton.click();
        waitABit(8000);


    }

    public void commentsForDisapproving() {
        disapproveComments.waitUntilVisible();
        disapproveComments.waitUntilEnabled();
        disapproveComments.waitUntilClickable();
        disapproveComments.click();
        disapproveComments.sendKeys("Disapprove to test Automation Script.");
    }

    public void clickOkButton() {
        clickOKButton.waitUntilPresent();
        clickOKButton.waitUntilVisible();
        clickOKButton.waitUntilClickable();
        clickOKButton.click();
        waitABit(5000);
    }

    public void clickOnAttachedFiles() {
        attachFileTab.waitUntilVisible();
        attachFileTab.waitUntilClickable();
        waitABit(5000);
        attachFileTab.click();

    }

    public void clickOnAddButtonAttachedFiles() {
        addAttachFileTab.waitUntilVisible();
        addAttachFileTab.waitUntilClickable();
        addAttachFileTab.click();
    }

    public void clickAttachFileOption() {
        /*selectFileToAttach.waitUntilVisible();
        selectFileToAttach.waitUntilEnabled();
        selectFileToAttach.waitUntilClickable();
        waitABit(5000);
        selectFileToAttach.click();*/
        waitABit(3000);
        evaluateJavascript("$('#fileUploaded__PurchaseRequisition').click()");
    }

    public void setDescriptionUnderAttachedFiles() {
        attachFileDescription.waitUntilVisible();
        attachFileDescription.waitUntilEnabled();
        attachFileDescription.waitUntilClickable();
        attachFileDescription.click();
        attachFileDescription.sendKeys("File attached using Automated Test case");
    }

    public void clickOnSaveButtonAfterAttachingFile() {
        attachFileSave.waitUntilVisible();
        attachFileSave.waitUntilClickable();
        attachFileSave.click();
    }

    public void clickOnMoreButton() {
        moreButton.waitUntilVisible();
        moreButton.waitUntilClickable();
        moreButton.click();

    }

    public void clickOnCancelRequisitionButton(){
        cancelPRButton.waitUntilVisible();
        cancelPRButton.waitUntilClickable();
        cancelPRButton.click();

    }
}
