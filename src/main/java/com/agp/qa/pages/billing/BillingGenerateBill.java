package com.agp.qa.pages.billing;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BillingGenerateBill extends TestBase {

    public BillingGenerateBill() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Generate Bill')]")
    public static WebElement billingGenerateBillMainHeader;

    @FindBy(xpath = "//label[contains(text(),'Cycle')]")
    public static WebElement billingGenerateBillCycleHeader;

    @FindBy(xpath = "//input[@id='CycleNo']")
    public static WebElement billingGenerateBillCycleInput;

    @FindBy(xpath = "//label[contains(text(),'Account Type')]")
    public static WebElement billingGenerateBillAccountTypeHeader;

    @FindBy(xpath = "//select[@id='drpAccountType']")
    public static WebElement billingGenerateBillAccountTypeSelect;

    @FindBy(xpath = "//option[contains(text(),'DOMESTIC CONNECTION')]")
    public static WebElement billingGenerateBillAccountTypeDomesticSelect;

    @FindBy(xpath = "//option[contains(text(),'COMMERCIAL')]")
    public static WebElement billingGenerateBillAccountTypeCommercialSelect;

    @FindBy(xpath = "//option[contains(text(),'NON-COMMERCIAL')]")
    public static WebElement billingGenerateBillAccountTypeNonCommercialSelect;

    @FindBy(xpath = "//option[contains(text(),'NON-DOMESTIC EXEMPTED CATEGORY (NDEC)')]")
    public static WebElement billingGenerateBillAccountTypeNDECSelect;

    @FindBy(xpath = "//label[contains(text(),'Ward')]")
    public static WebElement billingGenerateBillWardHeader;

    //    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[1]")
    @FindBy(xpath = "//label[contains(text(),'Ward')]/..//input[@class='select2-search__field']")
    public static WebElement billingGenerateBillWardInput;

    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    public static WebElement billingGenerateBillWardInputSelect;

    @FindBy(xpath = "//label[normalize-space()='No of Month']")
    public static WebElement billingGenerateBillMonthHeader;

    @FindBy(xpath = "//input[@id='NumofMonth']")
    public static WebElement billingGenerateBillMonthInput;

    @FindBy(xpath = "//label[normalize-space()='Consumer Number']")
    public static WebElement billingGenerateBillConsumerNumberHeader;

    @FindBy(xpath = "//input[@id='ConsumerCode']")
    public static WebElement billingGenerateBillConsumerNumberInput;

    @FindBy(xpath = "//input[@id='btnSearch']")
    public static WebElement billingGenerateBillSearchBtn;

    @FindBy(xpath = "//input[@id='btnSave']")
    public static WebElement billingGenerateBillGenerateBillBtn;

    @FindBy(xpath = "//input[@value='Clear']")
    public static WebElement billingGenerateBillClearBtn;

    @FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
    public static WebElement billingGenerateBillViewIcon;

    @FindBy(xpath = "//h4[normalize-space()='Bill Generation Status']")
    public static WebElement billingGenerateBillViewPopUpStatusHeader;

    @FindBy(xpath = "//th[@aria-label='ConsumerNumber: activate to sort column ascending']")
    public static WebElement billingGenerateBillViewPopUpStatusConsumerNoTableHeader;

    @FindBy(xpath = "//tr[@id='challan-table']//td[4]")
    public static WebElement billingGenerateBillViewPopUpStatusConsumerNoVerify;

    @FindBy(xpath = "(//span[@aria-hidden='true'][normalize-space()='×'])[1]")
    public static WebElement billingGenerateBillViewPopUpCloseIcon;

    public void generateMROOfApprovedGasInCustomer() {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = Xls_Reader.getRowCount("Commercial");

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            String ConsumerNo = Xls_Reader.getCellData("Commercial", "Consumer Number", rowNum);

            String Cycle = Xls_Reader.getCellData("Commercial", "Cycle No", rowNum);

            String AccountType = Xls_Reader.getCellData("Commercial", "Account Type", rowNum);

            String WardNo = Xls_Reader.getCellData("Commercial", "Ward No", rowNum);


            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillMainHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillCycleHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillCycleInput);
            TestUtil.waiting(1000);
            TestUtil.sendKeyNormalExcel(billingGenerateBillCycleInput, Cycle);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillAccountTypeHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillAccountTypeSelect);
            TestUtil.waiting(1000);
            TestUtil.selectMethodExcelString(billingGenerateBillAccountTypeSelect, AccountType);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillWardHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillWardInput);
            TestUtil.waiting(1000);
            TestUtil.sendKeyNormalExcel(billingGenerateBillWardInput, WardNo);
            TestUtil.waiting(1000);
            billingGenerateBillWardInputSelect.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillMonthHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillMonthInput);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillConsumerNumberHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillConsumerNumberInput);
            TestUtil.waiting(1000);
            TestUtil.sendKeyNormalExcel(billingGenerateBillConsumerNumberInput, ConsumerNo);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillSearchBtn);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillClearBtn);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillGenerateBillBtn);
            TestUtil.waiting(1000);
            billingGenerateBillGenerateBillBtn.click();

            TestUtil.waiting(3000);
            TestUtil.scrollTo(billingGenerateBillViewIcon);

            TestUtil.waiting(1000);
            billingGenerateBillViewIcon.click();

            TestUtil.waiting(3000);
            TestUtil.highlightElement(billingGenerateBillViewPopUpStatusHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillViewPopUpStatusConsumerNoTableHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillViewPopUpStatusConsumerNoVerify);
            TestUtil.waiting(1000);
            Assert.assertEquals(ConsumerNo, billingGenerateBillViewPopUpStatusConsumerNoVerify.getText(), "Consumer No Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(billingGenerateBillViewPopUpCloseIcon);
            TestUtil.waiting(1000);
            billingGenerateBillViewPopUpCloseIcon.click();


        }


    }


}
