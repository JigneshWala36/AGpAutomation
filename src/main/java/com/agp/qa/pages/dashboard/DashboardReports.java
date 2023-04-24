package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.reports.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardReports extends TestBase {

    public DashboardReports() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Invoice Details']")
    public static WebElement reportsInvoiceDetails;

    @FindBy(xpath = "//a[normalize-space()='Bill Payment Receipt Cheque Bounce Report']")
    public static WebElement reportsBillPaymentReceiptChequeBounceReport;

    @FindBy(xpath = "//a[normalize-space()='Misc Receipt Approved Cheque Report']")
    public static WebElement reportsMiscReceiptApprovedChequeReport;

    @FindBy(xpath = "//a[normalize-space()='Registration Receipt Approved Cheque Report']")
    public static WebElement reportsRegistrationReceiptApprovedChequeReport;

    @FindBy(xpath = "//a[normalize-space()='Bill Receipt Approved Cheque Report']")
    public static WebElement reportsBillReceiptApprovedChequeReport;

    @FindBy(xpath = "//a[normalize-space()='New Connection Application Approval Pending Report']")
    public static WebElement reportsNewConnectionApplicationApprovalPendingReport;

    @FindBy(xpath = "//a[normalize-space()='Bill Receipt Deleted List']")
    public static WebElement reportsBillReceiptDeletedList;

    @FindBy(xpath = "//a[normalize-space()='Verify Unit Used Report']")
    public static WebElement reportsVerifyUnitUsedReport;

    @FindBy(xpath = "//a[normalize-space()='New Connection Summary Report']")
    public static WebElement reportsNewConnectionSummaryReport;

    @FindBy(xpath = "//a[normalize-space()='Switch On List']")
    public static WebElement reportsSwitchOnList;

    @FindBy(xpath = "//a[normalize-space()='Registration Cheque Bounce Report']")
    public static WebElement reportsRegistrationChequeBounceReport;

    @FindBy(xpath = "//a[normalize-space()='Misc Cheque Bounce Report']")
    public static WebElement reportsMiscChequeBounceReport;

    @FindBy(xpath = "//a[normalize-space()='Consumer Connection Status List']")
    public static WebElement reportsConsumerConnectionStatusList;

    @FindBy(xpath = "//a[normalize-space()='Misc/Reg Receipt Pending Cheque']")
    public static WebElement reportsMiscAndRegReceiptPendingCheque;

    @FindBy(xpath = "//a[normalize-space()='Demand Master List']")
    public static WebElement reportsDemandMasterList;

    @FindBy(xpath = "//a[normalize-space()='Demand Master Accumulate List']")
    public static WebElement reportsDemandMasterAccumulateList;

    @FindBy(xpath = "//a[normalize-space()='Monthly Unit Sales']")
    public static WebElement reportsMonthlyUnitSales;

    @FindBy(xpath = "//a[normalize-space()='Ledger Report']")
    public static WebElement reportsLedgerReport;

    @FindBy(xpath = "//a[normalize-space()='Bill-Receipt Rojmel Report']")
    public static WebElement reportsBillReceiptRojmelReport;

    @FindBy(xpath = "//a[normalize-space()='Connection Status Details']")
    public static WebElement reportsConnectionStatusDetails;

    //    @FindBy(xpath = "//a[normalize-space()='Demand Raised For Meter Domestic Connection']")
    @FindBy(xpath = "//a[normalize-space()='Demand Raised For Meter Dommestic Connection']")
    public static WebElement reportsDemandRaisedForMeterDomesticConnection;

    @FindBy(xpath = "//a[@href='/By-Pass-or-Faulty-Meter-Dommestic']")
//    @FindBy(xpath = "//a[@href='/By-Pass-or-Faulty-Meter-Domestic']")
    public static WebElement reportsDemandRaisedForByPassOrFaultyMeterDomestic;

    @FindBy(xpath = "//a[normalize-space()='Demand Raised For Commercial Connection']")
    public static WebElement reportsDemandRaisedForCommercialConnection;

    @FindBy(xpath = "//a[normalize-space()='Demand Raised For Account Type Wise']")
    public static WebElement reportsDemandRaisedForAccountTypeWise;

    @FindBy(xpath = "//a[normalize-space()='Connection Status Report']")
    public static WebElement reportsConnectionStatusReport;

    @FindBy(xpath = "//a[normalize-space()='Misc. Rojmel Report']")
    public static WebElement reportsMiscRojmelReport;

    @FindBy(xpath = "//a[normalize-space()='Regi. Rojmel Report']")
    public static WebElement reportsRegiRojmelReport;

    @FindBy(xpath = "//a[normalize-space()='Consumer Agreement Approval Report']")
    public static WebElement reportsConsumerAgreementApprovalReport;

    @FindBy(xpath = "//a[normalize-space()='Promo Scheme Discount Report']")
    public static WebElement reportsPromoSchemeDiscountReport;

    @FindBy(xpath = "//a[normalize-space()='Change In Customer Status']")
    public static WebElement reportsChangeInCustomerStatus;

    @FindBy(xpath = "//a[normalize-space()='Demand Raised for AC Industrial']")
    public static WebElement reportsDemandRaisedForACIndustrial;

    @FindBy(xpath = "//a[normalize-space()='Misc Debit Raised Report']")
    public static WebElement reportsMiscDebitRaisedReport;

    @FindBy(xpath = "//a[normalize-space()='EMI Scheme Details Report']")
    public static WebElement reportsEMISchemeDetailsReport;

    @FindBy(xpath = "//a[normalize-space()='OutStanding Report']")
    public static WebElement reportsOutStandingReport;

    @FindBy(xpath = "//a[normalize-space()='Payment Gateway Status Report']")
    public static WebElement reportsPaymentGatewayStatusReport;


    public void reportsInvoiceDetailsClick() {
        try {
            TestUtil.highlightElement(reportsInvoiceDetails);
            Thread.sleep(1000);
            reportsInvoiceDetails.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsInvoiceDetails();
    }

    public void reportsBillPaymentReceiptChequeBounceReportClick() {
        try {
            TestUtil.highlightElement(reportsBillPaymentReceiptChequeBounceReport);
            Thread.sleep(1000);
            reportsBillPaymentReceiptChequeBounceReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsBillPaymentReceiptChequeBounceReport();
    }

    public void reportsMiscReceiptApprovedChequeReportClick() {
        try {
            TestUtil.highlightElement(reportsMiscReceiptApprovedChequeReport);
            Thread.sleep(1000);
            reportsMiscReceiptApprovedChequeReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsMiscReceiptApprovedChequeReport();
    }

    public void reportsRegistrationReceiptApprovedChequeReportClick() {
        try {
            TestUtil.highlightElement(reportsRegistrationReceiptApprovedChequeReport);
            Thread.sleep(1000);
            reportsRegistrationReceiptApprovedChequeReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsRegistrationReceiptApprovedChequeReport();
    }

    public void reportsBillReceiptApprovedChequeReportClick() {
        try {
            TestUtil.highlightElement(reportsBillReceiptApprovedChequeReport);
            Thread.sleep(1000);
            reportsBillReceiptApprovedChequeReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsBillReceiptApprovedChequeReport();
    }

    public void reportsNewConnectionApplicationApprovalPendingReportClick() {
        try {
            TestUtil.highlightElement(reportsNewConnectionApplicationApprovalPendingReport);
            Thread.sleep(1000);
            reportsNewConnectionApplicationApprovalPendingReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsNewConnectionApplicationApprovalPendingReport();
    }

    public void reportsBillReceiptDeletedListClick() {
        try {
            TestUtil.highlightElement(reportsBillReceiptDeletedList);
            Thread.sleep(1000);
            reportsBillReceiptDeletedList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsBillReceiptDeletedList();
    }

    public void reportsVerifyUnitUsedReportClick() {
        try {
            TestUtil.highlightElement(reportsVerifyUnitUsedReport);
            Thread.sleep(1000);
            reportsVerifyUnitUsedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsVerifyUnitUsedReport();
    }

    public void reportsNewConnectionSummaryReportClick() {
        try {
            TestUtil.highlightElement(reportsNewConnectionSummaryReport);
            Thread.sleep(1000);
            reportsNewConnectionSummaryReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsNewConnectionSummaryReport();
    }

    public void reportsSwitchOnListClick() {
        try {
            TestUtil.highlightElement(reportsSwitchOnList);
            Thread.sleep(1000);
            reportsSwitchOnList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsSwitchOnList();
    }

    public void reportsRegistrationChequeBounceReportClick() {
        try {
            TestUtil.highlightElement(reportsRegistrationChequeBounceReport);
            Thread.sleep(1000);
            reportsRegistrationChequeBounceReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsRegistrationChequeBounceReport();
    }

    public void reportsMiscChequeBounceReportClick() {
        try {
            TestUtil.highlightElement(reportsMiscChequeBounceReport);
            Thread.sleep(1000);
            reportsMiscChequeBounceReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsMiscChequeBounceReport();
    }

    public void reportsConsumerConnectionStatusListClick() {
        try {
            TestUtil.highlightElement(reportsConsumerConnectionStatusList);
            Thread.sleep(1000);
            reportsConsumerConnectionStatusList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsConsumerConnectionStatusList();
    }

    public void reportsMiscAndRegReceiptPendingChequeClick() {
        try {
            TestUtil.highlightElement(reportsMiscAndRegReceiptPendingCheque);
            Thread.sleep(1000);
            reportsMiscAndRegReceiptPendingCheque.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsMiscAndRegReceiptPendingCheque();
    }

    public void reportsDemandMasterListClick() {
        try {
            TestUtil.highlightElement(reportsDemandMasterList);
            Thread.sleep(1000);
            reportsDemandMasterList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandMasterList();
    }

    public void reportsDemandMasterAccumulateListClick() {
        try {
            TestUtil.highlightElement(reportsDemandMasterAccumulateList);
            Thread.sleep(1000);
            reportsDemandMasterAccumulateList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandMasterAccumulateList();
    }

    public void reportsMonthlyUnitSalesClick() {
        try {
            TestUtil.highlightElement(reportsMonthlyUnitSales);
            Thread.sleep(1000);
            reportsMonthlyUnitSales.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsMonthlyUnitSales();
    }

    public void reportsLedgerReportClick() {
        try {
            TestUtil.highlightElement(reportsLedgerReport);
            Thread.sleep(1000);
            reportsLedgerReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsLedgerReport();
    }

    public void reportsBillReceiptRojmelReportClick() {
        try {
            TestUtil.highlightElement(reportsBillReceiptRojmelReport);
            Thread.sleep(1000);
            reportsBillReceiptRojmelReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsBillReceiptRojmelReport();
    }

    public void reportsConnectionStatusDetailsClick() {
        try {
            TestUtil.highlightElement(reportsConnectionStatusDetails);
            Thread.sleep(1000);
            reportsConnectionStatusDetails.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsConnectionStatusDetails();
    }

    public void reportsDemandRaisedForMeterDomesticConnectionClick() {
        try {
            TestUtil.highlightElement(reportsDemandRaisedForMeterDomesticConnection);
            Thread.sleep(1000);
            reportsDemandRaisedForMeterDomesticConnection.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandRaisedForMeterDomesticConnection();
    }

    public void reportsDemandRaisedForByPassOrFaultyMeterDomesticClick() {
        try {
            TestUtil.highlightElement(reportsDemandRaisedForByPassOrFaultyMeterDomestic);
            Thread.sleep(1000);
            reportsDemandRaisedForByPassOrFaultyMeterDomestic.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandRaisedForByPassOrFaultyMeterDomestic();
    }

    public void reportsDemandRaisedForCommercialConnectionClick() {
        try {
            TestUtil.highlightElement(reportsDemandRaisedForCommercialConnection);
            Thread.sleep(1000);
            reportsDemandRaisedForCommercialConnection.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandRaisedForCommercialConnection();
    }

    public void reportsDemandRaisedForAccountTypeWiseClick() {
        try {
            TestUtil.highlightElement(reportsDemandRaisedForAccountTypeWise);
            Thread.sleep(1000);
            reportsDemandRaisedForAccountTypeWise.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandRaisedForAccountTypeWise();
    }

    public void reportsConnectionStatusReportClick() {
        try {
            TestUtil.highlightElement(reportsConnectionStatusReport);
            Thread.sleep(1000);
            reportsConnectionStatusReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsConnectionStatusReport();
    }

    public void reportsMiscRojmelReportClick() {
        try {
            TestUtil.highlightElement(reportsMiscRojmelReport);
            Thread.sleep(1000);
            reportsMiscRojmelReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsMiscRojmelReport();
    }

    public void reportsRegiRojmelReportClick() {
        try {
            TestUtil.highlightElement(reportsRegiRojmelReport);
            Thread.sleep(1000);
            reportsRegiRojmelReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsRegiRojmelReport();
    }

    public void reportsConsumerAgreementApprovalReportClick() {
        try {
            TestUtil.highlightElement(reportsConsumerAgreementApprovalReport);
            Thread.sleep(1000);
            reportsConsumerAgreementApprovalReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsConsumerAgreementApprovalReport();
    }

    public void reportsPromoSchemeDiscountReportClick() {
        try {
            TestUtil.highlightElement(reportsPromoSchemeDiscountReport);
            Thread.sleep(1000);
            reportsPromoSchemeDiscountReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsPromoSchemeDiscountReport();
    }

    public void reportsChangeInCustomerStatusClick() {
        try {
            TestUtil.highlightElement(reportsChangeInCustomerStatus);
            Thread.sleep(1000);
            reportsChangeInCustomerStatus.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsChangeInCustomerStatus();
    }

    public void reportsDemandRaisedForACIndustrialClick() {
        try {
            TestUtil.highlightElement(reportsDemandRaisedForACIndustrial);
            Thread.sleep(1000);
            reportsDemandRaisedForACIndustrial.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsDemandRaisedForACIndustrial();
    }

    public void reportsMiscDebitRaisedReportClick() {
        try {
            TestUtil.highlightElement(reportsMiscDebitRaisedReport);
            Thread.sleep(1000);
            reportsMiscDebitRaisedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsMiscDebitRaisedReport();
    }

    public void reportsEMISchemeDetailsReportClick() {
        try {
            TestUtil.highlightElement(reportsEMISchemeDetailsReport);
            Thread.sleep(1000);
            reportsEMISchemeDetailsReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsEMISchemeDetailsReport();
    }

    public void reportsOutStandingReportClick() {
        try {
            TestUtil.highlightElement(reportsOutStandingReport);
            Thread.sleep(1000);
            reportsOutStandingReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsOutStandingReport();
    }

    public void reportsPaymentGatewayStatusReportClick() {
        try {
            TestUtil.highlightElement(reportsPaymentGatewayStatusReport);
            Thread.sleep(1000);
            reportsPaymentGatewayStatusReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new ReportsPaymentGatewayStatusReport();
    }


}
