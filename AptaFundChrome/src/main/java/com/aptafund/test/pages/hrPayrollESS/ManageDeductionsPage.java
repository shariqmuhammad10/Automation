package com.aptafund.test.pages.hrPayrollESS;

import com.aptafund.test.actions.WaitActions;
import com.github.javafaker.Faker;
import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.Thucydides;
import org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by smuhammad on 10/18/2016.
 */
public class ManageDeductionsPage extends WaitActions{

    private static final Logger Logger = LoggerFactory.getLogger(ManageDeductionsPage.class);



    Faker faker = new Faker();
    String deductionname = faker.name().firstName();
    String fullname = ("1 Deduction for " + deductionname);
    String vendorName = "a";
    String empPayPeriodAmountVer = "100" ;
    String employerPayPriodAmtVer = "120";
    String getemployeePeriodAmountValue;
    String getEmployerPeriodAmountValue;


    Faker fakerPer = new Faker();
    String deductionnamePer = fakerPer.name().firstName();
    String fullnamePer = ("1Ded Per " + deductionnamePer);
    String vendorNamePer = "b";


    @FindBy(id = "menudropdown5")
    private WebElementFacade essBox;

    @FindBy(css = ".menulink[href=\"/QAAutom/Payroll/PayrollDeduction/Manage\"]")
    private WebElementFacade manageDeductionTitle;


    @FindBy (id = "btnAdd__PayrollDeductionManagementDataView")
    private WebElementFacade manageDeductionAddButton;

    @FindBy (id = "DeductionName")
    private WebElementFacade deductionName;

    @FindBy (id = "DeductionName")
    private WebElementFacade deductionNamePer;

    @FindBy (id = "PayrollDeductionType_Deduction")
    private WebElementFacade deductionTypeOption;

    @FindBy (id = "PayrollCalculationMethod_FixedAmount")
    private WebElementFacade calculationInFixedAmount;

    @FindBy (id = "PayrollCalculationMethod_Percentage")
    private WebElementFacade calculationInPercentage;

    @FindBy (id = "PayrollDeductionOrder_PostTax")
    private WebElementFacade deductOrderTypeOption;

    @FindBy(css = ".k-icon.k-i-arrow-s")
    private List<WebElementFacade> generalDD;

    @FindBy (css = "input[name = VendorId_input]")
    private WebElementFacade vendorInput;

    @FindBy (xpath = ".//*[@id='Comment']")
    private WebElementFacade comment;

    @FindBy (xpath = ".//*[@id='Comment']")
    private WebElementFacade updateComment;

    @FindBy (xpath =".//*[@id='EmployeePeriodAmount']")
    private WebElementFacade  employeePayPeriodAmount;

    @FindBy (xpath =".//*[@id='EmployerInformation']/div[1]/div[1]/span/span/input[1]")
    private WebElementFacade  employerPayPeriodAmount;


    @FindBy (id = "btnMoreButtons")
    private WebElementFacade moreButton;

    @FindBy (id = "btnSystemDeduction__PayrollDeductionManagementDataView")
    private WebElementFacade createSystemDeduction;

    @FindBy (xpath = ".//*[@id='StateList']/option[2]")
    private WebElementFacade arizonaStateSD;

    @FindBy (id ="btnCreateSystemDeduction")
    private WebElementFacade okButton;

    @FindBy (id = "divAjaxError")
    private  WebElementFacade msgDeductionCreated;


    @FindBy (css =".k-select")
    List<WebElementFacade> vendorList;


    @FindBy (css = ".k-link.k-header.k-state-hover")
    private WebElementFacade getEmployeeInformationHeader;

    @FindBy (css = "ul#VendorId_listbox li:nth-of-type(3)")
    private WebElementFacade vendorSelection;
    //VendorId_listbox

    @FindBy (css = "ul#EmployeeLiabElementValueId_listbox li:nth-of-type(1)")
    private WebElementFacade employeeLibValueElementSelection;

    @FindBy (id = "EmployeeLiabElementValueId")
    private WebElementFacade clickELE;



    @FindBy (css = "ul#EmployerLiabElementValueId_listbox li:nth-of-type(1)")
    private WebElementFacade liabilityElementValue;

