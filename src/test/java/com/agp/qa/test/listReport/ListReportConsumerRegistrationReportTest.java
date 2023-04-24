package com.agp.qa.test.listReport;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardListReport;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.listReport.ListReportConsumerRegistrationReport;
import com.agp.qa.pages.login.LoginPage;
import com.agp.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListReportConsumerRegistrationReportTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardListReport dashboardListReport;

    ListReportConsumerRegistrationReport listReportConsumerRegistrationReport;

    public ListReportConsumerRegistrationReportTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
//        initialization();
//        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
//        dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
//        dashboardPage.dashboardVerify();
        dashboardPage.listReportClick();
        dashboardListReport = new DashboardListReport();
        dashboardListReport.listReportConsumerRegistrationReportClick();

    }


    @Test
    public void fetchingConsumerNumberData() throws InterruptedException {
        listReportConsumerRegistrationReport = new ListReportConsumerRegistrationReport();
        listReportConsumerRegistrationReport.captureConsumerNumberFromConsumerRegistrationReport();


    }

    @AfterMethod
    public void tearDown() {
        TestUtil.waiting(3000);
//        driver.quit();
    }

}
