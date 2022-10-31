package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.HR_Software.HR_SoftwareSystemUserList;
import com.agp.qa.pages.accountant.AccountantCashPaidAgainstChequeReturn;
import com.agp.qa.pages.accountant.AccountantDailyTaxInvoice;
import com.agp.qa.pages.accountant.AccountantVATConsumer;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardAccountant extends TestBase {

    public DashboardAccountant() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement accountantCashPaidAgainstChequeReturn;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement accountantVATConsumer;

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement accountantDailyTaxInvoice;

    public void accountantCashPaidAgainstChequeReturnClick() {
        try {
            TestUtil.highlightElement(accountantCashPaidAgainstChequeReturn);
            Thread.sleep(1000);
            accountantCashPaidAgainstChequeReturn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantCashPaidAgainstChequeReturn();
    }

    public void accountantVATConsumerClick() {
        try {
            TestUtil.highlightElement(accountantVATConsumer);
            Thread.sleep(1000);
            accountantVATConsumer.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantVATConsumer();
    }

    public void accountantDailyTaxInvoiceClick() {
        try {
            TestUtil.highlightElement(accountantDailyTaxInvoice);
            Thread.sleep(1000);
            accountantDailyTaxInvoice.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new AccountantDailyTaxInvoice();
    }


}
