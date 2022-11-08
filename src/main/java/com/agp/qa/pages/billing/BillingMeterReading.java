package com.agp.qa.pages.billing;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BillingMeterReading extends TestBase {

    public BillingMeterReading() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Meter Reading')]")
    public static WebElement billingMeterReadingMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Consumer No')]")
    public static WebElement billingMeterReadingConsumerNumberHeader;

    @FindBy(xpath = "//input[@id='ConsumerNumber']")
    public static WebElement billingMeterReadingConsumerNumberInput;

    @FindBy(xpath = "//label[contains(text(),'Cycle No')]")
    public static WebElement billingMeterReadingCycleNoHeader;

    @FindBy(xpath = "//input[@id='Cycle']")
    public static WebElement billingMeterReadingCycleNoInput;

    @FindBy(xpath = "//button[@id='btnSearch']")
    public static WebElement billingMeterReadingSearchBtn;

    // -------------------------------------Customer Personal Details-----------------------------------------

    @FindBy(xpath = "//div[contains(text(),'Customer Personal Details')]")
    public static WebElement billingMeterReadingCustomerPersonalDetailsHeader;

    @FindBy(xpath = "//label[contains(text(),'Name')]")
    public static WebElement billingMeterReadingConsumerNameHeader;

    @FindBy(xpath = "//input[@id='FullName']")
    public static WebElement billingMeterReadingConsumerNameInput;

    @FindBy(xpath = "//label[contains(text(),'A/C Type')]")
    public static WebElement billingMeterReadingAccountTypeHeader;

    @FindBy(xpath = "//input[@id='AccountTypeName']")
    public static WebElement billingMeterReadingAccountTypeInput;

    @FindBy(xpath = "//label[contains(text(),'Bill No')]")
    public static WebElement billingMeterReadingBillNoHeader;

    @FindBy(xpath = "//input[@id='BillNumber']")
    public static WebElement billingMeterReadingBillNoInput;

    @FindBy(xpath = "//label[contains(text(),'Transaction Date')]")
    public static WebElement billingMeterReadingBillDateHeader;

    @FindBy(xpath = "//input[@id='BillDate']")
    public static WebElement billingMeterReadingBillDateInput;

    @FindBy(xpath = "//label[contains(text(),'Ward')]")
    public static WebElement billingMeterReadingWardHeader;

    @FindBy(xpath = "//input[@id='WardName']")
    public static WebElement billingMeterReadingWardInput;

    // -------------------------------------Meter Reading Entry-----------------------------------------


    @FindBy(xpath = "//div[contains(text(),'Meter Reading Entry')]")
    public static WebElement billingMeterReadingMeterReadingEntryHeader;

    @FindBy(xpath = "//label[@for='Reading_Date']")
    public static WebElement billingMeterReadingDateHeader;

    @FindBy(xpath = "//input[@id='ReadingDate']")
    public static WebElement billingMeterReadingDateInput;

    @FindBy(xpath = "//td[@class='active day']")
    public static WebElement billingMeterReadingDateSelect;

    @FindBy(xpath = "//label[@for='Meter_Status']")
    public static WebElement billingMeterReadingMeterStatusHeader;

    @FindBy(xpath = "//select[@id='MeterStatusId']")
    public static WebElement billingMeterReadingMeterStatusSelect;

    @FindBy(xpath = "//label[@for='Previous_Reading_Date']")
    public static WebElement billingMeterReadingPreviousReadingDateHeader;

    @FindBy(xpath = "//input[@id='PreviousReadingDate']")
    public static WebElement billingMeterReadingPreviousReadingDateInput;

    @FindBy(xpath = "//label[@for='Previous_Reading']")
    public static WebElement billingMeterReadingPreviousReadingHeader;

    @FindBy(xpath = "//input[@id='PreviousReading']")
    public static WebElement billingMeterReadingPreviousReadingInput;

    @FindBy(xpath = "//label[@for='Current_Reading']")
    public static WebElement billingMeterReadingCurrentReadingHeader;

    @FindBy(xpath = "//input[@id='CurrentReading']")
    public static WebElement billingMeterReadingCurrentReadingInput;

    @FindBy(xpath = "//label[@for='Total_Used']")
    public static WebElement billingMeterReadingTotalUnitUsedForCurrentBillHeader;

    @FindBy(xpath = "//input[@id='UnitUsed']")
    public static WebElement billingMeterReadingTotalUnitUsedForCurrentBillInput;

    @FindBy(xpath = "//label[@for='Previous_Balance']")
    public static WebElement billingMeterReadingPreviousBalanceHeader;

    @FindBy(xpath = "//input[@id='PreviousBalance']")
    public static WebElement billingMeterReadingPreviousBalanceInput;

    @FindBy(xpath = "//a[contains(text(),'Clear')]")
    public static WebElement billingMeterReadingClearBtn;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public static WebElement billingMeterReadingSaveBtn;

    public void meterReadingOfGeneratedMROApprovedGasInCustomer() {


        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = Xls_Reader.getRowCount("Commercial");

        //

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            String ConsumerNo = Xls_Reader.getCellData("Commercial", "Consumer Number", rowNum);

            String Cycle = Xls_Reader.getCellData("Commercial", "Cycle No", rowNum);

            String AccountType = Xls_Reader.getCellData("Commercial", "Account Type", rowNum);

            String WardNo = Xls_Reader.getCellData("Commercial", "Ward No", rowNum);

            String MeterReadingDate = Xls_Reader.getCellData("Commercial", "Meter Reading Date", rowNum);

            String MeterStatus = Xls_Reader.getCellData("Commercial", "Meter Status", rowNum);

            String CurrentReading = Xls_Reader.getCellData("Commercial", "Current Reading", rowNum);

            String NameOfEstablishment = Xls_Reader.getCellData("Commercial", "Name of Establishment", rowNum);

            String OpeningReading = Xls_Reader.getCellData("Commercial", "Opening Reading", rowNum);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingMainHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingConsumerNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingConsumerNumberInput);
            TestUtil.waiting(500);
            TestUtil.sendKeyNormalExcel(billingMeterReadingConsumerNumberInput, ConsumerNo);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingCycleNoHeader);
            billingMeterReadingCycleNoHeader.click();
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingCycleNoInput);
            TestUtil.waiting(500);
            Assert.assertEquals(Cycle, billingMeterReadingCycleNoInput.getAttribute("value"), "Consumer No Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingSearchBtn);
            TestUtil.waiting(500);
            billingMeterReadingSearchBtn.click();

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingCustomerPersonalDetailsHeader);
            billingMeterReadingCustomerPersonalDetailsHeader.click();

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingConsumerNameHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingConsumerNameInput);
            TestUtil.waiting(500);
            Assert.assertEquals(NameOfEstablishment.toUpperCase(), billingMeterReadingConsumerNameInput.getAttribute("value"), "Name Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingAccountTypeHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingAccountTypeInput);
            TestUtil.waiting(500);
            Assert.assertEquals(AccountType, billingMeterReadingAccountTypeInput.getAttribute("value"), "Account Type Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingBillNoHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingBillNoInput);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingBillDateHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingBillDateInput);
            TestUtil.waiting(500);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDateTime now = LocalDateTime.now();
            String dateInString = dtf.format(now);
            System.out.println("++++++++++++++++++++++++++++++ "+ dateInString);
            Assert.assertEquals(dateInString,billingMeterReadingBillDateInput.getAttribute("value"), "Date Does Not Match");

//            Assert.assertEquals(TestUtil.fetchCurrentDateFormatHiphen(),billingMeterReadingBillDateInput.getAttribute("value"), "Date Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingWardHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingWardInput);
            TestUtil.waiting(500);
            Assert.assertEquals(WardNo, billingMeterReadingWardInput.getAttribute("value"), "Ward No Does Not Match");

            TestUtil.waiting(500);
            TestUtil.scrollTo(billingMeterReadingMeterReadingEntryHeader);
            TestUtil.highlightElement(billingMeterReadingMeterReadingEntryHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingDateHeader);
            TestUtil.waiting(500);
            billingMeterReadingDateInput.click();
            TestUtil.sendKeyNormalExcel(billingMeterReadingDateInput, MeterReadingDate);
//            Thread.sleep(500);
            billingMeterReadingDateSelect.click();
            TestUtil.waiting(500);
            billingMeterReadingMeterReadingEntryHeader.click();
            TestUtil.waiting(500);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingMeterStatusHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingMeterStatusSelect);
            TestUtil.waiting(500);
            TestUtil.selectMethodExcelString(billingMeterReadingMeterStatusSelect, MeterStatus);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingPreviousReadingDateHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingPreviousReadingDateInput);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingPreviousReadingHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingPreviousReadingInput);
            TestUtil.waiting(500);
            Assert.assertEquals(OpeningReading, billingMeterReadingPreviousReadingInput.getAttribute("value"), "Opening Reading Does Not Match");

            TestUtil.waiting(500);

            TestUtil.highlightElement(billingMeterReadingCurrentReadingHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingCurrentReadingInput);
            TestUtil.waiting(500);
            TestUtil.sendKeyNormalExcel(billingMeterReadingCurrentReadingInput, CurrentReading);

            TestUtil.waiting(500);
            billingMeterReadingTotalUnitUsedForCurrentBillHeader.click();
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingTotalUnitUsedForCurrentBillHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingTotalUnitUsedForCurrentBillInput);
            // Verification Pending for Above Total Used


            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingPreviousBalanceHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingPreviousBalanceInput);

            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingClearBtn);
            TestUtil.waiting(500);
            TestUtil.highlightElement(billingMeterReadingSaveBtn);

            TestUtil.waiting(500);
            billingMeterReadingSaveBtn.click();





































        }


    }


}
