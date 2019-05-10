package com.aptafund.test.pages.hrPayrollESS;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.PrimitiveIterator;

import static org.openqa.jetty.html.Style.screen;

/**
 * Created by smuhammad on 12/28/2016.
 */
public class EmployeeJobsPage extends WaitActions {
    private static final Logger Logger = LoggerFactory.getLogger(EmployeeJobsPage.class);


    String cycleSalary;
    String SalaryCompareValue = "413.59" ;

    String fullTimePayRate;
    String FTPRCompareValue = "413.59";

    @FindBy (id = "btnSave__EmployeeJobsDataView")
    private WebElementFacade employeeJobSaveButton;

    @FindBy (id = "EJComment")
    private WebElementFacade addEmpJobComments;



    @FindBy (id = "MainJobForm")
    private WebElementFacade employeeJobFrame;

    @FindBy (id = "TotalSalary")
    private WebElementFacade salary;


    @FindBy (xpath = ".//*[@id='AccountCodeBox_AcEmployeeJobDetailsacTextBox']/div/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade accountCode;


    @FindBy(css = ".menulink[href=\"/QAAutom/HumanResources/Admin/Employee/Employee/EmployeeJobs\"]")
    private WebElementFacade employeeJobsTitle;


    @FindBy (css = ".k-input.ElementControlComboBox.EmployeeJobNameComboBoxDataSource")
    private WebElementFacade jobNameDDSelect;

    @FindBy (css = ".k-input.ElementControlComboBox.EmployeeJobNameComboBoxDataSource")
    private WebElementFacade jobNameDDSelectHourly;

    @FindBy(id = "menudropdown5")
    private WebElementFacade essBox;

    @FindBy (id ="btnAdd__EmployeeJobDataView")
    private WebElementFacade addNewEmployeeJobButton;

    @FindBy (css = "input[name=EmployeeId_input]")
    private  WebElementFacade employee;


    @FindBy (css = "ul#JobEmployeeId_listbox li:nth-of-type(1)")
    private WebElementFacade employeeSelection;

    @FindBy (css = "ul#JobEmployeeId_listbox li:nth-of-type(3)")
    private WebElementFacade editEmployeeSelection;

    @FindBy (css = "ul#MasterPositionId_listbox li:nth-of-type(1)")
    private WebElementFacade jobNameSelection;

    @FindBy (css = "ul#MasterPositionId_listbox li:nth-of-type(1)")
    private WebElementFacade hourlyJobNameSelection;

    @FindBy (css = "ul#tbAccountCodeEdit_AcEmployeeJobDetailsacTextBox_listbox li:nth-of-type(5)")
    private WebElementFacade accountCodeSelection;


    @FindBy(css = "#JobEmployeeId-list")
    private List<WebElementFacade> jobEmployeeDD;

    @FindBy (css= ".k-icon.k-i-arrow-s")
    private List<WebElementFacade> employeeDD;

    @FindBy (css= ".k-input.ElementControlComboBox.EmployeeJobEmployeeComboBoxDataSource")
    private WebElementFacade employeeDD1;

    @FindBy (xpath = ".//*[@id='EmployeeJobPanelbar-2']/div/div[1]/span[1]/span/span[2]/span")
    private WebElementFacade paycodeDD;


    @FindBy (xpath = ".//*[@id='EmployeeJobPanelbar-2']/div/div[5]/span[1]/span/span[2]/span")
    private WebElementFacade contributionTypeDD;

    @FindBy (css = "span [name=Custom3_input]")
    private WebElementFacade beforeContributionDD;


    @FindBy (css = "ul#EJCustom3_listbox li:nth-of-type(6)")
    private WebElementFacade selectContributionType;

    @FindBy (id = "btnApprove__EmployeeJobsDataView")
    private WebElementFacade approveEmployeeJob;

    @FindBy (id = "btnSubmitJobToPayroll__EmployeeJobDataView")
    private WebElementFacade submitEmployeeJob;


    @FindBy (id= "dialog-confirm")
    private WebElementFacade approveJobConfirmation;

    @FindBy (id = "usergridsettingsWindow__EmployeeJobDataView_wnd_title")
    private WebElementFacade submitDialogConfirm;

    @FindBy (xpath =".//*[@id='dialog-confirm']")
    private WebElementFacade submitJobConfirmation;

    @FindBy (id = "btnSubmitJobToPayroll__EmployeeJobDataView")
    private WebElementFacade submitJobToPayroll;

    @FindBy (id = "Salary")
    private WebElementFacade finalSalary;

    @FindBy (id = "EJCustom2")
    private WebElementFacade FTPRValue;


    @FindBy (id = "btnCancel__EmployeeJobsDataView" )
    private  WebElementFacade cancelButton;

    @FindBy (id = "btnOk__PayrollEncumbranceTransactionDate")
    private WebElementFacade submitJobToPayrollOkButton;


    @FindBy (xpath = ".//*[@id='EmployeeJobDataView']/div[3]/div/table/thead/tr/th[2]/a")
    private WebElementFacade sortJobStatus;

    @FindBy (xpath = ".//*[@id='EmployeeJobDataView']/div[4]/table/tbody/tr[1]/td[1]/input")
    private WebElementFacade applyCheck;

    @FindBy (id = "btnRemoveJobFromPayroll__EmployeeJobDataView")
    private WebElementFacade removeJobButton;


    @FindBy (id = "btnDelete__EmployeeJobDataView")
    private WebElementFacade deleteButton;

    @FindBy (id = "dialog-confirm")
    private WebElementFacade confirmMsg;

    public boolean getCycleSalary (){
        waitABit(5000);
        evaluateJavascript("$('#Salary').data('kendoNumericTextBox').focus()");
        waitABit(3000);
        cycleSalary = finalSalary.getValue();
        System.out.println(cycleSalary);
        if (cycleSalary.equals(SalaryCompareValue)) {
            System.out.println("This value of Cycle Salary is Correct :" + cycleSalary);

        }
        else
        {
            System.out.println("Cycle Salary value is INCORRECT ");
            takeScreenShotSalaryIncorrect();
        }
        return true;
    }

    public boolean getFullTimePayRate (){
        waitABit(5000);
        evaluateJavascript("$('#EJCustom2').data('kendoNumericTextBox').focus()");
        waitABit(3000);
        fullTimePayRate = FTPRValue.getValue();
        System.out.println(fullTimePayRate);
        if (fullTimePayRate.equals(FTPRCompareValue)) {
            System.out.println("This value of Full Time Pay Rate is Correct :" + fullTimePayRate);

        }
        else
        {
            System.out.println("Full Time Pay Rate value is INCORRECT ");
            takeScreenShotSalaryIncorrect();

        }
        return true;
    }

    public void clickSubmitOkButton(){
        waitABit(9000);
        evaluateJavascript("$('#btnOk__PayrollEncumbranceTransactionDate').focus().click()");
        waitABit(9000);

    }

    public void setSalary(){
        evaluateJavascript("$('#TotalSalary').data('kendoNumericTextBox').focus()");
        waitABit(5000);
        salary.sendKeys("1500");
        waitABit(8000);
    }

    public void takeScreenShotSalaryIncorrect() {
        Thucydides.takeScreenshot();
    }

    public void setAddEmployeeJobComments(){
        addEmpJobComments.waitUntilVisible();
        addEmpJobComments.waitUntilEnabled();
        addEmpJobComments.click();
        waitABit(5000);
        addEmpJobComments.sendKeys("Automated Add job");
    }


    public void clickApproveEmployeeJob(){
        Logger.info("Waiting to click on Approve job button");
        waitUntilLoaded(approveEmployeeJob);
        approveEmployeeJob.waitUntilClickable();
        waitABit(5000);
        approveEmployeeJob.click();

    }

    public void clickApproveJobConfirmation(){
        //waitUntilLoaded(approveJobConfirmation);
        Logger.info("Waiting to Click on Approve job Confirmation");
        waitABit(9000);
        approveJobConfirmation.waitUntilClickable();
        approveJobConfirmation.click();
        waitABit(9000);
    }

    public void clickOnSaveButton(){
        Logger.info("Waiting to click on Save button");
        employeeJobSaveButton.waitUntilClickable();
        employeeJobSaveButton.click();
        waitABit(9000);

    }

    public void openContributionType(){
        waitUntilLoaded(beforeContributionDD);
        beforeContributionDD.click();
        Logger.info("Waiting to click on Contribution Type DD");
        waitUntilLoaded(contributionTypeDD);
        contributionTypeDD.waitUntilClickable();
        contributionTypeDD.click();
        waitABit(5000);
        Logger.info("Clicked on Contribution Type DD");
    }

    public void selectContributionType(){
        Logger.info("Waiting to select Contribution Type Value");
        waitABit(8000);
        selectContributionType.waitUntilClickable();
        selectContributionType.click();
        Logger.info("Contribution Type Value has been selected");
        waitABit(5000);
    }


    public void openAccountCodeDD(){
        accountCode.waitUntilClickable();
        accountCode.click();
        waitABit(5000);
    }

    public void selectAccountCode(){
        accountCodeSelection.waitUntilClickable();
        accountCodeSelection.click();
        waitABit(5000);
    }


    public void switchToEmployeeJobFrame(){
        waitUntilLoaded(employeeJobFrame);
        getDriver().switchTo().frame(employeeJobFrame);
    }




    public void openEmployeeDD() {
        //waitABit(5000);
        Logger.info("About to click on Employee DD");
        employeeDD1.click();
        employeeDD1.sendKeys("1Brakus");
        waitABit(3000);
        Logger.info("Clicked on Employee DD");

    }


    public void selectEmployeeValue(){
        waitUntilLoaded(employeeSelection);
        Logger.info("Waiting to select Employee from open DD");
        //employeeDD1.sendKeys("1Hyatt");
        employeeSelection.click();
        waitABit(3000);
    }

    public void selectEditEmployeeValue(){

        waitUntilLoaded(employeeSelection);

        Logger.info("Waiting to select Employee from open DD");
        editEmployeeSelection.click();
        waitABit(3000);
    }


    public void openJobNameDD(){
        //evaluateJavascript("$('.k-input.ElementControlComboBox.EmployeeJobNameComboBoxDataSource').click()");
        waitUntilLoaded(jobNameDDSelect);
        jobNameDDSelect.click();
        jobNameDDSelect.sendKeys("Activities CE");
        waitABit(3000);

    }

    public void openJobNameDDForHourly(){
        //evaluateJavascript("$('.k-input.ElementControlComboBox.EmployeeJobNameComboBoxDataSource').click()");
        waitUntilLoaded(jobNameDDSelectHourly);
        jobNameDDSelectHourly.click();
        jobNameDDSelectHourly.sendKeys("Bilingual TA");
        waitABit(3000);

    }


    public void setJobNameDDSelect(){
        waitUntilLoaded(jobNameSelection);
        jobNameSelection.click();
        waitABit(5000);

    }

    public void setHourlyJobNameDDSelect(){
        waitUntilLoaded(hourlyJobNameSelection);
        hourlyJobNameSelection.click();
        waitABit(5000);

    }

    public void clickOnEmployeeJobs(){
        Logger.info("Waiting for Employee Jobs link to be clickable");
        waitUntilLoaded(essBox);
        waitUntilLoaded(employeeJobsTitle);
        employeeJobsTitle.sendKeys("");
        employeeJobsTitle.click();
        waitABit(3000);
    }


    public void clickAddNewEmployeeJobButton() {
        waitABit(3000);
        waitUntilLoaded(addNewEmployeeJobButton);
        addNewEmployeeJobButton.click();
        waitABit(5000);

    }

    public void clickOkForSubmitConfirmation(){
        waitABit(9000);
        //submitJobConfirmation.waitUntilVisible();
        evaluateJavascript("$('#dialog-cancel').focus().click()");
        evaluateJavascript("$('#dialog-confirm').focus().click()");
        waitABit(9000);

    }

    public void clickSubmitJobToPayroll(){
        //getDriver().navigate().refresh();
        waitABit(12000);
        submitJobToPayroll.waitUntilEnabled();
        submitJobToPayroll.waitUntilVisible();
        //waitUntilLoaded(submitJobToPayroll);
        submitJobToPayroll.waitUntilClickable();
        submitJobToPayroll.click();

    }

    public void updateComments() {
        addEmpJobComments.waitUntilEnabled();
        addEmpJobComments.waitUntilClickable();
        waitABit(5000);
        addEmpJobComments.click();
        addEmpJobComments.clear();
        addEmpJobComments.sendKeys("Employee Job Comments update to Edit job");
    }

    public void clickCancelButton() {
        cancelButton.waitUntilVisible();
        cancelButton.waitUntilClickable();
        cancelButton.click();

    }

    public void clickToSortJob() {
        waitUntilLoaded(sortJobStatus);
        sortJobStatus.waitUntilClickable();
        waitABit(5000);
        sortJobStatus.click();
        waitABit(9000);
        sortJobStatus.waitUntilClickable();
        sortJobStatus.click();
    }

    public void applyCheckToSelect(){
        applyCheck.waitUntilEnabled();
        applyCheck.waitUntilClickable();
        waitABit(5000);
        applyCheck.click();

    }

    public void clickDelete() {
    deleteButton.waitUntilVisible();
    deleteButton.waitUntilClickable();
    deleteButton.click();
    }

    public void clickConfirmationMsg() {
        waitABit(5000);
        confirmMsg.waitUntilClickable();
        confirmMsg.click();
        waitABit(5000);

    }

    public void clickRemoveSubmitButton() {
        waitABit(5000);
        removeJobButton.waitUntilVisible();
        removeJobButton.waitUntilPresent();

    }

    public void clickOkForSubmitConfirmationYes() {
        waitABit(9000);
        //submitJobConfirmation.waitUntilVisible();
        evaluateJavascript("$('#dialog-confirm').focus().click()");
        waitABit(9000);
    }
}
