package com.agp.qa.pages.domestic;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.dashboard.DashboardDomesticNewConnection;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DomesticUploadRegistrationFormAndDocumentsPage extends TestBase {

    public DomesticUploadRegistrationFormAndDocumentsPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h2[contains(text(),'Upload Registration Supporting Documents')]")
    public static WebElement domUploadRegistrationSupportingDocumentsMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Application No')]")
    public static WebElement domUploadRegistrationSupportingDocumentsApplicationNoHeader;

    @FindBy(xpath = "//div[@id='dvApplication']//div[@class='form-group']//input[1]")
    public static WebElement domUploadRegistrationSupportingDocumentsApplicationNoInput;

    @FindBy(xpath = "//button[@id='btnappSearch']")
    public static WebElement domUploadRegistrationSupportingDocumentsSearchBtn;

    @FindBy(xpath = "//div[contains(text(),'Customer Basic Details')]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerBasicHeader;

    @FindBy(xpath = "//label[contains(text(),'Full Name / Organisation Name')]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerNameHeader;

    @FindBy(xpath = "//input[@id='FullName']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerNameTextfield;

    @FindBy(xpath = "//label[contains(text(),'Address')]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerAddressHeader;

    @FindBy(xpath = "//textarea[@id='Address']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerAddressTextfield;

    @FindBy(xpath = "//label[contains(text(),'City')]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerCityHeader;

    @FindBy(xpath = "//input[@id='City']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerCityTextfield;

    @FindBy(xpath = "//label[contains(text(),'Pin Code')]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerPinCodeHeader;

    @FindBy(xpath = "//input[@id='PinCode']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerPinCodeTextfield;

    @FindBy(xpath = "//label[contains(text(),'Phone / Alternate Mobile number')]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerPhoneNumberHeader;

    @FindBy(xpath = "//input[@id='PhoneNumber']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerPhoneNumberTextfield;

    @FindBy(xpath = "//label[normalize-space()='Mobile']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerMobileNumberHeader;

    @FindBy(xpath = "//input[@id='MobileNumber']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerMobileNumberTextfield;

    @FindBy(xpath = "//label[normalize-space()='Email ID']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerEmailIdHeader;

    @FindBy(xpath = "//input[@id='EmailId']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerEmailIdTextfield;

//    @FindBy(css = "#UploadedFile1")
    @FindBy(xpath = "//input[@id='UploadedFile1']")
//    @FindBy(xpath = "(//input[@id='UploadedFile1'])[1]")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerUploadBtn;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerSaveBtn;

    @FindBy(xpath = "//button[@id='btnClear']")
    public static WebElement domUploadRegistrationSupportingDocumentsCustomerClearBtn;

    DomesticConsumerAgreementPrintPage domesticConsumerAgreementPrintPage;

    DashboardDomesticNewConnection dashboardDomesticNewConnection;

    String ApplicationNo;

    public void searchApplicationNo() {
        try {
            domesticConsumerAgreementPrintPage = new DomesticConsumerAgreementPrintPage();
            ApplicationNo = domesticConsumerAgreementPrintPage.getApplicationNoFromTheFirstRow();
            Thread.sleep(3000);
            System.out.println(ApplicationNo);
            dashboardDomesticNewConnection = new DashboardDomesticNewConnection();
            dashboardDomesticNewConnection.domesticUploadRegistrationFormAndDocumentsClick();

//            DomesticConsumerAgreementPrintPage domConsumerAgreementPrintPage = new DomesticConsumerAgreementPrintPage();
//            ApplicationNo = domConsumerAgreementPrintPage.getApplicationNoFromTheFirstRow();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterApplicationNoInTheUpload(){
        try {

            TestUtil.waiting(3000);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsMainHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsApplicationNoHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsApplicationNoInput);
            TestUtil.waiting(500);
            domUploadRegistrationSupportingDocumentsApplicationNoInput.sendKeys(ApplicationNo);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsSearchBtn);
            TestUtil.waiting(500);
            TestUtil.click(domUploadRegistrationSupportingDocumentsSearchBtn);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerBasicHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerNameHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerNameTextfield);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerAddressHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerAddressTextfield);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerCityHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerCityTextfield);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerPinCodeHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerPinCodeTextfield);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerPhoneNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerPhoneNumberTextfield);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerMobileNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerMobileNumberTextfield);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerEmailIdHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerEmailIdTextfield);

            TestUtil.waiting(500);
            TestUtil.scrollTo(domUploadRegistrationSupportingDocumentsCustomerSaveBtn);

            TestUtil.waiting(500);
            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerUploadBtn);
            domUploadRegistrationSupportingDocumentsCustomerUploadBtn.sendKeys(System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\testdata\\Google1.png");



//            TestUtil.waiting(1000);
//            TestUtil.highlightElement(domUploadRegistrationSupportingDocumentsCustomerUploadBtn);
//            TestUtil.click(domUploadRegistrationSupportingDocumentsCustomerUploadBtn);
//
////            domUploadRegistrationSupportingDocumentsCustomerUploadBtn.click();
//            TestUtil.waiting(1000);
//            Runtime.getRuntime().exec("D:\\Jignesh\\AutoIT\\SaveScript\\GanpatiFileUpload.exe");





            System.out.println(ApplicationNo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}

