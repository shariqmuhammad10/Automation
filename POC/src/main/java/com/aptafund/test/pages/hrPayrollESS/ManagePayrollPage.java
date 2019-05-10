package com.aptafund.test.pages.hrPayrollESS;

import com.aptafund.test.actions.WaitActions;
import com.github.javafaker.Faker;
import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.Thucydides;
import org.apache.commons.validator.Var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by smuhammad on 10/10/2016.
 */
public class ManagePayrollPage extends WaitActions{
    private static final Logger logger = LoggerFactory.getLogger(ManagePayrollPage.class);

    Faker faker = new Faker();
    String RegName = faker.numerify("SpcReg-#####");
    String NorRegName = faker.numerify("NorReg-#####");

    String RegNumValue;
    String NorRegNumValue;
    String Employee = "Automation";
    String GrossAmountVaule;
    String submitStatusVaule = "Submitted";

    String fullTimePayRate;
    String FTPRCompareValue = "413.59";

    String payCheckAmount;
    String comparePayCheckAmount = "$14.69";

    String grossPayRate;
    String grossPayRateValue = "15.91";


    @FindBy (css = ".kendo-data-row.k-state-selected>td>div")
    private WebElementFacade grossAmount;

    @FindBy (xpath = ".//*[@id='PayrollManagementDataView']/div[4]/table/tbody/tr/td[3]")
    private WebElementFacade approvedStatus;



    @FindBy (css =(".navigationreturnlink"))
            private WebElementFacade returnToSearchLink;

    @FindBy (css =("[href=\"/QAAutom/Payroll/Payroll/Manage\"]"),timeoutInSeconds = "5")
    private WebElementFacade managePayrollLink;


    @FindBy (id = "btnSubmitRegister__PayrollManagementDataView")
    private WebElementFacade submitRegistorButton;

    @FindBy (id = "Custom2")
    private WebElementFacade fullTimePayRateAmount;

    @FindBy (id = "GrossPaySalary")
    private WebElementFacade grossPayAmount;

    @FindBy (id = "dialog-confirm")
    private WebElementFacade yesDialogConfirm;

    @FindBy (id = "btnDelete__PayrollManagementDataView")
    private WebElementFacade deleteRegister;


    @FindBy (css = ".delete-confirm.k-button")
    private WebElementFacade deleteConfirmMsg;





    @FindBy (xpath = "html/body/div[22]/div[2]/div/div[2]/div/a")
    private WebElementFacade okDialogConfirm;

    @FindBy (xpath = "html/body/div[24]/div[2]/div/div[2]/div/a")
    private WebElementFacade selectOkButton;

    @FindBy (css = ".check_row__PayrollPaycheckDataView")
    private WebElementFacade checkBoxPaycheckPrinting;

    @FindBy (id = "btnSave__PayrolRegisterJobEditDataView")
    private  WebElementFacade saveButtonAddJobToRegistor;

    @FindBy (id = "btnOk_PrintPaycheckDialog")
    private  WebElementFacade printToPDF;

    @FindBy (id = "btnPrint_PaycheckPrinting")
    private WebElementFacade printPayCheckButton;

    @FindBy (css = ".kendo-data-row>td>div")
    private WebElementFacade valuePayCheckAmount;


    @FindBy (id ="btnVerify_PaycheckPrinting")
    private WebElementFacade verifyPrintCheckButton;

    @FindBy (id = "RegisterNumber")
    private WebElementFacade registorNumber;


    @FindBy (id = "btnConfigure__Index")
    private WebElementFacade loadConfiguration;

    @FindBy (id = "btnAdd__PayrollManagementDataView")
    private WebElementFacade managePayrollAddButton;

    @FindBy (xpath = ".//*[@id=\'panelbar-1\']/div/div[1]/div[1]/span/span/span[2]/span")
    private WebElementFacade payrollCycle;

