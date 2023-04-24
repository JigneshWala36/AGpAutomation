package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.listReport.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardListReport extends TestBase {

    public DashboardListReport() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Consumer Registration Report']")
    public static WebElement listReportConsumerRegistrationReport;

    @FindBy(xpath = "//a[normalize-space()='Uploaded Registration Form & Document Report']")
    public static WebElement listReportUploadedRegistrationFormAndDocumentReport;

    @FindBy(xpath = "//a[normalize-space()='Payment Outstanding List']")
    public static WebElement listReportPaymentOutstandingList;

    @FindBy(xpath = "//a[normalize-space()='Connection Pending Report']")
    public static WebElement listReportConnectionPendingReport;

    @FindBy(xpath = "//a[normalize-space()='Meter Reading List']")
    public static WebElement listReportMeterReadingList;

    @FindBy(xpath = "//a[normalize-space()='Bill Rate Master List']")
    public static WebElement listReportBillRateMasterList;

    @FindBy(xpath = "//a[normalize-space()='Reg. & Misc. Payment Receipt List']")
    public static WebElement listReportRegAndMiscPaymentReceiptList;

    @FindBy(xpath = "//a[normalize-space()='Bill Payment Receipt List']")
    public static WebElement listReportBillPaymentReceiptList;

    @FindBy(xpath = "//a[normalize-space()='Approved Meter & Route Assignment List']")
    public static WebElement listReportApprovedMeterAndRouteAssignmentList;

    @FindBy(xpath = "//a[normalize-space()='Approved Account Transfer List']")
    public static WebElement listReportApprovedAccountTransferList;

    @FindBy(xpath = "//a[normalize-space()='Approved Connection Status Change List']")
    public static WebElement listReportApprovedConnectionStatusChangeList;

    @FindBy(xpath = "//a[normalize-space()='Approved Meter Exchange List']")
    public static WebElement listReportApprovedMeterExchangeList;

    @FindBy(xpath = "//a[normalize-space()='Approved Modify Bill List']")
    public static WebElement listReportApprovedModifyBillList;

    @FindBy(xpath = "//a[normalize-space()='Route - Serial Report']")
    public static WebElement listReportRouteSerialReport;

    public void listReportConsumerRegistrationReportClick() {
        try {
            TestUtil.highlightElement(listReportConsumerRegistrationReport);
            Thread.sleep(1000);
            listReportConsumerRegistrationReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportConsumerRegistrationReport();
    }

    public void listReportUploadedRegistrationFormAndDocumentReportClick() {
        try {
            TestUtil.highlightElement(listReportUploadedRegistrationFormAndDocumentReport);
            Thread.sleep(1000);
            listReportUploadedRegistrationFormAndDocumentReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportUploadRegistrationFormAndDocumentsReport();
    }

    public void listReportPaymentOutstandingListClick() {
        try {
            TestUtil.highlightElement(listReportPaymentOutstandingList);
            Thread.sleep(1000);
            listReportPaymentOutstandingList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportPaymentOutstandingList();
    }

    public void listReportConnectionPendingReportClick() {
        try {
            TestUtil.highlightElement(listReportConnectionPendingReport);
            Thread.sleep(1000);
            listReportConnectionPendingReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportConnectionPendingReport();
    }

    public void listReportMeterReadingListClick() {
        try {
            TestUtil.highlightElement(listReportMeterReadingList);
            Thread.sleep(1000);
            listReportMeterReadingList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportMeterReadingList();
    }

    public void listReportBillRateMasterListClick() {
        try {
            TestUtil.highlightElement(listReportBillRateMasterList);
            Thread.sleep(1000);
            listReportBillRateMasterList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportBillRateMasterList();
    }

    public void listReportRegAndMiscPaymentReceiptListClick() {
        try {
            TestUtil.highlightElement(listReportRegAndMiscPaymentReceiptList);
            Thread.sleep(1000);
            listReportRegAndMiscPaymentReceiptList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportRegAndMiscPaymentReceiptList();
    }

    public void listReportBillPaymentReceiptListClick() {
        try {
            TestUtil.highlightElement(listReportBillPaymentReceiptList);
            Thread.sleep(1000);
            listReportBillPaymentReceiptList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportBillPaymentReceiptList();
    }

    public void listReportApprovedMeterAndRouteAssignmentListClick() {
        try {
            TestUtil.highlightElement(listReportApprovedMeterAndRouteAssignmentList);
            Thread.sleep(1000);
            listReportApprovedMeterAndRouteAssignmentList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportApprovedMeterAndRouteAssignmentList();
    }

    public void listReportApprovedAccountTransferListClick() {
        try {
            TestUtil.highlightElement(listReportApprovedAccountTransferList);
            Thread.sleep(1000);
            listReportApprovedAccountTransferList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportApprovedAccountTransferList();
    }

    public void listReportApprovedConnectionStatusChangeListClick() {
        try {
            TestUtil.highlightElement(listReportApprovedConnectionStatusChangeList);
            Thread.sleep(1000);
            listReportApprovedConnectionStatusChangeList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportApprovedConnectionStatusChangeList();
    }

    public void listReportApprovedMeterExchangeListClick() {
        try {
            TestUtil.highlightElement(listReportApprovedMeterExchangeList);
            Thread.sleep(1000);
            listReportApprovedMeterExchangeList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportApprovedMeterExchangeList();
    }

    public void listReportApprovedModifyBillListClick() {
        try {
            TestUtil.highlightElement(listReportApprovedModifyBillList);
            Thread.sleep(1000);
            listReportApprovedModifyBillList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportApprovedModifyBillList();
    }

    public void listReportRouteSerialReportClick() {
        try {
            TestUtil.highlightElement(listReportRouteSerialReport);
            Thread.sleep(1000);
            listReportRouteSerialReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ListReportRouteSerialReport();
    }




}
