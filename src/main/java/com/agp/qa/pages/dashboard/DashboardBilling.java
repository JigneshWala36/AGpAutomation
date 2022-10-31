package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.billing.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardBilling extends TestBase {

    public DashboardBilling() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Approval of Bill Modification Form']")
    public static WebElement billingApprovalOfBillModificationForm;

    @FindBy(xpath = "//a[normalize-space()='Generate Bill']")
    public static WebElement billingGenerateBill;

    @FindBy(xpath = "//a[normalize-space()='Print Bill']")
    public static WebElement billingPrintBill;

    @FindBy(xpath = "//a[normalize-space()='Meter Reading']")
    public static WebElement billingMeterReading;

    @FindBy(xpath = "//a[normalize-space()='Print-Bill-History']")
    public static WebElement billingPrintBillHistory;

    @FindBy(xpath = "//a[normalize-space()='Bill Modification Form']")
    public static WebElement billingBillModificationForm;

    @FindBy(xpath = "//a[normalize-space()='Set Last Reading']")
    public static WebElement billingSetLastReading;

    @FindBy(xpath = "//a[normalize-space()='Set Current Reading']")
    public static WebElement billingSetCurrentReading;

    @FindBy(xpath = "//a[normalize-space()='SBI Double Verification Check']")
    public static WebElement billingSBIDoubleVerificationCheck;

    @FindBy(xpath = "//a[normalize-space()='RazorPay Double Verification Check']")
    public static WebElement billingRazorPayDoubleVerificationCheck;

    public void billingApprovalOfBillModificationFormClick() {
        try {
            TestUtil.highlightElement(billingApprovalOfBillModificationForm);
            Thread.sleep(1000);
            billingApprovalOfBillModificationForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingApprovalOfBillModificationForm();
    }

    public void billingGenerateBillClick() {
        try {
            TestUtil.highlightElement(billingGenerateBill);
            Thread.sleep(1000);
            billingGenerateBill.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingGenerateBill();
    }

    public void billingPrintBillClick() {
        try {
            TestUtil.highlightElement(billingPrintBill);
            Thread.sleep(1000);
            billingPrintBill.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingPrintBill();
    }

    public void billingMeterReadingClick() {
        try {
            TestUtil.highlightElement(billingMeterReading);
            Thread.sleep(1000);
            billingMeterReading.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingMeterReading();
    }

    public void billingPrintBillHistoryClick() {
        try {
            TestUtil.highlightElement(billingPrintBillHistory);
            Thread.sleep(1000);
            billingPrintBillHistory.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingPrintBillHistory();
    }

    public void billingBillModificationFormClick() {
        try {
            TestUtil.highlightElement(billingBillModificationForm);
            Thread.sleep(1000);
            billingBillModificationForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingBillModificationForm();
    }

    public void billingSetLastReadingClick() {
        try {
            TestUtil.highlightElement(billingSetLastReading);
            Thread.sleep(1000);
            billingSetLastReading.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingSetLastReading();
    }

    public void billingSetCurrentReadingClick() {
        try {
            TestUtil.highlightElement(billingSetCurrentReading);
            Thread.sleep(1000);
            billingSetCurrentReading.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingSetCurrentReading();
    }

    public void billingSBIDoubleVerificationCheckClick() {
        try {
            TestUtil.highlightElement(billingSBIDoubleVerificationCheck);
            Thread.sleep(1000);
            billingSBIDoubleVerificationCheck.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingSBIDoubleVerificationCheck();
    }

    public void billingRazorPayDoubleVerificationCheckClick() {
        try {
            TestUtil.highlightElement(billingRazorPayDoubleVerificationCheck);
            Thread.sleep(1000);
            billingRazorPayDoubleVerificationCheck.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new BillingRazorPayDoubleVerificationCheck();
    }







}
