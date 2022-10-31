package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.HR_Software.HR_SoftwareRoleMaster;
import com.agp.qa.pages.HR_Software.HR_SoftwareSystemUserList;
import com.agp.qa.pages.cashier.CashierGenerateMiscBill;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardHR_Software extends TestBase {

    public DashboardHR_Software() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='System User List']")
    public static WebElement hr_SoftwareSystemUserList;

    @FindBy(xpath = "//a[normalize-space()='Role Master']")
    public static WebElement hr_SoftwareRoleMaster;

    public void hr_SoftwareSystemUserListClick() {
        try {
            TestUtil.highlightElement(hr_SoftwareSystemUserList);
            Thread.sleep(1000);
            hr_SoftwareSystemUserList.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new HR_SoftwareSystemUserList();
    }

    public void hr_SoftwareRoleMasterClick() {
        try {
            TestUtil.highlightElement(hr_SoftwareRoleMaster);
            Thread.sleep(1000);
            hr_SoftwareRoleMaster.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new HR_SoftwareRoleMaster();
    }

}
