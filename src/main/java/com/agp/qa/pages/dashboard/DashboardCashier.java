package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.cashier.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardCashier extends TestBase {

    public DashboardCashier() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Generate Misc. Bill']")
    public static WebElement cashierGenerateMiscBill;

    @FindBy(xpath = "//a[normalize-space()='Cash Paid Against Misc/Reg Cheque Return']")
    public static WebElement cashierCashPaidAgainstMiscAndRegChequeReturn;

    @FindBy(xpath = "//a[normalize-space()='Regular Bill Payment Receipt']")
    public static WebElement cashierRegularBillPaymentReceipt;

    @FindBy(xpath = "//a[normalize-space()='Misc. Bill Payment receipt']")
    public static WebElement cashierMiscBillPaymentReceipt;

    @FindBy(xpath = "//a[normalize-space()='EMI ForeClosure']")
    public static WebElement cashierEMIForeClosure;


    public void cashierGenerateMiscBillClick() {
        try {
            TestUtil.highlightElement(cashierGenerateMiscBill);
            Thread.sleep(1000);
            cashierGenerateMiscBill.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CashierGenerateMiscBill();
    }

    public void cashierCashPaidAgainstMiscAndRegChequeReturnClick() {
        try {
            TestUtil.highlightElement(cashierCashPaidAgainstMiscAndRegChequeReturn);
            Thread.sleep(1000);
            cashierCashPaidAgainstMiscAndRegChequeReturn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CashierCashPaidAgainstMiscAndRegChequeReturn();
    }

    public void cashierRegularBillPaymentReceiptClick() {
        try {
            TestUtil.highlightElement(cashierRegularBillPaymentReceipt);
            Thread.sleep(1000);
            cashierRegularBillPaymentReceipt.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CashierRegularBillPaymentReceipt();
    }

    public void cashierMiscBillPaymentReceiptClick() {
        try {
            TestUtil.highlightElement(cashierMiscBillPaymentReceipt);
            Thread.sleep(1000);
            cashierMiscBillPaymentReceipt.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CashierMiscBillPaymentReceipt();
    }

    public void cashierEMIForeClosureClick() {
        try {
            TestUtil.highlightElement(cashierEMIForeClosure);
            Thread.sleep(1000);
            cashierEMIForeClosure.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CashierEMIForeClosure();
    }


}
