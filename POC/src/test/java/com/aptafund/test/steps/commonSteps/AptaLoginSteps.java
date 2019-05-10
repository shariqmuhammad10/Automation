package com.aptafund.test.steps.commonSteps;

import com.aptafund.test.pages.commonPages.AptaHomePage;
import com.aptafund.test.pages.commonPages.AptaLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by omii on 8/17/2016.
 */
public class AptaLoginSteps extends ScenarioSteps {
    private static final Logger logger = LoggerFactory.getLogger(AptaLoginSteps.class);


    AptaLoginPage aptaLoginPage;
    AptaHomePage aptaHomePage;

    @Step
    public void navigateToLoginPage(){

        String  userNameid = "";
        String password = "";
        aptaLoginPage.open();
        assertTrue (aptaLoginPage.verifyPageIsOpen());
        aptaLoginPage.loginIntoApta(userNameid,password);
    }

    @Step
    public void loginIntoApta() {

         String  userNameid = "smuhammad@harriscomputer.com";
         String password = "Harmony123";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }


    @Step
    public void loginForReportsTest() {

        String  userNameid = "autoreq@apta.com";
        //String  userNameid = "req@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }

    @Step
    public void loginIntoAptaAsRequisitionor() {

        String  userNameid = "autoreq2@apta.com";
        //String  userNameid = "req@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }

    @Step
    public void loginIntoAptaAsMyAdminReq() {

        String  userNameid = "autoreq1@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }



    @Step
    public void loginIntoAptaAsMyAdminReq1() {

        String  userNameid = "admin@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }


    @Step
    public void loginIntoAptaAsApprover1() {

        String  userNameid = "autoapp1@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }

    @Step
    public void loginIntoAptaAsApprover2() {

        String  userNameid = "autoapp2@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }

    @Step
    public void loginIntoAptaAsFundAdmin() {

        String  userNameid = "fundadmin@apta.com";
        String password = "asdf<1234";
        aptaLoginPage.loginIntoApta(userNameid,password);
        assertTrue(aptaHomePage.homePageIsDisplayed());
    }



    @Step
    public void logoutApplication(){
        aptaLoginPage.logOut();
    }
}
