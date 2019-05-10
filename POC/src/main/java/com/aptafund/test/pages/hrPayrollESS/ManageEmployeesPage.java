package com.aptafund.test.pages.hrPayrollESS;

import com.aptafund.test.actions.WaitActions;
import com.github.javafaker.Faker;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by smuhammad on 11/22/2016.
 */
public class ManageEmployeesPage extends WaitActions {
    private static final Logger logger = LoggerFactory.getLogger(ManageEmployeesPage.class);



    Faker faker = new Faker();
    String employeeFirstName1;
    String employeeMiddleName1;
    String employeeLastName1;
    String lastname = faker.name().lastName();
    String firstname = faker.name().firstName();
    String prefix = faker.name().prefix();
    String middlename = faker.name().firstName();
    String fullName;
    String SSNvalue = faker.numerify("###-##-####");



    //String birthDate = faker.date().

    @FindBy (css = "[href=\"/QAAutom/HumanResources/Admin/Employee/Employee/Search\"]")
    private WebElementFacade manageEmployees;

    @FindBy(id = "menudropdown5")
    private WebElementFacade essBox;

    @FindBy (id = "FirstName")
    private WebElementFacade employeeFName;

    @FindBy (id = "MiddleName")
    private WebElementFacade employeeMName;

    @FindBy (id = "LastName")
    private WebElementFacade employeeLName;

    @FindBy(id = "DisplayName")
    private WebElementFacade displayName;

    @FindBy (id = "footerwrapper")
    private WebElementFacade footer;

    @FindBy (id = "btnMoreButtons")
    private WebElementFacade moreActionButtons;

    @FindBy(id = "btnAdd__EmployeesDataView")
    private WebElementFacade manageEmployeesAddButton;

    @FindBy (id = "txtValue_SSNTextboxDetail")
    private WebElementFacade SSNValue;

    @FindBy (id = "BirthDate")
        private WebElementFacade birthDateValue;

    @FindBy (css = ".k-input.ElementControlComboBox.None[name=Gender_input]")
    private WebElementFacade genderSelection;

    @FindBy (css = ".k-input.ElementControlComboBox.None[name=Ethnicity_input]")
    private WebElementFacade ethenticitySelection;

    @FindBy(css = ".k-multiselect-wrap.k-floatwrap")
    private WebElementFacade raceSelection;

    @FindBy (id = "60c8e503-0c8d-4c62-b36c-72db42c08239")
    private WebElementFacade maleValueSelection;

    @FindBy (id = "Race")
    private WebElementFacade raceDD;

    @FindBy (css = "option[value= \" Not Disclosed\"]")
    private WebElementFacade selectNotDisclosed;

    @FindBy(css = ".ElementControlMultiSelect")
    private WebElementFacade multiselectRace;

    @FindBy (id = "Comment")
    private WebElementFacade comment;

    @FindBy (css = "input[name= Classification_input]")
    private WebElementFacade classification;

    @FindBy (css = "input[name= Site_input]")
    private WebElementFacade site;

    @FindBy (css = "input[name= Department_input]")
    private WebElementFacade department;


    @FindBy (css = "input[name= EmployeeGroupId_input]")
    private WebElementFacade group;

    @FindBy (css = "input[name= TerminationReason_input]")
    private WebElementFacade terminationReason;


    @FindBy (id = "btnSave__Employee")
    WebElementFacade saveButton;

    @FindBy (id = "btnCancel__Employee")
    WebElementFacade cancelButton;


    @FindBy (id = "SearchText__EmployeesDataView")
    WebElementFacade searchNewEmployeeTB;

    @FindBy (xpath= "html/body/div[329]/div[1]/div/a/span")
    WebElementFacade closeAddNewEmployeeWindow;

    @FindBy (xpath = ".//*[@id='EmployeesDataView']/div[3]/div/table/thead/tr/th[3]/a")
    WebElementFacade sortEmployeeByNumber;

