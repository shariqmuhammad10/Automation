package com.aptafund.test.steps.PurchasingAndPayables;

import com.aptafund.test.pages.PurchasingAndPayables.PurchaseRequisitionPage;
import com.aptafund.test.pages.PurchasingAndPayables.PurchasingAndPayablesHomePage;
import com.aptafund.test.steps.HRPayrollESS.ManagePayrollSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PurchaseRequisitionSteps extends ScenarioSteps {

    private static final Logger logger = LoggerFactory.getLogger(ManagePayrollSteps.class);

    PurchaseRequisitionPage purchaseRequisitionPage;
    PurchasingAndPayablesHomePage purchasingAndPayablesHomePage;


    @Step
    public void navigateToPurchaseRequisition(){
        logger.info("Click on the Purchase Requsition link");
        purchaseRequisitionPage.clickPurchaseRequisition();
    }

    @Step
    public void navigateToPurchaseRequisitionForAdmin(){
        logger.info("Click on the Purchase Requsition link");
        purchaseRequisitionPage.clickPurchaseRequisitionForAdmin();
    }

    @Step
    public void navigateToPurchaseRequisitionForReq(){
        logger.info("Click on the Purchase Requsition link");
        purchaseRequisitionPage.clickPurchaseRequisitionForReq();
    }

    @Step
    public void navigateToPurchaseRequisitionForMyPRAdmin(){
        logger.info("Click on the Purchase Requsition link");
        purchaseRequisitionPage.clickPurchaseRequisitionForMyPRAdmin();
    }


    @Step
    public void addPurchaseRequisiton() {
        logger.info("Click on the Add button to add new Purchase Requisition");
        purchaseRequisitionPage.clickOnAddButton();
    }

    @Step
    public void addPurchaseRequisitonForMyPRAdmin() {
        logger.info("Click on the Add button to add new Purchase Requisition");
        purchaseRequisitionPage.clickOnAddButtonForMyPRAdmin();
    }

    @Step
    public void addSuggestedOrderingVendorForOb() {
        logger.info("Click on the Add Suggesting Ordering Vendor");
        purchaseRequisitionPage.selectSuggestingOrderingVendorForOB();
    }

    @Step
    public void addSuggestedOrderingVendor() {
        logger.info("Click on the Add Suggesting Ordering Vendor");
        purchaseRequisitionPage.selectSuggestingOrderingVendor();
    }

    @Step
    public void savePurchaseRequisition() {
        logger.info("Click on the Save to save Purchase Requisition");
        purchaseRequisitionPage.saveNewPurchaseRequisition();
    }

    @Step
    public void addPRDollarPRtype() {
        logger.info("Select Dollar from DropDown PR Type");
        purchaseRequisitionPage.selectDollarFromPRType();
    }

    @Step
    public void addComments() {
        logger.info("add comments when adding New Purchase Requisition");
        purchaseRequisitionPage.addCommentForPR();
    }

    @Step
    public void addPRTerms() {
        logger.info("add PR Terms to show edit Purchase Requisition");
        purchaseRequisitionPage.addPRTerms();
    }

    @Step
    public void getRequisitionNumberValue() {
        logger.info("Get the Purchase Requisition ID");
         purchaseRequisitionPage.getRequisitionNumber();

    }

    @Step
    public void closePurchaseRequisitionPopup() {
        logger.info("Close Purchase Requisition PopUp");
        purchaseRequisitionPage.closePurchaseReqPopup();
    }

    @Step
    public void searchNewlyCreatedPR() {
        logger.info("Search newly Created Purchase Requisition in search Box");
        purchaseRequisitionPage.searchNewPurchaseRequisition();
    }

    @Step
    public void searchNewlyCreatedPRForPRAdmin() {
        logger.info("Search newly Created Purchase Requisition in search Box");
        purchaseRequisitionPage.searchNewPurchaseRequisitionForPRAdmin();
    }

    @Step
    public void searchNewlyCreatedPRForApp1() {
        logger.info("Search newly Created Purchase Requisition in search Box");
        purchaseRequisitionPage.searchNewPurchaseRequisitionForApp1();
    }

    @Step
    public void applyCheckForSearch() {
        logger.info("Click on check Box to apply Check to edit record");
        waitABit(8000);
        purchaseRequisitionPage.applyCheckToSelectRecord();
    }

    @Step
    public void clickEditButton() {
        logger.info("Click on Edit Button to edit record");
        purchaseRequisitionPage.editPurchaseRequisition();
    }
    @Step
    public void deletePurchaseRequisition() {
        logger.info("Click on Delete Button to Delete record");
        purchaseRequisitionPage.deletePurchaseRequisition();
    }
    @Step
    public void deletePRConfirmMessage() {
        logger.info("Click on Confirm Yes to delete PR");
        purchaseRequisitionPage.clickYesToConfirmDelete();

    }
    @Step
    public void clickAddRequestedItem() {
        logger.info("Click Add to add Requested Item");
        purchaseRequisitionPage.clickAddButtonToAddLineItem();
    }
    @Step
    public void addFiledValuesForLineItem() {
        logger.info("Provide different Field Values for Item Line");
        //purchaseRequisitionPage.setLineItemQty();
        purchaseRequisitionPage.setUnitPrice();
        purchaseRequisitionPage.setAccountCode();
        purchaseRequisitionPage.setItemDescription();
    }
    @Step
    public void savePRItemLine() {
        logger.info("Click Save to Save Item and all Field Values for Item Line");
        purchaseRequisitionPage.clickSaveItemLine();
    }
    @Step
    public void editItemLine() {
        logger.info("Click Edit to edit the Item Line");
        purchaseRequisitionPage.clickOnEditLineItem();

    }

    @Step
    public void selectItemLineCheckBox() {
        logger.info("Select Check Box to chose the Item Line");
        purchaseRequisitionPage.selectItemLineCheckBox();
    }

    @Step
    public void updateItemDescription() {
        logger.info("update the Item Line Description to edit record");
        purchaseRequisitionPage.updateItemLineDesc();

    }

    @Step
    public void closeLineItemPopup() {
        logger.info("Close the Item Line popup window");
        purchaseRequisitionPage.clickCancelToCloseIL();

    }

    @Step
    public void submitPR() {
        logger.info("Click on Submit button to Submit PR");
        purchaseRequisitionPage.clickSubmitForPurchseRequisition();
    }

    @Step
    public void confirmSubmit() {
        logger.info("Click on Yes to confirm Submit PR");
        purchaseRequisitionPage.clickYesToConfirmSubmit();
    }

    @Step
    public void confirmOverBudget() {
        logger.info("Click on Yes to confirm Over budget Submit PR");
        purchaseRequisitionPage.clickYesToConfirmOverBudgetPR();
    }

    @Step
    public void setUnitPriceForLineItem() {
        logger.info("Provide Unit Price for Item Line");
        //purchaseRequisitionPage.setLineItemQty();
        purchaseRequisitionPage.setUnitPrice();
    }

    @Step
    public void setAccountCode() {
        logger.info("Set Account Code Field Values for Item Line");
        purchaseRequisitionPage.setAccountCode();

    }

    @Step
    public void setItemDescription() {
        logger.info("Provide Description for Item Line");
        purchaseRequisitionPage.setItemDescription();
    }

    @Step
    public void setOverBudgetAccountCode() {
        logger.info("Set Over BudgetAccount Code Field Values for Item Line");
        purchaseRequisitionPage.setOBAccountCode();

    }

    @Step
    public void closePRPopUp() {
        logger.info("Close the PR popup window");
        purchaseRequisitionPage.closePurchaseReqPopup();
    }

    @Step
    public void applyCheckForSearchForApp1() {
        logger.info("Apply check for PR to Approve using Approver level 1 ");
        purchaseRequisitionPage.applyCheckToPRForApprovalLevel1();
    }

    @Step
    public void clickApproveUsingApp1() {
        logger.info("Click Approve Button for PR to Approve using approver level 1 ");
        purchaseRequisitionPage.clickApproveButtonForApp1();
    }

    @Step
    public void searchNewlyCreatedPRForApp2() {
        logger.info("Search newly Created Purchase Requisition in search Box For App 2");
        purchaseRequisitionPage.searchNewPurchaseRequisitionForApp2();
    }

    @Step
    public void applyCheckForSearchForApp2() {
        logger.info("Apply check for PR to Approve using Approver level 2 ");
        purchaseRequisitionPage.applyCheckToPRForApprovalLevel2();
    }

    @Step
    public void clickApproveUsingApp2() {
        logger.info("Click Approve Button for PR to Approve using approver level 2 ");
        purchaseRequisitionPage.clickApproveButtonForApp1();
    }

    @Step
    public void deletePRLineItem() {
        logger.info("Click delete button to delete Line item ");
        purchaseRequisitionPage.clickDeleteToRemoveLineItem();

    }

    @Step
    public void confirmDeleteLI() {
        logger.info("Click confirm delete button to delete Line item ");
        purchaseRequisitionPage.clickConfirmDeleteItem();
    }

    @Step
    public void addMultipleLineitem() {
        logger.info("Add multiple Line items ");
        for(int i =0; i < 5; i++){
            purchaseRequisitionPage.clickAddButtonToAddLineItem();
            purchaseRequisitionPage.setUnitPrice();
            purchaseRequisitionPage.setAccountCode();
            purchaseRequisitionPage.setItemDescription();
            purchaseRequisitionPage.clickSaveItemLine();
            purchaseRequisitionPage.clickCancelToCloseIL();
        }

    }

    @Step
    public void selectAllItemLineCheckbox() {
        purchaseRequisitionPage.applyCheckForCheckAll();

    }

    @Step
    public void clickDisapproveUsingApp1() {
        logger.info("Click disapprove button to disapprove PR ");
        purchaseRequisitionPage.clickOnDisapproveButton();

    }

    @Step
    public void provideDisapproveComments() {
        logger.info("Provide disapprove Comments to define the reason of disapproving PR ");
        purchaseRequisitionPage.commentsForDisapproving();
    }

    @Step
    public void clickOkButtonAfterComments() {
        logger.info("Clcik OK after Providing Comments. ");
        purchaseRequisitionPage.clickOkButton();
    }

    @Step
    public void clickOnAttachedTab() {
        logger.info("Click on Attached Tab. ");
        purchaseRequisitionPage.clickOnAttachedFiles();
    }

    @Step
    public void clickOnAttachfileAdd() {
        logger.info("Click on Add Button under Attached Files Tab. ");
        purchaseRequisitionPage.clickOnAddButtonAttachedFiles();
    }

    @Step
    public void clickSelectFileToAttach() {
        logger.info("Click on Select File Button under Attached Files. ");
        purchaseRequisitionPage.clickAttachFileOption();
    }

    @Step
    public void defineDescriptionInAttachedFiles() {
        logger.info("Define the Description while Attaching Files. ");
        purchaseRequisitionPage.setDescriptionUnderAttachedFiles();
    }

    @Step
    public void clickOnSaveButtonAfterAttachingFile() {
        logger.info("Click on Save Button after Attaching Files. ");
        purchaseRequisitionPage.clickOnSaveButtonAfterAttachingFile();
    }


    @Step
    public void clickOnMoreButton() {
        logger.info("Click on More Button to click on Cancel button. ");
        purchaseRequisitionPage.clickOnMoreButton();
    }

    @Step
    public void cancelSubmittedPR() {
        logger.info("Click on Cancel Requisition Button to Cancel PR. ");
        purchaseRequisitionPage.clickOnCancelRequisitionButton();
    }
    @Step
    public void confirmCancelSubmit() {
        logger.info("Click ok to confirm Cancel Requisition. ");
        purchaseRequisitionPage.clickConfirmDeleteItem();
    }

    @Step
    public void selectTheFileToAttach() {
        logger.info("Select the file to Attach with the PR. ");
        purchaseRequisitionPage.selectFileToAttachWithPR();


    }

    @Step
    public void withdrawPurchaseRequisition() {
        logger.info("Click on Withdraw Requisition Button to Withdraw PR. ");
        purchaseRequisitionPage.clickOnWithdrawRequisitionButton();


    }

    @Step
    public void withdrawPurchaseRequisitionOutGrid() {
        logger.info("Click on Withdraw Requisition Button to Withdraw PR. ");
        purchaseRequisitionPage.clickOnWithdrawRequisitionButtonOutGrid();


    }


    @Step
    public void withdrawPRConfirmMessage() {
        logger.info("Click on OK Button to confirm Withdraw PR. ");
        purchaseRequisitionPage.clickOnConfirmWithdrawRequisitionButton();

    }
    @Step
    public void searchSubmittedRecordsOnly() {
        logger.info("Click on Search Button to find only new PR Records. ");
        purchaseRequisitionPage.searchSubmittedPRRecords();
    }

    @Step
    public void sortRequestNo() {
        logger.info("Click on Search Button to find only new PR Records. ");
        purchaseRequisitionPage.clickOnRequestNoColoumn();
    }
    @Step
    public void copyPurchaseRequisition() {
        logger.info("Click on copy Button to generate new copy of PR Records. ");
        purchaseRequisitionPage.copyPR();
    }

    @Step
    public void printPurchaseRequisition() {
        logger.info("Click on print Button to generate new print of PR Records. ");
        purchaseRequisitionPage.printPR();
    }
    @Step
    public void okPrintPurchaseRequisition() {
        logger.info("Click on print Button to generate new print of PR Records. ");
        purchaseRequisitionPage.okPrintmessage();

    }
    @Step
    public void successMessage() {
        logger.info("Click on print ok Button to print PR Records. ");
        purchaseRequisitionPage.okPrintMessage();
    }
    @Step
    public void addReqNumInTerms() {
        logger.info("Click on Terms box to add PR id in terms to search PR . ");
        purchaseRequisitionPage.clickOnTerms();
    }
    @Step
    public void selectItemLineCheckBoxForAdminPR() {
        logger.info("Select Check Box to chose the PR using Admin PR");
        purchaseRequisitionPage.selectItemLineCheckBoxForAdminPR();

    }

    @Step
    public void editForAdminPR() {
        logger.info("Click on Edit button to edit Admin PR");
        purchaseRequisitionPage.clickOnEditAdminPR();
    }

    @Step
    public void updateQuoteBitNotes() {
        logger.info("Click on Quote Bit Notes to add notes for Admin PR");
        purchaseRequisitionPage.clickOnQuoteBitNotes();
    }


    @Step
    public void viewForAdminPR() {
        logger.info("Click on View Button to View PR using Admin Account");
        purchaseRequisitionPage.clickOnViewButtonForAdminPR();
    }


    @Step
    public void clickOnHyperLinkToEdit() {
        logger.info("Click on Hyperlink of PR to edit PR using Admin Account");
        purchaseRequisitionPage.clickOnPRHyperlink();
    }
    @Step
    public void updateQuoteBitNotesThroughHyperLink() {
        logger.info("Click on Quote Bit Notes to add notes for Admin PR using HyperLink" );
        purchaseRequisitionPage.clickOnQuoteBitNotesForEditUsingHL();

    }

    @Step
    public void deletePRusingAdmin() {
        logger.info("Click on Quote Bit Notes to add notes for Admin PR using HyperLink" );
        purchaseRequisitionPage.clickOnDeletePRUsingAdminAccount();

    }

    @Step
    public void selectAllPRRecordsToGetTotalNumberOfPRRecords() {
        logger.info("Get the total Number of PR Records by selecting all the records" );
        purchaseRequisitionPage.clickOnCheckAllToGetPRNumber();

    }

    @Step
    public void clickEditAllButton() {
        logger.info("Click on Edit All button to check the functionality of Edit all button" );
        purchaseRequisitionPage.clickOnEditAllButton();

    }

    @Step
    public void getTotalNumberOfPRRecords() {
        logger.info("Get the Total number of PR Records by clicking Check All Options" );
        purchaseRequisitionPage.getTotalNumberOfPRRecords();
    }

    @Step
    public void getTotalNumberOfRecordsInPopUp() {
        logger.info("Get Total Number of Records after clicking the Popup");
        purchaseRequisitionPage.getTotalPRRecordsCountFromPopup();
    }

    @Step
    public void compareTotalRecordsCount() {
        logger.info("Comparing Total Number of Records after clicking the Popup");
        purchaseRequisitionPage.compareTheValueOfTotalRecordsOfPR();
    }
}