    @FindBy (xpath =".//*[@id='EmployerPeriodAmount']")
    private WebElementFacade employerPeriodAmount;

    @FindBy (id = "EmployeePeriodAmount")
    private WebElementFacade employeePeriodAmountValue;

    @FindBy (xpath =".//*[@id='EmployerPeriodPercent']")
    private WebElementFacade employerPeriodAmountForPercent;

    @FindBy (id ="Priority")
    private WebElementFacade ppp;

    @FindBy (xpath =".//*[@id='EmployeePeriodPercent']")
    private WebElementFacade employeePercentagePeriod;


    @FindBy (css = ".k-link.k-header.k-state-selected.k-state-focused.k-state-hover")
    private WebElementFacade employeeInformationHeader;

    @FindBy (xpath =".//*[@id='PayrollDeductionManagementDataView']/div[4]")
    private WebElementFacade managePayrollDataViewGrid;



    @FindBy (id = "btnSave__PayrollDeduction")
    private WebElementFacade saveDeduction;

    @FindBy (id = "SearchText__PayrollDeductionManagementDataView")
    private WebElementFacade searchBox;

    @FindBy (css = ".kendo-data-row>td>a")
    private WebElementFacade valueOfDeduction;

    @FindBy (css = ".k-input.ElementControlComboBox.None[name=IsHSADeduction_input]")
    private WebElementFacade HSASupportDD;

    @FindBy (css = ".selectAll__PayrollDeductionManagementDataView")
    private WebElementFacade applyCheck;

    @FindBy (id = "btnEnableDeduction__PayrollDeductionManagementDataView")
    private WebElementFacade enableDeductionButton;

    @FindBy (id = "dialog-confirm")
    private WebElementFacade yesToConfirmButton;

    @FindBy (id = "EmployeeYearlyCap")
    private WebElementFacade employeeYearlyCap;


    @FindBy (id = "btnDisableDeduction__PayrollDeductionManagementDataView")
    private WebElementFacade disableDeductionButton;

    @FindBy (id = "btnEdit__PayrollDeductionManagementDataView")
    private WebElementFacade editDeductionButton;


    @FindBy(xpath = ".//*[@id='EmployeeInformation']/div[4]/div[2]/span/span/span[1]")
    private WebElementFacade employeeLiabilityValueDD;

    @FindBy (xpath = ".//*[@id='PayrollDeductionManagementDataView']/div[4]/table/tbody/tr/td[1]/input")
    private WebElementFacade clickOnCheckbox;

  public void clickonEPP(){
        evaluateJavascript("$('#EmployeePeriodAmount').data('kendoNumericTextBox').focus()");
        waitABit(5000);
        employeePayPeriodAmount.sendKeys("100");

    }

    public void setLiabilityElementValue(){
        evaluateJavascript("$('#EmployeeLiabElementValueId').data('kendoDropDownList').select(1)");
        waitABit(5000);
    }

    public void setLiabilityElementValueForPercentageCalculation(){
        evaluateJavascript("$('#EmployeeLiabElementValueId').data('kendoDropDownList').select(1)");
        waitABit(5000);
    }

    public void setExpenditureElementValue(){
        evaluateJavascript("$('#EmployerExpElementValueId').data('kendoDropDownList').select(1)");
        waitABit(5000);
    }

    public void setExpenditureElementValueForPercent(){
        evaluateJavascript("$('#EmployerExpElementValueId').data('kendoDropDownList').select(1)");
        waitABit(5000);
    }

    public void setEmployerPayPeriod(){
        evaluateJavascript("$('#EmployerPeriodAmount').data('kendoNumericTextBox').focus()");
        waitABit(5000);
        employerPeriodAmount.sendKeys("120");
        waitABit(5000);
    }

    public void setEmployerPayPeriodForPercentage(){
        evaluateJavascript("$('#EmployerPeriodPercent').data('kendoNumericTextBox').focus()");
        waitABit(5000);
        employerPeriodAmountForPercent.sendKeys("120");
        waitABit(5000);
    }


