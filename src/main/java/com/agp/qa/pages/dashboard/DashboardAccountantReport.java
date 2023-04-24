package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.accountantReport.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardAccountantReport extends TestBase {

    public DashboardAccountantReport() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Switch-on-Report']")
    public static WebElement accountantReportSwitchOnReport;

    @FindBy(xpath = "//a[normalize-space()='Change Status Report']")
    public static WebElement accountantReportChangeStatusReport;

    @FindBy(xpath = "//a[normalize-space()='Form A Daily Collection']")
    public static WebElement accountantReportFormADailyCollection;

    @FindBy(xpath = "//a[normalize-space()='Bill Receipt Summary Report']")
    public static WebElement accountantReportBillReceiptSummaryReport;

    @FindBy(xpath = "//a[normalize-space()='Late Cheque Approve/Return']")
    public static WebElement accountantReportLateChequeApproveAndReturn;

    @FindBy(xpath = "//a[normalize-space()='GST Report']")
    public static WebElement accountantReportGSTReport;

    @FindBy(xpath = "//a[normalize-space()='VAT Report']")
    public static WebElement accountantReportVATReport;

    @FindBy(xpath = "//a[normalize-space()='Bill Receipt Rojmel Report']")
    public static WebElement accountantReportBillReceiptRojmelReport;

    @FindBy(xpath = "//a[normalize-space()='Bill-Receipt (Cheque) Return Report']")
    public static WebElement accountantReportBillReceiptChequeReturnReport;

    @FindBy(xpath = "//a[normalize-space()='Registration Cheque Return Report']")
    public static WebElement accountantReportRegistrationChequeReturnReport;

    @FindBy(xpath = "//a[normalize-space()='Consumer-Demand-Report']")
    public static WebElement accountantReportConsumerDemandReport;

    @FindBy(xpath = "//a[normalize-space()='Consumer Report']")
    public static WebElement accountantReportConsumerReport;

    @FindBy(xpath = "//a[normalize-space()='New Application For Connection']")
    public static WebElement accountantReportNewApplicationForConnection;

    @FindBy(xpath = "//a[normalize-space()='Bank Rojmel Report']")
    public static WebElement accountantReportBankRojmelReport;

    @FindBy(xpath = "//a[normalize-space()='Misc Receipt Report']")
    public static WebElement accountantReportMiscReceiptReport;

    @FindBy(xpath = "//a[normalize-space()='Collection Report']")
    public static WebElement accountantReportCollectionReport;

    @FindBy(xpath = "//a[normalize-space()='iSurePay Report']")
    public static WebElement accountantReportISurePayReport;

    public void accountantReportSwitchOnReportClick() {
        try {
            TestUtil.highlightElement(accountantReportSwitchOnReport);
            Thread.sleep(1000);
            accountantReportSwitchOnReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportSwitchOnReport();
    }

    public void accountantReportChangeStatusReportClick() {
        try {
            TestUtil.highlightElement(accountantReportChangeStatusReport);
            Thread.sleep(1000);
            accountantReportChangeStatusReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportChangeStatusReport();
    }

    public void accountantReportFormADailyCollectionClick() {
        try {
            TestUtil.highlightElement(accountantReportFormADailyCollection);
            Thread.sleep(1000);
            accountantReportFormADailyCollection.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportFormADailyCollection();
    }

    public void accountantReportBillReceiptSummaryReportClick() {
        try {
            TestUtil.highlightElement(accountantReportBillReceiptSummaryReport);
            Thread.sleep(1000);
            accountantReportBillReceiptSummaryReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportBillReceiptSummaryReport();
    }

    public void accountantReportLateChequeApproveAndReturnClick() {
        try {
            TestUtil.highlightElement(accountantReportLateChequeApproveAndReturn);
            Thread.sleep(1000);
            accountantReportLateChequeApproveAndReturn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportLateChequeApproveAndReturn();
    }

    public void accountantReportGSTReportClick() {
        try {
            TestUtil.highlightElement(accountantReportGSTReport);
            Thread.sleep(1000);
            accountantReportGSTReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportGSTReport();
    }

    public void accountantReportVATReportClick() {
        try {
            TestUtil.highlightElement(accountantReportVATReport);
            Thread.sleep(1000);
            accountantReportVATReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportVATReport();
    }

    public void accountantReportBillReceiptRojmelReportClick() {
        try {
            TestUtil.highlightElement(accountantReportBillReceiptRojmelReport);
            Thread.sleep(1000);
            accountantReportBillReceiptRojmelReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportBillReceiptRojmelReport();
    }

    public void accountantReportBillReceiptChequeReturnReportClick() {
        try {
            TestUtil.highlightElement(accountantReportBillReceiptChequeReturnReport);
            Thread.sleep(1000);
            accountantReportBillReceiptChequeReturnReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportBillReceiptChequeReturnReport();
    }

    public void accountantReportRegistrationChequeReturnReportClick() {
        try {
            TestUtil.highlightElement(accountantReportRegistrationChequeReturnReport);
            Thread.sleep(1000);
            accountantReportRegistrationChequeReturnReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportRegistrationChequeReturnReport();
    }

    public void accountantReportConsumerDemandReportClick() {
        try {
            TestUtil.highlightElement(accountantReportConsumerDemandReport);
            Thread.sleep(1000);
            accountantReportConsumerDemandReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportConsumerDemandReport();
    }

    public void accountantReportConsumerReportClick() {
        try {
            TestUtil.highlightElement(accountantReportConsumerReport);
            Thread.sleep(1000);
            accountantReportConsumerReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportConsumerReport();
    }

    public void accountantReportNewApplicationForConnectionClick() {
        try {
            TestUtil.highlightElement(accountantReportNewApplicationForConnection);
            Thread.sleep(1000);
            accountantReportNewApplicationForConnection.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportNewApplicationForConnection();
    }

    public void accountantReportBankRojmelReportClick() {
        try {
            TestUtil.highlightElement(accountantReportBankRojmelReport);
            Thread.sleep(1000);
            accountantReportBankRojmelReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportBankRojmelReport();
    }

    public void accountantReportMiscReceiptReportClick() {
        try {
            TestUtil.highlightElement(accountantReportMiscReceiptReport);
            Thread.sleep(1000);
            accountantReportMiscReceiptReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportMiscReceiptReport();
    }

    public void accountantReportCollectionReportClick() {
        try {
            TestUtil.highlightElement(accountantReportCollectionReport);
            Thread.sleep(1000);
            accountantReportCollectionReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportCollectionReport();
    }

    public void accountantReportISurePayReportClick() {
        try {
            TestUtil.highlightElement(accountantReportISurePayReport);
            Thread.sleep(1000);
            accountantReportISurePayReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantReportISurePayReport();
    }




}
