package com.aptafund.test.pages.PurchasingAndPayables;

import com.aptafund.test.actions.WaitActions;
import com.kenai.jffi.PageManager;
import com.thoughtworks.selenium.webdriven.Windows;
import com.thoughtworks.selenium.webdriven.commands.WindowFocus;
import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.jruby.RubyBoolean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import sun.dc.pr.PRError;

import java.util.List;

import static java.util.Calendar.PM;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willAnswer;
import static org.mockito.Mockito.verify;

public class PurchaseRequisitionPage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(PurchaseRequisitionPage.class);


    String reqNumber ;
    String id;
    String successMessage = "Purchase Requisitions Printed Successfully.";
    String getSuccessMessage;
    String prPageObjID = "lnk_EditPurchaseRequisition"+ id;
    String TotalPRRecords;
    String totalPRCountinPopup;
    String countInPopup;


    @FindBy(css = "[href=\"/QAAutom/Purchasing/MyPurchaseRequisition/MyPR\"]")
    private WebElementFacade purchaseRequisitionLink;

    @FindBy (css = "[href=\"/QAAutom/Purchasing/AdminRequisition/Manage\"]")
    private WebElementFacade purchaseRequisitionLinkForAdmin;

    @FindBy(css = "[href=\"/hf18/Purchasing/MyPurchaseRequisition/MyPR\"]")
    private WebElementFacade purchaseRequisitionLinkForReq;

    @FindBy(css = "[href=\"/QAAutom/Purchasing/AdminRequisition/Manage\"]")
    private WebElementFacade purchaseRequisitionLinkForMyPRAdmin;


    @FindBy(id = "menuheader3")
    private WebElementFacade purchaseAndPayable;

    @FindBy (id = "lblHeading")
    private WebElementFacade requisitionNumber;

    @FindBy (id = "btnCancel__PurchaseRequisitionView")
    private WebElementFacade cancelPurchaseReq;

    @FindBy (id = "SearchText__PRMyRequisitionDataView")
    private WebElementFacade searchPR;

    @FindBy (id = "SearchText__PRMyRequisitionDataView")
    private WebElementFacade requestNo;

    @FindBy (id = "SearchText__AdminPurchaseRequisitionsDataView")
    private WebElementFacade searchPRForPRAdmin;

    @FindBy (id = "SearchText__PRApprovalsDataView")
    private WebElementFacade searchPRForApp1;

    @FindBy (id = "SearchText__PRApprovalsDataView")
    private WebElementFacade searchPRForApp2;


    @FindBy (id = "btnEdit__PRApprovalsDataView")
    private WebElementFacade editPR;

    @FindBy (id = "btnEdit__PurchaseRequisitionView")
    private WebElementFacade editPR1;




    @FindBy (id= "btnDelete__PRApprovalsDataView")
    private WebElementFacade deletePR;

    @FindBy (id= "btnDelete__PurchaseRequisitionView")
    private WebElementFacade deletePRForAutoReq2;


    @FindBy(id = "PRComments")
    private WebElementFacade comments;

    @FindBy (id ="Comments")
    private WebElementFacade disapproveComments;

    @FindBy(id = "PRTerms")
    private WebElementFacade prTerms;

    @FindBy(id = "btnEdit__PRApprovalsDataView")
    private WebElementFacade editAdminPR;

    @FindBy(id = "QuoteBidNotes")
    private WebElementFacade quoteBitNotes;


    @FindBy(css = "//button[starts-with(@id, 'Submit-')]")
    private WebElementFacade prHyperLinkForEdit;

   // .//div[starts-with(@id,"lnk_EditPurchaseRequisition_") and contains(@id,"{0}")]


    @FindBy(id = "btnView__PRApprovalsDataView")
    private WebElementFacade viewButtonForAdminPR;


    @FindBy (id="PRItemDescription")
    private WebElementFacade setItemDescription;

    @FindBy(id = "btnSave__PurchaseRequisitionView")
    private WebElementFacade savePurchaseReqButton;

    @FindBy (id ="btnSave__PurchaseRequisitionItemDataView")
    private WebElementFacade saveItemLine;

    @FindBy(id = "btnAdd__PurchaseRequisitionView")
    private WebElementFacade addPurchaseRequisition;

    @FindBy(id = "btnAdd__PRApprovalsDataView")
    private WebElementFacade addPurchaseRequisitionForPRAdmin;

    @FindBy(id = "btnAdd__PurchaseRequisitionItemDataView")
    private WebElementFacade addItemLine;

    @FindBy (id = "dialog-confirm")
    private WebElementFacade confirmWithdraw;

    @FindBy(id = "btnEdit__PurchaseRequisitionItemDataView")
    private WebElementFacade itemLineEditButton;

    @FindBy(id = "btnCancel__PurchaseRequisitionItemDataView")
    private WebElementFacade itemLineCancelButton;


    @FindBy(id = "btnSaveAndSubmit__PurchaseRequisitionView")
    private WebElementFacade submitPRButton;


    @FindBy(css = ".k-loading-image")
    private WebElementFacade loadingWheel1;


    @FindBy(id = "btnApprove_PRApprovalsDataView")
    private WebElementFacade ApprovePRButtonForApp1;

    @FindBy (id = "btnDisapprove_PRApprovalsDataView")
    private WebElementFacade disApproveButton;

    @FindBy(id = "btnDelete__PurchaseRequisitionItemDataView")
    private WebElementFacade deleteLineItem;

    @FindBy(id = "btnMoreButtons")
    private WebElementFacade moreButton;

    @FindBy(id = "btnDelete__PRApprovalsDataView")
    private WebElementFacade deletePRButton;


    @FindBy (id ="btnCancelRequisition__PRApprovalsDataView")
    private WebElementFacade cancelPRButton;

    @FindBy (id ="btnWithdrawMyPR__PurchaseRequisitionView")
    private WebElementFacade withdrawPRButton;


    @FindBy (id ="btnWithdraw_PurchaseRequisitionView")
    private WebElementFacade withdrawPRButtonOutGrid;

    @FindBy (id = "dialog-confirm")
    private WebElementFacade clickYesToConfirm;

    @FindBy (id = "usergridsettingsWindow__PRMyRequisitionDataView_wnd_title")
    private WebElementFacade confirmSubmitPopup;


    @FindBy (id ="btnOk__RequisitionApproval")
    private WebElementFacade clickOKButton;

    @FindBy (id ="btnCopy__PurchaseRequisitionView")
    private WebElementFacade copyPRButton;

    @FindBy (id ="btnPrintMyPR__PurchaseRequisitionView")
    private WebElementFacade printPRButton;

    @FindBy (id ="btnOk__PrintPurchaseRequisition")
    private WebElementFacade okPrintPRButton;

    @FindBy (id ="divPRSuccessMessage")
    private WebElementFacade printSuccessMsg;

    @FindBy(xpath = ".//*[@id='RequisitionItemDetailsPopup']/div/div[1]/div[1]/span[1]/span/input[1]")
    private WebElementFacade lineItemQty;

    @FindBy(xpath = ".//*[@id='GeneralTab']/div[6]/span[1]/span/span[2]/span")
    private WebElementFacade suggestingOrderingVendor;



    @FindBy(xpath = ".//*[@id='GeneralTab']/div[4]/span[1]/span/span[2]/span")
    private WebElementFacade prTypeDD;

    @FindBy(css = ".k-input.ElementControlComboBox.None [name=\"PRType_input\"]")
    private List<WebElementFacade> PRDollarTypeDD;

    @FindBy(css = ".check_row__AdminPurchaseRequisitionsDataView")
    private WebElementFacade selectCheckBoxForMyPRReq2;

    @FindBy(css = ".check_row__PRMyRequisitionDataView")
    private WebElementFacade selectCheckBoxToDeleteForMyPRReq2;


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

    @FindBy (id ="popupWindowRequisition_wnd_title")
    private  WebElementFacade addPRWindow;


    @FindBy (id ="FileDescription")
    private  WebElementFacade attachFileDescription;

    @FindBy (id ="subMenu")
    private  WebElementFacade subMenu;




    @FindBy (id ="btnSave__frmAttachment__PurchaseRequisition")
    private  WebElementFacade attachFileSave;


    @FindBy (css = ".selectAll__PurchaseRequisitionItemDataView")
    private WebElementFacade selectAllCheckBox;

    @FindBy (css = ".k-i-loading")
    private WebElementFacade loadingWheel;


    @FindBy(css = ".check_row__PRApprovalsDataView")
    private WebElementFacade selectCheckBoxForPRForApp1;

    @FindBy(css = ".check_row__PRApprovalsDataView")
    private WebElementFacade selectCheckBoxForPRForApp2;


    @FindBy (xpath = ".//*[@id='RequisitionItemDetailsPopup']/div/div[3]/div[1]/span[1]/span/input[1]")
    private WebElementFacade setUnitPrice;

    @FindBy (id = "PRUnitPrice")
    private WebElementFacade setUnitPrice1;


    @FindBy (xpath = ".//*[@id='AccountCodeBox_PRItemDetailsacTextBox']/div/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade clickAccountCodeDD;

    @FindBy (css = ".check_row__PurchaseRequisitionItemDataView")
    private WebElementFacade checkBoxLineItem;

    @FindBy (css = ".check_row__AdminPurchaseRequisitionsDataView")
    private WebElementFacade checkBoxLineItemForAdminPR;

    @FindBy (css = "[data-page=\"5\"]")
    private WebElementFacade pageNumber;


    @FindBy(xpath = ".//*[@id='GeneralTab']/div[5]/span[1]/span/input")
    private WebElementFacade suggestVendorDD;

    @FindBy(css = "ul#SuggestedOrderingVendorId_listbox li:nth-of-type(6)")
    private WebElementFacade suggestVendorDD1;


    @FindBy(css = ".k-input.ElementControlComboBox.VendorComboBoxDataSource")
    private WebElementFacade suggestedVendorDD;

    @FindBy(css = ".k-input.ElementControlComboBox.VendorComboBoxDataSource")
    private List<WebElementFacade> suggestedVendorDD2;



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

    @FindBy (id = "breadcrumb_actionbuttons")
    private WebElementFacade breadCrumActionButtons;

    @FindBy (css = ".selectAll__AdminPurchaseRequisitionsDataView")
    private WebElementFacade selectAllPRRecordsForAdminPR;

    @FindBy (id = "SelectedRecordCount__AdminPurchaseRequisitionsDataView")
    private WebElementFacade totalNumberOfPrRecords;


    @FindBy (id = "NavigationText__PurchaseRequisitionDetailPopup")
    private WebElementFacade totalNumberOfPrRecordsInPopUp;


    @FindBy (id = "btnEditAll__PRApprovalsDataView")
    private WebElementFacade editAllButton;




    public void clickPurchaseRequisition() {
        waitABit(9000);
        purchaseRequisitionLink.waitUntilPresent();
        purchaseRequisitionLink.waitUntilEnabled();
        purchaseRequisitionLink.click();
    }

    public void clickPurchaseRequisitionForAdmin() {
        waitABit(9000);
        waitUntilLoaded(breadCrumActionButtons);

        //purchaseRequisitionLinkForAdmin.waitUntilPresent();
        purchaseRequisitionLinkForAdmin.waitUntilVisible();
        purchaseRequisitionLinkForAdmin.waitUntilClickable();
        purchaseRequisitionLinkForAdmin.click();
        checkPRLinkClickedOrNot();
    }

    private void checkPRLinkClickedOrNot() {






    }


    public void clickPurchaseRequisitionForReq() {
        waitABit(3000);
        purchaseRequisitionLinkForReq.waitUntilPresent();
        purchaseRequisitionLinkForReq.waitUntilEnabled();
        purchaseRequisitionLinkForReq.click();
    }

    public void clickPurchaseRequisitionForMyPRAdmin() {
        waitABit(9000);
        purchaseRequisitionLinkForMyPRAdmin.waitUntilPresent();
        purchaseRequisitionLinkForMyPRAdmin.waitUntilEnabled();
        purchaseRequisitionLinkForMyPRAdmin.click();
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
        waitABit(8000);
        addPurchaseRequisition.click();
        waitABit(8000);
    }

    public void clickOnAddButtonForMyPRAdmin() {
        addPurchaseRequisitionForPRAdmin.waitUntilVisible();
        addPurchaseRequisitionForPRAdmin.waitUntilPresent();
        addPurchaseRequisitionForPRAdmin.waitUntilClickable();
        waitABit(9000);
        addPurchaseRequisitionForPRAdmin.click();
        waitABit(5000);
    }

    public void selectSuggestingOrderingVendorForOB() {

        waitABit(5000);
        //suggestVendorDD.waitUntilVisible();
        comments.click();
        suggestVendorDD.click();
        waitABit(5000);
        //suggestVendorDD1.click();
        suggestVendorDD.sendKeys("A BEE MAN");
        waitABit(3000);

    }

    public void selectSuggestingOrderingVendor() {
        waitABit(9000);

        waitUntilLoaded(suggestedVendorDD);
        suggestedVendorDD2.listIterator(1);
        suggestedVendorDD.click();
        //suggestVendorDD.click();
       // waitABit(9000);
        suggestedVendorDD.sendKeys("24 HOUR");
        waitABit(3000);

    }


    public void saveNewPurchaseRequisition() {
        waitABit(3000);
        savePurchaseReqButton.waitUntilVisible();
        savePurchaseReqButton.waitUntilEnabled();
        savePurchaseReqButton.waitUntilClickable();
        savePurchaseReqButton.click();
        waitABit(5000);
    }

    public void selectDollarFromPRType() {

        //addPRWindow.waitUntilVisible();
        waitABit(9000);
        //prTypeDD.waitUntilPresent();
        prTypeDD.waitUntilVisible();
        prTypeDD.waitUntilClickable();
        prTypeDD.click();
        waitABit(5000);
        dollarPRType.waitUntilClickable();
        dollarPRType.click();

    }

    public void addCommentForPR() {
        waitABit(3000);
        comments.waitUntilClickable();
        comments.click();
        comments.sendKeys("Create new Purchase Requisition using automation.");
        waitABit(3000);
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
        //requisitionNumber.click();
        //waitABit(8000);
        loadingWheel.waitUntilPresent();
        waitABit(9000);
        reqNumber = requisitionNumber.getTextValue();
        System.out.println("This is the Purchase Requisition Number: " + reqNumber);
        //waitUntilLoaded(submitPRButton);
        submitPRButton.waitUntilVisible();
        loadingWheel.waitUntilNotVisible();
        waitABit(8000);
        id = reqNumber.substring(20);
        System.out.println(id);
        //int perReqCount = reqNumber.codePointCount(0,3);
        //System.out.println(perReqCount);
        waitABit(5000);
    }

    public void closePurchaseReqPopup() {
        waitABit(5000);
        cancelPurchaseReq.waitUntilPresent();
        cancelPurchaseReq.waitUntilVisible();
        cancelPurchaseReq.waitUntilClickable();
        cancelPurchaseReq.click();
        waitABit(5000);

    }

    public void searchNewPurchaseRequisition() {
        waitABit(8000);
        //loadingWheel.waitUntilPresent();
        searchPR.waitUntilVisible();
        searchPR.waitUntilEnabled();
        searchPR.waitUntilClickable();
        searchPR.click();
        //waitABit(5000);
        searchPR.typeAndEnter(id);
    }


    public void searchNewPurchaseRequisitionForPRAdmin() {
        waitABit(8000);
        loadingWheel.waitUntilNotVisible();
        searchPRForPRAdmin.waitUntilVisible();
        searchPRForPRAdmin.waitUntilEnabled();
        searchPRForPRAdmin.waitUntilClickable();
        searchPRForPRAdmin.click();
        waitABit(5000);
        searchPRForPRAdmin.typeAndEnter(id);
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
        //loadingWheel.waitUntilNotVisible();
        //selectCheckBox.waitUntilVisible();
        waitABit(5000);
        selectCheckBoxToDeleteForMyPRReq2.waitUntilVisible();
        selectCheckBoxToDeleteForMyPRReq2.waitUntilClickable();
        waitABit(9000);
        selectCheckBoxToDeleteForMyPRReq2.click();
    }

    public void editPurchaseRequisition() {
        waitABit(5000);
        editPR1.waitUntilVisible();
        editPR1.waitUntilEnabled();
        editPR1.waitUntilClickable();
        editPR1.click();

    }

    public void deletePurchaseRequisition() {
        deletePRForAutoReq2.waitUntilVisible();
        deletePRForAutoReq2.waitUntilEnabled();
        deletePRForAutoReq2.waitUntilClickable();
        deletePRForAutoReq2.click();

    }

    public void clickYesToConfirmDelete() {
        evaluateJavascript("$('.delete-confirm').last().click()");
        waitABit(8000);
    }

    public void clickAddButtonToAddLineItem() {
        addItemLine.waitUntilVisible();
        addItemLine.waitUntilPresent();
        addItemLine.waitUntilClickable();
        waitABit(8000);
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
        //setUnitPrice.clear();
        setUnitPrice.click();
        setUnitPrice.sendKeys("2");
    }

    public void setAccountCode() {
        clickAccountCodeDD.waitUntilPresent();
        clickAccountCodeDD.waitUntilEnabled();
        clickAccountCodeDD.waitUntilClickable();
        clickAccountCodeDD.click();
        waitABit(3000);
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

    public void selectItemLineCheckBoxForAdminPR() {
        checkBoxLineItemForAdminPR.waitUntilVisible();
        checkBoxLineItemForAdminPR.waitUntilEnabled();
        checkBoxLineItemForAdminPR.waitUntilClickable();
        pageNumber.waitUntilNotVisible();
        //waitABit(9000);
        waitABit(5000);
        checkBoxLineItemForAdminPR.click();
        waitABit(5000);
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
        waitABit(5000);
    }

    public void clickYesToConfirmSubmit() {
       // clickYesToConfirm.waitUntilVisible();
        waitABit(3000);

        //confirmSubmitPopup.waitUntilVisible();
        evaluateJavascript("$('#dialog-confirm').last().click()");

        //clickYesToConfirm.waitUntilEnabled();
        //clickYesToConfirm.waitUntilClickable();

        //clickYesToConfirm.click();
        waitABit(5000);

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
        //clickYesToConfirm.waitUntilClickable();
        waitABit(5000);
        evaluateJavascript("$('.delete-confirm').last().click()");
        //clickYesToConfirm.click();
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

    public void selectFileToAttachWithPR() {
        upload("D:\\Applicationdetails.txt");
        waitABit(5000);
        attachFileSave.waitUntilVisible();
        attachFileSave.waitUntilEnabled();
        attachFileSave.waitUntilClickable();
        attachFileSave.click();
        waitABit(9000);



    }

    public void clickOnWithdrawRequisitionButton() {
        waitABit(9000);

        //withdrawPRButton.waitUntilVisible();
        //waitUntilLoaded(withdrawPRButton);
        withdrawPRButton.waitUntilClickable();
        withdrawPRButton.click();
        waitABit(5000);

    }

    public void clickOnWithdrawRequisitionButtonOutGrid() {
        waitABit(9000);

        //withdrawPRButton.waitUntilVisible();
        //waitUntilLoaded(withdrawPRButton);
        withdrawPRButtonOutGrid.waitUntilClickable();
        withdrawPRButtonOutGrid.click();
        waitABit(5000);

    }


    public void clickOnConfirmWithdrawRequisitionButton() {
        waitABit(8000);
        //clickYesToConfirm.click();
        evaluateJavascript("$('.delete-confirm').last().click()");
        //evaluateJavascript("$('.k-window-titlebar').get(3).click()");
        //confirmWithdraw.sendKeys("");
        //confirmWithdraw.click();
        //clickYesToConfirm.waitUntilClickable();
        //clickYesToConfirm.click();
        waitABit(6000);

    }

    public void searchSubmittedPRRecords() {
        //waitABit(3000);
        searchPR.waitUntilClickable();
        loadingWheel.waitUntilPresent();
        searchPR.click();
        searchPR.typeAndEnter(id);
        waitABit(5000);

    }

    public void clickOnRequestNoColoumn() {
        waitABit(2000);
       evaluateJavascript("$(\".k-header:contains(\\'Request No\\')\").click()");
    }

    public void copyPR() {
        waitABit(5000);
        waitUntilLoaded(copyPRButton);
        copyPRButton.waitUntilVisible();
        copyPRButton.waitUntilClickable();
        copyPRButton.click();
        waitABit(5000);
    }

    public void printPR() {
        waitABit(5000);
        waitUntilLoaded(printPRButton);
        printPRButton.waitUntilVisible();
        printPRButton.waitUntilClickable();
        printPRButton.click();
        waitABit(5000);

    }

    public void okPrintmessage() {

        okPrintPRButton.waitUntilClickable();
        okPrintPRButton.waitUntilVisible();
        okPrintPRButton.click();
        waitABit(5000);
    }

    public void okPrintMessage() {
        printSuccessMsg.waitUntilVisible();
        printSuccessMsg.click();
        waitABit(5000);
        getSuccessMessage =  printSuccessMsg.getText();
        org.junit.Assert.assertEquals(successMessage,getSuccessMessage);
        System.out.println(getSuccessMessage);
        waitABit(5000);



    }

    public void clickOnTerms() {
        prTerms.waitUntilVisible();
        prTerms.waitUntilClickable();
        prTerms.click();
        insertValueOfTerms();
    }

    public void insertValueOfTerms(){
        waitABit(5000);
        prTerms.sendKeys(id);
        waitABit(5000);

    }

    public void clickOnEditAdminPR() {
        editAdminPR.waitUntilVisible();
        editAdminPR.waitUntilEnabled();
        editAdminPR.waitUntilClickable();
        editAdminPR.click();

    }

    public void clickOnQuoteBitNotes() {
        quoteBitNotes.waitUntilVisible();
        quoteBitNotes.waitUntilEnabled();
        quoteBitNotes.waitUntilClickable();
        quoteBitNotes.click();
        quoteBitNotes.sendKeys("Details to show that PR is edit");
        waitABit(5000);

    }

    public void clickOnViewButtonForAdminPR() {
        viewButtonForAdminPR.waitUntilVisible();
        viewButtonForAdminPR.waitUntilEnabled();
        viewButtonForAdminPR.waitUntilClickable();
        viewButtonForAdminPR.click();
        waitABit(6000);
    }

    public void clickOnPRHyperlink() {
        pageNumber.waitUntilNotVisible();
        waitABit(5000);
        evaluateJavascript("$('[id*=\"lnk_EditPurchaseRequisition_\"]').click()");

    }

    @WhenPageOpens

    public void waitUntilPurchaseRequisitionLinkAppear(){
        $(prHyperLinkForEdit).waitUntilVisible();
    }

    public void clickOnQuoteBitNotesForEditUsingHL() {
        quoteBitNotes.waitUntilVisible();
        quoteBitNotes.waitUntilEnabled();
        quoteBitNotes.waitUntilClickable();
        quoteBitNotes.click();
        quoteBitNotes.sendKeys("Details to show that PR is edit using HyperLink");
        waitABit(5000);

    }

    public void clickOnDeletePRUsingAdminAccount() {
        deletePRButton.waitUntilPresent();
        deletePRButton.waitUntilClickable();
        deletePRButton.click();
    }

    public void clickOnCheckAllToGetPRNumber() {
        pageNumber.waitUntilVisible();
        selectAllPRRecordsForAdminPR.waitUntilPresent();
        selectAllPRRecordsForAdminPR.waitUntilEnabled();
        selectAllPRRecordsForAdminPR.waitUntilClickable();
        selectAllPRRecordsForAdminPR.click();


    }

    public void getTotalNumberOfPRRecords() {
        totalNumberOfPrRecords.waitUntilVisible();
        totalNumberOfPrRecords.waitUntilEnabled();
        totalNumberOfPrRecords.waitUntilClickable();
        waitABit(5000);
        TotalPRRecords = totalNumberOfPrRecords.getText();
        System.out.println("The value of Total PR Records : " + TotalPRRecords);
    }

    public void clickOnEditAllButton() {
        editAllButton.waitUntilPresent();
        editAllButton.waitUntilEnabled();
        editAllButton.waitUntilClickable();
        editAllButton.click();
    }

    public void getTotalPRRecordsCountFromPopup() {
        loadingWheel1.waitUntilNotVisible();
        totalNumberOfPrRecordsInPopUp.waitUntilVisible();
        totalNumberOfPrRecordsInPopUp.waitUntilEnabled();
        totalNumberOfPrRecordsInPopUp.waitUntilClickable();
        waitABit(5000);
        totalPRCountinPopup = totalNumberOfPrRecordsInPopUp.getText();
        countInPopup = totalPRCountinPopup.substring(12);
        System.out.println("The value of Total PR Records in Pop up :" + countInPopup);
    }

    public void compareTheValueOfTotalRecordsOfPR(){

        if (countInPopup.equals(TotalPRRecords)){
            System.out.println("Total Number of Records are same.");
        }
            else{
            System.out.println("Total number of records are NOT equal");
        }

        }




}
