package com.agp.qa.test.listReport;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListReportConsumerRegistrationReportTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    public ListReportConsumerRegistrationReportTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }


    @Test
    public void loginTest2() throws InterruptedException {
        dashboardPage = loginPage.login1(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
