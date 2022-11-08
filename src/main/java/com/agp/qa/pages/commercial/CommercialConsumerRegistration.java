package com.agp.qa.pages.commercial;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommercialConsumerRegistration extends TestBase {

    // Initializing the PageObject

    public CommercialConsumerRegistration() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h2[contains(text(),'Consumer Registration')]")
    public static WebElement comConsumerRegistrationMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Enter Application No:')]")
    public static WebElement comConsumerRegistrationEnterApplicationNoHeader;

    @FindBy(xpath = "//input[@id='AppNo']")
    public static WebElement comConsumerRegistrationEnterApplicationNoInput;

    @FindBy(xpath = "//button[@id='btnSearchCustomer']")
    public static WebElement comConsumerRegistrationApplicationNoSearchBtn;


    @FindBy(xpath = "//b[contains(text(),'(A) & (B) OFFICE USE ONLY AND CUSTOMER DETAILS')]")
    public static WebElement comConsumerRegistrationA_BFormHeader;

    @FindBy(xpath = "//b[normalize-space()='(C) CONSENT / DECLARATION']")
    public static WebElement comConsumerRegistrationCFormHeader;

    @FindBy(xpath = "//b[normalize-space()='(D) FOR VERIFICATION']")
    public static WebElement comConsumerRegistrationDFormHeader;

    @FindBy(xpath = "//b[contains(text(),'(E) REGISTRATION CHARGES')]")
    public static WebElement comConsumerRegistrationEFormHeader;


    // ------------------- Account Type --------------------------

    @FindBy(xpath = "//label[contains(text(),'Account Type')]")
    public static WebElement comConsumerRegistrationAccountTypeHeader;

    @FindBy(xpath = "//select[@id='AccountTypeId']")
    public static WebElement comConsumerRegistrationAccountTypeDropDownClick;

    @FindBy(xpath = "//option[contains(text(),'2 - COMMERCIAL')]")
    public static WebElement comConsumerRegistrationAccountTypeSelectCommercial;

    @FindBy(xpath = "//option[contains(text(),'3 - NON-COMMERCIAL')]")
    public static WebElement comConsumerRegistrationAccountTypeSelectNonCommercial;

    @FindBy(xpath = "//option[contains(text(),'4 - NON-DOMESTIC EXEMPTED CATEGORY (NDEC)')]")
    public static WebElement comConsumerRegistrationAccountTypeSelectNonDomesticExemptedCategory;

    @FindBy(xpath = "//label[@id='AccountTypeId-error']")
    public static WebElement comConsumerRegistrationAccountTypeErrorMessage;

    // ------------------- Date --------------------------

    @FindBy(xpath = "//input[@id='TransactionDate']/..//label[contains(text(),'Date')]")
    public static WebElement comConsumerRegistrationDateHeader;

    @FindBy(xpath = "//input[@id='TransactionDate']")
    public static WebElement comConsumerRegistrationDateInput;

    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    public static WebElement comConsumerRegistrationDateSelect;


    @FindBy(xpath = "//label[contains(text(),'Please Enter transaction date')]")
    public static WebElement comConsumerRegistrationDateErrorMessage;

    // ------------------- Name of Establishment --------------------------

    @FindBy(xpath = "//label[normalize-space()='Name of Establishment']")
    public static WebElement comConsumerRegistrationNameHeader;

    @FindBy(xpath = "//input[@id='OrganizationName']")
    public static WebElement comConsumerRegistrationNameInput;

    @FindBy(xpath = "//label[contains(text(),'Please Enter Name of Establishment')]")
    public static WebElement comConsumerRegistrationNameErrorMessage;

    @FindBy(xpath = "//label[contains(text(),'Organization Name is already exist')]")
    public static WebElement comConsumerRegistrationNameExistErrorMessage;

    // ------------------- Legal Entity --------------------------

    @FindBy(xpath = "//select[@id='LegalEntityId']/..//label[1]")
    public static WebElement comConsumerRegistrationLegalEntityHeader;

    @FindBy(xpath = "//select[@id='LegalEntityId']")
    public static WebElement comConsumerRegistrationLegalEntityDropDownClick;

    @FindBy(xpath = "//option[contains(text(),'Company')]")
    public static WebElement comConsumerRegistrationLegalEntitySelectCompany;

    @FindBy(xpath = "//option[contains(text(),'Hsg. Soc')]")
    public static WebElement comConsumerRegistrationLegalEntitySelectHsgSoc;

    @FindBy(xpath = "//option[contains(text(),'Individual')]")
    public static WebElement comConsumerRegistrationLegalEntitySelectIndividual;

    @FindBy(xpath = "//option[contains(text(),'Partnership Firm')]")
    public static WebElement comConsumerRegistrationLegalEntitySelectPartnershipFirm;

    @FindBy(xpath = "//option[contains(text(),'Proprietor')]")
    public static WebElement comConsumerRegistrationLegalEntitySelectProprietor;

    @FindBy(xpath = "//option[contains(text(),'Trust')]")
    public static WebElement comConsumerRegistrationLegalEntitySelectTrust;

    @FindBy(xpath = "//label[@id='LegalEntityId-error']")
    public static WebElement comConsumerRegistrationLegalEntityErrorMessage;

    // ------------------- Date of Incorporation --------------------------

    @FindBy(xpath = "//label[contains(text(),'Date of Incorporation')]")
    public static WebElement comConsumerRegistrationDateIncorporationHeader;

    @FindBy(xpath = "//input[@id='DateOfIncorporation']")
    public static WebElement comConsumerRegistrationDateIncorporationInput;

    @FindBy(xpath = "//tbody/tr[2]/td[3]")
    public static WebElement comConsumerRegistrationDateIncorporationSelect;

    @FindBy(xpath = "//label[@id='DateOfIncorporation-error']")
    public static WebElement comConsumerRegistrationDateIncorporationErrorMessage;

    // ------------------- Name of Authorized Person --------------------------

    @FindBy(xpath = "//input[@id='OwnerName']/..//label[1]")
    public static WebElement comConsumerRegistrationNameAuthorizedPersonHeader;

    @FindBy(xpath = "//input[@id='OwnerName']")
    public static WebElement comConsumerRegistrationNameAuthorizedPersonInput;

    @FindBy(xpath = "//label[@id='OwnerName-error']")
    public static WebElement comConsumerRegistrationNameAuthorizedPersonErrorMessage;

    // ------------------- Phone Number --------------------------

    @FindBy(xpath = "//label[normalize-space()='Phone No']")
    public static WebElement comConsumerRegistrationPhoneNumberHeader;

    @FindBy(xpath = "//input[@id='PhoneNumber']")
    public static WebElement comConsumerRegistrationPhoneNumberInput;

    // ------------------- Mobile Number --------------------------

    @FindBy(xpath = "//input[@id='MobileNumber']/..//label[1]")
    public static WebElement comConsumerRegistrationMobileNumberHeader;

    @FindBy(xpath = "//input[@id='MobileNumber']")
    public static WebElement comConsumerRegistrationMobileNumberInput;

    @FindBy(xpath = "//label[@id='MobileNumber-error']")
    public static WebElement comConsumerRegistrationMobileNumberErrorMessage;

    // ------------------- Email ID --------------------------

    @FindBy(xpath = "//label[normalize-space()='Email ID']")
    public static WebElement comConsumerRegistrationEmailHeader;

    @FindBy(xpath = "//input[@id='EmailId']")
    public static WebElement comConsumerRegistrationEmailInput;

    @FindBy(xpath = "//label[@id='EmailId-error']")
    public static WebElement comConsumerRegistrationEmailErrorMessage;

    // ------------------- Address  --------------------------

    @FindBy(xpath = "//textarea[@id='Address']/..//label[1]")
    public static WebElement comConsumerRegistrationAddressHeader;

    @FindBy(xpath = "//textarea[@id='Address']")
    public static WebElement comConsumerRegistrationAddressInput;

    @FindBy(xpath = "//label[@id='Address-error']")
    public static WebElement comConsumerRegistrationAddressErrorMessage;

    // ------------------- City --------------------------

    @FindBy(xpath = "//select[@id='CityId']/..//label[1]")
    public static WebElement comConsumerRegistrationCityHeader;

    @FindBy(xpath = "//select[@id='CityId']")
    public static WebElement comConsumerRegistrationCityDropDownClick;

    @FindBy(xpath = "//option[contains(text(),'Akthali Village')]")
    public static WebElement comConsumerRegistrationCitySelectAkthaliVillage;

    @FindBy(xpath = "//option[contains(text(),'Alakhdara Village')]")
    public static WebElement comConsumerRegistrationCitySelectAlakhdaraVillage;

    @FindBy(xpath = "//option[contains(text(),'Ariya Village')]")
    public static WebElement comConsumerRegistrationCitySelectAriyaVillage;

    @FindBy(xpath = "//option[contains(text(),'Arana Jharana Village')]")
    public static WebElement comConsumerRegistrationCitySelectAranaJharanaVillage;

    @FindBy(xpath = "//option[contains(text(),'Asanda Village')]")
    public static WebElement comConsumerRegistrationCitySelectAsandaVillage;

    @FindBy(xpath = "//label[@id='CityId-error']")
    public static WebElement comConsumerRegistrationCityErrorMessage;

    // ------------------- Area Name --------------------------

    @FindBy(xpath = "//select[@id='AreaIdSelect']/..//label[1]")
    public static WebElement comConsumerRegistrationAreaNameHeader;

    @FindBy(xpath = "//select[@id='AreaIdSelect']")
    public static WebElement comConsumerRegistrationAreaNameDropDownClick;

    @FindBy(xpath = "//option[normalize-space()='Akthali']")
    public static WebElement comConsumerRegistrationAreaNameSelectAkthali;

    @FindBy(xpath = "//option[normalize-space()='Alakhdara']")
    public static WebElement comConsumerRegistrationAreaNameSelectAlakhdara;

    @FindBy(xpath = "//option[normalize-space()='Ariya']")
    public static WebElement comConsumerRegistrationAreaNameSelectAriya;

    @FindBy(xpath = "//option[normalize-space()='Arana Jharana']")
    public static WebElement comConsumerRegistrationAreaNameSelectAranaJharana;

    @FindBy(xpath = "//option[normalize-space()='Asanda']")
    public static WebElement comConsumerRegistrationAreaNameSelectAsanda;

    @FindBy(xpath = "//label[@id='AreaIdSelect-error']")
    public static WebElement comConsumerRegistrationAreaNameErrorMessage;

    // ------------------- Pincode --------------------------

    @FindBy(xpath = "//select[@id='PinCodeSelect']/..//label[1]")
    public static WebElement comConsumerRegistrationPincodeHeader;

    @FindBy(xpath = "//select[@id='PinCodeSelect']")
    public static WebElement comConsumerRegistrationPincodeDropDownClick;

    @FindBy(xpath = "//option[contains(text(),'342027')]")
    public static WebElement comConsumerRegistrationPincodeSelectAkthali;

    @FindBy(xpath = "//option[contains(text(),'342001')]")
    public static WebElement comConsumerRegistrationPincodeSelectAlakhdara;

    @FindBy(xpath = "//option[contains(text(),'342023')]")
    public static WebElement comConsumerRegistrationPincodeSelectAriya;

    @FindBy(xpath = "//option[contains(text(),'342001')]")
    public static WebElement comConsumerRegistrationPincodeSelectAranaJharana;

    @FindBy(xpath = "//option[contains(text(),'342027')]")
    public static WebElement comConsumerRegistrationPincodeSelectAsanda;

    @FindBy(xpath = "//label[@id='PinCodeSelect-error']")
    public static WebElement comConsumerRegistrationPincodeErrorMessage;

    // ------------------- Type of Establishment --------------------------

    @FindBy(xpath = "//select[@id='OrganizationId']/..//label[1]")
    public static WebElement comConsumerRegistrationNameTypeHeader;

    @FindBy(xpath = "//select[@id='OrganizationId']")
    public static WebElement comConsumerRegistrationNameTypeDropDownClick;

    @FindBy(xpath = "//option[contains(text(),'College')]")
    public static WebElement comConsumerRegistrationCommercialNameTypeSelectCollege;

    @FindBy(xpath = "//option[contains(text(),'Dairy')]")
    public static WebElement comConsumerRegistrationCommercialNameTypeSelectDairy;

    @FindBy(xpath = "//option[contains(text(),'Multiplex / Cinema')]")
    public static WebElement comConsumerRegistrationCommercialNameTypeSelectMultiplexOrCinema;


    @FindBy(xpath = "//label[@id='OrganizationId-error']")
    public static WebElement comConsumerRegistrationCommercialNameTypeErrorMessage;

    @FindBy(xpath = "//option[contains(text(),'Non-Commercial (Please Specify)')]")
    public static WebElement comConsumerRegistrationNonCommercialNameTypeSelect;

    @FindBy(xpath = "//input[@id='OtherTypeOfOrganization']")
    public static WebElement comConsumerRegistrationNonCommercialNameTypeInputField;

    @FindBy(xpath = "//option[contains(text(),'Government / Municipal Hospital')]")
    public static WebElement comConsumerRegistrationNDECNameTypeSelectGovernmentAndMunicipalHospital;

    @FindBy(xpath = "//option[contains(text(),'Canteens run of Cooperative basis under Cooperative Societies Act')]")
    public static WebElement comConsumerRegistrationNDECNameTypeSelectCanteensCooperativeSocietiesAct;

    // ------------------- Natural Gas in SCM  --------------------------

    @FindBy(xpath = "//input[@id='DailyReguirementOfNaturalGas']/..//label[1]")
    public static WebElement comConsumerRegistrationNGSCMHeader;

    @FindBy(xpath = "//input[@id='DailyReguirementOfNaturalGas']")
    public static WebElement comConsumerRegistrationNGSCMInput;

    @FindBy(xpath = "//label[@id='DailyReguirementOfNaturalGas-error']")
    public static WebElement comConsumerRegistrationNGSCMErrorMessage;

    // ------------------- Applicant's Name  --------------------------

    @FindBy(xpath = "//input[@id='ApplicantName']/..//label[1]")
    public static WebElement comConsumerRegistrationApplicantNameHeader;

    @FindBy(xpath = "//input[@id='ApplicantName']")
    public static WebElement comConsumerRegistrationApplicantNameInput;

    // ------------------- Authorized Person Phone No  --------------------------

    @FindBy(xpath = "//label[normalize-space()='Authorized Person Phone No']")
    public static WebElement comConsumerRegistrationApplicantPhoneNoHeader;

    @FindBy(xpath = "//input[@id='APPhoneNumber']")
    public static WebElement comConsumerRegistrationApplicantPhoneNoInput;


    // ------------------- Place  --------------------------

    @FindBy(xpath = "//label[normalize-space()='Place']")
    public static WebElement comConsumerRegistrationPlaceHeader;

    @FindBy(xpath = "//input[@id='Place']")
    public static WebElement comConsumerRegistrationPlaceInput;


    // ------------------- Proof of Ownership Select  --------------------------

    @FindBy(xpath = "//label[contains(text(),'Proof of Ownership for the premise, as applicable ')]")
    public static WebElement comConsumerRegistrationProofOwnershipHeader;

    @FindBy(xpath = "//label[normalize-space()='Original of latest Electricity Bill']")
    public static WebElement comConsumerRegistrationProofOwnershipOriginalLatestElectricityBillCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Sales Deed']")
    public static WebElement comConsumerRegistrationProofOwnershipSalesDeedCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Gumasta Dhara license/ Food License']")
    public static WebElement comConsumerRegistrationProofOwnershipGumastaDharaCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Copy of GST/CST/VATCertificate']")
    public static WebElement comConsumerRegistrationProofOwnershipGSTCSTVATCertificateCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Tax Bill (Vera Bill etc.)']")
    public static WebElement comConsumerRegistrationProofOwnershipTaxBillCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Original of latest Telephone Bill']")
    public static WebElement comConsumerRegistrationProofOwnershipOriginalOfLatestTelephoneBillCheckboxSelect;



    // ------------------- Proof of Identification for authorized representative  --------------------------

    @FindBy(xpath = "//label[contains(text(),'Proof of Identification for authorized representative')]")
    public static WebElement comConsumerRegistrationProofIdentificationHeader;

    @FindBy(xpath = "//label[normalize-space()='Driving License']")
    public static WebElement comConsumerRegistrationProofIdentificationDrivingLicenseCheckboxSelect;

    @FindBy(xpath = "//div[@id='divPhotoProofList']//div[@class='row']//div[2]//div[1]//label[1]")
    public static WebElement comConsumerRegistrationProofIdentificationPanCardCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Voter’s ID Card']")
    public static WebElement comConsumerRegistrationProofIdentificationGumastaDharaCheckboxSelect;

    @FindBy(xpath = "//label[normalize-space()='Aadhar Card']")
    public static WebElement comConsumerRegistrationProofIdentificationGSTCSTVATCertificateCheckboxSelect;

    @FindBy(xpath = "//input[@id='AadharNo']/..//label[1]")
    public static WebElement comConsumerRegistrationProofIdentificationPanCardHeader;

    @FindBy(xpath = "//input[@id='AadharNo']")
    public static WebElement comConsumerRegistrationProofIdentificationPanCardInput;

    @FindBy(xpath = "//label[contains(text(),'GSTIN / VAT Number')]")
    public static WebElement comConsumerRegistrationProofIdentificationGSTHeader;

    @FindBy(xpath = "//input[@id='GSTIN']")
    public static WebElement comConsumerRegistrationProofIdentificationGSTInput;

    @FindBy(xpath = "//span[contains(text(),'In case of Lease / Leave or license: copy of the l')]")
    public static WebElement comConsumerRegistrationProofIdentificationLeaseHeader;

    @FindBy(xpath = "//span[contains(text(),'In case of Lease / Leave or license: copy of the l')]/..//div[@class='icheckbox_square-green']")
    public static WebElement comConsumerRegistrationProofIdentificationLeaseCheckbox;


    // ------------------- Form E  --------------------------

    @FindBy(xpath = "//input[@id='AdminstrativeCharges']/..//label[1]")
    public static WebElement comConsumerRegistrationAdminstrativeChargesHeader;

    @FindBy(xpath = "//input[@id='AdminstrativeCharges']")
    public static WebElement comConsumerRegistrationAdminstrativeChargesInput;

    @FindBy(xpath = "//label[normalize-space()='Consumption SD:']")
    public static WebElement comConsumerRegistrationConsumptionSDHeader;

    @FindBy(xpath = "//input[@id='ConsuptionSD']")
    public static WebElement comConsumerRegistrationConsumptionSDInput;

    @FindBy(xpath = "//label[normalize-space()='Equipment SD:']")
    public static WebElement comConsumerRegistrationEquipmentSDHeader;

    @FindBy(xpath = "//input[@id='ConnectiionSd']")
    public static WebElement comConsumerRegistrationEquipmentSDInput;

    // ------------------- Save & Cancel Btn --------------------------

    @FindBy(xpath = "//input[@id='btnsaveConsumer']")
    public static WebElement comConsumerRegistrationSaveBtn;

    @FindBy(xpath = "//input[@value='Cancel']")
    public static WebElement comConsumerRegistrationCancelBtn;

    @FindBy(xpath = "//h2[normalize-space()='Success!!']")
    public static WebElement comConsumerRegistrationSuccessMessage;

    @FindBy(xpath = "//h2[normalize-space()='Success!!']/..//p[@style='display: block;']")
    public static WebElement comConsumerRegistrationFinalApplicationNumber;

    @FindBy(xpath = "//button[@class='confirm']")
    public static WebElement comConsumerRegistrationSuccessConfirmBtn;


//    Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir") + "\\src\\main\\java\\com\\excel\\qa\\testdata\\TestData.xlsx");


    public void fetchDataFromExcelForNewCommercialRegistration() throws InterruptedException {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

//        String AccountTypeSelect = reader.getCellData("Commercial","Account Type Select",2);
//        System.out.println(AccountTypeSelect);

//        String Date = reader.getCellData("Commercial","Date",2);
//        System.out.println(Date);

        int rowCount = reader.getRowCount("Commercial");
//        System.out.println(rowCount);

        if (!reader.addColumn("Commercial", "Application No")) {
            reader.addColumn("Commercial", "Application No");
        }

        String uploadApplicationNo = null;
        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            Thread.sleep(5000);
            //  Fetching Data in the Loop
            String AccountTypeSelect = reader.getCellData("Commercial", "Account Type Select", rowNum);


            String Date = reader.getCellData("Commercial", "Date", rowNum);


            String NameOfEstablishment = reader.getCellData("Commercial", "Name of Establishment", rowNum);


            String LegalEntitySelect = reader.getCellData("Commercial", "Legal Entity Select", rowNum);


            String DateOfIncorporation = reader.getCellData("Commercial", "Date of Incorporation", rowNum);


            String NameOfAuthorizedPerson = reader.getCellData("Commercial", "Name of Authorized Person", rowNum);


            String PhoneNo = reader.getCellData("Commercial", "Phone No", rowNum);


            String MobileNo = reader.getCellData("Commercial", "Mobile No", rowNum);


            String EmailID = reader.getCellData("Commercial", "Email ID", rowNum);


            String Address = reader.getCellData("Commercial", "Address", rowNum);


            String City = reader.getCellData("Commercial", "City", rowNum);


            String AreaName = reader.getCellData("Commercial", "Area Name", rowNum);


            String Pincode = reader.getCellData("Commercial", "Pincode", rowNum);


            String TypeOfEstablishment = reader.getCellData("Commercial", "Type of Establishment", rowNum);


            String ApproxNaturalGasInSCM = reader.getCellData("Commercial", "Approx Natural Gas in SCM", rowNum);


            String ApplicantsName = reader.getCellData("Commercial", "Applicant's Name", rowNum);


            String AuthorizedPersonPhoneNo = reader.getCellData("Commercial", "Authorized Person Phone No", rowNum);


            String Place = reader.getCellData("Commercial", "Place", rowNum);


            String ProofOfOwnership = reader.getCellData("Commercial", "Proof of Ownership", rowNum);


            String ProofOfIdentification = reader.getCellData("Commercial", "Proof of Identification", rowNum);


            String PanCardNumber = reader.getCellData("Commercial", "Pan Card Number", rowNum);


            String GSTINVATNumber = reader.getCellData("Commercial", "GSTIN / VAT Number", rowNum);


            String AdministrativeChargesInclusiveTax = reader.getCellData("Commercial", "Administrative Charges (Inclusive Tax)", rowNum);


            String ConsumptionSD = reader.getCellData("Commercial", "Consumption SD", rowNum);


            String EquipmentSD = reader.getCellData("Commercial", "Equipment SD", rowNum);


//                comConsumerRegistrationAccountTypeDropDownClick.click();
//                comConsumerRegistrationAccountTypeSelectCommercial.click();
//                System.out.println(AccountTypeSelect);

            TestUtil.highlightElement(comConsumerRegistrationMainHeader);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationA_BFormHeader);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationAccountTypeHeader);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(comConsumerRegistrationAccountTypeDropDownClick, AccountTypeSelect);
            Thread.sleep(2000);

            TestUtil.highlightElement(comConsumerRegistrationDateHeader);
            Thread.sleep(500);
            comConsumerRegistrationDateInput.click();
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationDateInput, Date);
            Thread.sleep(500);
            comConsumerRegistrationDateSelect.click();
            Thread.sleep(500);
            comConsumerRegistrationDateInput.click();
            Thread.sleep(500);
            comConsumerRegistrationDateSelect.click();
            Thread.sleep(500);


            TestUtil.highlightElement(comConsumerRegistrationNameHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationNameInput, NameOfEstablishment);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationLegalEntityHeader);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(comConsumerRegistrationLegalEntityDropDownClick, LegalEntitySelect);
            Thread.sleep(500);


            TestUtil.highlightElement(comConsumerRegistrationDateIncorporationHeader);
            Thread.sleep(500);
            comConsumerRegistrationDateIncorporationInput.click();
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationDateIncorporationInput, Date);
            Thread.sleep(500);
            comConsumerRegistrationDateIncorporationSelect.click();
            Thread.sleep(500);
            comConsumerRegistrationDateIncorporationInput.click();
            Thread.sleep(500);
            comConsumerRegistrationDateIncorporationSelect.click();
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationNameAuthorizedPersonHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationNameAuthorizedPersonInput, NameOfAuthorizedPerson);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationPhoneNumberHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationPhoneNumberInput, PhoneNo);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationMobileNumberHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationMobileNumberInput, MobileNo);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationEmailHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationEmailInput, EmailID);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationAddressHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationAddressInput, Address);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationCityHeader);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(comConsumerRegistrationCityDropDownClick, City);
            Thread.sleep(2000);

            TestUtil.highlightElement(comConsumerRegistrationAreaNameHeader);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(comConsumerRegistrationAreaNameDropDownClick, AreaName);
            Thread.sleep(2000);

            TestUtil.highlightElement(comConsumerRegistrationPincodeHeader);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(comConsumerRegistrationPincodeDropDownClick, Pincode);
            Thread.sleep(2000);

            TestUtil.highlightElement(comConsumerRegistrationNameTypeHeader);
            Thread.sleep(500);
            TestUtil.selectMethodExcelString(comConsumerRegistrationNameTypeDropDownClick, TypeOfEstablishment);
            String NonCommercialNameType = comConsumerRegistrationNameTypeDropDownClick.getText();
            System.out.println(comConsumerRegistrationNameTypeDropDownClick.getText());
            Thread.sleep(1000);
            if (NonCommercialNameType.equals("--Select Type of Establishment--\n" +
                    "Non-Commercial (Please Specify)")) {
                comConsumerRegistrationNonCommercialNameTypeInputField.sendKeys("Ayngaran Foundation");
            }
            Thread.sleep(2000);

            TestUtil.highlightElement(comConsumerRegistrationNGSCMHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationNGSCMInput, ApproxNaturalGasInSCM);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationCFormHeader);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationApplicantNameHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationApplicantNameInput, ApplicantsName);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationApplicantPhoneNoHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationApplicantPhoneNoInput, AuthorizedPersonPhoneNo);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationPlaceHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationPlaceInput, Place);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationDFormHeader);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationProofOwnershipHeader);
            Thread.sleep(500);
            if (comConsumerRegistrationProofOwnershipOriginalLatestElectricityBillCheckboxSelect.getText().equals(ProofOfOwnership)) {
                comConsumerRegistrationProofOwnershipOriginalLatestElectricityBillCheckboxSelect.click();
            } else if (comConsumerRegistrationProofOwnershipSalesDeedCheckboxSelect.getText().equals(ProofOfOwnership)) {
                comConsumerRegistrationProofOwnershipSalesDeedCheckboxSelect.click();
            } else if (comConsumerRegistrationProofOwnershipGumastaDharaCheckboxSelect.getText().equals(ProofOfOwnership)) {
                comConsumerRegistrationProofOwnershipGumastaDharaCheckboxSelect.click();
            } else if (comConsumerRegistrationProofOwnershipGSTCSTVATCertificateCheckboxSelect.getText().equals(ProofOfOwnership)) {
                comConsumerRegistrationProofOwnershipGSTCSTVATCertificateCheckboxSelect.click();
            } else if (comConsumerRegistrationProofOwnershipTaxBillCheckboxSelect.getText().equals(ProofOfOwnership)) {
                comConsumerRegistrationProofOwnershipTaxBillCheckboxSelect.click();
            }
            comConsumerRegistrationProofOwnershipOriginalOfLatestTelephoneBillCheckboxSelect.click();
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationProofIdentificationHeader);
            Thread.sleep(500);
            if (comConsumerRegistrationProofIdentificationDrivingLicenseCheckboxSelect.getText().equals(ProofOfIdentification)) {
                comConsumerRegistrationProofIdentificationDrivingLicenseCheckboxSelect.click();
//                    if (!comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.isSelected()){
//                    Thread.sleep(1000);
//                        comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.click();
//                    }
            } else if (comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.getText().equals(ProofOfIdentification)) {
                if (!comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.isSelected()) {
                    comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.click();
                }
            } else if (comConsumerRegistrationProofIdentificationGumastaDharaCheckboxSelect.getText().equals(ProofOfIdentification)) {
                comConsumerRegistrationProofIdentificationGumastaDharaCheckboxSelect.click();
//                    if (!comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.isSelected()){
//                    Thread.sleep(1000);
//                        comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.click();
//                    }
            } else if (comConsumerRegistrationProofIdentificationGSTCSTVATCertificateCheckboxSelect.getText().equals(ProofOfIdentification)) {
                comConsumerRegistrationProofIdentificationGSTCSTVATCertificateCheckboxSelect.click();
//                    if (!comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.isSelected()){
//                    Thread.sleep(1000);
//                        comConsumerRegistrationProofIdentificationPanCardCheckboxSelect.click();
//                    }
            }
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationProofIdentificationPanCardHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationProofIdentificationPanCardInput, PanCardNumber);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationProofIdentificationGSTHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationProofIdentificationGSTInput, GSTINVATNumber);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationProofIdentificationLeaseHeader);
            Thread.sleep(500);
            comConsumerRegistrationProofIdentificationLeaseCheckbox.click();
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationEFormHeader);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationAdminstrativeChargesHeader);
            Thread.sleep(500);
            comConsumerRegistrationAdminstrativeChargesInput.clear();
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationAdminstrativeChargesInput, AdministrativeChargesInclusiveTax);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationConsumptionSDHeader);
            Thread.sleep(500);
            comConsumerRegistrationConsumptionSDInput.clear();
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationConsumptionSDInput, ConsumptionSD);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationEquipmentSDHeader);
            Thread.sleep(500);
            comConsumerRegistrationEquipmentSDInput.clear();
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(comConsumerRegistrationEquipmentSDInput, EquipmentSD);
            Thread.sleep(500);

            TestUtil.highlightElement(comConsumerRegistrationCancelBtn);