    @FindBy (css = ".check_row__EmployeesDataView")
    WebElementFacade applyCheck;

    @FindBy (id = "btnEnableEmployee__EmployeesDataView")
    WebElementFacade enableEmployeeButton;



    public void searchNewEmployee() {
        //getFullName();
        waitUntilLoaded(searchNewEmployeeTB);
        waitABit(5000);
        searchNewEmployeeTB.clear();
        searchNewEmployeeTB.typeAndEnter("1" + lastname);
        waitABit(4000);

    }


    public void setTerminationReason(){
        waitUntilLoaded(terminationReason);
        terminationReason.click();
        terminationReason.sendKeys("Death");
        waitABit(5000);
    }

    public void saveEmployee(){
        waitUntilLoaded(saveButton);
        saveButton.click();
        waitABit(4000);
    }

    public void setGroup(){
        waitUntilLoaded(group);
        group.click();
        group.sendKeys("12 MO 4 HR");
        waitABit(5000);
    }

    public void setDepartment(){
        waitUntilLoaded(department);
        department.click();
        department.sendKeys("Admin");
        waitABit(3000);
    }


    public void setSite(){
        waitUntilLoaded(site);
        site.click();
        site.sendKeys("BCCHS");
        waitABit(3000);
    }

    public void setClassification(){
        waitUntilLoaded(classification);
        classification.click();
        classification.sendKeys("Certificated");
        waitABit(3000);
    }


    public void setGender(){
        waitUntilLoaded(genderSelection);
        genderSelection.clear();
        genderSelection.click();
        waitABit(3000);
        genderSelection.sendKeys("Male");
        /*waitUntilLoaded(maleValueSelection);
        maleValueSelection.click();*/
        //waitABit(2000);

    }

    public void setComments(){
        waitUntilLoaded(comment);
        comment.click();
        comment.sendKeys("This is new automated Employee");
        //waitABit(9000);
    }


    public void setEthenticity (){
        waitUntilLoaded(ethenticitySelection);
        ethenticitySelection.click();

        //ethenticitySelection.clear();
        ethenticitySelection.sendKeys("Not Disclosed");
        //waitABit(6000);
    }

    @FindBy(css = "ul#Race li:nth-of-type(2)")
    private WebElementFacade AsianValue;

    public void setRaceSelection (){
       // waitUntilLoaded(raceSelection);
        //raceSelection.clear();
//        raceSelection.sendKeys("");
//        raceSelection.click();
//        waitABit(5000);
//        raceSelection.sendKeys(" Not Disclosed");
//        raceSelection.sendKeys(Keys.RETURN);
 //       AsianValue.waitUntilClickable();
     //   AsianValue.click();
        multiselectRace.click();
        waitABit(6000);
        AsianValue.waitUntilClickable();
        AsianValue.sendKeys("Asian");


    }

    public void setFullName(String displayName) {
        waitUntilLoaded(this.displayName);
        this.displayName.sendKeys(displayName);
        logger.info("Enter Full Name " + displayName);
    }

    public void setFullNameData() {
        logger.info("Adding Empolyee Details");
        setFullName(fullName);
        logger.info("Employee Full Name > " + fullName);
        //waitABit(5000);
    }

    public void getFullName(){
        logger.info("Get the Full Name");
        fullName = displayName.getText();
    }

    public void setLastName(String employeeLastName ) {
        waitUntilLoaded(this.employeeLName);
        this.employeeLName.clear();
        this.employeeLName.sendKeys("1");
        this.employeeLName.sendKeys(employeeLastName);
        logger.info("Enter Last Name " + employeeLastName);

    }

    public void setLastNameData() {
        logger.info("Adding Employee Last Name Details");
        //setLastName(lastname);

        employeeLastName1 = lastname;
        logger.info("Employee Last Name > " + lastname);
        employeeLName.sendKeys(employeeLastName1);
        //waitABit(5000);

    }

