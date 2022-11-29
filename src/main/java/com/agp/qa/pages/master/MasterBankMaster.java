package com.agp.qa.pages.master;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MasterBankMaster extends TestBase {

    public MasterBankMaster() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Bank Master')]")
    public static WebElement masterBankMasterMainHeader;

    @FindBy(xpath = "//button[normalize-space()='Add Bank']")
    public static WebElement masterBankMasterAddBankClick;

    @FindBy(xpath = "//input[@type='search']")
    public static WebElement masterBankMasterSearchInput;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public static WebElement masterBankMasterAddNewBankPopUpHeader;

    @FindBy(xpath = "//label[@for='Bank_Code']")
    public static WebElement masterBankMasterAddNewBankPopUpBankCodeHeader;

    @FindBy(xpath = "//input[@id='BankCode']")
    public static WebElement masterBankMasterAddNewBankPopUpBankCodeInput;

    @FindBy(xpath = "//label[@for='Bank_Name']")
    public static WebElement masterBankMasterAddNewBankPopUpBankNameHeader;

    @FindBy(xpath = "//input[@id='BankName']")
    public static WebElement masterBankMasterAddNewBankPopUpBankNameInput;

    @FindBy(xpath = "//button[normalize-space()='Close']")
    public static WebElement masterBankMasterAddNewBankPopUpCloseBtn;

    @FindBy(xpath = "//span[@aria-hidden='true']")
    public static WebElement masterBankMasterAddNewBankPopUpXIconClick;

    @FindBy(xpath = "//button[@id='btnSave']")
    public static WebElement masterBankMasterAddNewBankPopUpSaveBtn;


    public void verifyBankMasterPageOpenCloseOfAddBankPopUp() {

        TestUtil.waiting(1000);
        TestUtil.highlightElement(masterBankMasterMainHeader);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddBankClick);
        TestUtil.waiting(500);
        masterBankMasterAddBankClick.click();
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpCloseBtn);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpCloseBtn.click();
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddBankClick);
        TestUtil.waiting(500);
        masterBankMasterAddBankClick.click();
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpXIconClick);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpXIconClick.click();
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddBankClick);
        TestUtil.waiting(500);
        masterBankMasterAddBankClick.click();


    }

    public void verifyAddBankDetails() {

        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpHeader);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankCodeHeader);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankCodeInput);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpBankCodeInput.sendKeys(data.getProperty("newAddedBankCodeInBankMaster"));
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankNameHeader);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankNameInput);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpBankNameInput.sendKeys(data.getProperty("newAddedBankNameInBankMaster"));
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpSaveBtn);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpSaveBtn.click();
        masterBankMasterAddNewBankPopUpSaveBtn.click();
        TestUtil.waiting(5000);

    }

    static String bankName = data.getProperty("newAddedBankNameInBankMaster");


    public void clickEditIconFromTheTableList(List<WebElement> listOfBankNameElement) {

        int size = listOfBankNameElement.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            String get_text = listOfBankNameElement.get(i).getText();
            System.out.println(get_text);
            if (bankName.equals(get_text)) {
                System.out.println("++++++++++++++++++++++++++++" + "Text verified");

                // Edit Icon Click List of WebElements of the Tabled
                List<WebElement> finalElements = driver.findElements(By.xpath("//tr//td[6]//button[@type='button']//i[@class='fa fa-pencil']"));

                System.out.println(finalElements.get(i));

                TestUtil.waiting(2000);
                finalElements.get(i).click();
                ;
                System.out.println("verified");
                break;

            }
        }

    }

    public void verifyBankNameForEdit() {

        TestUtil.waiting(2000);
        TestUtil.highlightElement(masterBankMasterMainHeader);
        TestUtil.waiting(1000);

        List<WebElement> namesElements = driver.findElements(By.xpath("//tr//td[3]"));

        List<String> names = new ArrayList<String>();

        for (WebElement nameElement : namesElements) {

            names.add(nameElement.getText());

        }

        clickEditIconFromTheTableList(driver.findElements(By.xpath("//tr//td[3]")));


        while (!names.contains(bankName)) {

            WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
            String nextBtnDisable = driver.findElement(By.xpath("//a[contains(text(),'Next')]/..")).getAttribute("class");
            System.out.println(nextBtnDisable);
            if (nextBtnDisable.contains("disabled")) {
                System.out.println("No Such Element Found");
                break;
            }

            nextBtn.click();

            TestUtil.waiting(1000);

            namesElements = driver.findElements(By.xpath("//tr//td[3]"));

            for (WebElement namesElement : namesElements) {

                names.add(namesElement.getText());

            }

            clickEditIconFromTheTableList(driver.findElements(By.xpath("//tr//td[3]")));


        }


//    System.out.println(data.getProperty("masterBankName"));
    }

    public void verifyEditDataAndEditBankData() {

        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankCodeHeader);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankCodeInput);
        TestUtil.waiting(500);
        Assert.assertEquals(data.getProperty("newAddedBankCodeInBankMaster"), masterBankMasterAddNewBankPopUpBankCodeInput.getAttribute("value"), "Bank Code not Match");
        TestUtil.waiting(500);
        TestUtil.clearElementThroughKeys(masterBankMasterAddNewBankPopUpBankCodeInput);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankCodeInput);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpBankCodeInput.sendKeys(data.getProperty("editAddedBankCodeInBankMaster"));

        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankNameHeader);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankNameInput);
        TestUtil.waiting(500);
        Assert.assertEquals(data.getProperty("newAddedBankNameInBankMaster"), masterBankMasterAddNewBankPopUpBankNameInput.getAttribute("value"), "Bank Name not Match");
        TestUtil.waiting(500);
        TestUtil.clearElementThroughKeys(masterBankMasterAddNewBankPopUpBankNameInput);
        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpBankNameInput);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpBankNameInput.sendKeys(data.getProperty("EditAddedBankNameInBankMaster"));


        TestUtil.waiting(500);
        TestUtil.highlightElement(masterBankMasterAddNewBankPopUpSaveBtn);
        TestUtil.waiting(500);
        masterBankMasterAddNewBankPopUpSaveBtn.click();
        masterBankMasterAddNewBankPopUpSaveBtn.click();
        TestUtil.waiting(5000);


    }
}