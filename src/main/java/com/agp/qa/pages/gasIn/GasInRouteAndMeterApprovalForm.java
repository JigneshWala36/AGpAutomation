package com.agp.qa.pages.gasIn;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GasInRouteAndMeterApprovalForm extends TestBase {

    public GasInRouteAndMeterApprovalForm() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Consumer Approval Form']")
    public static WebElement gasInRouteAndMeterApprovalFormMainHeader;

    @FindBy(xpath = "//label[normalize-space()='Ward']")
    public static WebElement gasInRouteAndMeterApprovalFormWardHeader;

    @FindBy(xpath = "//select[@id='WardId']")
    public static WebElement gasInRouteAndMeterApprovalFormWardSelect;

    @FindBy(xpath = "//option[contains(text(),'N09 - N09')]")
    public static WebElement gasInRouteAndMeterApprovalFormWardNo09Select;

    @FindBy(xpath = "//label[contains(text(),'Enter Consumer Number')]")
    public static WebElement gasInRouteAndMeterApprovalFormEnterConsumerNumberHeader;

    @FindBy(xpath = "//input[@id='ConsumerNumber']")
    public static WebElement gasInRouteAndMeterApprovalFormEnterConsumerNumberInput;

    @FindBy(xpath = "//input[@id='btnSearch']")
    public static WebElement gasInRouteAndMeterApprovalFormSearchBtn;

    @FindBy(xpath = "//input[@id='btnReset']")
    public static WebElement gasInRouteAndMeterApprovalFormResetBtn;

    @FindBy(xpath = "//input[@value='Export-To-Excel']")
    public static WebElement gasInRouteAndMeterApprovalFormExportToExcelBtn;

    @FindBy(xpath = "//th[contains(text(),'Consumer Number')]")
    public static WebElement gasInRouteAndMeterApprovalFormConsumerNumberTableColumnHeader;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public static WebElement gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerVerifyData;

    @FindBy(xpath = "//th[contains(text(),'Approve')]")
    public static WebElement gasInRouteAndMeterApprovalFormApproveTableColumnHeader;

    @FindBy(xpath = "(//i[@class='fa fa-check'])[1]")
    public static WebElement gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerApproveBtn;

    @FindBy(xpath = "//button[@class='btn-success']")
    public static WebElement gasInRouteAndMeterApprovalFormApproveSelectedBtn;

    @FindBy(xpath = "//h2[normalize-space()='Are you sure, you want to approve Form11?']")
    public static WebElement gasInRouteAndMeterApprovalFormApprovePopUpMessage;

    @FindBy(xpath = "//button[@class='cancel']")
    public static WebElement gasInRouteAndMeterApprovalFormApprovePopUpNoBtn;

    @FindBy(xpath = "//button[@class='confirm']")
    public static WebElement gasInRouteAndMeterApprovalFormApprovePopUpApproveBtn;



    public void approvingNewAddedCustomerSwitchOnDate() {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = Xls_Reader.getRowCount("Commercial");

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            String ConsumerNo = Xls_Reader.getCellData("Commercial", "Consumer Number", rowNum);

            String WardNoSelect = Xls_Reader.getCellData("Commercial", "Ward No Select", rowNum);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormMainHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormWardHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormWardSelect);
            TestUtil.waiting(1000);
            TestUtil.selectMethodExcelString(gasInRouteAndMeterApprovalFormWardSelect, WardNoSelect);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormEnterConsumerNumberHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormEnterConsumerNumberInput);
            TestUtil.waiting(1000);
            TestUtil.sendKeyNormalExcel(gasInRouteAndMeterApprovalFormEnterConsumerNumberInput, ConsumerNo);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormExportToExcelBtn);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormResetBtn);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormSearchBtn);
            TestUtil.waiting(1000);
            gasInRouteAndMeterApprovalFormSearchBtn.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormConsumerNumberTableColumnHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerVerifyData);
            TestUtil.waiting(1000);
            Assert.assertEquals(ConsumerNo, gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerVerifyData.getText(), "Consumer No Does Not Match");


            TestUtil.waiting(1000);
            TestUtil.scrollTo(gasInRouteAndMeterApprovalFormApproveTableColumnHeader);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormApproveTableColumnHeader);



            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerApproveBtn);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerApproveBtn);


            TestUtil.waiting(1000);
            TestUtil.scrollTo(gasInRouteAndMeterApprovalFormApproveSelectedBtn);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormApproveSelectedBtn);

            TestUtil.waiting(1000);
            gasInRouteAndMeterApprovalFormConsumerNumberTableSearchCustomerApproveBtn.click();
            TestUtil.waiting(3000);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormApprovePopUpMessage);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormApprovePopUpNoBtn);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(gasInRouteAndMeterApprovalFormApprovePopUpApproveBtn);
            TestUtil.waiting(1000);
            gasInRouteAndMeterApprovalFormApprovePopUpApproveBtn.click();
            TestUtil.waiting(5000);







        }


    }


}
