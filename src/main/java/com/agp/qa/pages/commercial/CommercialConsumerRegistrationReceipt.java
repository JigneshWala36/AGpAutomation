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
import java.util.Iterator;
import java.util.Set;


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

    @FindBy(xpath = "//h2[normalize-space()='Success!!']")
    public static WebElement comConsumerRegistrationPaymentReceiptSuccessToasterMessagePopUp;

//    @FindBy(xpath = "//p[normalize-space()='Record Saved Succssfully']")
    @FindBy(xpath = "//p[normalize-space()='Record Saved Successfully']")
    public static WebElement comConsumerRegistrationPaymentReceiptRecordSavedSuccessfullyPopUp;

    @FindBy(xpath = "//button[@class='confirm']")
    public static WebElement comConsumerRegistrationPaymentReceiptConfirmPopUpBTN;

    // -------------------------------- Switching to Other Tab -------------------------------------------



    @FindBy(xpath = "//b[normalize-space()='RECEIPT']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabReceiptHeader;

    @FindBy(xpath = "//b[normalize-space()='Application No :']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabApplicationNoHeader;

    @FindBy(xpath = "//b[contains(text(),'Application No :')]/../..//td[1]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabApplicationNoUI;


    @FindBy(xpath = "//b[normalize-space()='Mobile No :']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabMobileNoHeader;

    @FindBy(xpath = "//b[contains(text(),'Application No :')]/../..//td[2]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabMobileNoUI;

    @FindBy(xpath = "//b[normalize-space()='Receipt No :']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabReceiptNoHeader;

    @FindBy(xpath = "//b[contains(text(),'Application No :')]/../..//td[1]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabReceiptNoUI;

    @FindBy(xpath = "//b[contains(text(),'To :')]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabConsumerNameHeader;

    @FindBy(xpath = "//b[contains(text(),'To :')]/../..//td[1]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabConsumerNameUI;

    @FindBy(xpath = "//b[normalize-space()='Receipt Date :']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabReceiptDateHeader;

    @FindBy(xpath = "//b[normalize-space()='Receipt Date :']/../..//td[3]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI;



    @FindBy(xpath = "//b[contains(text(),'Particulars')]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularTableHeader;

    @FindBy(xpath = "//b[normalize-space()='Amount']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabAmountTableHeader;

    @FindBy(xpath = "//td[normalize-space()='Basic Administrative Charges']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularBasicAdministrativeChargesHeader;

    @FindBy(xpath = "//td[normalize-space()='Basic Administrative Charges']/..//td[2]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularBasicAdministrativeChargesUI;

    @FindBy(xpath = "//td[normalize-space()='CGST On Administrative Charges']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularCGSTBasicAdministrativeChargesHeader;

    @FindBy(xpath = "//td[normalize-space()='CGST On Administrative Charges']/..//td[2]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularCGSTBasicAdministrativeChargesUI;

    @FindBy(xpath = "//td[normalize-space()='SGST On Administrative Charges']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularSGSTBasicAdministrativeChargesHeader;

    @FindBy(xpath = "//td[normalize-space()='SGST On Administrative Charges']/..//td[2]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabSGSTParticularBasicAdministrativeChargesUI;

    @FindBy(xpath = "//td[normalize-space()='Consumption SD']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularConsumptionSDHeader;

    @FindBy(xpath = "//td[normalize-space()='Consumption SD']/..//td[2]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabParticularConsumptionSDUI;

    @FindBy(xpath = "//b[normalize-space()='Total Amount (Rs.)']")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabFinalTotalAmountTable;

    @FindBy(xpath = "//b[contains(text(),'Total Amount (Rs.)')]/../..//td[4]")
    public static WebElement comConsumerRegistrationPaymentReceiptNewTabFinalTotalAmountTableUI;











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
            System.out.println("++++++++++++++++++++++++++++++ "+ dateInString);
            Assert.assertEquals(dateInString,comConsumerRegistrationPaymentReceiptReceiptDateInput.getAttribute("value"), "Date Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPaymentModeHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPaymentModeClick);
            TestUtil.waiting(1000);
            comConsumerRegistrationPaymentReceiptPaymentModeClick.click();
            TestUtil.waiting(1000);
            comConsumerRegistrationPaymentReceiptPaymentModeCashSelect.click();
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptPaymentModeClick);
            TestUtil.waiting(1000);
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



            // ------------------------------------ Total Paid Amount: -----------------------------------------

            Double finalPayableAmount = basicAdministrativeCharges + convertCGSTAdministrativeChargesFinal +
                    convertSGSTAdministrativeChargesFinal + consumptionSDCharges + connectionSDCharges + chequeReturnCharges
                    + cGSTChequeReturnCharges + sGSTChequeReturnCharges;

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptTotalPaidAmountHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptTotalPaidAmountInput);
            TestUtil.waiting(1000);

            Double TotalPaidAmountUI = Double.parseDouble(comConsumerRegistrationPaymentReceiptTotalPaidAmountInput.getText());
            Assert.assertEquals(TotalPaidAmountUI, finalPayableAmount, "Total Paid Amount  Does Not Match");

            // ------------------------------------ Clear aND Submit BTN -----------------------------------------

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptClearBtn);
            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSaveAndPrintBtn);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSaveAndPrintBtn);
            TestUtil.waiting(1000);
            comConsumerRegistrationPaymentReceiptSaveAndPrintBtn.click();


            // ------------------------------------ Success Toaster -----------------------------------------

            TestUtil.waiting(3000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptSuccessToasterMessagePopUp);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptRecordSavedSuccessfullyPopUp);
            TestUtil.waiting(1000);

            String MainWindow=driver.getWindowHandle();
            Set<String> s1=driver.getWindowHandles();

            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptConfirmPopUpBTN);
            TestUtil.waiting(1000);

            comConsumerRegistrationPaymentReceiptConfirmPopUpBTN.click();


            // ======================== Switching to Other Tab ========================================



//            String MainWindow=driver.getWindowHandle();
//            Set<String> s1=driver.getWindowHandles();
            Iterator<String> i1=s1.iterator();
            while(i1.hasNext())
            {
                String ChildWindow=i1.next();

                if(!MainWindow.equalsIgnoreCase(ChildWindow))
                {

                    TestUtil.waiting(3000);
                    TestUtil.keyboradPressEsc();
                    TestUtil.waiting(2000);

                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);

                    // Closing the Child Window.
                    driver.close();
                }
            }

            driver.switchTo().window(MainWindow);

//            String current_window = driver.getWindowHandle();
//            Set<String> all_Windows = driver.getWindowHandles();
//            Iterator<String> i = all_Windows.iterator();
//            while(i.hasNext()){
//                String child_window = i.next();
//                if(!child_window.equalsIgnoreCase(current_window)){
//                    driver.switchTo().window(child_window);
//                    System.out.println("The current window is "+child_window);
//                    // close() method closes the child window in focus, the parent window is still open
//                    driver.close();
//                } else {
//                    System.out.println("No other window open");
//                }
//            }




//            String receiptApplicationNo = TestUtil.getTextFromUI(comConsumerRegistrationPaymentReceiptNewTabApplicationNoUI);
//            System.out.println("----------------" + receiptApplicationNo);
//            String[] outputApplicationNo = receiptApplicationNo.split(": ");
//            String finalReceiptApplicationNo = outputApplicationNo[1];
//            String verifyApplicationNo = finalReceiptApplicationNo;

//            TestUtil.waiting(1000);
//            String verifyApplicationNo =  TestUtil.getSplitStringOfFirstArray(comConsumerRegistrationPaymentReceiptNewTabApplicationNoUI);
////            String receiptMobileNo = TestUtil.getTextFromUI(comConsumerRegistrationPaymentReceiptNewTabMobileNoUI);
////            System.out.println("----------------" + receiptMobileNo);
////            String[] outputMobileNo = receiptMobileNo.split(": ");
////            String finalReceiptMobileNo = outputMobileNo[1];
////            String verifyMobileNo = finalReceiptMobileNo;
//            TestUtil.waiting(1000);
//            String verifyMobileNo =  TestUtil.getSplitStringOfFirstArray(comConsumerRegistrationPaymentReceiptNewTabMobileNoUI);
////            String receiptReceiptNo = TestUtil.getTextFromUI(comConsumerRegistrationPaymentReceiptNewTabReceiptNoUI);
////            System.out.println("----------------" + receiptReceiptNo);
////            String[] outputReceiptNo = receiptReceiptNo.split(": ");
////            String finalReceiptReceiptNo = outputReceiptNo[1];
////            String verifyReceiptNo = finalReceiptReceiptNo;
//            TestUtil.waiting(1000);
//            String verifyReceiptNo =  TestUtil.getSplitStringOfFirstArray(comConsumerRegistrationPaymentReceiptNewTabReceiptNoUI);
////            String receiptConsumerName = TestUtil.getTextFromUI(comConsumerRegistrationPaymentReceiptNewTabConsumerNameUI);
////            System.out.println("----------------" + receiptReceiptNo);
////            String[] outputConsumerName = receiptConsumerName.split(": ");
////            String finalReceiptConsumerName = outputConsumerName[1];
////            String verifyConsumerName = finalReceiptConsumerName;
//            TestUtil.waiting(1000);
//            String verifyConsumerName =  TestUtil.getSplitStringOfFirstArray(comConsumerRegistrationPaymentReceiptNewTabConsumerNameUI);
//
//            TestUtil.waiting(1000);
//            String verifyReceiptDate =  TestUtil.getSplitStringOfFirstArray(comConsumerRegistrationPaymentReceiptNewTabReceiptDateHeader);
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptHeader);
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabApplicationNoHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabApplicationNoUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(verifyApplicationNo,Application_No, "Application_No Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabMobileNoHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabMobileNoUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(verifyMobileNo,MobileNo, "Mobile No Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabConsumerNameHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabConsumerNameUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(verifyConsumerName,consumerName.toUpperCase(), "Consumer Name Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI.getText(),dateInString, "Receipt Date  Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabParticularTableHeader);
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabAmountTableHeader);
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabParticularBasicAdministrativeChargesHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabParticularBasicAdministrativeChargesUI);
//            TestUtil.waiting(1000);
//            Double basicAdministrativeChargesReceiptTable = Double.parseDouble(comConsumerRegistrationPaymentReceiptNewTabParticularBasicAdministrativeChargesUI.getText());
//            Assert.assertEquals(basicAdministrativeChargesReceiptTable,basicAdministrativeCharges , "Basic Administrative Charges  Does Not Match");
//            Assert.assertEquals(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI.getText(),dateInString, "Receipt Date  Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI.getText(),dateInString, "Receipt Date  Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI.getText(),dateInString, "Receipt Date  Does Not Match");
//
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateHeader);
//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI);
//            TestUtil.waiting(1000);
//            Assert.assertEquals(comConsumerRegistrationPaymentReceiptNewTabReceiptDateUI.getText(),dateInString, "Receipt Date  Does Not Match");































        }




    }






























}
