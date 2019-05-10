package com.aptafund.test.features.login.PurchasingAndPayables;


import com.aptafund.test.steps.HRPayrollESS.HRManagePayrollHomeSteps;
import com.aptafund.test.steps.HRPayrollESS.ManagePayrollSteps;
import com.aptafund.test.steps.MyAptaFund.MyAptaFundHomeSteps;
import com.aptafund.test.steps.MyAptaFund.MyPRApprovalSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchaseRequisitionSteps;
import com.aptafund.test.steps.PurchasingAndPayables.PurchasingAndPayableSteps;
import com.aptafund.test.steps.commonSteps.AptaLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PurchaseRequisitionTest {

    private static final Logger Logger = LoggerFactory.getLogger(PurchaseRequisitionTest.class);

    @Managed
    WebDriver driver;

    @Steps
    AptaLoginSteps aptaLoginSteps;

    @Steps
    HRManagePayrollHomeSteps hrManagePayrollHomeSteps;

    @Steps
    ManagePayrollSteps managePayrollSteps;

    @Steps
    PurchasingAndPayableSteps purchasingAndPayableSteps;

    @Steps
    PurchaseRequisitionSteps purchaseRequisitionSteps;

    @Steps
    MyPRApprovalSteps myPRApprovalSteps;

    @Steps
    MyAptaFundHomeSteps myAptaFundHomeSteps;




    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void verifyNavigateToPurchaseRequisition() {


        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<-- Verify Navigate to Purchase Requisition Link ----->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();

    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void addPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<-- Add New Purchase Requisition -------------------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();

    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void addItemLineInPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<------ Add New Item Line Purchase Requisition ------>");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();



    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void attachFileInPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<------ Attach file in Purchase Requisition --------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.clickOnAttachedTab();
        purchaseRequisitionSteps.clickOnAttachfileAdd();
        purchaseRequisitionSteps.clickSelectFileToAttach();
        purchaseRequisitionSteps.defineDescriptionInAttachedFiles();
        purchaseRequisitionSteps.clickOnSaveButtonAfterAttachingFile();
        purchaseRequisitionSteps.selectTheFileToAttach();


    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void addMultipleItemLineInPurchaseRequisition() {

        Logger.info ("<------------------------------------------------------>");
        Logger.info ("<-- Add Multiple New Line Item Purchase Requisition --->");
        Logger.info ("<------------------------------------------------------>");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.addMultipleLineitem();

    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void submitMultipleItemLineInPurchaseRequisition() {

        Logger.info ("<------------------------------------------------------>");
        Logger.info ("<-- Submit Multiple Line Item Purchase Requisition ---->");
        Logger.info ("<------------------------------------------------------>");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.addMultipleLineitem();
        //purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.selectAllItemLineCheckbox();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void deleteItemLineInPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<--- Delete Item Line Purchase Requisition ---------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.selectItemLineCheckBox();
        purchaseRequisitionSteps.deletePRLineItem();
        purchaseRequisitionSteps.confirmDeleteLI();
        //purchaseRequisitionSteps.confirmSubmit();

    }








    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void editItemLineInPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<----- Edit Item Line Purchase Requisition ---------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.addPRTerms();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.selectItemLineCheckBox();
        purchaseRequisitionSteps.editItemLine();
        purchaseRequisitionSteps.updateItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void cancelPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<------------ Cancel Purchase Requisition ----------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToPurchaseAndPayableForMyPRAdmin();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForMyPRAdmin();
        purchaseRequisitionSteps.addPurchaseRequisitonForMyPRAdmin();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.addReqNumInTerms();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePurchaseRequisitionPopup();
        purchaseRequisitionSteps.searchNewlyCreatedPRForPRAdmin();
        purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.clickOnMoreButton();
        purchaseRequisitionSteps.cancelSubmittedPR();
        purchaseRequisitionSteps.confirmCancelSubmit();
    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void submitPurchaseRequisition() {

        Logger.info("<---------------------------------------------------->");
        Logger.info("<-- Submit Purchase Requisition --------------------->");
        Logger.info("<---------------------------------------------------->");


            aptaLoginSteps.navigateToLoginPage();
            aptaLoginSteps.loginIntoAptaAsRequisitionor();
            purchasingAndPayableSteps.navigateToMyAptaFund();
            purchaseRequisitionSteps.navigateToPurchaseRequisition();
            //purchaseRequisitionSteps.navigateToPurchaseRequisitionForReq();
            purchaseRequisitionSteps.addPurchaseRequisiton();
            purchaseRequisitionSteps.addSuggestedOrderingVendor();
            purchaseRequisitionSteps.addComments();
            purchaseRequisitionSteps.savePurchaseRequisition();
            purchaseRequisitionSteps.getRequisitionNumberValue();
            purchaseRequisitionSteps.clickAddRequestedItem();
            purchaseRequisitionSteps.setUnitPriceForLineItem();
            purchaseRequisitionSteps.setAccountCode();
            purchaseRequisitionSteps.setItemDescription();
            purchaseRequisitionSteps.savePRItemLine();
            purchaseRequisitionSteps.closeLineItemPopup();
            purchaseRequisitionSteps.submitPR();
            purchaseRequisitionSteps.confirmSubmit();
            purchaseRequisitionSteps.closePRPopUp();


        }




    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )

    public void submitOverBudgetPurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<-- Submit Over Budget Purchase Requisition --------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendorForOb();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setOverBudgetAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.confirmOverBudget();
    }




    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void addPurchaseRequisitionUsingDollarPRType() {

        Logger.info ("<----------------------------------------------------->");
        Logger.info ("<-- Add New Purchase Requisition using Dollar PR Type->");
        Logger.info ("<----------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addPRDollarPRtype();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.savePurchaseRequisition();

    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void editMyPurchaseRequisitionUsingDollarPRType() {

        Logger.info ("<-------------------------------------------------------->");
        Logger.info ("<-- Edit New Purchase Requisition using Dollar PR Type -->");
        Logger.info ("<-------------------------------------------------------->");

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addPRDollarPRtype();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.addReqNumInTerms();
        purchaseRequisitionSteps.savePurchaseRequisition();
        //purchaseRequisitionSteps.closePurchaseRequisitionPopup();
        purchaseRequisitionSteps.searchNewlyCreatedPR();
        purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.clickEditButton();
        purchaseRequisitionSteps.addPRTerms();
        purchaseRequisitionSteps.savePurchaseRequisition();
    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void deleteMyPurchaseRequisitionUsingDollarPRType() {

        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addPRDollarPRtype();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.addReqNumInTerms();
        purchaseRequisitionSteps.savePurchaseRequisition();
        //purchaseRequisitionSteps.closePurchaseRequisitionPopup();
        purchaseRequisitionSteps.searchNewlyCreatedPR();
        purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.deletePurchaseRequisition();
        purchaseRequisitionSteps.deletePRConfirmMessage();
    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void withdrawMyPurchaseRequisition() {


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        //purchaseRequisitionSteps.navigateToPurchaseRequisitionForReq();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        //purchaseRequisitionSteps.closePRPopUp();
        //purchaseRequisitionSteps.searchSubmittedRecordsOnly();
        //purchaseRequisitionSteps.searchNewlyCreatedPR();
        //purchaseRequisitionSteps.sortRequestNo();
        //purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.withdrawPurchaseRequisition();
        purchaseRequisitionSteps.withdrawPRConfirmMessage();
    }



    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public
    void withdrawMyPurchaseRequisitionFromGrid() {


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.addReqNumInTerms();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePRPopUp();
        purchaseRequisitionSteps.searchSubmittedRecordsOnly();
        //purchaseRequisitionSteps.sortRequestNo();
        purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.withdrawPurchaseRequisitionOutGrid();
        purchaseRequisitionSteps.withdrawPRConfirmMessage();
    }



    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void withdrawMyPurchaseRequisitionFromGrid1() {


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        //purchaseRequisitionSteps.addReqNumInTerms();
        //purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.addReqNumInTerms();
        //purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        //purchaseRequisitionSteps.savePurchaseRequisition();
        //purchaseRequisitionSteps.closePRPopUp();
        //purchaseRequisitionSteps.searchSubmittedRecordsOnly();
        //purchaseRequisitionSteps.sortRequestNo();
        //purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.withdrawPurchaseRequisition();
        purchaseRequisitionSteps.withdrawPRConfirmMessage();
    }






    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void copyMyPurchaseRequisition() {


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        //purchaseRequisitionSteps.navigateToPurchaseRequisitionForReq();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.copyPurchaseRequisition();

    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),

            }
    )

    public void printMyPurchaseRequisition() {


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.printPurchaseRequisition();
        purchaseRequisitionSteps.okPrintPurchaseRequisition();
        purchaseRequisitionSteps.successMessage();
    }




    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void approveLevel1PurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<-- Approval for Level 1 Purchase Requisition ------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePRPopUp();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsApprover1();
        myAptaFundHomeSteps.navigateToMyAptaFundForApp1();
        myPRApprovalSteps.navigateToMyPRApprovals();

        purchaseRequisitionSteps.searchNewlyCreatedPRForApp1();
        purchaseRequisitionSteps.applyCheckForSearchForApp1();
        purchaseRequisitionSteps.clickApproveUsingApp1();



    }





    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void disapprovePurchaseRequisition() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<----------- Disapprove Purchase Requisition  ------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePRPopUp();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsApprover1();
        myAptaFundHomeSteps.navigateToMyAptaFundForApp1();
        myPRApprovalSteps.navigateToMyPRApprovals();

        purchaseRequisitionSteps.searchNewlyCreatedPRForApp1();
        purchaseRequisitionSteps.applyCheckForSearchForApp1();
        purchaseRequisitionSteps.clickDisapproveUsingApp1();
        purchaseRequisitionSteps.provideDisapproveComments();
        purchaseRequisitionSteps.clickOkButtonAfterComments();


    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void resubmitAfterDisapprovePurchaseRequisition() {

        Logger.info ("<------------------------------------------------------------------->");
        Logger.info ("<----------- Resubmit After Disapprove Purchase Requisition  ------->");
        Logger.info ("<------------------------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePRPopUp();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsApprover1();
        myAptaFundHomeSteps.navigateToMyAptaFundForApp1();
        myPRApprovalSteps.navigateToMyPRApprovals();

        purchaseRequisitionSteps.searchNewlyCreatedPRForApp1();
        purchaseRequisitionSteps.applyCheckForSearchForApp1();
        purchaseRequisitionSteps.clickDisapproveUsingApp1();
        purchaseRequisitionSteps.provideDisapproveComments();
        purchaseRequisitionSteps.clickOkButtonAfterComments();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();

        purchaseRequisitionSteps.searchNewlyCreatedPR();
        purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();


    }



    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void appL2AfterAppL1PurchaseRequisition() {

        Logger.info ("<--------------------------------------------------------------------------->");
        Logger.info ("<-- Approval for Level 2 after Approval Level 1 Purchase Requisition ------->");
        Logger.info ("<--------------------------------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePRPopUp();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsApprover1();
        myAptaFundHomeSteps.navigateToMyAptaFundForApp1();
        myPRApprovalSteps.navigateToMyPRApprovals();
        //purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.searchNewlyCreatedPRForApp1();
        purchaseRequisitionSteps.applyCheckForSearchForApp1();
        purchaseRequisitionSteps.clickApproveUsingApp1();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsApprover2();
        myAptaFundHomeSteps.navigateToMyAptaFundForApp2();
        myPRApprovalSteps.navigateToMyPRApprovalsForApp2();
        purchaseRequisitionSteps.searchNewlyCreatedPRForApp2();
        purchaseRequisitionSteps.applyCheckForSearchForApp2();
        purchaseRequisitionSteps.clickApproveUsingApp2();


    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void appL2PurchaseRequisitionWithoutLevel1Approval() {

        Logger.info ("<--------------------------------------------------------------------------->");
        Logger.info ("<-- Approval for Level 2 Purchase Requisition without Level 1 Approval ----->");
        Logger.info ("<--------------------------------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToMyAptaFund();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.clickAddRequestedItem();
        purchaseRequisitionSteps.setUnitPriceForLineItem();
        purchaseRequisitionSteps.setAccountCode();
        purchaseRequisitionSteps.setItemDescription();
        purchaseRequisitionSteps.savePRItemLine();
        purchaseRequisitionSteps.closeLineItemPopup();
        purchaseRequisitionSteps.submitPR();
        purchaseRequisitionSteps.confirmSubmit();
        purchaseRequisitionSteps.closePRPopUp();
        aptaLoginSteps.logoutApplication();
        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsApprover2();
        myAptaFundHomeSteps.navigateToMyAptaFundForApp2();
        myPRApprovalSteps.navigateToMyPRApprovalsForApp2();
        purchaseRequisitionSteps.searchNewlyCreatedPRForApp2();
        purchaseRequisitionSteps.applyCheckForSearchForApp2();
        purchaseRequisitionSteps.clickApproveUsingApp2();


    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void viewPurchaseRequisitionForAdmin() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<--View Purchase Requisition using Admin PR Account-->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToAdminPR();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForAdmin();
        purchaseRequisitionSteps.addPurchaseRequisitonForMyPRAdmin();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.closePRPopUp();
        purchaseRequisitionSteps.searchNewlyCreatedPRForPRAdmin();
        purchaseRequisitionSteps.selectItemLineCheckBoxForAdminPR();
        purchaseRequisitionSteps.viewForAdminPR();


    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void AddPurchaseRequisitionForAdmin() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<--------Add Purchase Requisition for Admin PR------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToAdminPR();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForAdmin();
        purchaseRequisitionSteps.addPurchaseRequisitonForMyPRAdmin();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void editPurchaseRequisitionForAdmin() {

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<-------Edit Purchase Requisition for Admin PR------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToAdminPR();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForAdmin();
        purchaseRequisitionSteps.addPurchaseRequisitonForMyPRAdmin();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.closePRPopUp();
        purchaseRequisitionSteps.searchNewlyCreatedPRForPRAdmin();
        purchaseRequisitionSteps.selectItemLineCheckBoxForAdminPR();
        purchaseRequisitionSteps.editForAdminPR();
        purchaseRequisitionSteps.updateQuoteBitNotes();
        purchaseRequisitionSteps.savePurchaseRequisition();

    }

    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void editAllPurchaseRequisitionForAdmin() {

        Logger.info ("<--------------------------------------------------------->");
        Logger.info ("<--------Edit All Purchase Requisition for Admin PR------->");
        Logger.info ("<--------------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToAdminPR();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForAdmin();
        purchaseRequisitionSteps.selectAllPRRecordsToGetTotalNumberOfPRRecords();
        purchaseRequisitionSteps.getTotalNumberOfPRRecords();
        purchaseRequisitionSteps.selectAllPRRecordsToGetTotalNumberOfPRRecords();
        purchaseRequisitionSteps.clickEditAllButton();
        purchaseRequisitionSteps.getTotalNumberOfRecordsInPopUp();
        purchaseRequisitionSteps.compareTotalRecordsCount();


    }



    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void editPurchaseRequisitionForAdminUsingHyperLink() {

        Logger.info ("<--------------------------------------------------------------------->");
        Logger.info ("<--------Edit Purchase Requisition for Admin PR using Hyperlink------->");
        Logger.info ("<--------------------------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToAdminPR();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForAdmin();
        purchaseRequisitionSteps.addPurchaseRequisitonForMyPRAdmin();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.closePRPopUp();
        purchaseRequisitionSteps.searchNewlyCreatedPRForPRAdmin();
        purchaseRequisitionSteps.clickOnHyperLinkToEdit();
        //purchaseRequisitionSteps.editForAdminPR();
        purchaseRequisitionSteps.updateQuoteBitNotesThroughHyperLink();
        purchaseRequisitionSteps.savePurchaseRequisition();

    }


    @Test

    @WithTags(
            {@WithTag(type = "release", name = "Regression Level 2"),
                    @WithTag("Priority:High")
            }
    )


    public void deletePurchaseRequisitionForAdminUsingHyperLink() {

        Logger.info ("<--------------------------------------------------------------------->");
        Logger.info ("<----------- Delete Purchase Requisition for Admin PR ---------------->");
        Logger.info ("<--------------------------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsMyAdminReq1();
        purchasingAndPayableSteps.navigateToAdminPR();
        purchaseRequisitionSteps.navigateToPurchaseRequisitionForAdmin();
        purchaseRequisitionSteps.addPurchaseRequisitonForMyPRAdmin();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.closePRPopUp();
        purchaseRequisitionSteps.searchNewlyCreatedPRForPRAdmin();
        purchaseRequisitionSteps.selectItemLineCheckBoxForAdminPR();
        purchaseRequisitionSteps.deletePRusingAdmin();

    }




}