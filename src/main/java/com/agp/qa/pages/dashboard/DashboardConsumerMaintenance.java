package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.consumerMaintenance.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardConsumerMaintenance extends TestBase {

    public DashboardConsumerMaintenance() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Account Transfer Form']")
    public static WebElement consumerMaintenanceAccountTransferForm;

    @FindBy(xpath = "//a[normalize-space()='Approval of Account Transfer Form']")
    public static WebElement consumerMaintenanceApprovalOfAccountTransferForm;

    @FindBy(xpath = "//a[normalize-space()='Connection Status Change Form']")
    public static WebElement consumerMaintenanceConnectionStatusChangeForm;

    @FindBy(xpath = "//a[normalize-space()='Approval of Connection Status Change Form']")
    public static WebElement consumerMaintenanceApprovalOfConnectionStatusChangeForm;

    @FindBy(xpath = "//a[normalize-space()='Meter Exchange Form']")
    public static WebElement consumerMaintenanceMeterExchangeForm;

    @FindBy(xpath = "//a[normalize-space()='Approval of Meter Exchange Form']")
    public static WebElement consumerMaintenanceApprovalOfMeterExchangeForm;

    @FindBy(xpath = "//a[normalize-space()='Misc/Reg Deleted Challan List']")
    public static WebElement consumerMaintenanceMiscAndRegDeletedChallanList;

    @FindBy(xpath = "//a[normalize-space()='Bill Receipt Pending Cheque']")
    public static WebElement consumerMaintenanceBillReceiptPendingCheque;


    public void consumerMaintenanceAccountTransferFormClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceAccountTransferForm);
            Thread.sleep(1000);
            consumerMaintenanceAccountTransferForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceAccountTransferForm();
    }

    public void consumerMaintenanceApprovalOfAccountTransferFormClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceApprovalOfAccountTransferForm);
            Thread.sleep(1000);
            consumerMaintenanceApprovalOfAccountTransferForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceAccountTransferForm();
    }

    public void consumerMaintenanceConnectionStatusChangeFormClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceConnectionStatusChangeForm);
            Thread.sleep(1000);
            consumerMaintenanceConnectionStatusChangeForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceConnectionStatusChangeForm();
    }

    public void consumerMaintenanceApprovalOfConnectionStatusChangeFormClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceApprovalOfConnectionStatusChangeForm);
            Thread.sleep(1000);
            consumerMaintenanceApprovalOfConnectionStatusChangeForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceApprovalOfConnectionStatusChangeForm();
    }

    public void consumerMaintenanceMeterExchangeFormlick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceMeterExchangeForm);
            Thread.sleep(1000);
            consumerMaintenanceMeterExchangeForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceMeterExchangeForm();
    }

    public void consumerMaintenanceApprovalOfMeterExchangeFormClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceApprovalOfMeterExchangeForm);
            Thread.sleep(1000);
            consumerMaintenanceApprovalOfMeterExchangeForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceApprovalOfMeterExchangeForm();
    }

    public void consumerMaintenanceMiscAndRegDeletedChallanListClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceMiscAndRegDeletedChallanList);
            Thread.sleep(1000);
            consumerMaintenanceMiscAndRegDeletedChallanList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceMiscAndRegDeletedChallanList();
    }

    public void consumerMaintenanceBillReceiptPendingChequeClick() {
        try {
            TestUtil.highlightElement(consumerMaintenanceBillReceiptPendingCheque);
            Thread.sleep(1000);
            consumerMaintenanceBillReceiptPendingCheque.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ConsumerMaintenanceBillReceiptPendingCheque();
    }

}
