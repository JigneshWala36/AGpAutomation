package com.agp.qa.test.commercial;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.commercial.CommercialConsumerRegistration;
import com.agp.qa.pages.dashboard.DashboardCommercialNewConnection;
import com.agp.qa.pages.dashboard.DashboardDomesticNewConnection;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.domestic.DomesticConsumerAgreementPrintPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CommercialConsumerRegistrationTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardCommercialNewConnection dashboardCommercialNewConnection;

    CommercialConsumerRegistration commercialConsumerRegistration;

    public CommercialConsumerRegistrationTest(){
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
        commercialConsumerRegistration = new CommercialConsumerRegistration();
        commercialConsumerRegistration.fetchDataFromExcelForNewCommercialRegistration();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
