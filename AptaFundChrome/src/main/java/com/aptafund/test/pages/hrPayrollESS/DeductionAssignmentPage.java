package com.aptafund.test.pages.hrPayrollESS;

        import com.aptafund.test.actions.WaitActions;
        import net.serenitybdd.core.annotations.findby.FindBy;
        import net.serenitybdd.core.pages.WebElementFacade;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import javax.xml.ws.FaultAction;

/**
 * Created by smuhammad on 2/2/2017.
 */
public class DeductionAssignmentPage extends WaitActions {

    private Logger logger = LoggerFactory.getLogger(DeductionAssignmentPage.class);



    @FindBy(css = ".menulink[href=\"/QAAutom/Payroll/PayrollEmployeeDeduction/Manage\"]")
    private WebElementFacade deductionAssignment;


    @FindBy(id = "btnAdd__EmpPyDedAssignmentFixedAmountDataView")
    private WebElementFacade addFixedAmountDeduction;


    @FindBy(id = "btnAdd__EmployeePayrollDeductionAssignmentDataView")
    private WebElementFacade addDeductionAssignment;

    @FindBy(id = "btnSave__PayrollEmployeeDeduction")
    private WebElementFacade saveButton;



    @FindBy(id = "btnSave__EmpPyDedAssignmentFixedAmountDataView")
    private WebElementFacade saveFixedAmountDed;


    @FindBy (id ="CommentFixedDeduction")
    private WebElementFacade fixedAmountDeductionComments;


    @FindBy (id ="DeductionComments")
    private WebElementFacade comments;

    @FindBy (id = "DeductionEmployeeId-list")
    private WebElementFacade deductionEmployeeDD;


    @FindBy (css = ".k-input.ElementControlComboBox.None")
    private WebElementFacade stateCode;

    @FindBy (id = "DeductionId")
    private WebElementFacade Deduction;

    @FindBy (css = ".k-input.ElementControlComboBox.FixedAmountDeductionComboBoxDataSource")
    private WebElementFacade focusDeduction;

    @FindBy (id ="Allowances")
    private WebElementFacade allowances;

    @FindBy (id = "btnEdit__EmployeePayrollDeductionAssignmentDataView")
    private WebElementFacade editButton;


    @FindBy (id = "SearchText__EmployeePayrollDeductionAssignmentDataView")
    private WebElementFacade searchNewDedAssign;

    @FindBy (xpath = ".//*[@id='EmployeePayrollDeductionAssignmentDataView']/div[4]/table/tbody/tr[2]/td[2]/input")
    private WebElementFacade checkToEdit;

    @FindBy (id = "RenderBody")
    private WebElementFacade renderBody;


    @FindBy (id = "tabstripFINSUITabStripItemDirectDeposit")
    private WebElementFacade directDeposit;

    @FindBy (id = "tabstripFINSUITabStripItemPercentage")
    private WebElementFacade percentage;

    @FindBy (id = "btnAdd__EmpPyDedAssignmentPercentageDataView")
    private WebElementFacade addPercentageButton;


    @FindBy (id = "DeductionComments")
    private WebElementFacade deductionComments;


    @FindBy (id = "btnAdd__EmpPyDedAssignmentDirectDepositDataView")
    private WebElementFacade addDirectDeposit;

    @FindBy (id = "BankName")
    private WebElementFacade bankName;

    @FindBy (id = "RoutingNumber")
    private WebElementFacade routingNumber;

    @FindBy (id = "AccountNumber")
    private WebElementFacade accountNumber;

    @FindBy (xpath = ".//*[@id='FormPayrollEmployeeDeductionDirectDeposit']/div/div[2]/div[2]/span[1]/span/span[2]/span")
    private WebElementFacade accountTypeDD;

    @FindBy (css = "ul#AccountType_listbox li:nth-of-type(2)")
    private WebElementFacade setAccountType;

    @FindBy (css = "ul#PercentageDeductionId_listbox li:nth-of-type(2)")
    private WebElementFacade setDeduction;

