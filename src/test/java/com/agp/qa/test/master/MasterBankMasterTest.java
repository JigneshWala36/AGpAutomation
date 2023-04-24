package com.agp.qa.test.master;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardMaster;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.pages.login.LoginPage;
import com.agp.qa.pages.master.MasterBankMaster;
import com.agp.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MasterBankMasterTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    DashboardMaster dashboardMaster;

    MasterBankMaster masterBankMaster;



    public MasterBankMasterTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        dashboardPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        dashboardPage.dashboardVerify();
        dashboardPage.masterClick();
        dashboardMaster = new DashboardMaster();
        dashboardMaster.masterBankMasterClick();

    }


    @Test
    public void verifyEditBankMaster () {

        masterBankMaster = new MasterBankMaster();
        TestUtil.waiting(500);
        masterBankMaster.verifyBankMasterPageOpenCloseOfAddBankPopUp();
        TestUtil.waiting(500);
        masterBankMaster.verifyAddBankDetails();
        TestUtil.waiting(500);
        masterBankMaster.verifyBankNameForEdit();
        TestUtil.waiting(500);
        masterBankMaster.verifyEditDataAndEditBankData();

    }

    @AfterMethod
    public void tearDown(){
        TestUtil.waiting(3000);
//        driver.quit();
    }

}
