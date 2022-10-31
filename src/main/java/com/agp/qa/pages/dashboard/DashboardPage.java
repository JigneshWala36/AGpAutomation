package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends TestBase {

    // Initializing the PageObject

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//div[contains(text(),'You are successfully logged in')]")
    public static WebElement successLoggedInToaster;

    @FindBy(xpath = "//strong[contains(text(),'JIGNESH WALA')]")
    public static WebElement dashboardUerLoggedInNameClick;

    @FindBy(xpath = "//b[normalize-space()='Profile']")
    public static WebElement dashboardUerLoggedInProfileClick;

    @FindBy(xpath = "//b[normalize-space()='Change Password']")
    public static WebElement dashboardUerLoggedInChangePasswordClick;


    @FindBy(xpath = "//h1[normalize-space()='Welcome to AG&P Pratham']")
    public static WebElement dashboardMainHeader;



    @FindBy(xpath = "//a[@id='btn_logout']")
    public static WebElement dashboardLogoutBtn;

    // -------- Menu Main Header -------------------------

    @FindBy(xpath = "//span[normalize-space()='Domestic New Connection']")
    public static WebElement dashboardDomesticNewConnection;

    @FindBy(xpath = "//span[normalize-space()='Commercial New Connection']")
    public static WebElement dashboardCommercialNewConnection;

    @FindBy(xpath = "//span[normalize-space()='Gas In']")
    public static WebElement dashboardGasIn;

    @FindBy(xpath = "//span[normalize-space()='Consumer Maintenance']")
    public static WebElement dashboardConsumerMaintenance;

    @FindBy(xpath = "//span[normalize-space()='Billing']")
    public static WebElement dashboardBilling;

    @FindBy(xpath = "//span[normalize-space()='Master']")
    public static WebElement dashboardMaster;

    @FindBy(xpath = "//span[normalize-space()='Cashier']")
    public static WebElement dashboardCashier;

    @FindBy(xpath = "//span[normalize-space()='HR/Software']")
    public static WebElement dashboardHR_Software;

    @FindBy(xpath = "//span[normalize-space()='Ledger']")
    public static WebElement dashboardLedger;

    @FindBy(xpath = "//a[@id='menu~Accountant Report']")
    public static WebElement dashboardAccountantReport;

    @FindBy(xpath = "//a[@id='menu~List Report']")
    public static WebElement dashboardListReport;

    @FindBy(xpath = "//span[normalize-space()='Reports']")
    public static WebElement dashboardReports;

    @FindBy(xpath = "//span[normalize-space()='Accountant']")
    public static WebElement dashboardAccountant;

    @FindBy(xpath = "//span[normalize-space()='DMA']")
    public static WebElement dashboardDMA;

    @FindBy(xpath = "//span[normalize-space()='SAP Reports']")
    public static WebElement dashboardSAPReports;

    @FindBy(xpath = "//span[normalize-space()='Reader Management']")
    public static WebElement dashboardReaderManagement;

    public void dashboardVerify(){
        TestUtil.highlightElement(successLoggedInToaster);
        successLoggedInToaster.click();
        TestUtil.waiting(2000);
        TestUtil.explicitWait(dashboardMainHeader);
        TestUtil.highlightElement(dashboardMainHeader);
        TestUtil.waiting(1000);
    }
    public void domesticNewConnectionClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardDomesticNewConnection));
            TestUtil.highlightElement(dashboardDomesticNewConnection);
            TestUtil.waiting(1000);
            dashboardDomesticNewConnection.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardDomesticNewConnection();
    }

    public void commercialNewConnectionClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardCommercialNewConnection));
            TestUtil.highlightElement(dashboardCommercialNewConnection);
            TestUtil.waiting(1000);
            dashboardCommercialNewConnection.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardCommercialNewConnection();
    }

    public void gasInClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardGasIn));
            TestUtil.highlightElement(dashboardGasIn);
            TestUtil.waiting(1000);
            dashboardGasIn.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardGasIn();
    }


    public void consumerMaintenanceClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardConsumerMaintenance));
            TestUtil.highlightElement(dashboardConsumerMaintenance);
            TestUtil.waiting(1000);
            dashboardConsumerMaintenance.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardConsumerMaintenance();
    }

    public void billingClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardBilling));
            TestUtil.highlightElement(dashboardBilling);
            TestUtil.waiting(1000);
            dashboardBilling.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardBilling();
    }

    public void masterClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardMaster));
            TestUtil.highlightElement(dashboardMaster);
            TestUtil.waiting(1000);
            dashboardMaster.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardMaster();
    }

    public void cashierClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardCashier));
            TestUtil.highlightElement(dashboardCashier);
            TestUtil.waiting(1000);
            dashboardCashier.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardCashier();
    }

    public void hr_SoftwareClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardHR_Software));
            TestUtil.highlightElement(dashboardHR_Software);
            TestUtil.waiting(1000);
            dashboardHR_Software.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardHR_Software();
    }

    public void ledgerClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardLedger));
            TestUtil.highlightElement(dashboardLedger);
            TestUtil.waiting(1000);
            dashboardLedger.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardLedger();
    }

    public void accountantReportClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardAccountantReport));
            TestUtil.highlightElement(dashboardAccountantReport);
            TestUtil.waiting(1000);
            dashboardAccountantReport.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardAccountantReport();
    }

    public void listReportClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardListReport));
            TestUtil.highlightElement(dashboardListReport);
            TestUtil.waiting(1000);
            dashboardListReport.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardListReport();
    }

    public void reportClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardReports));
            TestUtil.highlightElement(dashboardReports);
            TestUtil.waiting(1000);
            dashboardReports.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardReports();
    }

    public void accountantClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardAccountant));
            TestUtil.highlightElement(dashboardAccountant);
            TestUtil.waiting(1000);
            dashboardAccountant.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardAccountant();
    }

    public void dmaClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardDMA));
            TestUtil.highlightElement(dashboardDMA);
            TestUtil.waiting(1000);
            dashboardDMA.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardDMA();
    }

    public void sapReportsClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardSAPReports));
            TestUtil.highlightElement(dashboardSAPReports);
            TestUtil.waiting(1000);
            dashboardSAPReports.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardSAPReports();
    }

    public void readerManagementClick() {
        try {
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(dashboardReaderManagement));
            TestUtil.highlightElement(dashboardReaderManagement);
            TestUtil.waiting(1000);
            dashboardReaderManagement.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DashboardReaderManagement();
    }












}
