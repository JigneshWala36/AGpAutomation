package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.commercial.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardCommercialNewConnection extends TestBase {

    public DashboardCommercialNewConnection() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Consumer Registration']")
    public static WebElement commercialConsumerRegistration;

    @FindBy(xpath = "//a[normalize-space()='Create Bulk DocumentPDF']")
    public static WebElement commercialCreateBulkDocumentPDF;

    @FindBy(xpath = "//a[normalize-space()='Upload Registration Form & Document']")
    public static WebElement commercialUploadRegistrationFormDocument;

    @FindBy(xpath = "//a[contains(text(),'Consumer Registration Receipt')]")
    public static WebElement commercialConsumerRegistrationReceipt;


    @FindBy(xpath = "//a[normalize-space()='Registration Receipt Pending Cheque']")
    public static WebElement commercialRegistrationReceiptPendingCheque;

    @FindBy(xpath = "//a[normalize-space()='POS Updation']")
    public static WebElement commercialPOSUpdation;

    @FindBy(xpath = "//a[@href='/CustomerAgreementApprovalCommercial']")
    public static WebElement commercialCustomerApplicationApprovalCommercial;




    public void commercialConsumerRegistrationClick() {
        try {
            TestUtil.highlightElement(commercialConsumerRegistration);
            Thread.sleep(1000);
            commercialConsumerRegistration.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialConsumerRegistration();
    }

    public void commercialUploadRegistrationFormDocument() {
        try {
            TestUtil.highlightElement(commercialUploadRegistrationFormDocument);
            Thread.sleep(1000);
            commercialUploadRegistrationFormDocument.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialUploadRegistrationFormDocument();
    }

    public void commercialCreateBulkDocumentPDFClick() {
        try {
            TestUtil.highlightElement(commercialCreateBulkDocumentPDF);
            Thread.sleep(1000);
            commercialCreateBulkDocumentPDF.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialCreateBulkDocumentPDF();
    }



    public void commercialConsumerRegistrationReceiptClick() {
        try {
            TestUtil.highlightElement(commercialConsumerRegistrationReceipt);
            Thread.sleep(1000);
            commercialConsumerRegistrationReceipt.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialConsumerRegistrationReceipt();
    }

    public void commercialRegistrationReceiptPendingChequeClick() {
        try {
            TestUtil.highlightElement(commercialRegistrationReceiptPendingCheque);
            Thread.sleep(1000);
            commercialRegistrationReceiptPendingCheque.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialRegistrationReceiptPendingCheque();
    }

    public void commercialPOSUpdationClick() {
        try {
            TestUtil.highlightElement(commercialPOSUpdation);
            Thread.sleep(1000);
            commercialPOSUpdation.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialPOSUpdation();
    }

    public void commercialCustomerApplicationApprovalCommercialClick() {
        try {
            TestUtil.highlightElement(commercialCustomerApplicationApprovalCommercial);
            Thread.sleep(1000);
            commercialCustomerApplicationApprovalCommercial.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new CommercialConsumerApplicationApproval();
    }


}
