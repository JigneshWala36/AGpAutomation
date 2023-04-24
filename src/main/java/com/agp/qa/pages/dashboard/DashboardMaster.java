package com.agp.qa.pages.dashboard;

import com.agp.qa.x.TestBase;
import com.agp.qa.pages.master.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardMaster extends TestBase {

    public DashboardMaster() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Taxation']")
    public static WebElement masterTaxation;

    @FindBy(xpath = "//a[normalize-space()='Bill Rate Master']")
    public static WebElement masterBillRateMaster;

    @FindBy(xpath = "//a[normalize-space()='GCV Details']")
    public static WebElement masterGCVDetails;

    @FindBy(xpath = "//a[normalize-space()='Unit Rate Master']")
    public static WebElement masterUnitRateMaster;

    @FindBy(xpath = "//a[normalize-space()='Ward Master']")
    public static WebElement masterWardMaster;

    @FindBy(xpath = "//a[normalize-space()='Account Type Master']")
    public static WebElement masterAccountTypeMaster;

    @FindBy(xpath = "//a[normalize-space()='Payment Master']")
    public static WebElement masterPaymentMaster;

    @FindBy(xpath = "//a[normalize-space()='Bank Master']")
    public static WebElement masterBankMaster;

    @FindBy(xpath = "//a[normalize-space()='Document Type Master']")
    public static WebElement masterDocumentTypeMaster;

    @FindBy(xpath = "//a[normalize-space()='Cycle Master']")
    public static WebElement masterCycleMaster;

    @FindBy(xpath = "//a[normalize-space()='Connection Status Master']")
    public static WebElement masterConnectionStatusMaster;

    @FindBy(xpath = "//a[normalize-space()='Registration Rate Master']")
    public static WebElement masterRegistrationRateMaster;

    @FindBy(xpath = "//a[normalize-space()='Misc. Receipt Rate Master']")
    public static WebElement masterMiscReceiptRateMaster;

    @FindBy(xpath = "//a[normalize-space()='Safe Custody Master']")
    public static WebElement masterSafeCustodyMaster;

    @FindBy(xpath = "//a[normalize-space()='Transfer Type Master']")
    public static WebElement masterTransferTypeMaster;

    @FindBy(xpath = "//a[normalize-space()='Route Code Master']")
    public static WebElement masterRouteCodeMaster;

    @FindBy(xpath = "//a[normalize-space()='Rate Master']")
    public static WebElement masterRateMaster;

    @FindBy(xpath = "//a[normalize-space()='Meter Status Master']")
    public static WebElement masterMeterStatusMaster;

    @FindBy(xpath = "//a[normalize-space()='Rate Master Consumer Wise']")
    public static WebElement masterRateMasterConsumerWise;

    @FindBy(xpath = "//a[normalize-space()='Unit Usage Rate Master']")
    public static WebElement masterUnitUsageRateMaster;

    //    @FindBy(xpath = "//a[normalize-space()='Bank Guarantee Detail List']")
    @FindBy(xpath = "//a[normalize-space()='Bank Gurantee Detail List']")
    public static WebElement masterBankGuaranteeDetailList;

    @FindBy(xpath = "//a[normalize-space()='Agreement Content']")
    public static WebElement masterAgreementContent;

    @FindBy(xpath = "//a[normalize-space()='Correction Factor']")
    public static WebElement masterCorrectionFactor;

    @FindBy(xpath = "//a[normalize-space()='Regulator Pressure']")
    public static WebElement masterRegulatorPressure;

    @FindBy(xpath = "//a[normalize-space()='Email/SMS Templete']")
    public static WebElement masterEmailAndSMSTemplete;

    @FindBy(xpath = "//a[normalize-space()='Promotional-Scheme']")
    public static WebElement masterPromotionalScheme;

    public void masterTaxationClick() {
        try {
            TestUtil.highlightElement(masterTaxation);
            Thread.sleep(1000);
            masterTaxation.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterTaxation();
    }

    public void masterBillRateMasterClick() {
        try {
            TestUtil.highlightElement(masterBillRateMaster);
            Thread.sleep(1000);
            masterBillRateMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterBillRateMaster();
    }

    public void masterGCVDetailsClick() {
        try {
            TestUtil.highlightElement(masterGCVDetails);
            Thread.sleep(1000);
            masterGCVDetails.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterGCVDetails();
    }

    public void masterUnitRateMasterClick() {
        try {
            TestUtil.highlightElement(masterUnitRateMaster);
            Thread.sleep(1000);
            masterUnitRateMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterUnitRateMaster();
    }

    public void masterWardMasterClick() {
        try {
            TestUtil.highlightElement(masterWardMaster);
            Thread.sleep(1000);
            masterWardMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterWardMaster();
    }

    public void masterAccountTypeMasterClick() {
        try {
            TestUtil.highlightElement(masterAccountTypeMaster);
            Thread.sleep(1000);
            masterAccountTypeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterAccountTypeMaster();
    }

    public void masterPaymentMasterClick() {
        try {
            TestUtil.highlightElement(masterPaymentMaster);
            Thread.sleep(1000);
            masterPaymentMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterPaymentMaster();
    }

    public void masterBankMasterClick() {
        try {
            TestUtil.highlightElement(masterBankMaster);
            Thread.sleep(1000);
            masterBankMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterBankMaster();
    }

    public void masterDocumentTypeMasterClick() {
        try {
            TestUtil.highlightElement(masterDocumentTypeMaster);
            Thread.sleep(1000);
            masterDocumentTypeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterDocumentTypeMaster();
    }

    public void masterCycleMasterClick() {
        try {
            TestUtil.highlightElement(masterCycleMaster);
            Thread.sleep(1000);
            masterCycleMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterCycleMaster();
    }

    public void masterConnectionStatusMasterClick() {
        try {
            TestUtil.highlightElement(masterConnectionStatusMaster);
            Thread.sleep(1000);
            masterConnectionStatusMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterConnectionStatusMaster();
    }

    public void masterRegistrationRateMasterClick() {
        try {
            TestUtil.highlightElement(masterRegistrationRateMaster);
            Thread.sleep(1000);
            masterRegistrationRateMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterRegistrationRateMaster();
    }

    public void masterMiscReceiptRateMasterClick() {
        try {
            TestUtil.highlightElement(masterMiscReceiptRateMaster);
            Thread.sleep(1000);
            masterMiscReceiptRateMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterMiscReceiptRateMaster();
    }

    public void masterSafeCustodyMasterClick() {
        try {
            TestUtil.highlightElement(masterSafeCustodyMaster);
            Thread.sleep(1000);
            masterSafeCustodyMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterSafeCustodyMaster();
    }

    public void masterTransferTypeMasterClick() {
        try {
            TestUtil.highlightElement(masterTransferTypeMaster);
            Thread.sleep(1000);
            masterTransferTypeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterTransferTypeMaster();
    }

    public void masterRouteCodeMasterClick() {
        try {
            TestUtil.highlightElement(masterRouteCodeMaster);
            Thread.sleep(1000);
            masterRouteCodeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterRouteCodeMaster();
    }

    public void masterRateMasterClick() {
        try {
            TestUtil.highlightElement(masterRateMaster);
            Thread.sleep(1000);
            masterRateMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterRateMaster();
    }

    public void masterMeterStatusMasterClick() {
        try {
            TestUtil.highlightElement(masterMeterStatusMaster);
            Thread.sleep(1000);
            masterMeterStatusMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterMeterStatusMaster();
    }

    public void masterRateMasterConsumerWiseClick() {
        try {
            TestUtil.highlightElement(masterRateMasterConsumerWise);
            Thread.sleep(1000);
            masterRateMasterConsumerWise.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterRateMasterConsumerWise();
    }

    public void masterUnitUsageRateMasterClick() {
        try {
            TestUtil.highlightElement(masterUnitUsageRateMaster);
            Thread.sleep(1000);
            masterUnitUsageRateMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterUnitUsageRateMaster();
    }

    public void masterBankGuaranteeDetailListClick() {
        try {
            TestUtil.highlightElement(masterBankGuaranteeDetailList);
            Thread.sleep(1000);
            masterBankGuaranteeDetailList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterBankGuranteeDetailList();
    }

    public void masterAgreementContentClick() {
        try {
            TestUtil.highlightElement(masterAgreementContent);
            Thread.sleep(1000);
            masterAgreementContent.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterAgreementContent();
    }

    public void masterCorrectionFactorClick() {
        try {
            TestUtil.highlightElement(masterCorrectionFactor);
            Thread.sleep(1000);
            masterCorrectionFactor.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterCorrectionFactor();
    }

    public void masterRegulatorPressureClick() {
        try {
            TestUtil.highlightElement(masterRegulatorPressure);
            Thread.sleep(1000);
            masterRegulatorPressure.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterRegularPressure();
    }

    public void masterEmailAndSMSTempleteClick() {
        try {
            TestUtil.highlightElement(masterEmailAndSMSTemplete);
            Thread.sleep(1000);
            masterEmailAndSMSTemplete.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterEmailAndSMSTemplete();
    }

    public void masterPromotionalSchemeClick() {
        try {
            TestUtil.highlightElement(masterPromotionalScheme);
            Thread.sleep(1000);
            masterPromotionalScheme.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new MasterPromotionalScheme();
    }


}
