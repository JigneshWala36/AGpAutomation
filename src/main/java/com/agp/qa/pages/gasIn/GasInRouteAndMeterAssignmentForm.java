package com.agp.qa.pages.gasIn;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GasInRouteAndMeterAssignmentForm extends TestBase {

    public GasInRouteAndMeterAssignmentForm() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Route & Meter Assignment Form')]")
    public static WebElement gasInRouteAndMeterAssignmentFormHeader;

    @FindBy(xpath = "//label[contains(text(),'Consumer Number')]")
    public static WebElement gasInRouteAndMeterAssignmentFormConsumerNumberHeader;

    @FindBy(xpath = "//label[contains(text(),'Consumer Number')]/..//input[@id='ConsumerNumber']")
    public static WebElement gasInRouteAndMeterAssignmentFormConsumerNumberInput;

    @FindBy(xpath = "//button[@id='btnappSearch']")
    public static WebElement gasInRouteAndMeterAssignmentFormSearchBtn;

    @FindBy(xpath = "//label[normalize-space()='Ward']")
    public static WebElement gasInRouteAndMeterAssignmentFormWardHeader;

    @FindBy(xpath = "//select[@id='WardId']")
    public static WebElement gasInRouteAndMeterAssignmentFormWardSelect;

    @FindBy(xpath = "//option[contains(text(),'N09')]")
    public static WebElement gasInRouteAndMeterAssignmentFormWardNo09Select;

    @FindBy(xpath = "//label[normalize-space()='Route Code']")
    public static WebElement gasInRouteAndMeterAssignmentFormRouteCodeHeader;

    @FindBy(xpath = "//input[@id='RouteCode']")
    public static WebElement gasInRouteAndMeterAssignmentFormRouteCodeInput;

    @FindBy(xpath = "//label[normalize-space()='Serial No']")
    public static WebElement gasInRouteAndMeterAssignmentFormSerialNoHeader;

    @FindBy(xpath = "//input[@id='SerialNumber']")
    public static WebElement gasInRouteAndMeterAssignmentFormSerialNoInput;

    @FindBy(xpath = "//label[normalize-space()='Account Type']")
    public static WebElement gasInRouteAndMeterAssignmentFormAccountTypeHeader;

    @FindBy(xpath = "//input[@id='AccountTypeName']")
    public static WebElement gasInRouteAndMeterAssignmentFormAccountTypeInput;

    @FindBy(xpath = "//label[normalize-space()='Switch On Date']")
    public static WebElement gasInRouteAndMeterAssignmentFormSwitchOnDateHeader;

    @FindBy(xpath = "//input[@id='SwitchOnDate']")
    public static WebElement gasInRouteAndMeterAssignmentFormSwitchOnDateInput;

    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    public static WebElement gasInRouteAndMeterAssignmentFormSwitchOnDateSelect;

    @FindBy(xpath = "//label[normalize-space()='MMT Date']")
    public static WebElement gasInRouteAndMeterAssignmentFormMMTDateHeader;

    @FindBy(xpath = "//input[@id='MMTDate']")
    public static WebElement gasInRouteAndMeterAssignmentFormMMTDateInput;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public static WebElement gasInRouteAndMeterAssignmentFormMMTDateSelect;


    @FindBy(xpath = "//label[normalize-space()='Plumbing Date']")
    public static WebElement gasInRouteAndMeterAssignmentFormPlumbingDateHeader;

    @FindBy(xpath = "//input[@id='PlumbingDate']")
    public static WebElement gasInRouteAndMeterAssignmentFormPlumbingDateInput;

    @FindBy(xpath = "//td[contains(text(),'15')]")
    public static WebElement gasInRouteAndMeterAssignmentFormPlumbingDateSelect;


    @FindBy(xpath = "//b[normalize-space()='Use VCF?']")
    public static WebElement gasInRouteAndMeterAssignmentFormUseVCFHeader;

    @FindBy(xpath = "//div[@class='icheckbox_square-green']//ins[@class='iCheck-helper']")
    public static WebElement gasInRouteAndMeterAssignmentFormUseVCFCheckboxClick;

    @FindBy(xpath = "//label[normalize-space()='Regulator Pressure']")
    public static WebElement gasInRouteAndMeterAssignmentFormRegulatorPressureHeader;

    @FindBy(xpath = "//select[@id='RegulatorPressureId']")
    public static WebElement gasInRouteAndMeterAssignmentFormRegulatorPressureDropDownClick;

    @FindBy(xpath = "//div[contains(text(),'Customer Basic Details')]")
    public static WebElement gasInRouteAndMeterAssignmentFormCustomerBasicDetailsHeader;

    @FindBy(xpath = "//label[contains(text(),'Full Name/ Organization Name')]")
    public static WebElement gasInRouteAndMeterAssignmentFormFullNameHeader;

    @FindBy(xpath = "//input[@id='FullName']")
    public static WebElement gasInRouteAndMeterAssignmentFormFullNameInput;

    @FindBy(xpath = "//label[contains(text(),'Address')]")
    public static WebElement gasInRouteAndMeterAssignmentFormAddressHeader;

    @FindBy(xpath = "//textarea[@id='Address']")
    public static WebElement gasInRouteAndMeterAssignmentFormAddressInput;

    @FindBy(xpath = "//label[contains(text(),'City')]")
    public static WebElement gasInRouteAndMeterAssignmentFormCityHeader;

    @FindBy(xpath = "//input[@id='City']")
    public static WebElement gasInRouteAndMeterAssignmentFormCityInput;

    @FindBy(xpath = "//label[contains(text(),'Area')]")
    public static WebElement gasInRouteAndMeterAssignmentFormAreaHeader;

    @FindBy(xpath = "//input[@id='Area']")
    public static WebElement gasInRouteAndMeterAssignmentFormAreaInput;

    @FindBy(xpath = "//label[contains(text(),'Pin Code')]")
    public static WebElement gasInRouteAndMeterAssignmentFormPinCodeHeader;

    @FindBy(xpath = "//input[@id='PinCode']")
    public static WebElement gasInRouteAndMeterAssignmentFormPinCodeInput;

    @FindBy(xpath = "//label[contains(text(),'Phone')]")
    public static WebElement gasInRouteAndMeterAssignmentFormPhoneNumberHeader;

    @FindBy(xpath = "//input[@id='PhoneNumber']")
    public static WebElement gasInRouteAndMeterAssignmentFormPhoneNumberInput;

    @FindBy(xpath = "//label[normalize-space()='Mobile']")
    public static WebElement gasInRouteAndMeterAssignmentFormMobileNumberHeader;

    @FindBy(xpath = "//input[@id='MobileNumber']")
    public static WebElement gasInRouteAndMeterAssignmentFormMobileNumberInput;

    @FindBy(xpath = "//label[normalize-space()='Email ID']")
    public static WebElement gasInRouteAndMeterAssignmentFormEmailIdHeader;

    @FindBy(xpath = "//input[@id='EmailId']")
    public static WebElement gasInRouteAndMeterAssignmentFormEmailIdInput;

    @FindBy(xpath = "//label[contains(text(),'Discount')]")
    public static WebElement gasInRouteAndMeterAssignmentFormDiscountHeader;

    @FindBy(xpath = "//input[@id='Discount']")
    public static WebElement gasInRouteAndMeterAssignmentFormDiscountInput;

    @FindBy(xpath = "//label[contains(text(),'Meter No')]")
    public static WebElement gasInRouteAndMeterAssignmentFormMeterNumberHeader;

    @FindBy(xpath = "//input[@id='MeterNumber']")
    public static WebElement gasInRouteAndMeterAssignmentFormMeterNumberInput;

    @FindBy(xpath = "//label[contains(text(),'Opening Reading')]")
    public static WebElement gasInRouteAndMeterAssignmentFormOpeningReadingHeader;

    @FindBy(xpath = "//input[@id='OpeningReading']")
    public static WebElement gasInRouteAndMeterAssignmentFormOpeningReadingInput;

    @FindBy(xpath = "//label[contains(text(),'Extra Pipe Charges')]")
    public static WebElement gasInRouteAndMeterAssignmentFormEstimateAmountHeader;

    @FindBy(xpath = "//input[@id='EstimateAmount']")
    public static WebElement gasInRouteAndMeterAssignmentFormEstimateAmountInput;

    @FindBy(xpath = "//div[contains(text(),'Inward Receipt')]")
    public static WebElement gasInRouteAndMeterAssignmentFormInwardReceiptHeader;

    @FindBy(xpath = "//label[contains(text(),'Receipt No.')]")
    public static WebElement gasInRouteAndMeterAssignmentFormReceiptNoHeader;

    @FindBy(xpath = "//input[@id='txtChallanNo']")
    public static WebElement gasInRouteAndMeterAssignmentFormReceiptNoInput;


    // ------------------------ Add Btm for the Receipt -------------------------------

    @FindBy(xpath = "//button[@id='btnAddChallan']")
    public static WebElement gasInRouteAndMeterAssignmentFormAddReceiptBtn;

    @FindBy(xpath = "//a[contains(text(),'Clear')]")
    public static WebElement gasInRouteAndMeterAssignmentFormClearBtn;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public static WebElement gasInRouteAndMeterAssignmentFormAddSaveBtn;


//    @FindBy(xpath = "//input[@id='OpeningReading']")
//    public static WebElement gasInRouteAndMeterAssignmentFormOpeningReadingInput;

    public void addingSwitchDataOfNewCustomerAdded() throws InterruptedException {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = Xls_Reader.getRowCount("Commercial");

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            Thread.sleep(3000);
            //  Fetching Data in the Loop

            String ConsumerNo = Xls_Reader.getCellData("Commercial", "Consumer Number", rowNum);

            String WardNo = Xls_Reader.getCellData("Commercial", "Ward No", rowNum);

            String RouteCode = Xls_Reader.getCellData("Commercial", "Route Code", rowNum);

            String SwitchOnDate = Xls_Reader.getCellData("Commercial", "Switch On Date", rowNum);

            String MMTDate = Xls_Reader.getCellData("Commercial", "MMT Date", rowNum);

            String PlumbingDate = Xls_Reader.getCellData("Commercial", "Plumbing Date", rowNum);

            String NameOfEstablishment = Xls_Reader.getCellData("Commercial", "Name of Establishment", rowNum);

            String Address = Xls_Reader.getCellData("Commercial", "Address", rowNum);

            String City = Xls_Reader.getCellData("Commercial", "City", rowNum);

            String AreaName = Xls_Reader.getCellData("Commercial", "Area Name", rowNum);

            String Pincode = Xls_Reader.getCellData("Commercial", "Pincode", rowNum);

            String PhoneNo = Xls_Reader.getCellData("Commercial", "Phone No", rowNum);

            String MobileNo = Xls_Reader.getCellData("Commercial", "Mobile No", rowNum);

            String EmailID = Xls_Reader.getCellData("Commercial", "Email ID", rowNum);

            String MeterNo = Xls_Reader.getCellData("Commercial", "Meter No", rowNum);

            String OpeningReading = Xls_Reader.getCellData("Commercial", "Opening Reading", rowNum);

            String AccountType = Xls_Reader.getCellData("Commercial", "Account Type", rowNum);


            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormHeader);

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormConsumerNumberHeader);

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormConsumerNumberInput);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormConsumerNumberInput, ConsumerNo);

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormSearchBtn);
            Thread.sleep(500);
            gasInRouteAndMeterAssignmentFormSearchBtn.click();

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormWardHeader);
            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormWardSelect);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(gasInRouteAndMeterAssignmentFormWardSelect, WardNo);

            Thread.sleep(3000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormRouteCodeHeader);
            gasInRouteAndMeterAssignmentFormRouteCodeHeader.click();
            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormRouteCodeInput);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormRouteCodeInput, RouteCode);
            Thread.sleep(1000);
            TestUtil.useTabElementThroughKeys(gasInRouteAndMeterAssignmentFormRouteCodeInput);

            Thread.sleep(2000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormSerialNoHeader);
            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormSerialNoInput);

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAccountTypeHeader);
            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAccountTypeInput);
            Thread.sleep(500);
            Assert.assertEquals(AccountType, gasInRouteAndMeterAssignmentFormAccountTypeInput.getAttribute("value"), "Account Type Does Not Match");

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormSwitchOnDateHeader);
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormSwitchOnDateInput.click();
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormSwitchOnDateInput, SwitchOnDate);
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormSwitchOnDateSelect.click();
//            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormCustomerBasicDetailsHeader.click();
//            gasInRouteAndMeterAssignmentFormSwitchOnDateInput.click();
//            Thread.sleep(1000);
//            gasInRouteAndMeterAssignmentFormSwitchOnDateSelect.click();
//            Thread.sleep(1000);

            Thread.sleep(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormMMTDateHeader);
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormMMTDateInput.click();
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormMMTDateInput, MMTDate);
//            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormMMTDateSelect.click();
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormCustomerBasicDetailsHeader.click();
//            gasInRouteAndMeterAssignmentFormMMTDateInput.click();
//            Thread.sleep(1000);
//            gasInRouteAndMeterAssignmentFormMMTDateSelect.click();
//            Thread.sleep(1000);

            Thread.sleep(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormPlumbingDateHeader);
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormPlumbingDateInput.click();
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormPlumbingDateInput, PlumbingDate);
//            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormPlumbingDateSelect.click();
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentFormCustomerBasicDetailsHeader.click();
//            gasInRouteAndMeterAssignmentFormPlumbingDateInput.click();
//            Thread.sleep(1000);
//            gasInRouteAndMeterAssignmentFormPlumbingDateSelect.click();
//            Thread.sleep(1000);

            // ---------------------------------- Customer Basic Details ----------------------------------

            Thread.sleep(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormCustomerBasicDetailsHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormFullNameHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormFullNameInput);
            TestUtil.waiting(500);

            System.out.println("++++++++++++++++++++ " + NameOfEstablishment.toUpperCase());

            Assert.assertEquals(NameOfEstablishment.toUpperCase(), gasInRouteAndMeterAssignmentFormFullNameInput.getAttribute("value"), "Organisation Name Does Not Match");


            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAddressHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAddressInput);
            TestUtil.waiting(500);
            Assert.assertEquals(Address.toUpperCase(), gasInRouteAndMeterAssignmentFormAddressInput.getAttribute("value"), "Address Does Not Match");

            TestUtil.waiting(500);
            TestUtil.scrollTo(gasInRouteAndMeterAssignmentFormCityHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormCityHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormCityInput);
            TestUtil.waiting(500);
            Assert.assertEquals(City, gasInRouteAndMeterAssignmentFormCityInput.getAttribute("value"), "City Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAreaHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAreaInput);
            TestUtil.waiting(500);
            Assert.assertEquals(AreaName, gasInRouteAndMeterAssignmentFormAreaInput.getAttribute("value"), "Area  Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormPinCodeHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormPinCodeInput);
            TestUtil.waiting(500);
            Assert.assertEquals(Pincode, gasInRouteAndMeterAssignmentFormPinCodeInput.getAttribute("value"), "PinCode Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormPhoneNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormPhoneNumberInput);
            TestUtil.waiting(500);
            Assert.assertEquals(PhoneNo, gasInRouteAndMeterAssignmentFormPhoneNumberInput.getAttribute("value"), "Phone No Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormMobileNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormMobileNumberInput);
            TestUtil.waiting(500);
            Assert.assertEquals(MobileNo, gasInRouteAndMeterAssignmentFormMobileNumberInput.getAttribute("value"), "Mobile No Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormEmailIdHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormEmailIdInput);
            TestUtil.waiting(500);
            Assert.assertEquals(EmailID.toUpperCase(), gasInRouteAndMeterAssignmentFormEmailIdInput.getAttribute("value"), "Email ID Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormDiscountHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormDiscountInput);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormMeterNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormMeterNumberInput);
            TestUtil.waiting(500);
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormMeterNumberInput, MeterNo);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormOpeningReadingHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormOpeningReadingInput);
            gasInRouteAndMeterAssignmentFormOpeningReadingInput.clear();
            TestUtil.waiting(1000);
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterAssignmentFormOpeningReadingInput, OpeningReading);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormClearBtn);
            TestUtil.waiting(500);
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentFormAddSaveBtn);
            TestUtil.waiting(1000);
            gasInRouteAndMeterAssignmentFormAddSaveBtn.click();
            TestUtil.waiting(5000);


        }


    }


}
