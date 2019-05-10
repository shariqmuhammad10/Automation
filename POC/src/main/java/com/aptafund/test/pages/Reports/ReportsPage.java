package com.aptafund.test.pages.Reports;

import com.aptafund.test.actions.WaitActions;
import com.aptafund.test.pages.PurchasingAndPayables.PurchaseRequisitionPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class ReportsPage extends WaitActions {

    private static final Logger logger = LoggerFactory.getLogger(ReportsPage.class);


    @FindBy(css = "[href=\"/QAAutom/Reports/DBReports/Select\"]")
    private WebElementFacade reportLink;

    @FindBy (xpath = ".//*[@id='RenderBody']/div[1]/span[2]/span/span[1]")
    private WebElementFacade ReportsDD;



    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(2)")
    private WebElementFacade APAgingDetailReport;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(3)")
    private WebElementFacade APAgingSummaryReport ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(4)")
    private WebElementFacade accountActivityByPurchaseOrder ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(5)")
    private WebElementFacade accountActivityByWarrant ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(6)")
    private WebElementFacade AccountsPayableVoucherForm ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(0)")
    private WebElementFacade APWarrantTransferForm ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(7)")
    private WebElementFacade CheckListing ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(8)")
    private WebElementFacade CheckReport ;

    @FindBy (css = "ul#ReportName_listbox li:nth-of-type(9)")
    private WebElementFacade PurchaseOrderInquiry;

    @FindBy (id = "btnReports__PDF")
    private WebElementFacade reportToPDFButton;

    @FindBy (id = "txt_AccountCodeExpression")
    private WebElementFacade AccountCodeDD;

    @FindBy (id = "FittoOnePageWideCheckBox")
    private WebElementFacade fitToOnePageWide;

    @FindBy (id = "btnReports__XLS")
    private WebElementFacade reportToXLSButton;

    @FindBy (id = "ReportFilters_2__ParamValue")
    private WebElementFacade addCountyValue;


    @FindBy (css = ".message")
    private WebElementFacade messageNodata;

    @FindBy (css = ".k-multiselect-wrap.k-floatwrap")
    private WebElementFacade purchaseOrderDD;


    public void clickOnReports() {

        waitABit(5000);
        reportLink.waitUntilClickable();
        reportLink.click();
    }

    public void selectAPAgingDetailReportsValue() {
        waitABit(5000);
        ReportsDD.click();
        waitABit(5000);
        APAgingDetailReport.click();

    }

    public void selectAPAgingSummaryReportsValue() {
        waitABit(5000);
        ReportsDD.click();
        waitABit(5000);
        APAgingSummaryReport.click();

    }

    public void clickOnReportToPDF() {
        waitABit(5000);
        reportToPDFButton.waitUntilClickable();
        reportToPDFButton.click();
        waitABit(5000);
    }

    public void clickOnReportToXLS()  {
        waitABit(9000);
        reportToXLSButton.waitUntilVisible();
        reportToXLSButton.waitUntilEnabled();
        reportToXLSButton.waitUntilClickable();
        reportToXLSButton.click();
        waitABit(5000);
        //callWindowPopup();
    }

    public void clickOnReportToXLSForAAbyPO() {
        waitABit(9000);
        reportToXLSButton.waitUntilVisible();
        reportToXLSButton.waitUntilEnabled();
        AccountCodeDD.click();
        fitToOnePageWide.waitUntilEnabled();
        fitToOnePageWide.click();
        fitToOnePageWide.click();
        reportToXLSButton.waitUntilVisible();
        waitUntilLoaded(reportToXLSButton);
       reportToXLSButton.click();
        waitABit(5000);
    }

    public void compareOutputMessage() {
        waitABit(5000);
        messageNodata.waitUntilClickable();
        String message = messageNodata.getText();
        System.out.println(message);
        Assert.assertEquals("No records to display.",message);

    }

    public void selectAccountActivityByPurchaseOrderValue() {

        waitABit(3000);
        ReportsDD.click();
        waitABit(5000);
        accountActivityByPurchaseOrder.click();

    }

    public void selectAccountActivityByWarrantValue() {
        waitABit(3000);
        ReportsDD.click();
        waitABit(5000);
        accountActivityByWarrant.click();
    }

    public void selectAccountsPayableVoucherFormValue() {
        waitABit(3000);
        ReportsDD.click();
        waitABit(5000);
        AccountsPayableVoucherForm.click();
        addCountyValue.waitUntilVisible();
        addCountyValue.waitUntilClickable();
        addCountyValue.sendKeys("15");

    }

    public void selectAPWarrantTransferFormValue() {
        waitABit(3000);
        ReportsDD.click();
        waitABit(5000);
        APWarrantTransferForm.click();

    }

    public void selectCheckListingValue() {
        waitABit(3000);
        ReportsDD.click();
        waitABit(5000);
        CheckListing.click();

    }

    public void selectCheckReportValue() {
        waitABit(5000);
        ReportsDD.click();
        waitABit(9000);
        CheckReport.click();
        waitABit(5000);

    }

    public void selectPurchaseOrderInquiry() {
        waitABit(3000);
        ReportsDD.click();
        waitABit(5000);
        PurchaseOrderInquiry.click();
    }

    public void selectPurchaseOrderDropDownValue() {
        waitABit(5000);
        purchaseOrderDD.waitUntilEnabled();
        purchaseOrderDD.waitUntilVisible();
        purchaseOrderDD.waitUntilClickable();
        purchaseOrderDD.click();
        purchaseOrderDD.sendKeys("17 - 00137");
        waitABit(5000);
    }

   public void callWindowPopup()  {
       getDriver().getWindowHandle();
       getDriver().close();
       //getDriver().switchTo().alert().accept();
       waitABit(9000);

   }
}