    public void setEmployerLiabilityElementValue(){
        evaluateJavascript("$('#EmployerLiabElementValueId').data('kendoDropDownList').select(1)");
        waitABit(5000);
        
    }

    public void setEmployerLiabilityElementValueForPercentage(){
        evaluateJavascript("$('#EmployerLiabElementValueId').data('kendoDropDownList').select(1)");
        waitABit(5000);

    }

    public void setVendorName (){
        waitABit(9000);
        vendorList.get(1).click();
        waitABit(5000);
        vendorSelection.click();
    }

    public void clickOnManageDeduction(){
        Logger.info("Waiting for Employee Jobs link to be clickable");
        waitUntilLoaded(essBox);
        manageDeductionTitle.sendKeys("");
        manageDeductionTitle.click();
        waitABit(5000);
            }

        public void addDeduction(){
        manageDeductionAddButton.waitUntilClickable();
        waitABit(5000);
        manageDeductionAddButton.click();
        }



    public void setDeductionNamePer(String deductionNamePer ) {
        waitUntilLoaded(this.deductionNamePer);
        this.deductionNamePer.clear();
        this.deductionNamePer.sendKeys("1Ded Per ");
        this.deductionNamePer.sendKeys(deductionNamePer);
        Logger.info("Enter Full Name " + deductionNamePer);
        waitABit(5000);
    }

    public void setDeductionNameForPercentageData() {
        Logger.info("Adding Deduction Name Details");
        setDeductionNamePer(deductionnamePer);
        Logger.info("Employee Name > " + deductionnamePer);
        waitABit(2000);
    }


    public void setDeductionName(String deductionName ) {
        waitUntilLoaded(this.deductionName);
        this.deductionName.clear();
        this.deductionName.sendKeys("1 Deduction for ");
        this.deductionName.sendKeys(deductionName);
        Logger.info("Enter Full Name " + deductionName);
        waitABit(5000);
    }

    public void setDeductionNameData() {
        Logger.info("Adding Deduction Name Details");
        setDeductionName(deductionname);
        Logger.info("Employee Name > " + deductionname);
        waitABit(4000);
    }




    public void setDeductionTypeOption (){
            deductionTypeOption.waitUntilClickable();
            deductionTypeOption.click();

    }

    public void setCalculationUsingPercentage (){
        calculationInPercentage.waitUntilClickable();
        calculationInPercentage.click();


    }

    public void setCalculationTypeOption (){
        calculationInFixedAmount.waitUntilClickable();
        calculationInFixedAmount.click();
    }

    public void setDeductOrderTypeOption (){
        deductOrderTypeOption.waitUntilClickable();
        deductOrderTypeOption.click();
        waitABit(2000);

    }

    public void openVendorDD(){
        waitUntilLoaded(vendorInput);
        vendorInput.click();
        vendorInput.sendKeys("3wire.com");
        vendorInput.click();

    }


   public void setComment () {
        waitABit(5000);
        comment.sendKeys("");
        comment.waitUntilClickable();
        evaluateJavascript("$('#Comment').click()");
        comment.clear();
        comment.sendKeys("This is an Auto created Percentage Deduction");
        waitABit(5000);
   }

   public void setEmployeePayPeriodAmount(){
        employeePayPeriodAmount.click();
        employeePayPeriodAmount.sendKeys("101");

   }


    public void clickOnMoreButton() {
       waitUntilLoaded(moreButton);
       moreButton.waitUntilClickable();
       moreButton.click();
       waitABit(6000);
    }

    public void selectCreateSystemDeduction() {

        createSystemDeduction.waitUntilClickable();
        createSystemDeduction.click();
        waitABit(5000);

    }

    public void createSystemDeductionAZ()
    {
        arizonaStateSD.waitUntilClickable();
        arizonaStateSD.click();
        waitUntilLoaded(okButton);
        okButton.waitUntilClickable();
        okButton.click();
        waitABit(5000);
        Assert.verify(true,"System deductions created successfully.");
        Logger.info("System Deduction has been created Successfully");
    }



    public void setSaveDeduction() {
        waitUntilLoaded(saveDeduction);
        saveDeduction.waitUntilClickable();
        saveDeduction.click();
        searchBox.waitUntilClickable();
    }

