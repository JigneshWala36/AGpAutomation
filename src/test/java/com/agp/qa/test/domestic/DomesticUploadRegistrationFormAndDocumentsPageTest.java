package com.agp.qa.test.domestic;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardDomesticNewConnection;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.domestic.DomesticConsumerAgreementPrintPage;
import com.agp.qa.pages.domestic.DomesticUploadRegistrationFormAndDocumentsPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DomesticUploadRegistrationFormAndDocumentsPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    DashboardDomesticNewConnection dashboardDomesticNewConnection;

    DomesticConsumerAgreementPrintPage domesticConsumerAgreementPrintPage;

    DomesticUploadRegistrationFormAndDocumentsPage domesticUploadRegistrationFormAndDocumentsPage;

    String ApplicationNo;

    public DomesticUploadRegistrationFormAndDocumentsPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        dashboardPage.dashboardVerify();
        dashboardPage.domesticNewConnectionClick();
        dashboardDomesticNewConnection = new DashboardDomesticNewConnection();
        dashboardDomesticNewConnection.domesticConsumerAgreementPrintClick();
        domesticConsumerAgreementPrintPage = new DomesticConsumerAgreementPrintPage();
//        domesticConsumerAgreementPrintPage.getApplicationNoFromTheFirstRow();
//        ApplicationNo = domesticConsumerAgreementPrintPage.getApplicationNoFromTheFirstRow();
//        System.out.println(ApplicationNo);
//        dashboardDomesticNewConnection.domesticUploadRegistrationFormAndDocumentsClick();

    }

    @Test(priority = 1)
    public void domesticUploadRegistrationFormAndDocumentsPage() throws InterruptedException {
        domesticUploadRegistrationFormAndDocumentsPage = new DomesticUploadRegistrationFormAndDocumentsPage();
        domesticUploadRegistrationFormAndDocumentsPage.searchApplicationNo();
        domesticUploadRegistrationFormAndDocumentsPage.enterApplicationNoInTheUpload();


        Thread.sleep(2000);
//        domesticUploadRegistrationFormAndDocumentsPage = new DomesticUploadRegistrationFormAndDocumentsPage();
//        domesticConsumerAgreementPrintPage.searchDomesticConsumer();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }


}