    public void setFirstName(String employeeFirstName ) {
        waitUntilLoaded(this.employeeFName);
        this.employeeFName.clear();
        this.employeeFName.sendKeys(employeeFirstName);
        logger.info("Enter First Name " + employeeFirstName);
    }

    public void setFirstNameData() {
        logger.info("Adding Empolyee First Name Details");
        waitUntilLoaded(employeeFName);
        employeeFName.sendKeys("Auto");
        employeeFirstName1 = "Auto";


    }

    public void setMiddleName(String employeeMiddleName ) {
        waitUntilLoaded(this.employeeMName);
        this.employeeMName.clear();
        this.employeeMName.sendKeys(employeeMiddleName);
        logger.info("Enter Middle Name " + this.employeeMName);
    }

    public void setMiddleNameData() {
        logger.info("Adding Empolyee Middle Name Details");
        //setMiddleName(middlename);
        employeeMiddleName1 = middlename;
        logger.info("Employee Middle Name > " + middlename);
        employeeMName.sendKeys(employeeMiddleName1);
        //waitABit(5000);
    }

   public void setSSNValueData() {
       logger.info("Adding SSN Value");
       setSSNValue(SSNvalue);
       logger.info("SSN Value > " + SSNvalue);
        //waitABit(5000);
    }

    private void setSSNValue(String SSNValue) {
        waitUntilLoaded(this.SSNValue);
        this.SSNValue.clear();
        this.SSNValue.sendKeys(SSNValue);
        logger.info("Enter SSN Value " + this.SSNValue);
        //waitABit(6000);
    }




  /*  public void setBirhtDateData() {
        logger.info("Adding SSN Value");

        logger.info("SSN Value > " + SSNvalue);
        waitABit(5000);
    }

    private void setBirthDate(String SSNValue) {
        waitUntilLoaded(this.SSNValue);
        this.SSNValue.clear();
        this.SSNValue.sendKeys(SSNValue);
        logger.info("Enter SSN Value " + this.SSNValue);
        waitABit(6000);
    }*/

    public void clickAddManageEmployees() {
        logger.info("Waiting for Add button on Manage Payroll");
        waitUntilLoaded(footer);
        waitUntilLoaded(moreActionButtons);
        waitUntilLoaded(manageEmployeesAddButton);
        manageEmployeesAddButton.sendKeys("");
        logger.info("Clicking on Add button through Manage Payroll");
        //waitForAnyRenderedElementOf().waitFor(managePayrollAddButton);
        manageEmployeesAddButton.click();
        logger.info("Add button through Manage Payroll has been clicked");
        //waitABit(5000);

    }

    public void clickManageEmployee() {

        logger.info("Waiting for Manage Employees to be clickable");
        essBox.waitUntilVisible();
        waitUntilLoaded(manageEmployees);
        manageEmployees.sendKeys("");
        logger.info("Clicking on Manage Employees");
        manageEmployees.click();
        waitABit(5000);
        logger.info("Manage Employees link has been clicked");
    }

    public void setSortEmployeeByNumber (){
        logger.info("Click on Employee number column to sort employee");
        waitUntilLoaded(sortEmployeeByNumber);
        sortEmployeeByNumber.waitUntilClickable();
        waitABit(8000);
        sortEmployeeByNumber.click();
        sortEmployeeByNumber.waitUntilClickable();
        waitABit(9000);
        sortEmployeeByNumber.click();
    }

    public void selectCheckBox(){
        waitUntilLoaded(applyCheck);
        applyCheck.waitUntilClickable();
        waitABit(5000);
        applyCheck.click();

    }

    public void clickOnEnableEmployee(){
        waitUntilLoaded(enableEmployeeButton);
        enableEmployeeButton.waitUntilClickable();
        enableEmployeeButton.click();

    }

    public void closeEmployee() {
        waitABit(5000);
        cancelButton.waitUntilEnabled();
        cancelButton.waitUntilClickable();
        cancelButton.click();
    }
}