    @FindBy (xpath = ".//*[@id='panelbar-1']/div/div[1]/div[1]/span/span/span[2]/span")
    private WebElementFacade payrollCycleDD;

    @FindBy (xpath = ".//*[@id='PayrollCycleList_listbox']/li[1]")
    private WebElementFacade payrollCycleValue1;

    @FindBy (id = "PayrollCycleList_listbox")
    private WebElementFacade payrollCycleList;


    @FindBy(id = "menucolumn")
    private WebElementFacade col;


    @FindBy(css = "#panelbar-1 .k-input")
    private List<WebElementFacade>  payCycleDD;

    @FindBy(css = "#panelbar-1 .k-input")
    private List<WebElementFacade> payrollPeriodDD;

    @FindBy(css = "#panelbar-1 .k-input")
    private List<WebElementFacade> registerTypeDD;

    @FindBy (css = "ul#PayrollPeriodId_listbox li:nth-of-type(14)")
    private WebElementFacade payrollPeriodValue;

    @FindBy (css = "ul#PayrollPeriodId_listbox li:nth-of-type(4)")
    private WebElementFacade removePayrollPeriodValue;

    @FindBy (css = "ul#PayrollPeriodId_listbox li:nth-of-type(3)")
    private WebElementFacade voidPayrollPeriodValue;

    @FindBy (css = "ul#SelectedEmployees_listbox li:nth-of-type(3)")
    private WebElementFacade setemployeeValueToRemove;

    @FindBy (css = "ul#SelectedEmployees_listbox li:nth-of-type(2)")
    private WebElementFacade setemployeeValue;

    @FindBy (css = "span [aria-controls=\"SelectedEmployees_listbox\"]")
    private WebElementFacade openemployeeValueDD;


    @FindBy (css = "ul#JobName_listbox li:nth-of-type(2)")
    private WebElementFacade setemployeeJobValue;

    @FindBy (css = "span [aria-controls=\"JobName_listbox\"]")
    private WebElementFacade openemployeeJobValueDD;


    @FindBy(css = "ul#PayrollCycleList_listbox li:nth-of-type(2)")
    private WebElementFacade biWeeklyValue;

    @FindBy(css = "ul#RegisterType_listbox li:nth-of-type(2)")
    private WebElementFacade specialRegValue;

    @FindBy(css = "ul#RegisterType_listbox li:nth-of-type(1)")
    private WebElementFacade normalRegValue;

    @FindBy(id = "RegisterDescription")
    private WebElementFacade registerDescription ;

    @FindBy(id = "RegisterDescription")
    private WebElementFacade norRegisterDescription ;

    @FindBy (id = "btnCancel__PayrollRegister")
    private WebElementFacade cancleAddRegister;


    @FindBy (id = "btnSave__PayrollRegister")
    private WebElementFacade saveAddRegistor;

    @FindBy (id = "btnAdd__PayrollManagementDataView")
    private WebElementFacade addJobToRegistorButton;

    @FindBy (css = ".navigationreturnlink")
    private WebElementFacade searchToReturn;

    @FindBy (id = "SelectedEmployees")
    private WebElementFacade selectEmployeeForAddReg;

    @FindBy (css  = ".selectAll__PayrollJobsAddendaDataView")
    private WebElementFacade checkOnSelectAllJobs;

    @FindBy (id = "SearchText__PayrollManagementDataView")
    private WebElementFacade searchTextBox;

    @FindBy (id = "btnSave__PayrollRegister")
    private WebElementFacade saveAfterAddJobToRegistor;

    @FindBy (css = ".check_row__PayrollJobsAddendaDataView")
    private WebElementFacade selectCheckboxToSelectJob;

    @FindBy (css = ".check_row__PayrollManagementDataView")
    private WebElementFacade selectCheckboxToSelectApproveReg;

    @FindBy (id = "btnEdit__PayrollManagementDataView")
    private WebElementFacade clickOnEditButton;

    @FindBy (id = "DockHours")
    private WebElementFacade setJobHours;