//                comConsumerRegistrationCancelBtn.click();

            Thread.sleep(1000);
            TestUtil.highlightElement(comConsumerRegistrationSaveBtn);

            Thread.sleep(1000);
            comConsumerRegistrationSaveBtn.click();

            Thread.sleep(2000);
            TestUtil.highlightElement(comConsumerRegistrationSuccessMessage);
            Thread.sleep(1000);

            // Splitting the String and Capturing the Application No From the String -> Using Split method

//            TestUtil.highlightElement(comConsumerRegistrationFinalApplicationNumber); // Showing error
//            Thread.sleep(1000);
            String uiApplicationNo = TestUtil.getTextFromUI(comConsumerRegistrationFinalApplicationNumber);
//            System.out.println("----------------" + uiApplicationNo);
            String[] output = uiApplicationNo.split(": ");
            String finalApplicationNo = output[1];
            uploadApplicationNo = finalApplicationNo;
//            System.out.println("+++++++++++++++ " + finalApplicationNo);


            for (int statusRowDataAdd = rowNum; statusRowDataAdd <= rowCount; statusRowDataAdd ++) {
                System.out.println(rowCount);

                Thread.sleep(1000);
                //  Fetching Data in the Loop

                String.valueOf(reader.setCellData("Commercial","Application No",statusRowDataAdd,uploadApplicationNo));

            }

            Thread.sleep(1000);
            TestUtil.highlightElement(comConsumerRegistrationSuccessConfirmBtn);
            Thread.sleep(1000);
            comConsumerRegistrationSuccessConfirmBtn.click();
            Thread.sleep(2000);

        }

    }


}
