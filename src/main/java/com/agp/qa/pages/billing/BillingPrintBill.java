package com.agp.qa.pages.billing;

import com.agp.qa.base.TestBase;
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

    @FindBy(xpath = "//td[@class='day'][normalize-space()='2']")
    public static WebElement billingPrintBillBillDateSelect;

    @FindBy(xpath = "//button[@id='btnPrint']")
    public static WebElement billingPrintBillPrintBtn;


















}