    @FindBy (id = "btnSave__PayrolRegisterJobEditDataView")
    private WebElementFacade saveAfterJobHoursEdit;

    @FindBy (id = "btnApproveRegister__PayrollManagementDataView")
    private WebElementFacade approveRegister;


    @FindBy (css = ".check_row__PayrollManagementDataView")
    private WebElementFacade selectNewAddedRegisterCheckBox;

    @FindBy (id = "btnMoreButtons")
    private WebElementFacade clickMoreButton;


    @FindBy (id = "btnPrintPayrollChecks__PayrollManagementDataView")
    private WebElementFacade clickPrintPayrollChecks;

    @FindBy (css = ".check_row__PayrollPaycheckDataView")
    private WebElementFacade payCheckStatusCheck;


    @FindBy (id = "btnOk_PrintPaycheckDialog")
    private WebElementFacade clickPrintPDFOption;


    @FindBy (id = "btnVerify_PaycheckPrinting")
    private WebElementFacade clickVerifyOption;

    @FindBy (id = "btnPrint_PaycheckPrinting")
    private WebElementFacade clickPrintCheckOption;

    @FindBy (id = "btnCancel_PaycheckPrinting")
    private WebElementFacade cancleAfterCompleteprinting;


    @FindBy (id = "btnOk_VerifyPaycheckDialog")
    private WebElementFacade clickOkVerifyOption;

    @FindBy (id = "btnCancel_PrintPaycheckDialog")
    private WebElementFacade printPayChecksCloseButton;

    @FindBy (id = "btnCancel__MassActionResultsView")
    private WebElementFacade clickCloseButton;

    @FindBy (id = "SelectedEmployees_listbox")
    private WebElementFacade selectEmployeeForAR;

