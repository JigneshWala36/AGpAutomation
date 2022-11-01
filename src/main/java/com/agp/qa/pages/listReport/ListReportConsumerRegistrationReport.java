package com.agp.qa.pages.listReport;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import com.aventstack.extentreports.App;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ListReportConsumerRegistrationReport extends TestBase {

    public ListReportConsumerRegistrationReport() {
        PageFactory.initElements(driver, this);
    }


    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h2[normalize-space()='Consumer Registration Report']")
    public static WebElement listReportConsumerRegistrationReportMainHeader;

    @FindBy(xpath = "(//label[contains(text(),'Select Account Type')])[1]")
    public static WebElement listReportSelectAccountTypeHeader;

    @FindBy(xpath = "//select[@id='AccountTypeId']")
    public static WebElement listReportSelectAccountTypeDropdownClick;

    @FindBy(xpath = "//option[normalize-space()='1 - DOMESTIC CONNECTION']")
    public static WebElement listReportSelectDomesticConnectionAccountType;

    @FindBy(xpath = "//option[normalize-space()='2 - COMMERCIAL']")
    public static WebElement listReportSelectCommercialAccountType;

    @FindBy(xpath = "//option[normalize-space()='3 - NON-COMMERCIAL']")
    public static WebElement listReportSelectNonCommercialAccountType;

    @FindBy(xpath = "//option[normalize-space()='4 - NON-DOMESTIC EXEMPTED CATEGORY (NDEC)']")
    public static WebElement listReportSelectNonDomesticExemptedCategoryAccountType;

    @FindBy(xpath = "//label[normalize-space()='Select Area']")
    public static WebElement listReportSelectAreaHeader;

    @FindBy(xpath = "//label[normalize-space()='Enter Application Number']")
    public static WebElement listReportEnterApplicationNumberHeader;

    @FindBy(xpath = "//input[@id='ApplicationNumber']")
    public static WebElement listReportEnterApplicationNumberInput;

    @FindBy(xpath = "//th[@aria-label='Application Number: activate to sort column descending']")
    public static WebElement listReportApplicationNumberTableHeader;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public static WebElement listReportApplicationNumberSearchResult;

    @FindBy(xpath = "//th[@aria-label='Consumer Number: activate to sort column ascending']")
    public static WebElement listReportConsumerNumberTableHeader;

    @FindBy(xpath = "//tr[@class='odd']//td[14]")
    public static WebElement listReportGetConsumerNumberFromTable;

    @FindBy(xpath = "//input[@id='btnSearch']")
    public static WebElement listReportSearchBtn;

    @FindBy(xpath = "//input[@id='btnReset']")
    public static WebElement listReportResetBtn;

    @FindBy(xpath = "//input[@id='btnExport']")
    public static WebElement listReportExportBtn;

    public void captureConsumerNumberFromConsumerRegistrationReport() throws InterruptedException {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

//        String AccountTypeSelect = reader.getCellData("Commercial","Account Type Select",2);
//        System.out.println(AccountTypeSelect);

//        String Date = reader.getCellData("Commercial","Date",2);
//        System.out.println(Date);

        int rowCount = reader.getRowCount("Commercial");
//        System.out.println(rowCount);

        if (!reader.addColumn("Commercial", "Consumer Number")) {
            reader.addColumn("Commercial", "Consumer Number");
        }

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            Thread.sleep(3000);
            //  Fetching Data in the Loop
            String ApplicationNo = reader.getCellData("Commercial", "Application No", rowNum);

            String AccountTypeSelect = reader.getCellData("Commercial", "Account Type Select", rowNum);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportConsumerRegistrationReportMainHeader);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportSelectAccountTypeHeader);

            Thread.sleep(500);
            TestUtil.selectMethodExcelString(listReportSelectAccountTypeDropdownClick, AccountTypeSelect);
            Thread.sleep(2000);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportSelectAreaHeader);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportEnterApplicationNumberHeader);
            Thread.sleep(500);
            TestUtil.sendKeyNormalExcel(listReportEnterApplicationNumberInput, ApplicationNo);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportExportBtn);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportResetBtn);

            Thread.sleep(500);
            TestUtil.highlightElement(listReportSearchBtn);
            Thread.sleep(500);
            listReportSearchBtn.click();

            Thread.sleep(2000);
            TestUtil.highlightElement(listReportApplicationNumberTableHeader);
            Thread.sleep(1000);
            TestUtil.highlightElement(listReportApplicationNumberSearchResult);
            Thread.sleep(1000);
            Assert.assertEquals(listReportApplicationNumberSearchResult.getText(), ApplicationNo, "Application No Does Not Match");

            Thread.sleep(1000);
            TestUtil.scrollTo(listReportConsumerNumberTableHeader);
            Thread.sleep(500);
            TestUtil.highlightElement(listReportGetConsumerNumberFromTable);

            Thread.sleep(1000);
            String finalConsumerNo = listReportGetConsumerNumberFromTable.getText();
            System.out.println(finalConsumerNo);

            for (int consumerNo = rowNum; consumerNo <= rowCount; consumerNo++) {
                System.out.println(rowCount);

                Thread.sleep(1000);

                //  Fetching Data in the Loop

                String.valueOf(reader.setCellData("Commercial", "Consumer Number", consumerNo, finalConsumerNo));

            }


        }

    }


}
