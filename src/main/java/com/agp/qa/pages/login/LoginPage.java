package com.agp.qa.pages.login;

import com.agp.qa.base.TestBase;
import com.agp.qa.pages.dashboard.DashboardPage;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    // Initializing the PageObject

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // PageFactory  or ObjectRepository

    @FindBy(xpath = "//label[normalize-space()='User Name']")
    public static WebElement agpLoginPageUserNameHeader;

    @FindBy(xpath = "//input[@id='UserName']")
    public static WebElement agpLoginPageUserNameInput;


    @FindBy(xpath = "//label[normalize-space()='Password']")
    public static WebElement agpLoginPagePasswordHeader;


    @FindBy(xpath = "//input[@id='Password']")
//    @FindBy(xpath = "//input[@id='Passwordddd']")
    public static WebElement agpLoginPagePasswordInput;

//    @FindBy(xpath = "//input[@id='Password']")
    @FindBy(xpath = "//input[@id='Passwordddd']")
    public static WebElement agpLoginPagePasswordInput1;



    @FindBy(xpath = "//button[normalize-space()='Login']")
    public static WebElement agpLoginPageLoginButton;

    public DashboardPage login(String ur, String pwd) {
        try {
            Thread.sleep(2000);
            TestUtil.highlightElement(agpLoginPageUserNameHeader);
//            agpLoginPageUserNameInput.clear();
            TestUtil.highlightElement(agpLoginPageUserNameInput);
            TestUtil.waiting(500);
            agpLoginPageUserNameInput.sendKeys(ur);
            TestUtil.highlightElement(agpLoginPagePasswordHeader);
//            agpLoginPagePasswordInput.clear();
            TestUtil.highlightElement(agpLoginPagePasswordInput);
            TestUtil.waiting(500);
            agpLoginPagePasswordInput.sendKeys(pwd);
            TestUtil.highlightElement(agpLoginPageLoginButton);
            TestUtil.waiting(500);
            agpLoginPageLoginButton.click();
            TestUtil.waiting(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DashboardPage();
    }

    public DashboardPage login1(String ur, String pwd) throws InterruptedException {

            Thread.sleep(2000);
            TestUtil.highlightElement(agpLoginPageUserNameHeader);
//            agpLoginPageUserNameInput.clear();
            TestUtil.highlightElement(agpLoginPageUserNameInput);
            TestUtil.waiting(1000);
            agpLoginPageUserNameInput.sendKeys(ur);
            TestUtil.highlightElement(agpLoginPagePasswordHeader);
//            agpLoginPagePasswordInput.clear();
            TestUtil.highlightElement(agpLoginPagePasswordInput);
            TestUtil.waiting(1000);
            agpLoginPagePasswordInput1.sendKeys(pwd);
            TestUtil.highlightElement(agpLoginPageLoginButton);
            TestUtil.waiting(1000);
            agpLoginPageLoginButton.click();
        TestUtil.waiting(3000);

        return new DashboardPage();
    }






}
