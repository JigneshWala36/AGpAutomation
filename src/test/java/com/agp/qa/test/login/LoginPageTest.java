package com.agp.qa.test.login;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.login.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }

//    @Test(priority = 1)
//    public void loginTest() {
//        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//    }

    @Test
    public void count() throws InterruptedException {
        loginPage.countTest();
    }

//    @Test(priority = 2)
//    public void loginTest1() throws InterruptedException {
//        dashboardPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
//    }
//
//    @Test(priority = 3)
//    public void loginTest2() throws InterruptedException {
//
//
//        dashboardPage = loginPage.login1(prop.getProperty("username"), prop.getProperty("password"));
//    }

    @AfterMethod

    public void tearDown() {
//        dashboardPage.dashboardVerify();
//        driver.quit();

    }


}
