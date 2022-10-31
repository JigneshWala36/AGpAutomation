package com.agp.qa.pages.domestic;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DomesticConsumerAgreementPrintPage extends TestBase {

    public DomesticConsumerAgreementPrintPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Consumer Agreement Print']")
    public static WebElement domesticConsumerAgreementPrintMainHeader;

    @FindBy(xpath = "//button[normalize-space()='Bulk Create PDF']")
    public static WebElement domesticConsumerAgreementBulkCreatePDFBtn;

    @FindBy(xpath = "//input[@type='search']")
    public static WebElement domesticConsumerAgreementSearchInput;

    //    @FindBy(xpath = "//th[contains(text(),'Application Number')]/../../..//tbody//tr[1]//td[2]")
    @FindBy(xpath = "//th[@aria-label='Application Number']/../../..//tbody//td[2]")
    public static WebElement domesticConsumerAgreementTableRow1ApplicationNo;

    @FindBy(xpath = "//th[contains(text(),'Application Number')]/../../..//tbody//tr[1]//td[3]/div[1]")
//    @FindBy(xpath = "//th[@aria-label='Application Number']/../../..//tbody//td[3]")
    public static WebElement domesticConsumerAgreementTableRow1ConsumerNumber;

    @FindBy(xpath = "//th[contains(text(),'Application Number')]/../../..//tbody//tr[1]//td[4]")
//    @FindBy(xpath = "//th[@aria-label='Application Number']/../../..//tbody//td[4]")
    public static WebElement domesticConsumerAgreementTableRow1ConsumerPrintIconBtn;

    public void searchDomesticConsumer() {
        String ApplicationNo;
        String ConsumerName;
        try {

            TestUtil.waiting(3000);
            TestUtil.highlightElement(domesticConsumerAgreementPrintMainHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementTableRow1ApplicationNo);
            ApplicationNo = TestUtil.getTextFromUI(domesticConsumerAgreementTableRow1ApplicationNo);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementSearchInput);
            domesticConsumerAgreementSearchInput.sendKeys(ApplicationNo);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementSearchInput);
            TestUtil.waiting(1000);
            Assert.assertEquals(domesticConsumerAgreementTableRow1ApplicationNo.getText(), ApplicationNo, "Application No Not matched");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementTableRow1ApplicationNo);
            TestUtil.waiting(1000);

            // Clearing the Application No

            TestUtil.clearElementThroughKeys(domesticConsumerAgreementSearchInput);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementSearchInput);


            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementTableRow1ConsumerNumber);
            ConsumerName = TestUtil.getTextFromUI(domesticConsumerAgreementTableRow1ConsumerNumber);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementSearchInput);
            domesticConsumerAgreementSearchInput.sendKeys(ConsumerName);
            TestUtil.waiting(2000);
            TestUtil.highlightElement(domesticConsumerAgreementSearchInput);
            TestUtil.waiting(1000);
            Assert.assertEquals(domesticConsumerAgreementTableRow1ConsumerNumber.getText(), ConsumerName, "Application No Not matched");

            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementTableRow1ConsumerNumber);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementSearchInput);
//            TestUtil.clearElement(domesticConsumerAgreementSearchInput);
            TestUtil.clearElementThroughKeys(domesticConsumerAgreementSearchInput);

            TestUtil.waiting(1000);
            TestUtil.click(domesticConsumerAgreementTableRow1ConsumerPrintIconBtn);
            TestUtil.waiting(5000);


//            Assert.assertEquals(editCompanyStep1NameInput.getAttribute("value"),data.getProperty("addCompanyStep1NameInput1"),"Edit company Name not same");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getApplicationNoFromTheFirstRow() {
        String firstRowApplicationNo = null;
        try {
            TestUtil.waiting(2000);
            TestUtil.highlightElement(domesticConsumerAgreementPrintMainHeader);
            TestUtil.waiting(1000);
            TestUtil.highlightElement(domesticConsumerAgreementTableRow1ApplicationNo);
            firstRowApplicationNo = TestUtil.getTextFromUI(domesticConsumerAgreementTableRow1ApplicationNo);
            TestUtil.waiting(3000);

        } catch (Exception e) {
            System.out.println("No Data Found in the Consumer Agreement Print Page");
            e.printStackTrace();
        }

        return firstRowApplicationNo;
    }


}
