package com.agp.qa.base;

import com.agp.qa.util.TestUtil;
import com.agp.qa.util.WebEventListener;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    public static Properties data;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    public static ExtentTest extentTest;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\config\\config.properties");
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            data = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\config\\data.properties");
            data.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("IE")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\java\\com\\agp\\qa\\resources\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

//        extentTest.log(LogStatus.PASS,browserName);


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }

}