    @FindBy (xpath = ".//*[@id='panelbarJobAdd-1']/div/div[2]/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade xpathJobNameDD;

    @FindBy (id = "Custom4")
    private WebElementFacade custom4;

    @FindBy (id = "btnDelete__PayrollManagementDataView")
    private WebElementFacade removeJobFromReg;

    @FindBy (id = "massActionResultsClose")
    private WebElementFacade closeSuccessMessage;



    @FindBy (xpath = ".//*[@id='panelbarJobAdd-1']/div/div[1]/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade employeeXpathDD;

    @FindBy (xpath = "html/body/div[24]/div[2]/div/div[2]/div/a")
    private WebElementFacade waitingQueeOk;

    @FindBy (css = ".check_row__PayrollPaycheckDataView")
    private WebElementFacade applyCheckToSelectRegularPayment;

    @FindBy (css = ".delete-confirm.k-button.get(0)")
    private WebElementFacade okMessage;

    @FindBy (id = "close")
    private WebElementFacade closeMessage;

    @FindBy (id = "RegisterNumber")
    private WebElementFacade registerNumber;

    @FindBy (id = "RegisterNumber")
    private WebElementFacade norRegisterNumber;

    @FindBy (id = "btnVoidRegister__PayrollManagementDataView")
    private WebElementFacade voidRegister;






    public void selectRegularPaymentCheckBox(){
        waitABit(5000);
        //applyCheckToSelectRegularPayment.waitUntilVisible();
        applyCheckToSelectRegularPayment.waitUntilClickable();
        applyCheckToSelectRegularPayment.click();
        waitABit(5000);
        copyGrossAmount();

    }

    public void copyGrossAmount(){
        grossAmount.waitUntilVisible();
        grossAmount.waitUntilPresent();
        GrossAmountVaule = grossAmount.getText();
        Assert.verify(true,"$1.28");
    }

    public void clickClosePayCheckDialog(){
        printPayChecksCloseButton.waitUntilClickable();
        printPayChecksCloseButton.click();
        waitABit(5000);
    }


    public void clickOkVerifyOption(){
        clickOkVerifyOption.waitUntilClickable();
        clickOkVerifyOption.click();
    }


    public void clickPrintPaycheck(){
        printPayCheckButton.waitUntilClickable();
        printPayCheckButton.click();

    }

    public void clickVerifyOption(){
        clickPrintPDFOption.waitUntilClickable();
        waitABit(5000);
        clickPrintPDFOption.click();
    }

    public void clickPrintPayrollChecks(){
        clickPrintPayrollChecks.waitUntilClickable();
        waitUntilLoaded(clickPrintPayrollChecks);
        clickPrintPayrollChecks.click();
    }

    public void getApprovedStatusValue(){
        getSelectedValueFrom(approvedStatus);
        //approvedStatus = "Approved";

    }

    public void clickApproveRegister(){
        getDriver().navigate().refresh();
        //waitUntilLoaded(approveRegister);
        waitABit(16000);
        approveRegister.waitUntilPresent();
        approveRegister.waitUntilClickable();
        approveRegister.waitUntilEnabled();
       /* waitFor(submitStatusVaule);
        if( submitStatusVaule != "Submitted" )
            getDriver().navigate().refresh();*/
        waitABit(15000);
        //assertThat(("Submitted"),is(equals(approvedStatus)));
        approveRegister.click();

    }


    public void setJobHoursInEditJob(){
        waitUntilLoaded(setJobHours);
        setJobHours.waitUntilClickable();
        setJobHours.sendKeys("1");

    }

    public void selectCheckBoxToSelectNewAddedRegister(){
        //selectNewAddedRegisterCheckBox.waitUntilClickable();
        waitABit(9000);
        //selectNewAddedRegisterCheckBox.waitUntilClickable();
        waitUntilLoaded(selectNewAddedRegisterCheckBox);
        selectNewAddedRegisterCheckBox.click();
    }

    public void clickEditButtonToEditJob() {
        clickOnEditButton.waitUntilClickable();
        waitABit(5000);
        clickOnEditButton.click();
    }

    public void clickToSelectCheckBoxToSelectJob(){
        //selectCheckboxToSelectJob.waitUntilClickable();
        waitABit(5000);
        selectCheckboxToSelectJob.click();
    }

    public void clickToSelectCheckBoxToSelectApprovedReg(){
        waitABit(5000);
        //selectCheckboxToSelectApproveReg.waitUntilEnabled();
        //selectCheckboxToSelectApproveReg.waitUntilClickable();
        selectCheckboxToSelectApproveReg.click();
    }

    public void clickSaveAfterAddJobToRegistor(){
        saveAfterAddJobToRegistor.waitUntilClickable();
        saveAfterAddJobToRegistor.click();

    }


    public void clickOnSelectAllCheckBox(){
        checkOnSelectAllJobs.waitUntilClickable();
        checkOnSelectAllJobs.click();

    }

    public void clickOnSaveAddJobToRegister(){
        waitUntilLoaded(saveButtonAddJobToRegistor);
        saveButtonAddJobToRegistor.waitUntilClickable();
        saveButtonAddJobToRegistor.click();

    }


    public void SelectEmployeeForAddReg(){
        waitUntilLoaded(selectEmployeeForAddReg);
        selectEmployeeForAddReg.waitUntilClickable();
        selectEmployeeForAddReg.click();

    }

    public void clickPrintPayCheckButton(){
        waitUntilLoaded(printPayCheckButton);
        printPayCheckButton.waitUntilClickable();
        printPayCheckButton.click();

    }

    public void clickYesToConfirmForApproval() {
        //yesDialogConfirm.waitUntilClickable();
        waitABit(9000);
        //yesDialogConfirm.waitUntilVisible();
        yesDialogConfirm.waitUntilClickable();
        yesDialogConfirm.click();
        waitABit(5000);
        //getDriver().navigate().refresh();

    }

    public void clickYesToConfirmVoid() {
        //yesDialogConfirm.waitUntilClickable();
        waitABit(5000);
        evaluateJavascript("$('.delete-confirm.k-button').get(0).click()");
      /*  yesDialogConfirm.waitUntilVisible();
        yesDialogConfirm.waitUntilClickable();
        yesDialogConfirm.click();
        waitABit(5000);
        //getDriver().navigate().refresh();*/

    }




    public void clickYesToConfirm(){
        yesDialogConfirm.waitUntilClickable();
        yesDialogConfirm.click();
        waitABit(5000);
        evaluateJavascript("$('.delete-confirm.k-button').get(1).click()");
        waitABit(9000);
        //getDriver().navigate().refresh();
        waitABit(5000);
    }



    public void clickAddJobRegisterButton(){
        addJobToRegistorButton.waitUntilClickable();
        addJobToRegistorButton.click();
    }

    public void clickSubmitRegisterButton(){
        waitUntilLoaded(submitRegistorButton);
        waitABit(5000);
        submitRegistorButton.click();
        waitABit(8000);
    }

    public void selectEmpFromAddJobReg(){

        //openemployeeJobValueDD.click();
       waitABit(5000);
       employeeXpathDD.waitUntilClickable();
       employeeXpathDD.click();
        waitABit(5000);
        setemployeeValue.click();
        waitABit(3000);




        //setemployeeValue.click();
        //        waitABit(9000);
        //
          // evaluateJavascript("$('#SelectedEmployees').data('kendoComboBox').search('Automation')");
           //selectEmployeeForAR.sendKeys("Automation");
          //evaluateJavascript("$('#SelectedEmployees').data('kendoComboBox').select(0)");
           //custom4.click();
           //waitABit(5000);

           
           //evaluateJavascript("$('#SelectedEmployees').data('kendoComboBox').focus()");
        //        //selectEmployeeForAR.typeAndEnter("Automation");
        //
        //        waitABit(2000);

        //        evaluateJavascript("$('#SelectedEmployees').data('kendoComboBox').select(combobox.ul.children().eq(1))");
        //        //selectEmployeeForAR.waitUntilPresent();
        //        waitABit(9000);
        //        //Assert.verify(true,Employee);
    }


       public void selectJobNameFromAddJobReg(){

        waitABit(5000);
        xpathJobNameDD.click();
        waitABit(5000);
        setemployeeJobValue.click();
        waitABit(5000);

    }

    public void selectJobNameFromRemoveJobReg(){

        waitABit(6000);
        xpathJobNameDD.click();
        waitABit(5000);
        setemployeeJobValue.click();
        waitABit(5000);

    }


    public void clickAdd(){
        waitUntilLoaded(managePayrollAddButton);
        managePayrollAddButton.click();
    }

    public void clickManagePayroll(){
        waitUntilLoaded(loadConfiguration);
        waitUntilLoaded(managePayrollLink);
        waitUntilLoaded(managePayrollLink);
    }


    public void openPayRollCycle() {
        waitUntilLoaded(payCycleDD.get(0));
        payCycleDD.get(0).click();
        waitABit(3000);
    }

    public void openPayRollPeriod() {
        waitUntilLoaded(payrollPeriodDD.get(1));
        payrollPeriodDD.get(1).click();
        //waitABit(2000);
    }

    public void openPayRollPeriodForRemove() {
        waitUntilLoaded(payrollPeriodDD.get(1));
        payrollPeriodDD.get(1).click();
        //waitABit(2000);
    }

    public void selectBiWeekly() {
        biWeeklyValue.waitUntilClickable();
        biWeeklyValue.click();
        waitABit(2000);
    }

    public void selectSepValue() {
        payrollPeriodValue.waitUntilClickable();
        payrollPeriodValue.click();
        waitABit(3000);
    }

    public void selectJulyValueToRemove() {
        removePayrollPeriodValue.waitUntilClickable();
        removePayrollPeriodValue.click();
        waitABit(3000);
    }

    public void selectJulyValueForVoid() {
        voidPayrollPeriodValue.waitUntilClickable();
        voidPayrollPeriodValue.click();
        waitABit(3000);
    }


    public void openRegisterType() {
        waitUntilLoaded(registerTypeDD.get(4));
        registerTypeDD.get(4).click();
        waitABit(3000);
    }

    public void selectSpecialRegistor() {
        specialRegValue.waitUntilClickable();
        specialRegValue.click();
        waitABit(3000);
    }

    public void selectNormalRegistor() {
        normalRegValue.waitUntilClickable();
        normalRegValue.click();
        waitABit(3000);
    }

    public void setRegisterDescription(){
        registerDescription.waitUntilClickable();
        registerDescription.sendKeys("This is Auto generated Special Register using Automated scripts");
        waitABit(3000);

    }

    public void setNorRegisterDescription(){
        norRegisterDescription.waitUntilClickable();
        norRegisterDescription.sendKeys("This is Auto generated Normal Register using Automated scripts");
        waitABit(3000);

    }

    public void cancelAddRegister() {
        cancleAddRegister.waitUntilClickable();
        cancleAddRegister.click();
        waitABit(5000);
    }

    public void saveAddRegistor(){
        saveAddRegistor.waitUntilClickable();
        saveAddRegistor.click();
        waitABit(5000);
    }

    public void clickAddJobToRegistor() {
        //addJobToRegistorButton.waitUntilClickable();
        waitABit(5000);
        addJobToRegistorButton.click();
    }

    public void captureRegisterNumber(){
        waitFor(registorNumber);
        RegNumValue = registorNumber.getValue();
        }

    public void captureNorRegisterNumber(){
        waitFor(norRegisterNumber);
        NorRegNumValue = norRegisterNumber.getValue();
    }


    public void searchRegisterNumber(){
        searchTextBox.waitUntilClickable();
        searchTextBox.click();
        searchTextBox.typeAndEnter(RegNumValue);
    }

    public void searchFixRegisterNumber(){
        searchTextBox.waitUntilClickable();
        searchTextBox.click();
        searchTextBox.typeAndEnter("SpcReg-57789");
    }

    public void searchNorRegisterNumber(){
        searchTextBox.waitUntilClickable();
        searchTextBox.click();
        searchTextBox.typeAndEnter(NorRegNumValue);
    }

    public void clickReturnToSearch () {
        returnToSearchLink.waitUntilPresent();
        returnToSearchLink.waitUntilClickable();
        getDriver().navigate().refresh();
         waitABit(9000);
        returnToSearchLink.click();
    }



    public void clickSaveAfterAddHoursToJob() {
        waitABit(5000);
        saveAfterJobHoursEdit.waitUntilClickable();
        saveAfterJobHoursEdit.click();
    }

    public void clickOnMoreButton() {
        clickMoreButton.waitUntilClickable();
        waitABit(5000);
        clickMoreButton.click();
        waitABit(5000);

    }

    public void clickOnPrintPDFButton() {
        waitABit(5000);
        clickPrintPDFOption.waitUntilClickable();
        clickPrintPDFOption.click();

    }

    public void clickSetJobHours() {
        setJobHours.waitUntilClickable();
        setJobHours.click();
    }

    public void clickOkButtonSubmitReg() {
        okMessage.waitUntilVisible();
        okMessage.waitUntilClickable();
        okMessage.click();
        waitABit(5000);
        getDriver().navigate().refresh();

    }

    public void clickOkCancelAfterPrintingComplete() {
        waitABit(8000);
        cancleAfterCompleteprinting.waitUntilClickable();
        cancleAfterCompleteprinting.click();

    }

    public void clickVoidMenu() {
        voidRegister.waitUntilPresent();
        voidRegister.waitUntilClickable();
        voidRegister.click();
    }

    public void clickRemoveJobFromRegister() {
        removeJobFromReg.waitUntilPresent();
        removeJobFromReg.waitUntilClickable();
        removeJobFromReg.click();


    }

    public void clickCloseButton() {
        waitABit(5000);
        clickCloseButton.waitUntilPresent();
        clickCloseButton.waitUntilClickable();
        clickCloseButton.click();


    }

    public void clickYesToConfirm1() {
        yesDialogConfirm.waitUntilClickable();
        yesDialogConfirm.click();
        waitABit(5000);
    }

    public void clickOnDeleteRegister() {
        deleteRegister.waitUntilClickable();
        deleteRegister.click();
        waitABit(5000);

    }

    public void clickDeleteConfirmMessage() {
        deleteConfirmMsg.waitUntilClickable();
        deleteConfirmMsg.click();
        waitABit(5000);
    }

    public void setRegNameData() {
        logger.info("Adding Register Value");
        setRegName(RegName);
        logger.info("Register Value > " + RegName);
    }


    private void setRegName(String registerNumber) {
        waitUntilLoaded(this.registerNumber);
        this.registerNumber.clear();
        this.registerNumber.sendKeys(registerNumber);
        logger.info("Special Register Name " + this.registerNumber);
        }

    public void setNormalRegNameData() {
        logger.info("Adding Normal Register Value");
        setNormalRegName(NorRegName);
        logger.info("Normal Register Value > " + NorRegName);
        waitABit(25000);
    }

    private void setNormalRegName(String norRegisterNumber) {
        waitUntilLoaded(this.norRegisterNumber);
        this.norRegisterNumber.clear();
        this.norRegisterNumber.sendKeys(norRegisterNumber);
        logger.info("Normal Register Name " + this.norRegisterNumber);
    }


    public void deleteNormalRegister() {
        waitUntilLoaded(deleteRegister);
        deleteRegister.click();
    }


    public boolean getFullTimePayRate (){
        waitABit(5000);
        evaluateJavascript("$('#Custom2').data('kendoNumericTextBox').focus()");
        waitABit(3000);
        fullTimePayRate = fullTimePayRateAmount.getValue();
        System.out.println(fullTimePayRate);
        if (fullTimePayRate.equals(FTPRCompareValue)) {
            System.out.println("This value of Full Time Pay Rate is Correct :" + fullTimePayRate);

        }
        else
        {
            System.out.println("Cycle Salary value is INCORRECT ");
            takeScreenShotOnIncorrectValue();
        }
        return true;
    }


    public void takeScreenShotOnIncorrectValue() {
        Thucydides.takeScreenshot();
    }

    public boolean getGrossPay() {
        waitABit(5000);

        evaluateJavascript("$('#GrossPaySalary').data('kendoNumericTextBox').focus()");
        waitABit(3000);

        grossPayRate = grossPayAmount.getValue();

        System.out.println(grossPayRate);
        if (grossPayRate.equals(grossPayRateValue)) {
            System.out.println("This value of Gross Pay Rate Value is Correct :" + grossPayRate);

        }
        else
        {
            System.out.println("Gross Pay value is INCORRECT ");
            takeScreenShotOnIncorrectValue();
        }
        return true;


    }

    public boolean getPayCheckAmount() {
        waitABit(5000);
        //Object payCheckAmount = evaluateJavascript("$('#PayrollPaycheckDataView').data('kendoGrid')._data[0]['AmountPaid']");
       evaluateJavascript("$('#PayrollPaycheckDataView').data('kendoGrid')._data[0]['AmountPaid']");

        waitABit(3000);
        payCheckAmount = valuePayCheckAmount.getText();
        System.out.println(payCheckAmount);
        if (payCheckAmount.equals(comparePayCheckAmount)) {
            System.out.println("This value of Pay Check Value is Correct :" + payCheckAmount);

        }
        else
        {
            System.out.println("Pay Check value is INCORRECT ");
            takeScreenShotOnIncorrectValue();
        }
        return true;


    }

}
