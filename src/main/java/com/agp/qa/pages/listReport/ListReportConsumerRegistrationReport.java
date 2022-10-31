package com.agp.qa.pages.listReport;

import com.agp.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListReportConsumerRegistrationReport extends TestBase {

    public ListReportConsumerRegistrationReport() {
        PageFactory.initElements(driver, this);
    }


    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//h2[normalize-space()='Consumer Registration Report']")
    public static WebElement listReportConsumerRegistrationReportMainHeader;

    @FindBy(xpath = "(//label[contains(text(),'Select Account Type')])[1]")
    public static WebElement listReportSelectAccountTypeMainHeader;

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
    public static WebElement listReportSelectAreaMainHeader;

    @FindBy(xpath = "//label[normalize-space()='Enter Application Number']")
    public static WebElement listReportEnterApplicationNumberMainHeader;

    @FindBy(xpath = "//input[@id='ApplicationNumber']")
    public static WebElement listReportEnterApplicationNumberInput;

    @FindBy(xpath = "//th[@aria-label='Application Number: activate to sort column descending']")
    public static WebElement listReportApplicationNumberTableHeader;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public static WebElement listReportApplicationNumberSearchResult;

    @FindBy(xpath = "//th[@aria-label='Consumer Number: activate to sort column ascending']")
    public static WebElement listReportConsumerNumberTableHeader;

    @FindBy(xpath = "td:nth-child(14)")
    public static WebElement listReportConsumerNumberGet;

    @FindBy(xpath = "//input[@id='btnSearch']")
    public static WebElement listReportSearchBtn;

    @FindBy(xpath = "//input[@id='btnReset']")
    public static WebElement listReportResetBtn;

    @FindBy(xpath = "//input[@id='btnExport']")
    public static WebElement listReportExportBtn;






}
