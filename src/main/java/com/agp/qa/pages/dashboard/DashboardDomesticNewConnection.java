package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.domestic.DomesticConsumerAgreementPrintPage;
import com.agp.qa.pages.domestic.DomesticCustomerAgreementApprovalPage;
import com.agp.qa.pages.domestic.DomesticCustomerDetailUpdationPage;
import com.agp.qa.pages.domestic.DomesticUploadRegistrationFormAndDocumentsPage;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardDomesticNewConnection extends TestBase {

    public DashboardDomesticNewConnection() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Consumer Agreement Print']")
    public static WebElement domesticConsumerAgreementPrint;

    @FindBy(xpath = "//a[normalize-space()='Upload Registration Form & Documents']")
    public static WebElement domesticUploadRegistrationFormAndDocuments;

    @FindBy(xpath = "//a[@href='/CustomerAgreementApproval']")
    public static WebElement domesticCustomerAgreementApproval;

    @FindBy(xpath = "//a[normalize-space()='Domestic Customer Detail Updation']")
    public static WebElement domesticCustomerDetailUpdation;

    public void domesticConsumerAgreementPrintClick() {
        try {
            TestUtil.highlightElement(domesticConsumerAgreementPrint);
            Thread.sleep(1000);
            domesticConsumerAgreementPrint.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DomesticConsumerAgreementPrintPage();
    }

    public void domesticUploadRegistrationFormAndDocumentsClick() {
        try {
            Thread.sleep(1000);
            TestUtil.highlightElement(domesticUploadRegistrationFormAndDocuments);
            Thread.sleep(2000);
            domesticUploadRegistrationFormAndDocuments.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DomesticUploadRegistrationFormAndDocumentsPage();
    }

    public void domesticCustomerAgreementApprovalClick() {
        try {
            TestUtil.highlightElement(domesticCustomerAgreementApproval);
            Thread.sleep(1000);
            domesticCustomerAgreementApproval.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DomesticCustomerAgreementApprovalPage();
    }

    public void domesticCustomerDetailUpdationClick() {
        try {
            TestUtil.highlightElement(domesticCustomerDetailUpdation);
            Thread.sleep(2000);
            domesticCustomerDetailUpdation.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DomesticCustomerDetailUpdationPage();
    }


}
