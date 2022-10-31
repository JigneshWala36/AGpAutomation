package com.agp.qa.pages.gasIn;

import com.agp.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//label[normalize-space()='MMT Date']")
    public static WebElement gasInRouteAndMeterAssignmentFormMMTDateHeader;

    @FindBy(xpath = "//input[@id='MMTDate']")
    public static WebElement gasInRouteAndMeterAssignmentFormMMTDateInput;

    @FindBy(xpath = "//label[normalize-space()='Plumbing Date']")
    public static WebElement gasInRouteAndMeterAssignmentFormPlumbingDateHeader;

    @FindBy(xpath = "//input[@id='PlumbingDate']")
    public static WebElement gasInRouteAndMeterAssignmentFormPlumbingDateInput;

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

    @FindBy(xpath = "//label[contains(text(),'House No')]")
    public static WebElement gasInRouteAndMeterAssignmentFormHouseNoHeader;

    @FindBy(xpath = "//input[@id='HouseNo']")
    public static WebElement gasInRouteAndMeterAssignmentFormHouseNoInput;

    @FindBy(xpath = "//label[contains(text(),'Door No')]")
    public static WebElement gasInRouteAndMeterAssignmentFormDoorNoHeader;

    @FindBy(xpath = "//input[@id='DoorNo']")
    public static WebElement gasInRouteAndMeterAssignmentFormDoorNoInput;

    @FindBy(xpath = "//label[contains(text(),'City')]")
    public static WebElement gasInRouteAndMeterAssignmentFormCityHeader;

    @FindBy(xpath = "//input[@id='City']")
    public static WebElement gasInRouteAndMeterAssignmentFormCityInput;

    @FindBy(xpath = "//label[contains(text(),'Floor No')]")
    public static WebElement gasInRouteAndMeterAssignmentFormFloorNoHeader;

    @FindBy(xpath = "//input[@id='FloorNo']")
    public static WebElement gasInRouteAndMeterAssignmentFormFloorNoInput;

    @FindBy(xpath = "//label[contains(text(),'Society')]")
    public static WebElement gasInRouteAndMeterAssignmentFormSocietyHeader;

    @FindBy(xpath = "//input[@id='Society']")
    public static WebElement gasInRouteAndMeterAssignmentFormSocietyInput;

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

    @FindBy(xpath = "//label[normalize-space()='Kitchen Point']")
    public static WebElement gasInRouteAndMeterAssignmentFormKitchenPointHeader;

    @FindBy(xpath = "//div[@id='KitchenPointdiv']//input[@id='KitchenPoint']")
    public static WebElement gasInRouteAndMeterAssignmentFormKitchenPointInput;

    @FindBy(xpath = "//label[normalize-space()='Geyser Points']")
    public static WebElement gasInRouteAndMeterAssignmentFormGeyserPointsHeader;

    @FindBy(xpath = "//label[contains(text(),'Geyser Points')]/..//input[@id='GeyserPoints' and @readonly='readonly']")
    public static WebElement gasInRouteAndMeterAssignmentFormGeyserPointsInput;

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

//    @FindBy(xpath = "//input[@id='OpeningReading']")
//    public static WebElement gasInRouteAndMeterAssignmentFormOpeningReadingInput;
























}
