package com.agp.qa.pages.commercial;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CommercialConsumerRegistrationReceipt extends TestBase {

    public CommercialConsumerRegistrationReceipt() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h2[contains(text(),'Consumer Registration Payment Receipt')]")
    public static WebElement comConsumerRegistrationPaymentReceiptMainHeader;

    @FindBy(xpath = "//label[normalize-space()='Application No']")
    public static WebElement comConsumerRegistrationPaymentReceiptApplicationNoHeader;

    @FindBy(xpath = "//input[@id='AppNo']")
    public static WebElement comConsumerRegistrationPaymentReceiptApplicationNoInput;

    @FindBy(xpath = "//button[@id='btnSearchCustomer']")
    public static WebElement comConsumerRegistrationPaymentReceiptSearchBtn;

    @FindBy(xpath = "//label[contains(text(),'Consumer Name')]")
    public static WebElement comConsumerRegistrationPaymentReceiptConsumerNameHeader;

    @FindBy(xpath = "//input[@id='FullName']")
    public static WebElement comConsumerRegistrationPaymentReceiptConsumerNameInput;

    @FindBy(xpath = "//label[contains(text(),'Mobile Number')]")
    public static WebElement comConsumerRegistrationPaymentReceiptMobileNumberHeader;

    @FindBy(xpath = "//input[@id='MobileNumber']")
    public static WebElement comConsumerRegistrationPaymentReceiptMobileNumberInput;

    @FindBy(xpath = "//label[contains(text(),'Address')]")
    public static WebElement comConsumerRegistrationPaymentReceiptAddressHeader;

    @FindBy(xpath = "//textarea[@id='Address']")
    public static WebElement comConsumerRegistrationPaymentReceiptAddressInput;

    @FindBy(xpath = "//label[contains(text(),'Receipt Date')]")
    public static WebElement comConsumerRegistrationPaymentReceiptReceiptDateHeader;

    @FindBy(xpath = "//input[@id='TransactionDate']")
    public static WebElement comConsumerRegistrationPaymentReceiptReceiptDateInput;

//    @FindBy(xpath = "//div[@class='form-group disablePayment']//label[1]")
    @FindBy(xpath = "//label[contains(text(),'Payment Mode ')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPaymentModeHeader;

    @FindBy(xpath = "//select[@id='ConChallanTr_PaymentTypeId']")
    public static WebElement comConsumerRegistrationPaymentReceiptPaymentModeClick;



    @FindBy(xpath = "//option[contains(text(),'CASH')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPaymentModeCashSelect;

    @FindBy(xpath = "//option[contains(text(),'CTS Cheque')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPaymentModeCTSChequeSelect;

    @FindBy(xpath = "//option[contains(text(),'POS Transaction')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPaymentModePOSTransactionSelect;

    @FindBy(xpath = "//input[@id='ConChallanTr_ChequeDDNumber']/..//label[contains(text(),'Cheque/DD Reference No. ')]")
    public static WebElement comConsumerRegistrationPaymentReceiptChequeDDReferenceNoHeader;

    @FindBy(xpath = "//input[@id='ConChallanTr_ChequeDDNumber']")
    public static WebElement comConsumerRegistrationPaymentReceiptChequeDDReferenceNoInput;

    @FindBy(xpath = "//input[@id='ConChallanTr_ChequeDDDate']/..//label[contains(text(),'Cheque/DD Date ')]")
    public static WebElement comConsumerRegistrationPaymentReceiptChequeDateHeader;

    @FindBy(xpath = "//input[@id='ConChallanTr_ChequeDDDate']")
    public static WebElement comConsumerRegistrationPaymentReceiptChequeDateInput;

    @FindBy(xpath = "//select[@id='ConChallanTr_BankId']/..//label[contains(text(),'Bank Name ')]")
    public static WebElement comConsumerRegistrationPaymentReceiptBankNameHeader;

    @FindBy(xpath = "//select[@id='ConChallanTr_BankId']")
    public static WebElement comConsumerRegistrationPaymentReceiptBankNameInput;

    @FindBy(xpath = "//option[contains(text(),'ABHYUDAYA CO-OP BANK LTD')]")
    public static WebElement comConsumerRegistrationPaymentReceiptABHYUDAYABankNameSelect;

    @FindBy(xpath = "//input[@id='ConChallanTr_POSNumber']/..//label[contains(text(),'POS Number')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPOSNumberHeader;

    @FindBy(xpath = "//input[@id='ConChallanTr_POSNumber']")
    public static WebElement comConsumerRegistrationPaymentReceiptPOSNumberInput;

    @FindBy(xpath = "//input[@id='ConChallanTr_ChallanAmount']/..//label[contains(text(),'Payable Amount')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPayableAmountHeader;

    @FindBy(xpath = "//input[@id='ConChallanTr_ChallanAmount']")
    public static WebElement comConsumerRegistrationPaymentReceiptPayableAmountInput;

    @FindBy(xpath = "//th[contains(text(),'Description')]")
    public static WebElement comConsumerRegistrationPaymentReceiptDescriptionTableHeader;

    @FindBy(xpath = "//th[contains(text(),'Paid Amount')]")
    public static WebElement comConsumerRegistrationPaymentReceiptPaidAmountTableHeader;

    @FindBy(xpath = "//td[contains(text(),'Basic Administrative Charges')]")
    public static WebElement comConsumerRegistrationPaymentReceiptBasicAdministrativeChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_BasicAdministrativeCharges']")
    public static WebElement comConsumerRegistrationPaymentReceiptBasicAdministrativeChargesInput;

    @FindBy(xpath = "//td[contains(text(),'CGST On Administrative Charges')]")
    public static WebElement comConsumerRegistrationPaymentReceiptCGSTAdministrativeChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_CGSTOnAdministrativeCharges']")
    public static WebElement comConsumerRegistrationPaymentReceiptCGSTAdministrativeChargesInput;

    @FindBy(xpath = "//td[contains(text(),'SGST On Administrative Charges')]")
    public static WebElement comConsumerRegistrationPaymentReceiptSGSTAdministrativeChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_SGSTOnAdministrativeCharges']")
    public static WebElement comConsumerRegistrationPaymentReceiptSGSTAdministrativeChargesInput;

    @FindBy(xpath = "//td[contains(text(),'ConsumptionSD Charges')]")
    public static WebElement comConsumerRegistrationPaymentReceiptConsumptionSDChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_ConsumptionSD']")
    public static WebElement comConsumerRegistrationPaymentReceiptConsumptionSDChargesInput;

    @FindBy(xpath = "//td[contains(text(),'ConnectionSD Charges')]")
    public static WebElement comConsumerRegistrationPaymentReceiptConnectionSDChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_ConnectionSD']")
    public static WebElement comConsumerRegistrationPaymentReceiptConnectionSDChargesInput;

    @FindBy(xpath = "//td[normalize-space()='Cheque Return Charges']")
    public static WebElement comConsumerRegistrationPaymentReceiptChequeReturnChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_ChequeReturnCharge']")
    public static WebElement comConsumerRegistrationPaymentReceiptChequeReturnChargesInput;

    @FindBy(xpath = "//td[normalize-space()='CGST On Cheque Return Charges']")
    public static WebElement comConsumerRegistrationPaymentReceiptCGSTChequeReturnChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_CGSTOnChequeReturnCharges']")
    public static WebElement comConsumerRegistrationPaymentReceiptCGSTChequeReturnChargesInput;

    @FindBy(xpath = "//td[normalize-space()='SGST On Cheque Return Charges']")
    public static WebElement comConsumerRegistrationPaymentReceiptSGSTChequeReturnChargesHeader;

    @FindBy(xpath = "//input[@id='ConsumerSDBalance_SGSTOnChequeReturnCharges']")
    public static WebElement comConsumerRegistrationPaymentReceiptSGSTChequeReturnChargesInput;

    @FindBy(xpath = "//td[contains(text(),'Total Paid Amount:')]")
    public static WebElement comConsumerRegistrationPaymentReceiptTotalPaidAmountHeader;

    @FindBy(xpath = "//div[@id='basicamtsum']")
    public static WebElement comConsumerRegistrationPaymentReceiptTotalPaidAmountInput;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public static WebElement comConsumerRegistrationPaymentReceiptSaveAndPrintBtn;

    @FindBy(xpath = "//button[@id='btnclear']")
    public static WebElement comConsumerRegistrationPaymentReceiptClearBtn;

    public void paymentReceiptVerifyAmount() {

        TestUtil.waiting(1000);
        TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptMainHeader);


        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = reader.getRowCount("Commercial");

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {


            String Application_No = reader.getCellData("Commercial", "Application No", rowNum);

            String consumerName = reader.getCellData("Commercial", "Name of Establishment", rowNum);

            String MobileNo = reader.getCellData("Commercial", "Mobile No", rowNum);

            String Address = reader.getCellData("Commercial", "Address", rowNum);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptApplicationNoHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptApplicationNoInput);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationPaymentReceiptApplicationNoInput, Application_No);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSearchBtn);
            TestUtil.waiting(500);
            comConsumerRegistrationPaymentReceiptSearchBtn.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConsumerNameHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConsumerNameInput);
            TestUtil.waiting(500);
            System.out.println("++++++++++++++++++++ "+ consumerName.toUpperCase());
            Assert.assertEquals(consumerName.toUpperCase(), comConsumerRegistrationPaymentReceiptConsumerNameInput.getAttribute("value"), "Consumer Name Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptMobileNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptMobileNumberInput);
            TestUtil.waiting(500);
            Assert.assertEquals(MobileNo, comConsumerRegistrationPaymentReceiptMobileNumberInput.getAttribute("value"), "Mobile No Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptAddressHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptAddressInput);
            TestUtil.waiting(500);
            Assert.assertEquals(Address.toUpperCase(), comConsumerRegistrationPaymentReceiptAddressInput.getAttribute("value"), "Address Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptReceiptDateHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptReceiptDateInput);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();
            String dateInString = dtf.format(now);
            Assert.assertEquals(dateInString,comConsumerRegistrationPaymentReceiptReceiptDateInput.getAttribute("value"), "Date Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPaymentModeHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPaymentModeClick);
            TestUtil.waiting(1000);
            comConsumerRegistrationPaymentReceiptPaymentModeClick.click();
            TestUtil.waiting(1000);
            comConsumerRegistrationPaymentReceiptPaymentModeCashSelect.click();
//            TestUtil.selectMethod(comConsumerRegistrationPaymentReceiptReceiptDateInput,"Cash");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPayableAmountHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPayableAmountInput);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptDescriptionTableHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPaidAmountTableHeader);

            // -------------------------------- Basic Administrative Charges ---------------------------
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptBasicAdministrativeChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptBasicAdministrativeChargesInput);
            Double basicAdministrativeCharges = Double.parseDouble(comConsumerRegistrationPaymentReceiptBasicAdministrativeChargesInput.getAttribute("value"));

            // -------------------------------- CGST ------------------------------------------
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptCGSTAdministrativeChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptCGSTAdministrativeChargesInput);
            TestUtil.waiting(1000);

//            Double convertCGSTAdministrativeChargesInput = Double.parseDouble(comConsumerRegistrationPaymentReceiptCGSTAdministrativeChargesInput.getAttribute("value"));

//            System.out.println(convertCGSTAdministrativeChargesInput);
            Double convertCGSTAdministrativeChargesFinal = (basicAdministrativeCharges * 0.09);
            System.out.println(convertCGSTAdministrativeChargesFinal);

            Double convertCGSTAdministrativeChargesFinalUI = Double.parseDouble(comConsumerRegistrationPaymentReceiptSGSTAdministrativeChargesInput.getAttribute("value"));

            Assert.assertEquals(convertCGSTAdministrativeChargesFinalUI,convertCGSTAdministrativeChargesFinal, "CGST Administrative Charges Final Does Not Match");

            // ------------------------------------ SGST -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSGSTAdministrativeChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSGSTAdministrativeChargesInput);
            TestUtil.waiting(1000);

//            Double convertSGSTAdministrativeChargesInput = Double.parseDouble(comConsumerRegistrationPaymentReceiptCGSTAdministrativeChargesInput.getAttribute("value"));

            Double convertSGSTAdministrativeChargesFinal = (basicAdministrativeCharges * 0.09);

            Double convertSGSTAdministrativeChargesFinalUI = Double.parseDouble(comConsumerRegistrationPaymentReceiptSGSTAdministrativeChargesInput.getAttribute("value"));

            Assert.assertEquals(convertSGSTAdministrativeChargesFinalUI, convertSGSTAdministrativeChargesFinal, "SGST Administrative Charges Final Does Not Match");


            // ------------------------------------ ConsumptionSD Charges -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConsumptionSDChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConsumptionSDChargesInput);

            Double consumptionSDCharges = Double.parseDouble(comConsumerRegistrationPaymentReceiptConsumptionSDChargesInput.getAttribute("value"));

            // ------------------------------------ ConnectionSD Charges -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConnectionSDChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConnectionSDChargesInput);

            Double connectionSDCharges = Double.parseDouble(comConsumerRegistrationPaymentReceiptConnectionSDChargesInput.getAttribute("value"));


            // ------------------------------------ Cheque Return Charges -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptChequeReturnChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptChequeReturnChargesInput);

            Double chequeReturnCharges = Double.parseDouble(comConsumerRegistrationPaymentReceiptChequeReturnChargesInput.getAttribute("value"));

            // ------------------------------------ CGST Cheque Return Charges -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptCGSTChequeReturnChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptCGSTChequeReturnChargesInput);

            Double cGSTChequeReturnCharges = Double.parseDouble(comConsumerRegistrationPaymentReceiptCGSTChequeReturnChargesInput.getAttribute("value"));

            // ------------------------------------ SGST Cheque Return Charges -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSGSTChequeReturnChargesHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSGSTChequeReturnChargesInput);

            Double sGSTChequeReturnCharges = Double.parseDouble(comConsumerRegistrationPaymentReceiptSGSTChequeReturnChargesInput.getAttribute("value"));

            Double finalPayableAmount = basicAdministrativeCharges + convertCGSTAdministrativeChargesFinal +
                    convertSGSTAdministrativeChargesFinal + consumptionSDCharges + connectionSDCharges + chequeReturnCharges
                    + cGSTChequeReturnCharges + sGSTChequeReturnCharges;

            // ------------------------------------ Total Paid Amount: -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptTotalPaidAmountHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptTotalPaidAmountInput);
            TestUtil.waiting(1000);

            Double TotalPaidAmountUI = Double.parseDouble(comConsumerRegistrationPaymentReceiptTotalPaidAmountInput.getAttribute("value"));
            Assert.assertEquals(TotalPaidAmountUI, finalPayableAmount, "Total Paid Amount  Does Not Match");

            // ------------------------------------ Clear aND Submit BTN -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptClearBtn);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSaveAndPrintBtn);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSaveAndPrintBtn);



        }




    }






























}
