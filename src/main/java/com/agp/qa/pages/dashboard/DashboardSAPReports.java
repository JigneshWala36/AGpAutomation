package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.sapReports.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardSAPReports extends TestBase {

    public DashboardSAPReports() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Registration Receipt Itemized Report']")
    public static WebElement sapReportsRegistrationReceiptItemizedReport;

    @FindBy(xpath = "//a[normalize-space()='Bill Receipt Itemized Report']")
    public static WebElement sapReportsBillReceiptItemizedReport;

    @FindBy(xpath = "//a[normalize-space()='Misc Receipt Itemized Report']")
    public static WebElement sapReportsMiscReceiptItemizedReport;

    @FindBy(xpath = "//a[contains(text(),'Realization Failure Registration Receipt Itemized ')]")
    public static WebElement sapReportsRealizationFailureRegistrationReceiptItemizedReport;

    @FindBy(xpath = "//a[normalize-space()='Realization Failure Bill Receipt Itemized Report']")
    public static WebElement sapReportsRealizationFailureBillReceiptItemizedReport;

    @FindBy(xpath = "//a[normalize-space()='Realization Failure Misc Receipt Itemized Report']")
    public static WebElement sapReportsRealizationFailureMiscReceiptItemizedReport;

    @FindBy(xpath = "//a[contains(text(),'DemandDiff')]")
    public static WebElement sapReportsDemandDiffItemizedReport;

    public void sapReportsRegistrationReceiptItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsRegistrationReceiptItemizedReport);
            Thread.sleep(1000);
            sapReportsRegistrationReceiptItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsRegistrationReceiptItemizedReport();
    }

    public void sapReportsBillReceiptItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsBillReceiptItemizedReport);
            Thread.sleep(1000);
            sapReportsBillReceiptItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsBillReceiptItemizedReport();
    }

    public void sapReportsMiscReceiptItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsMiscReceiptItemizedReport);
            Thread.sleep(1000);
            sapReportsMiscReceiptItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsMiscReceiptItemizedReport();
    }

    public void sapReportsRealizationFailureRegistrationReceiptItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsRealizationFailureRegistrationReceiptItemizedReport);
            Thread.sleep(1000);
            sapReportsRealizationFailureRegistrationReceiptItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsRealizationFailureBillReceiptItemizedReport();
    }

    public void sapReportsRealizationFailureBillReceiptItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsRealizationFailureBillReceiptItemizedReport);
            Thread.sleep(1000);
            sapReportsRealizationFailureBillReceiptItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsRealizationFailureBillReceiptItemizedReport();
    }

    public void sapReportsRealizationFailureMiscReceiptItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsRealizationFailureMiscReceiptItemizedReport);
            Thread.sleep(1000);
            sapReportsRealizationFailureMiscReceiptItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsRealizationFailureMiscReceiptItemizedReport();
    }

    public void sapReportsDemandDiffItemizedReportClick() {
        try {
            TestUtil.highlightElement(sapReportsDemandDiffItemizedReport);
            Thread.sleep(1000);
            sapReportsDemandDiffItemizedReport.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new SAPReportsDemandDiffItemizedReport();
    }


}
