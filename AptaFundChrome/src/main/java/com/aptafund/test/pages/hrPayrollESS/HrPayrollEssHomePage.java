package com.aptafund.test.pages.hrPayrollESS;

import com.aptafund.test.actions.WaitActions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;



/**
 * Created by smuhammad on 10/10/2016.
 */
public class HrPayrollEssHomePage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(HrPayrollEssHomePage.class);

    @FindBy(css = "div#menuheader5.menuheader")
    private WebElementFacade hrPayrollESSHeader;

    @FindBy(css = ".menulink[href=\"/QAAutom/Payroll/Payroll/Manage\"]")
    private WebElementFacade managePayrollTitle;

    @FindBy(css = ".menulink[href=\"/QAAutom/Payroll/PayrollDeduction/Manage\"]")
    private WebElementFacade manageDeductionsTitle;

    @FindBy(css = ".menulink[href=\"/QAAutom/Payroll/PayrollEmployeeW2/Manage\"]")
    private WebElementFacade payrollEmployeeW2;

    @FindBy (id = "SearchText__EmployeePayrollDeductionAssignmentDataView")
    private WebElementFacade DedAssignmentSearch;


    @FindBy(css = ".menulink[href=\"/QAAutom/Payroll/PayrollEmployeeDeduction/Manage\"]")
    private WebElementFacade deductionAssignmentTitle;


    @FindBy (xpath = ".//*[@id='breadcrumb_actionbuttons']/table/tbody/tr/td[1]/div/div")
    private WebElementFacade waitBeforeClickToAddButton;

    @FindBy(id = "btnAdd__PayrollManagementDataView")
    private WebElementFacade managePayrollAddButton;

    @FindBy(id = "UnselectAll__PayrollManagementDataView")
    private WebElementFacade unselectAll;

    @FindBy (id = "btnConfigure__Index")
    private WebElementFacade configureButton;


    @FindBy (id = "footerwrapper")
    private WebElementFacade footer;

    @FindBy (id = "btnMoreButtons")
    private WebElementFacade moreActionButtons;

    @FindBy(css = "#panelbar-1 .k-input")
    private List<WebElementFacade> payCyclePanel;


    @FindBy(id = "menudropdown5")
    private WebElementFacade essBox;

    public void clickHrPayrollESSHeader() {

        logger.info("Waiting for HR, Payroll & ESS");
        waitUntilLoaded(hrPayrollESSHeader);
        hrPayrollESSHeader.sendKeys("");
        hrPayrollESSHeader.click();
        logger.info("Clicked on HR, Payroll & ESS");
        logger.info("HR, Payroll & ESS link has been clicked");
        waitABit(5000);

    }


    public void clickManagePayroll() {

        logger.info("Waiting for Manage Payroll to be clickable");
        //waitUntilLoaded(configureButton);
        essBox.waitUntilVisible();
        waitUntilLoaded(managePayrollTitle);
        managePayrollTitle.sendKeys("");
        logger.info("Clicking on Manage Payroll");
        managePayrollTitle.click();
        waitABit(5000);
        logger.info("Manage Payroll link has been clicked");
    }

    public void clickAddPayrollManagement() {
        logger.info("Waiting for Add button on Manage Payroll");
        waitUntilLoaded(footer);
        waitUntilLoaded(moreActionButtons);
        waitUntilLoaded(managePayrollAddButton);
        waitABit(5000);
        managePayrollAddButton.sendKeys("");
        logger.info("Clicking on Add button through Manage Payroll");
        managePayrollAddButton.click();
        logger.info("Add button through Manage Payroll has been clicked");

    }

    public void clickManageDeductions() {

        //waitUntilLoaded(managePayrollTitle);
        logger.info("Waiting for Manage Deductions Link to load");
        waitUntilLoaded(configureButton);
        waitUntilLoaded(manageDeductionsTitle);
        waitFor(manageDeductionsTitle).waitUntilClickable();
        manageDeductionsTitle.sendKeys("");
        logger.info("Clicking on Manage Deductions link");
        manageDeductionsTitle.click();
        logger.info("Manage Deductions link has been clicked");
    }


    public void clickDeductionAssignment() {

        logger.info("Waiting for Deduction Assignment Link to load");
        waitUntilLoaded(configureButton);
        waitUntilLoaded(deductionAssignmentTitle);
        waitFor(deductionAssignmentTitle).waitUntilClickable();
        deductionAssignmentTitle.sendKeys("");
        logger.info("Clicking on Deduction assignment link");
        deductionAssignmentTitle.click();
        logger.info("Deduction Assignment link has been clicked");

    }



}
