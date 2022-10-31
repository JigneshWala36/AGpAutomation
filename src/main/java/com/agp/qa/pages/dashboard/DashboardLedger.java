package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.HR_Software.HR_SoftwareSystemUserList;
import com.agp.qa.pages.ledger.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardLedger extends TestBase {

    public DashboardLedger() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Deposite Challan Receipt']")
    public static WebElement ledgerDepositChallanReceipt;

    @FindBy(xpath = "//a[normalize-space()='Deposite Challan Receipt Report']")
    public static WebElement ledgerDepositChallanReceiptReport;

    @FindBy(xpath = "//a[normalize-space()='Payable OS Mismatch Report']")
    public static WebElement ledgerPayableOSMismatchReport;

    @FindBy(xpath = "//a[normalize-space()='Advance Bill']")
    public static WebElement ledgerAdvanceBill;

    @FindBy(xpath = "//a[normalize-space()='Part Payment']")
    public static WebElement ledgerPartPayment;

    @FindBy(xpath = "//a[normalize-space()='Ledger Misc Challan List']")
    public static WebElement ledgerLedgerMiscChallanList;

    @FindBy(xpath = "//a[normalize-space()='User Activity Report']")
    public static WebElement ledgerUserActivityReport;

    @FindBy(xpath = "//a[normalize-space()='Consumer Registration Termination']")
    public static WebElement ledgerConsumerRegistrationTermination;

    @FindBy(xpath = "//a[normalize-space()='Consumer Registration Termination Report']")
    public static WebElement ledgerConsumerRegistrationTerminationReport;


    public void ledgerDepositChallanReceiptClick() {
        try {
            TestUtil.highlightElement(ledgerDepositChallanReceipt);
            Thread.sleep(1000);
            ledgerDepositChallanReceipt.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerDepositChallanReceipt();
    }

    public void ledgerDepositChallanReceiptReportClick() {
        try {
            TestUtil.highlightElement(ledgerDepositChallanReceiptReport);
            Thread.sleep(1000);
            ledgerDepositChallanReceiptReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerDepositChallanReceiptReport();
    }

    public void ledgerPayableOSMismatchReportClick() {
        try {
            TestUtil.highlightElement(ledgerPayableOSMismatchReport);
            Thread.sleep(1000);
            ledgerPayableOSMismatchReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerPayableOSMismatchReport();
    }

    public void ledgerAdvanceBillClick() {
        try {
            TestUtil.highlightElement(ledgerAdvanceBill);
            Thread.sleep(1000);
            ledgerAdvanceBill.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerAdvancedBill();
    }

    public void ledgerPartPaymentClick() {
        try {
            TestUtil.highlightElement(ledgerPartPayment);
            Thread.sleep(1000);
            ledgerPartPayment.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerPartPayment();
    }

    public void ledgerLedgerMiscChallanListClick() {
        try {
            TestUtil.highlightElement(ledgerLedgerMiscChallanList);
            Thread.sleep(1000);
            ledgerLedgerMiscChallanList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerLedgerMiscChallanList();
    }

    public void ledgerUserActivityReportClick() {
        try {
            TestUtil.highlightElement(ledgerUserActivityReport);
            Thread.sleep(1000);
            ledgerUserActivityReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerUserActivityReport();
    }

    public void ledgerConsumerRegistrationTerminationClick() {
        try {
            TestUtil.highlightElement(ledgerConsumerRegistrationTermination);
            Thread.sleep(1000);
            ledgerConsumerRegistrationTermination.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerConsumerRegistrationTermination();
    }

    public void ledgerConsumerRegistrationTerminationReportClick() {
        try {
            TestUtil.highlightElement(ledgerConsumerRegistrationTerminationReport);
            Thread.sleep(1000);
            ledgerConsumerRegistrationTerminationReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new LedgerConsumerRegistrationTerminationReport();
    }


}
