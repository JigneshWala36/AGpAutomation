package com.agp.qa.test.billing;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.billing.BillingGenerateBill;
import com.agp.qa.pages.dashboard.DashboardBilling;
import com.agp.qa.pages.dashboard.DashboardGasIn;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterApprovalForm;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterAssignmentForm;
import com.agp.qa.pages.login.LoginPage;
import com.agp.qa.util.TestUtil;
import com.mongodb.DB;
import org.openxml4j.document.wordprocessing.model.table.TableBorder;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BillingGenerateBillTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardGasIn dashboardGasIn;

    DashboardBilling dashboardBilling;

    GasInRouteAndMeterAssignmentForm gasInRouteAndMeterAssignmentForm;

    BillingGenerateBill billingGenerateBill;

    GasInRouteAndMeterApprovalForm gasInRouteAndMeterApprovalForm;


    public BillingGenerateBillTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        dashboardPage.dashboardVerify();
//        dashboardPage.gasInClick();
//        dashboardGasIn = new DashboardGasIn();
//        dashboardGasIn.gasInRouteAndMeterAssignmentFormClick();
//        gasInRouteAndMeterAssignmentForm = new GasInRouteAndMeterAssignmentForm();
//        gasInRouteAndMeterAssignmentForm.addingSwitchDataOfNewCustomerAdded();
//        TestUtil.waiting(5000);
//        dashboardGasIn.gasInRouteAndMeterApprovalFormClick();
        dashboardPage.billingClick();
        dashboardBilling = new DashboardBilling();
        dashboardBilling.billingGenerateBillClick();
        TestUtil.waiting(1000);


    }


    @Test
    public void fetchingConsumerNumberData() throws InterruptedException {
        billingGenerateBill = new BillingGenerateBill();
        billingGenerateBill.generateMROOfApprovedGasInCustomer();



    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

}

