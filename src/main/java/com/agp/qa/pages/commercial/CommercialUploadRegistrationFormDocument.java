package com.agp.qa.pages.commercial;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommercialUploadRegistrationFormDocument extends TestBase {


    public CommercialUploadRegistrationFormDocument() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h2[normalize-space()='Upload Registration Form & Document']")
    public static WebElement comUploadRegistrationFormDocumentMainHeader;

    @FindBy(xpath = "//label[normalize-space()='Application No']")
    public static WebElement comUploadRegistrationFormDocumentApplicationNoHeader;

    @FindBy(xpath = "//div[@id='dvApplication']//div[@class='form-group']//input[1]")
    public static WebElement comUploadRegistrationFormDocumentApplicationNoInput;

    @FindBy(xpath = "//button[@id='btnappSearch']")
    public static WebElement comUploadRegistrationFormDocumentSearchBtn;

    //-------------------------Customer Basic Details--------------------------

    @FindBy(xpath = "//div[contains(text(),'Customer Basic Details')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerBasicDetailsHeader;

    @FindBy(xpath = "//label[contains(text(),'Full Name / Organisation Name')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerFullNameOrganisationNameHeader;

    @FindBy(xpath = "//input[@id='FullName']")
    public static WebElement comUploadRegistrationFormDocumentCustomerFullNameOrganisationNameInput;

    @FindBy(xpath = "//label[contains(text(),'Address')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerAddressHeader;

    @FindBy(xpath = "//textarea[@id='Address']")
    public static WebElement comUploadRegistrationFormDocumentCustomerAddressInput;

    @FindBy(xpath = "//label[contains(text(),'City')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerCityHeader;

    @FindBy(xpath = "//input[@id='City']")
    public static WebElement comUploadRegistrationFormDocumentCustomerCityInput;

    @FindBy(xpath = "//label[contains(text(),'Pin Code')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerPinCodeHeader;

    @FindBy(xpath = "//input[@id='PinCode']")
    public static WebElement comUploadRegistrationFormDocumentCustomerPinCodeInput;

    @FindBy(xpath = "//label[contains(text(),'Phone / Alternate Mobile number')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerPhoneAlternateMobileNumberHeader;

    @FindBy(xpath = "//input[@id='PhoneNumber']")
    public static WebElement comUploadRegistrationFormDocumentCustomerPhoneAlternateMobileNumberInput;

    @FindBy(xpath = "//label[normalize-space()='Mobile']")
    public static WebElement comUploadRegistrationFormDocumentCustomerMobileHeader;

    @FindBy(xpath = "//input[@id='MobileNumber']")
    public static WebElement comUploadRegistrationFormDocumentCustomerMobileInput;

    @FindBy(xpath = "//label[normalize-space()='Email ID']")
    public static WebElement comUploadRegistrationFormDocumentCustomerEmailIdHeader;

    @FindBy(xpath = "//input[@id='EmailId']")
    public static WebElement comUploadRegistrationFormDocumentCustomerEmailIdInput;

    @FindBy(xpath = "//label[contains(text(),'Upload Registration Form')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerUploadRegistrationFormHeader;

    @FindBy(xpath = "//input[@id='UploadedFile']")
    public static WebElement comUploadRegistrationFormDocumentCustomerUploadRegistrationFormInput;

    @FindBy(xpath = "//label[contains(text(),'Upload Supporting Document')]")
    public static WebElement comUploadRegistrationFormDocumentCustomerUploadSupportingDocumentHeader;

    @FindBy(xpath = "//input[@id='UploadedFile1']")
    public static WebElement comUploadRegistrationFormDocumentCustomerUploadSupportingDocumentInput;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public static WebElement comUploadRegistrationFormDocumentSaveBtn;

    @FindBy(xpath = "//button[@id='btnClear']")
    public static WebElement comUploadRegistrationFormDocumentClearBtn;


    public void uploadRegistrationFormDocumentAddAndVerifyData() {

        TestUtil.waiting(1000);
        TestUtil.highlightElement(comUploadRegistrationFormDocumentMainHeader);

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = reader.getRowCount("Commercial");

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {


            String Application_No = reader.getCellData("Commercial", "Application No", rowNum);

            String NameOfEstablishment = reader.getCellData("Commercial", "Name of Establishment", rowNum);

            String Address = reader.getCellData("Commercial", "Address", rowNum);

            String City = reader.getCellData("Commercial", "City", rowNum);

            String Pincode = reader.getCellData("Commercial", "Pincode", rowNum);

            String PhoneNo = reader.getCellData("Commercial", "Phone No", rowNum);

            String MobileNo = reader.getCellData("Commercial", "Mobile No", rowNum);

            String EmailID = reader.getCellData("Commercial", "Email ID", rowNum);

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentApplicationNoHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentApplicationNoInput);
            TestUtil.sendKeyNormalExcel(comUploadRegistrationFormDocumentApplicationNoInput, Application_No);

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentSearchBtn);
            TestUtil.waiting(500);
            comUploadRegistrationFormDocumentSearchBtn.click();

            TestUtil.waiting(1500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerBasicDetailsHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerFullNameOrganisationNameHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerFullNameOrganisationNameInput);
            TestUtil.waiting(500);

            System.out.println("++++++++++++++++++++ "+ NameOfEstablishment.toUpperCase());

            Assert.assertEquals(NameOfEstablishment.toUpperCase(), comUploadRegistrationFormDocumentCustomerFullNameOrganisationNameInput.getAttribute("value"), "Organisation Name Does Not Match");


            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerAddressHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerAddressInput);
            TestUtil.waiting(500);
            Assert.assertEquals(Address.toUpperCase(), comUploadRegistrationFormDocumentCustomerAddressInput.getAttribute("value"), "Address Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerCityHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerCityInput);
            TestUtil.waiting(500);
            Assert.assertEquals(City, comUploadRegistrationFormDocumentCustomerCityInput.getAttribute("value"), "City Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerPinCodeHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerPinCodeInput);
            TestUtil.waiting(500);
            Assert.assertEquals(Pincode, comUploadRegistrationFormDocumentCustomerPinCodeInput.getAttribute("value"), "PinCode Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerPhoneAlternateMobileNumberHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerPhoneAlternateMobileNumberInput);
            TestUtil.waiting(500);
            Assert.assertEquals(PhoneNo, comUploadRegistrationFormDocumentCustomerPhoneAlternateMobileNumberInput.getAttribute("value"), "Phone No Does Not Match");

            TestUtil.waiting(500);
            TestUtil.scrollTo(comUploadRegistrationFormDocumentCustomerMobileHeader);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerMobileHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerMobileInput);
            TestUtil.waiting(500);
            Assert.assertEquals(MobileNo, comUploadRegistrationFormDocumentCustomerMobileInput.getAttribute("value"), "Mobile No Does Not Match");

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerEmailIdHeader);
            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerEmailIdInput);
            TestUtil.waiting(500);
            Assert.assertEquals(EmailID.toUpperCase(), comUploadRegistrationFormDocumentCustomerEmailIdInput.getAttribute("value"), "Email ID Does Not Match");

            TestUtil.waiting(500);
            TestUtil.scrollTo(comUploadRegistrationFormDocumentCustomerUploadRegistrationFormHeader);

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerUploadRegistrationFormHeader);
            TestUtil.waiting(500);
            comUploadRegistrationFormDocumentCustomerUploadRegistrationFormInput.sendKeys((System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\testdata\\Google.png"));

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentCustomerUploadSupportingDocumentHeader);
            TestUtil.waiting(500);
            comUploadRegistrationFormDocumentCustomerUploadSupportingDocumentInput.sendKeys((System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\testdata\\Google1.png"));

            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentClearBtn);


            TestUtil.waiting(500);
            TestUtil.highlightElement(comUploadRegistrationFormDocumentSaveBtn);
            TestUtil.waiting(500);
            comUploadRegistrationFormDocumentSaveBtn.click();
            TestUtil.waiting(1000);

        }


    }
}
