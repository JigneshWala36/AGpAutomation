package com.agp.qa.pages.commercial;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import com.agp.qa.util.Xls_Reader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommercialConsumerApplicationApproval extends TestBase {

    public CommercialConsumerApplicationApproval() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Consumer Application Approval')]")
    public static WebElement comConsumerApplicationApprovalMainHeader;

    @FindBy(xpath = "//input[@type='search']")
    public static WebElement comConsumerApplicationApprovalApplicationNoInput;

    @FindBy(xpath = "//th[@aria-label='Application Number: activate to sort column ascending']")
    public static WebElement comConsumerApplicationApprovalApplicationNoTableHeader;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public static WebElement comConsumerApplicationApprovalApplicationNoVerifyInTable;

    @FindBy(xpath = "//th[@aria-label='Customer Name: activate to sort column ascending']")
    public static WebElement comConsumerApplicationApprovalCustomerNameTableHeader;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public static WebElement comConsumerApplicationApprovalCustomerNameVerifyInTable;

    @FindBy(xpath = "//th[contains(text(),'Approve')]")
    public static WebElement comConsumerApplicationApprovalApproveTableHeader;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public static WebElement comConsumerApplicationApprovalApproveIconClick;

    public void approveCustomerForTheGasInProcess() {

        Xls_Reader reader = new Xls_Reader("src/main/java/com/agp/qa/testdata/TestData1.xlsx");

        int rowCount = Xls_Reader.getRowCount("Commercial");

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            System.out.println(rowCount);

            String Application_No = Xls_Reader.getCellData("Commercial", "Application No", rowNum);

            String NameOfEstablishment = reader.getCellData("Commercial", "Name of Establishment", rowNum);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalMainHeader);

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalApplicationNoInput);
            TestUtil.waiting(1000);
            TestUtil.sendKeyNormalExcel(comConsumerApplicationApprovalApplicationNoInput, Application_No);
            TestUtil.waiting(1000);
            comConsumerApplicationApprovalMainHeader.click();

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalApplicationNoTableHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalApplicationNoVerifyInTable);
            TestUtil.waiting(1000);
            Assert.assertEquals(Application_No, comConsumerApplicationApprovalApplicationNoVerifyInTable.getAttribute("value"), "Application_No Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalCustomerNameTableHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalCustomerNameVerifyInTable);
            TestUtil.waiting(1000);
            Assert.assertEquals(NameOfEstablishment, comConsumerApplicationApprovalCustomerNameVerifyInTable.getAttribute("value"), "Organisation Name Does Not Match");

            TestUtil.waiting(1000);
            TestUtil.scrollTo(comConsumerApplicationApprovalApproveTableHeader);
            TestUtil.highlightElement(comConsumerApplicationApprovalApproveTableHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(comConsumerApplicationApprovalApproveIconClick);
            TestUtil.waiting(1000);
//            comConsumerApplicationApprovalApproveIconClick.click();


        }


    }


}
