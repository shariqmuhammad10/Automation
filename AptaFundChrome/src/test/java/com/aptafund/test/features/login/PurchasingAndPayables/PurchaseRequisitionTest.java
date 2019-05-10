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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchaseRequisitionSteps.closePurchaseRequisitionPopup();
        purchaseRequisitionSteps.searchNewlyCreatedPR();
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

        Logger.info ("<---------------------------------------------------->");
        Logger.info ("<-- Submit Purchase Requisition --------------------->");
        Logger.info ("<---------------------------------------------------->");


        aptaLoginSteps.navigateToLoginPage();
        aptaLoginSteps.loginIntoAptaAsRequisitionor();
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addPRDollarPRtype();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.closePurchaseRequisitionPopup();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
        purchaseRequisitionSteps.navigateToPurchaseRequisition();
        purchaseRequisitionSteps.addPurchaseRequisiton();
        purchaseRequisitionSteps.addPRDollarPRtype();
        purchaseRequisitionSteps.addSuggestedOrderingVendor();
        purchaseRequisitionSteps.addComments();
        purchaseRequisitionSteps.savePurchaseRequisition();
        purchaseRequisitionSteps.getRequisitionNumberValue();
        purchaseRequisitionSteps.closePurchaseRequisitionPopup();
        purchaseRequisitionSteps.searchNewlyCreatedPR();
        purchaseRequisitionSteps.applyCheckForSearch();
        purchaseRequisitionSteps.deletePurchaseRequisition();
        purchaseRequisitionSteps.deletePRConfirmMessage();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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
        purchasingAndPayableSteps.navigateToPurchasingAndPayable();
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

}