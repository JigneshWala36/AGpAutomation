package com.agp.qa.test.gasIn;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.dashboard.DashboardGasIn;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterApprovalForm;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterAssignmentForm;
import com.agp.qa.pages.login.LoginPage;
import com.agp.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GasInRouteAndMeterApprovalFormTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardGasIn dashboardGasIn;

    GasInRouteAndMeterAssignmentForm gasInRouteAndMeterAssignmentForm;

    GasInRouteAndMeterApprovalForm gasInRouteAndMeterApprovalForm;


    public GasInRouteAndMeterApprovalFormTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
//        initialization();
//        loginPage = new LoginPage();
//        dashboardPage = new DashboardPage();
//        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        dashboardPage.dashboardVerify();
//        dashboardPage.gasInClick();
        dashboardGasIn = new DashboardGasIn();
//        dashboardGasIn.gasInRouteAndMeterAssignmentFormClick();
//        gasInRouteAndMeterAssignmentForm = new GasInRouteAndMeterAssignmentForm();
//        gasInRouteAndMeterAssignmentForm.addingSwitchDataOfNewCustomerAdded();
        TestUtil.waiting(2000);
        dashboardGasIn.gasInRouteAndMeterApprovalFormClick();

    }


    @Test
    public void approveConsumerNumberDataAddedInGasIn() throws InterruptedException {
        gasInRouteAndMeterApprovalForm = new GasInRouteAndMeterApprovalForm();
        gasInRouteAndMeterApprovalForm.approvingNewAddedCustomerSwitchOnDate();


    }

    @AfterMethod
    public void tearDown(){
    TestUtil.waiting(3000);
//        driver.quit();
    }

}
