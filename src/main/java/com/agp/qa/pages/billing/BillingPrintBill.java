package com.agp.qa.pages.billing;

import com.agp.qa.x.TestBase;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPrintBill extends TestBase {

    public BillingPrintBill() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Print Bill')]")
    public static WebElement billingPrintBillMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Account Type')]")
    public static WebElement billingPrintBillAccountTypeHeader;

    @FindBy(xpath = "//select[@id='AccountTypeId']")
    public static WebElement billingPrintBillAccountTypeDropdown;

    @FindBy(xpath = "//option[normalize-space()='COMMERCIAL']")
    public static WebElement billingPrintBillAccountTypeCommercialSelect;

    @FindBy(xpath = "//label[@for='Cycle']")
    public static WebElement billingPrintBillCycleHeader;

    @FindBy(xpath = "//input[@id='Cycle']")
    public static WebElement billingPrintBillCycleInput;

    @FindBy(xpath = "//label[@for='Ward']")
    public static WebElement billingPrintBillWardHeader;

    @FindBy(xpath = "//select[@id='WardId']")
    public static WebElement billingPrintBillWardDropdown;

    @FindBy(xpath = "//option[@value='9']")
    public static WebElement billingPrintBillWardN09Select;

    @FindBy(xpath = "//label[@for='Consumer_Number']")
    public static WebElement billingPrintBillConsumerNumberHeader;

    @FindBy(xpath = "//textarea[@id='ConsumerCode']")
    public static WebElement billingPrintBillConsumerNumberInput;

    @FindBy(xpath = "//label[@for='Bill_Date']")
    public static WebElement billingPrintBillBillDateHeader;

    @FindBy(xpath = "//input[@id='BillDate']")
    public static WebElement billingPrintBillBillDateInput;

    @FindBy(xpath = "//th[normalize-space()='December 2022']")
    public static WebElement billingPrintBillBillYearMonthClick;

    @FindBy(xpath = "//span[normalize-space()='May']")
    public static WebElement billingPrintBillBillMayMonthClick;

    @FindBy(xpath = "//td[@class='day'][normalize-space()='2']")
    public static WebElement billingPrintBillBillDateSelect;

    @FindBy(xpath = "//button[@id='btnPrint']")
    public static WebElement billingPrintBillPrintBtn;

    @FindBy(xpath = "//h2[contains(text(),'Invoice pdf generated successfully.Download it')]")
    public static WebElement billingPrintBillConfirmMessage;


    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public static WebElement billingPrintBillConfirmOkBtn;


    public void meterReadingOfGeneratedMROApprovedGasInCustomer() {


        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = Xls_Reader.getRowCount("Commercial");

        //

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);


        }
    }


}
