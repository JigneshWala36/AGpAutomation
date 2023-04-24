package com.agp.qa.test.commercial;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.commercial.CommercialConsumerApplicationApproval;
import com.agp.qa.pages.commercial.CommercialConsumerRegistration1;
import com.agp.qa.pages.commercial.CommercialConsumerRegistrationReceipt;
import com.agp.qa.pages.commercial.CommercialUploadRegistrationFormDocument;
import com.agp.qa.pages.dashboard.DashboardCommercialNewConnection;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.login.LoginPage;
import com.agp.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommercialConsumerApplicationApprovalTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardCommercialNewConnection dashboardCommercialNewConnection;

    CommercialConsumerRegistration1 commercialConsumerRegistration1;

    CommercialUploadRegistrationFormDocument commercialUploadRegistrationFormDocument;

    CommercialConsumerRegistrationReceipt commercialConsumerRegistrationReceipt;

    CommercialConsumerApplicationApproval commercialConsumerApplicationApproval;


    public CommercialConsumerApplicationApprovalTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
//        initialization();
//        loginPage = new LoginPage();
//        dashboardPage = new DashboardPage();
//        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        dashboardPage.dashboardVerify();
//        dashboardPage.commercialNewConnectionClick();
        dashboardCommercialNewConnection = new DashboardCommercialNewConnection();
        dashboardCommercialNewConnection.commercialCustomerApplicationApprovalCommercialClick();
//        dashboardCommercialNewConnection.commercialConsumerRegistrationClick();
    }

    @Test(priority = 1)
    public void approvalOfNewCommercialCustomerForGasIn() throws InterruptedException {
//        commercialConsumerRegistration1 = new CommercialConsumerRegistration1();
//        commercialConsumerRegistration1.fetchDataFromExcelForNewCommercialRegistration1();
//
//        Thread.sleep(3000);
//        dashboardCommercialNewConnection.commercialUploadRegistrationFormDocument();
//
//        Thread.sleep(3000);
//        commercialUploadRegistrationFormDocument = new CommercialUploadRegistrationFormDocument();
//        commercialUploadRegistrationFormDocument.uploadRegistrationFormDocumentAddAndVerifyData();
//
//        Thread.sleep(3000);
//        dashboardCommercialNewConnection.commercialCustomerApplicationApprovalCommercialClick();

        TestUtil.waiting(3000);
        commercialConsumerApplicationApproval = new CommercialConsumerApplicationApproval();
        commercialConsumerApplicationApproval.approveCustomerForTheGasInProcess();

    }

    @AfterMethod
    public void tearDown() {
        TestUtil.waiting(3000);
//        driver.quit();
    }
}
