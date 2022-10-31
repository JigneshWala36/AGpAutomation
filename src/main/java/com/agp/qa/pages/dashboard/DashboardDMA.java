package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.dma.*;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardDMA extends TestBase {

    public DashboardDMA() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='GA Master']")
    public static WebElement dmaGAMaster;

    @FindBy(xpath = "//a[normalize-space()='State Details']")
    public static WebElement dmaStateDetails;

    @FindBy(xpath = "//a[normalize-space()='Extra Point Master']")
    public static WebElement dmaExtraPointMaster;

    @FindBy(xpath = "//a[normalize-space()='District Master']")
    public static WebElement dmaDistrictMaster;

    @FindBy(xpath = "//a[normalize-space()='Taluka Master']")
    public static WebElement dmaTalukaMaster;

    @FindBy(xpath = "//a[normalize-space()='Area Master']")
    public static WebElement dmaAreaMaster;

    @FindBy(xpath = "//a[normalize-space()='Pincode Master']")
    public static WebElement dmaPincodeMaster;

    @FindBy(xpath = "//a[normalize-space()='Scheme Master']")
    public static WebElement dmaSchemeMaster;

    @FindBy(xpath = "//a[normalize-space()='City Master']")
    public static WebElement dmaCityMaster;

    @FindBy(xpath = "//a[normalize-space()='Payment Type Master']")
    public static WebElement dmaPaymentTypeMaster;

    @FindBy(xpath = "//a[normalize-space()='House Type Master']")
    public static WebElement dmaHouseTypeMaster;

    @FindBy(xpath = "//a[normalize-space()='Photo Proof Master']")
    public static WebElement dmaPhotoProofMaster;

    @FindBy(xpath = "//a[normalize-space()='Address Proof Master']")
    public static WebElement dmaAddressProofMaster;

    @FindBy(xpath = "//a[normalize-space()='Owner Proof Master']")
    public static WebElement dmaOwnerProofMaster;

    public void dmaGAMasterClick() {
        try {
            TestUtil.highlightElement(dmaGAMaster);
            Thread.sleep(1000);
            dmaGAMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAGAMaster();
    }

    public void dmaStateDetailsClick() {
        try {
            TestUtil.highlightElement(dmaStateDetails);
            Thread.sleep(1000);
            dmaStateDetails.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAStateDetails();
    }

    public void dmaExtraPointMasterClick() {
        try {
            TestUtil.highlightElement(dmaExtraPointMaster);
            Thread.sleep(1000);
            dmaExtraPointMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAExtraPointMaster();
    }

    public void dmaDistrictMasterClick() {
        try {
            TestUtil.highlightElement(dmaDistrictMaster);
            Thread.sleep(1000);
            dmaDistrictMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMADistrictMaster();
    }

    public void dmaTalukaMasterClick() {
        try {
            TestUtil.highlightElement(dmaTalukaMaster);
            Thread.sleep(1000);
            dmaTalukaMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMATalukaMaster();
    }

    public void dmaAreaMasterClick() {
        try {
            TestUtil.highlightElement(dmaAreaMaster);
            Thread.sleep(1000);
            dmaAreaMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAAreaMaster();
    }

    public void dmaPincodeMasterClick() {
        try {
            TestUtil.highlightElement(dmaPincodeMaster);
            Thread.sleep(1000);
            dmaPincodeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAPincodeMaster();
    }

    public void dmaSchemeMasterClick() {
        try {
            TestUtil.highlightElement(dmaSchemeMaster);
            Thread.sleep(1000);
            dmaSchemeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMASchemeMaster();
    }

    public void dmaCityMasterClick() {
        try {
            TestUtil.highlightElement(dmaCityMaster);
            Thread.sleep(1000);
            dmaCityMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMACityMaster();
    }

    public void dmaPaymentTypeMasterClick() {
        try {
            TestUtil.highlightElement(dmaPaymentTypeMaster);
            Thread.sleep(1000);
            dmaPaymentTypeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAPaymentTypeMaster();
    }

    public void dmaHouseTypeMasterClick() {
        try {
            TestUtil.highlightElement(dmaHouseTypeMaster);
            Thread.sleep(1000);
            dmaHouseTypeMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAHouseTypeMaster();
    }

    public void dmaPhotoProofMasterClick() {
        try {
            TestUtil.highlightElement(dmaPhotoProofMaster);
            Thread.sleep(1000);
            dmaPhotoProofMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAPhotoProofMaster();
    }

    public void dmaAddressProofMasterClick() {
        try {
            TestUtil.highlightElement(dmaAddressProofMaster);
            Thread.sleep(1000);
            dmaAddressProofMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAAddressProofMaster();
    }

    public void dmaOwnerProofMasterClick() {
        try {
            TestUtil.highlightElement(dmaOwnerProofMaster);
            Thread.sleep(1000);
            dmaOwnerProofMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new DMAOwnerProofMaster();
    }




}
