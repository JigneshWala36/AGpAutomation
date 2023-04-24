package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.readerManagement.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardReaderManagement extends TestBase {

    public DashboardReaderManagement() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement readerManagementDeviceManagement;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement readerManagementDeviceUserMapping;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement readerManagementAssignBills;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement readerManagementCurrentBills;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement readerManagementAssignedBillsHistory;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement readerManagementRemarksReport;

    public void readerManagementDeviceManagementClick() {
        try {
            TestUtil.highlightElement(readerManagementDeviceManagement);
            Thread.sleep(1000);
            readerManagementDeviceManagement.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReaderManagementDeviceManagement();
    }

    public void readerManagementDeviceUserMappingClick() {
        try {
            TestUtil.highlightElement(readerManagementDeviceUserMapping);
            Thread.sleep(1000);
            readerManagementDeviceUserMapping.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReaderManagementDeviceUserMapping();
    }

    public void readerManagementAssignBillsClick() {
        try {
            TestUtil.highlightElement(readerManagementAssignBills);
            Thread.sleep(1000);
            readerManagementAssignBills.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReaderManagementAssignBills();
    }

    public void readerManagementCurrentBillsClick() {
        try {
            TestUtil.highlightElement(readerManagementCurrentBills);
            Thread.sleep(1000);
            readerManagementCurrentBills.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReaderManagementCurrentBills();
    }

    public void readerManagementAssignedBillsHistoryClick() {
        try {
            TestUtil.highlightElement(readerManagementAssignedBillsHistory);
            Thread.sleep(1000);
            readerManagementAssignedBillsHistory.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReaderManagementAssignedBillsHistory();
    }

    public void readerManagementRemarksReportClick() {
        try {
            TestUtil.highlightElement(readerManagementRemarksReport);
            Thread.sleep(1000);
            readerManagementRemarksReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReaderManagementRemarksReport();
    }




}