    @FindBy (xpath = ".//*[@id='FormPayrollEmployeeDeductionDirectDeposit']/div/div[3]/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade preNoticationDD;

    @FindBy (css = "ul#PreNotification_listbox li:nth-of-type(1)")
    private WebElementFacade setPreNotification;


    @FindBy (xpath = ".//*[@id='FormPayrollEmployeeDeductionDirectDeposit']/div/div[3]/div[2]/span[1]/span/span[2]/span")
    private WebElementFacade primaryDD;

    @FindBy (css = "input[name=PercentageDeductionId_input]")
    private WebElementFacade deductionDD;


    @FindBy (css = "ul#PrimaryAllocation_listbox li:nth-of-type(2)")
    private WebElementFacade primaryValue;

    @FindBy (id ="btnSave__EmpPyDedAssignmentDirectDepositDataView")
    private WebElementFacade saveDirectDeposit;

    @FindBy (id ="btnSave__EmpPyDedAssignmentPercentageDataView")
    private WebElementFacade saveNonVariablePercentage;


    @FindBy (id = "Percent")
    private WebElementFacade percentValue;


    @FindBy (id = "Amount")
    private WebElementFacade amountValue;

    @FindBy (id = "PercentageComment")
    private WebElementFacade percentageComments;


    @FindBy (xpath = ".//*[@id='FormPayrollEmployeeDeductionDirectDeposit']/div/div[4]/div[1]/span[1]/span/input[1]")
    private WebElementFacade percentSelect;


    @FindBy (xpath = ".//*[@id='FormPayrollEmployeeDeductionDirectDeposit']/div/div[4]/div[2]/span[1]/span/input[1]")
    private WebElementFacade amountSelect;

    @FindBy (css = ".selectAll__EmpPyDedAssignmentPercentageDataView")
    private WebElementFacade selectAllCheck;

    @FindBy (id = "btnDelete__EmpPyDedAssignmentPercentageDataView")
    private WebElementFacade clickDelete;

    @FindBy (id = "FormPayrollEmployeeDeductionPercentageAmount")
    private WebElementFacade loadForm;

    @FindBy (id = "dialog-confirm")
    private WebElementFacade clickYesConfirm;

    @FindBy (id = "popupWindowPercentageDetails_wnd_title")
    private WebElementFacade loadDeductionDetails;

    @FindBy (css = "input[name=\"FWTFilingStatus_input\"]")
    private WebElementFacade fillingStatus;

    @FindBy (id ="W5Count")
    private WebElementFacade W5Filled;

    @FindBy (id = "btnSave__PayrollEmployeeDeduction")
    private WebElementFacade saveDeductionDetails;

    @FindBy (css =".check_row__EmpPyDedAssignmentFixedAmountDataView")
    private WebElementFacade  applyCheckToEditDeduction;

    @FindBy (id = "btnEdit__EmpPyDedAssignmentFixedAmountDataView")
    private WebElementFacade editDeductionSet;


    @FindBy (id = "CommentFixedDeduction")
    private WebElementFacade editComments;




    public void clickDeductionAssingment() {
        waitUntilLoaded(deductionAssignment);
        deductionAssignment.waitUntilClickable();
        waitABit(2000);
        deductionAssignment.click();

    }


    public void clickAddNewDeductionAssignmentButton() {
        waitABit(5000);
        waitUntilLoaded(addDeductionAssignment);
        addDeductionAssignment.click();
        waitABit(9000);

    }


    public void selectEmployeeValueDD() {
        //waitUntilLoaded(deductionEmployeeDD);
        evaluateJavascript("$('#DeductionEmployeeId').data('kendoComboBox').select(5)");
        waitABit(5000);

    }

    public void selectFillingStatus() {
        //waitUntilLoaded(allowances);
        //waitFor(allowances);
        //W5Filled.waitUntilClickable();
        //W5Filled.click();

        waitABit(5000);
        fillingStatus.waitUntilClickable();
        //evaluateJavascript("$('#FWTFilingStatus').data('kendoComboBox').select(1)");
        waitABit(5000);
        fillingStatus.sendKeys("Single");
        waitABit(5000);
    }



    public void selectStateValueDD() {
        //evaluateJavascript("$('#StateCode').data('kendoComboBox').focus()");
        //evaluateJavascript("$('#StateCode').data('kendoComboBox').focus()");
        //evaluateJavascript("$('#StateCode').data('kendoComboBox').select(2)");
        //evaluateJavascript("$('#StateCode').data('kendoComboBox').search('California')");
        stateCode.click();
        waitABit(3000);
        stateCode.type("California");
        waitABit(5000);

    }

    public void selectDeductionValueDD() {
        focusDeduction.click();
        focusDeduction.sendKeys("1Deduction");
        evaluateJavascript("$('#DeductionId').data('kendoComboBox').select(1)");
        waitABit(5000);
    }


    public void saveDeductionSet() {
        waitUntilLoaded(saveButton);
        saveButton.click();
        waitABit(9000);
    }

    public void saveFixedAmountDeductionSet() {
        waitUntilLoaded(saveFixedAmountDed);
        saveFixedAmountDed.click();
        waitABit(9000);
    }

    public void addComments(){
        waitABit(5000);
        comments.click();
        comments.sendKeys("Automated comments adding new Deduction set");
    }


    public void addFixedAmountDeductionComments(){
        fixedAmountDeductionComments.waitUntilClickable();
        fixedAmountDeductionComments.click();
        fixedAmountDeductionComments.sendKeys("Automated comments adding new Fixed Amount Deduction ");
    }

    public void clickAddFixedAmountDeduction(){
        waitUntilLoaded(addFixedAmountDeduction);
        addFixedAmountDeduction.waitUntilClickable();
        addFixedAmountDeduction.click();
        waitABit(9000);

    }

    public void searchNewAssignment() {

        searchNewDedAssign.waitUntilVisible();
        searchNewDedAssign.waitUntilEnabled();
        searchNewDedAssign.waitUntilClickable();
        waitUntilLoaded(searchNewDedAssign);
        searchNewDedAssign.click();
        //searchNewDedAssign.clear();
        waitABit(5000);
        searchNewDedAssign.typeAndEnter("New");

    }


    public void applyCheckInCheckBox() {
        waitUntilLoaded(renderBody);
        waitABit(8000);
        checkToEdit.click();
        //evaluateJavascript("$('.check_row__EmployeePayrollDeductionAssignmentDataView').get(0)");

    }

    public void editDeductionAssignment() {
        waitUntilLoaded(editButton);
        editButton.waitUntilClickable();
        editButton.click();
    }

    public void clickDirectDepositTab() {
        //directDeposit.waitUntilVisible();
        //directDeposit.waitUntilEnabled();
        deductionComments.click();
        waitABit(5000);
        directDeposit.waitUntilClickable();
        directDeposit.click();
    }

    public void clickPercentageTab() {
        //directDeposit.waitUntilVisible();
        //directDeposit.waitUntilEnabled();
        deductionComments.click();
        waitABit(5000);
        percentage.waitUntilClickable();
        percentage.click();
    }

    public void  clickOnAddPercentage(){
        addPercentageButton.waitUntilVisible();
        addPercentageButton.waitUntilClickable();
        addPercentageButton.click();

    }

    public void addDirectDepositInDeduction() {
        //addDirectDeposit.waitUntilPresent();
        //addDirectDeposit.waitUntilEnabled();

        waitABit(8000);
        addDirectDeposit.waitUntilClickable();
        addDirectDeposit.click();
    }

    public void setBankName() {
        bankName.waitUntilVisible();
        bankName.waitUntilClickable();
        //bankName.waitUntilPresent();
        bankName.click();
        bankName.sendKeys("Auto Bank");
        waitABit(5000);
    }

    public void setRoutingNumber() {
        routingNumber.waitUntilVisible();
        routingNumber.waitUntilEnabled();
        routingNumber.waitUntilPresent();
        routingNumber.sendKeys("121000358");

    }

    public void setAccountNumber() {
        //accountNumber.waitUntilNotVisible();
        accountNumber.waitUntilEnabled();
        accountNumber.waitUntilClickable();
        accountNumber.sendKeys("12345678");
        waitABit(3000);
    }

    public void setAccountType() {
        //accountTypeDD.waitUntilNotVisible();
        //accountTypeDD.waitUntilClickable();

        accountTypeDD.click();
        waitABit(2000);

        setAccountType.waitUntilVisible();
        setAccountType.waitUntilClickable();
        setAccountType.click();
        waitABit(3000);
    }

    public void setPreNotification() {
        preNoticationDD.waitUntilClickable();
        waitABit(3000);
        preNoticationDD.click();
        setPreNotification.waitUntilClickable();
        setPreNotification.click();
        waitABit(5000);

    }

    public void setPrimaryLocation() {
        primaryDD.waitUntilClickable();
        primaryDD.click();
        waitABit(2000);
        waitUntilLoaded(primaryDD);
        primaryValue.waitUntilClickable();
        primaryValue.click();
        waitABit(3000);

    }

    public void saveDirectDeposit() {
        saveDirectDeposit.waitUntilClickable();
        saveDirectDeposit.click();
        //waitABit(5000);
    }

    public void setPercentValue() {
        percentSelect.click();
        waitUntilLoaded(percentValue);
        percentValue.waitUntilPresent();
        percentValue.click();
        percentValue.sendKeys("20");
    }

    public void setAmountValue() {
        amountSelect.click();
        waitUntilLoaded(amountValue);
        amountValue.waitUntilPresent();
        amountValue.click();
        amountValue.sendKeys("120");
    }


    public void selectDeductionDD() {
        waitUntilLoaded(loadDeductionDetails);
        waitUntilLoaded(loadForm);

        deductionDD.waitUntilClickable();
        //evaluateJavascript("$('#DeductionId').data('kendoDropDownList').select(1)");
        deductionDD.click();
    }

    public void selectDeductionFromDD(){
        waitUntilLoaded(setDeduction);

        setDeduction.click();

    }

    public void setDeductionValue() {
        deductionDD.waitUntilVisible();
        waitUntilLoaded(deductionDD);
        waitABit(5000);
        deductionDD.sendKeys("CA SDI");
        waitABit(5000);

    }

    public void setDeductionValueForDelete() {
        deductionDD.waitUntilVisible();
        waitUntilLoaded(deductionDD);
        waitABit(5000);
        deductionDD.sendKeys("GR-GARNISHMENT JS");
        waitABit(5000);

    }

    public void setComments() {
        percentageComments.waitUntilClickable();
        percentageComments.sendKeys("This is auto generated comments For percentage");
        waitABit(5000);
    }

    public void saveNonVariablePercentage(){
        saveNonVariablePercentage.waitUntilClickable();
        saveNonVariablePercentage.click();
        waitABit(9000);


    }

    public void applyCheckForNewlyAddedDeduction() {
        selectAllCheck.waitUntilClickable();
        selectAllCheck.click();
    }

    public void clickOnDeleteButton() {
        clickDelete.waitUntilClickable();
        clickDelete.click();
        clickYesConfirm.waitUntilVisible();
        clickYesConfirm.click();
        waitABit(9000);
    }

    public void saveDeductionDetails() {
        saveDeductionDetails.waitUntilClickable();
        saveDeductionDetails.click();

    }

    public void applyCheckToEditDeductionDetails() {
        applyCheckToEditDeduction.waitUntilVisible();
        applyCheckToEditDeduction.waitUntilClickable();
        applyCheckToEditDeduction.click();
    }

    public void clickOnEditButton() {
        editDeductionSet.waitUntilPresent();
        editDeductionSet.waitUntilEnabled();
        editDeductionSet.waitUntilClickable();
        editDeductionSet.click();

    }

    public void updateCommentsToCheckEditFunctionality() {
        editComments.waitUntilVisible();
        editComments.waitUntilPresent();
        editComments.waitUntilClickable();
        editComments.clear();
        editComments.waitUntilEnabled();
        waitABit(5000);
        //editComments.click();
        editComments.sendKeys("Change the comments to check the editing functionality of Direct Deposit");
        saveFixedAmountDed.waitUntilVisible();
        saveFixedAmountDed.waitUntilEnabled();
        saveFixedAmountDed.waitUntilClickable();
        waitABit(5000);
        saveFixedAmountDed.click();
    }



}

