package com.agp.qa.test.domestic;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardDomesticNewConnection;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.domestic.DomesticConsumerAgreementPrintPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DomesticConsumerAgreementPrintPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    DashboardDomesticNewConnection dashboardDomesticNewConnection;
    DomesticConsumerAgreementPrintPage domesticConsumerAgreementPrintPage;

    public DomesticConsumerAgreementPrintPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        dashboardPage.dashboardVerify();
        dashboardPage.domesticNewConnectionClick();
        dashboardDomesticNewConnection = new DashboardDomesticNewConnection();
        dashboardDomesticNewConnection.domesticConsumerAgreementPrintClick();
    }

    @Test(priority = 1)
    public void consumerAgreementPrintTest(){
        domesticConsumerAgreementPrintPage = new DomesticConsumerAgreementPrintPage();
        domesticConsumerAgreementPrintPage.searchDomesticConsumer();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }






}
