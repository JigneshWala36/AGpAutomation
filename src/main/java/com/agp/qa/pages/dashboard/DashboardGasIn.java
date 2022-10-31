package com.agp.qa.pages.dashboard;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.gasIn.GasInBulkGasIn;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterApprovalForm;
import com.agp.qa.pages.gasIn.GasInRouteAndMeterAssignmentForm;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardGasIn extends TestBase {

    public DashboardGasIn() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Route & Meter Assignment Form']")
    public static WebElement gasInRouteAndMeterAssignmentForm;

    @FindBy(xpath = "//a[normalize-space()='Route & Meter Approval Form']")
    public static WebElement gasInRouteAndMeterApprovalForm;

    @FindBy(xpath = "//a[normalize-space()='Bulk Gas In']")
    public static WebElement gasInBulkGasIn;

    public void gasInRouteAndMeterAssignmentFormClick() {
        try {
            TestUtil.highlightElement(gasInRouteAndMeterAssignmentForm);
            Thread.sleep(1000);
            gasInRouteAndMeterAssignmentForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new GasInRouteAndMeterAssignmentForm();
    }

    public void gasInRouteAndMeterApprovalFormClick() {
        try {
            TestUtil.highlightElement(gasInRouteAndMeterApprovalForm);
            Thread.sleep(1000);
            gasInRouteAndMeterApprovalForm.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new GasInRouteAndMeterApprovalForm();
    }

    public void gasInBulkGasInClick() {
        try {
            TestUtil.highlightElement(gasInBulkGasIn);
            Thread.sleep(1000);
            gasInBulkGasIn.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        new GasInBulkGasIn();
    }


}