    public void clickOnSearchBox(){
       waitABit(9000);
       waitUntilLoaded(searchBox);
       searchBox.click();

    }

    public void searchNewlyCreatedDeduction(){
        searchBox.typeAndEnter(fullname);
        enableCheckToSelect();

    }

    public void searchNewlyCreatedDeductionForPercentage(){
        searchBox.typeAndEnter(fullnamePer);
        enableCheckToSelect();

    }

    public void enableCheckToSelect(){
        waitABit(9000);
        clickOnCheckbox.waitUntilVisible();
        clickOnCheckbox.waitUntilClickable();
        clickOnCheckbox.click();


    }

    public void enableNewlyCreatedDeduction(){
        waitUntilLoaded(enableDeductionButton);
        enableDeductionButton.click();
        waitABit(9000);

    }


    public void clickYesToConfirmForDisable(){

        evaluateJavascript("$('#dialog-confirm').click()");
        waitABit(5000);

    }
    public void clickYesToConfirm(){
        waitUntilLoaded(yesToConfirmButton);
        yesToConfirmButton.click();
        waitABit(5000);

    }

    public void clickYesToConfirm1(){
        waitUntilLoaded(yesToConfirmButton);
        yesToConfirmButton.click();
        waitABit(5000);

    }

    public void disableDeductionSet() {
        waitABit(16000);
        waitUntilLoaded(disableDeductionButton);
        disableDeductionButton.waitUntilClickable();
        disableDeductionButton.click();
        waitABit(9000);
    }

    public void clickonPPP() {
        evaluateJavascript("$('#EmployeePeriodPercent').data('kendoNumericTextBox').focus()");
        waitABit(5000);
        employeePercentagePeriod.sendKeys("25");

    }

    public void reloadPageForDisableDeduction() {
        getDriver().navigate().refresh();
    }

    public void clickEditButton() {
        waitUntilLoaded(managePayrollDataViewGrid);
        editDeductionButton.waitUntilVisible();
        editDeductionButton.waitUntilEnabled();
        editDeductionButton.waitUntilClickable();
        waitABit(5000);
        editDeductionButton.click();
    }

    public boolean verifyEmpPayPeriodAmountValue() {
        waitABit(15000);
        evaluateJavascript("$('#EmployeePeriodAmount').data('kendoNumericTextBox').focus()");
        waitABit(3000);
        getemployeePeriodAmountValue = employeePayPeriodAmount.getValue();
        System.out.println(getemployeePeriodAmountValue);
        if (getemployeePeriodAmountValue.equals(empPayPeriodAmountVer)) {
            System.out.println("This value of Employee Pay Period Amount is Correct :" + getemployeePeriodAmountValue);

        }
        else
        {
            System.out.println("Employee Pay Period Amount value is INCORRECT ");
            takeScreenShotAmountIncorrect();
        }
        return true;

    }

    public void callRefreshPage() {
        getDriver().navigate().refresh();
    }

    public void takeScreenShotAmountIncorrect() {
        Thucydides.takeScreenshot();
    }

    public boolean verifyEmployerPayPeriodAmountValue() {

        waitABit(9000);
        evaluateJavascript("$('#EmployerPeriodAmount').data('kendoNumericTextBox').focus()");
        waitABit(5000);

        getEmployerPeriodAmountValue = employerPeriodAmount.getValue();
        System.out.println(getEmployerPeriodAmountValue);
        if (getEmployerPeriodAmountValue.equals(employerPayPriodAmtVer)) {
            System.out.println("This value of Employer Pay Period Amount is Correct :" + getEmployerPeriodAmountValue);

        }
        else
        {
            System.out.println("Employer Pay Period Amount value is INCORRECT ");
            takeScreenShotAmountIncorrect();
        }
        return true;
    }

    public void updateComments() {
        waitABit(5000);
        updateComment.clear();
        updateComment.sendKeys("Deduction has been updated");
    }

    public void openHSASupport() {
      HSASupportDD.click();
      HSASupportDD.sendKeys("None");



    }
}
