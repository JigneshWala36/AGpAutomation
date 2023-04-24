package com.agp.qa.test.commercial;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.commercial.CommercialConsumerRegistration1;
import com.agp.qa.pages.dashboard.DashboardCommercialNewConnection;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommercialConsumerRegistrationTest1 extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardCommercialNewConnection dashboardCommercialNewConnection;

    CommercialConsumerRegistration1 commercialConsumerRegistration1;

    public CommercialConsumerRegistrationTest1(){
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
    public void consumerAgreementPrintTest() throws InterruptedException {
        commercialConsumerRegistration1 = new CommercialConsumerRegistration1();
        commercialConsumerRegistration1.fetchDataFromExcelForNewCommercialRegistration1();

    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }


}
