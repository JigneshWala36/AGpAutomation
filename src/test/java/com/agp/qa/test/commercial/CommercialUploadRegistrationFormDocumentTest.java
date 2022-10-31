package com.agp.qa.test.commercial;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.commercial.CommercialConsumerRegistration1;
import com.agp.qa.pages.commercial.CommercialUploadRegistrationFormDocument;
import com.agp.qa.pages.dashboard.DashboardCommercialNewConnection;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommercialUploadRegistrationFormDocumentTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardCommercialNewConnection dashboardCommercialNewConnection;

    CommercialConsumerRegistration1 commercialConsumerRegistration1;

    CommercialUploadRegistrationFormDocument commercialUploadRegistrationFormDocument;



    public CommercialUploadRegistrationFormDocumentTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        dashboardPage.dashboardVerify();
        dashboardPage.commercialNewConnectionClick();
        dashboardCommercialNewConnection = new DashboardCommercialNewConnection();
        dashboardCommercialNewConnection.commercialConsumerRegistrationClick();
    }

    @Test(priority = 1)
    public void uploadRegistrationFormDocument() throws InterruptedException {
        commercialConsumerRegistration1 = new CommercialConsumerRegistration1();
        commercialConsumerRegistration1.fetchDataFromExcelForNewCommercialRegistration1();

        Thread.sleep(3000);
        dashboardCommercialNewConnection.commercialUploadRegistrationFormDocument();

        Thread.sleep(3000);
        commercialUploadRegistrationFormDocument = new CommercialUploadRegistrationFormDocument();
        commercialUploadRegistrationFormDocument.uploadRegistrationFormDocumentAddAndVerifyData();



    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }


}
