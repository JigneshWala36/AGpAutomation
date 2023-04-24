package com.agp.qa.test.gasIn;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardGasIn;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterAssignmentForm;
import com.agp.qa.pages.login.LoginPage;
import com.agp.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GasInRouteAndMeterAssignmentFormTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardGasIn dashboardGasIn;

    GasInRouteAndMeterAssignmentForm gasInRouteAndMeterAssignmentForm;



    public GasInRouteAndMeterAssignmentFormTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
//        initialization();
//        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
//        dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
//        dashboardPage.dashboardVerify();
        dashboardPage.gasInClick();
        dashboardGasIn = new DashboardGasIn();
        dashboardGasIn.gasInRouteAndMeterAssignmentFormClick();

    }


    @Test
    public void assigningConsumerDataForGasIn () throws InterruptedException {
        gasInRouteAndMeterAssignmentForm = new GasInRouteAndMeterAssignmentForm();
        gasInRouteAndMeterAssignmentForm.addingSwitchDataOfNewCustomerAdded();





    }

    @AfterMethod
    public void tearDown(){
        TestUtil.waiting(3000);
//        driver.quit();
    }

}
