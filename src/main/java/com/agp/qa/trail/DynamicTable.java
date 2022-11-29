package com.agp.qa.trail;

import com.agp.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable extends TestBase {

    public DynamicTable() {
        PageFactory.initElements(driver, this);
    }

//    static String bankName = data.getProperty("masterBankName");




    public static String bankName = data.getProperty("masterBankName");

    public void verifyEditIcon() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Jignesh\\Driver\\Chrome 107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();
        long PageLoadTimeOut = 0;
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

        // Launch Website
        driver.get("https://uatmonthly.agppratham.com/#");

        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("jignesh");
//        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("426351");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(8000);

        driver.findElement(By.xpath("//span[contains(text(),'Master')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Bank Master')]")).click();
        Thread.sleep(3000);


//        String bankName = "STATE BANK OF TRAVANCORE";
//        String bankName = data.getProperty("masterBankName");

        List<WebElement> namesElements = driver.findElements(By.xpath("//tr//td[3]"));

        List<String> names = new ArrayList<String>();

        for (WebElement nameElement : namesElements) {

            names.add(nameElement.getText());

        }

        int size = namesElements.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            String get_text = namesElements.get(i).getText();
            System.out.println(get_text);
            if (bankName.equals(get_text)) {
                System.out.println("++++++++++++++++++++++++++++" + "Text verified");

                // Edit Icon Click List of WebElements of the Tabled
                List<WebElement> finalElements = driver.findElements(By.xpath("//tr//td[6]//button[@type='button']//i[@class='fa fa-pencil']"));

                System.out.println(finalElements.get(i));

                Thread.sleep(1000);
                finalElements.get(i).click();
                ;
                System.out.println("verified");
                break;

            }
        }

//        WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));

        while (!names.contains(bankName)) {


            WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
            String nextBtnDisable = driver.findElement(By.xpath("//a[contains(text(),'Next')]/..")).getAttribute("class");
            System.out.println(nextBtnDisable);
            if (nextBtnDisable.contains("disabled")) {
                System.out.println("No Such Element Found");
                break;
            }

            nextBtn.click();

            Thread.sleep(1000);

            namesElements = driver.findElements(By.xpath("//tr//td[3]"));

            for (WebElement namesElement : namesElements) {

                names.add(namesElement.getText());

            }

            int size1 = namesElements.size();
            System.out.println(size1);
            for (int i = 0; i < size1; i++) {
                String get_text = namesElements.get(i).getText();


                System.out.println(get_text);
                if (bankName.equals(get_text)) {
                    System.out.println("++++++++++++++++++++++++++++" + "Text verified");

                    // Edit Icon Click List of WebElements of the Tabled
                    List<WebElement> finalElements = driver.findElements(By.xpath("//tr//td[6]//button[@type='button']//i[@class='fa fa-pencil']"));

                    System.out.println(finalElements.get(i));

                    Thread.sleep(1000);
                    finalElements.get(i).click();
                    ;
                    System.out.println("verified");
                    break;

                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {

        DynamicTable dynamicTable = new DynamicTable();
        dynamicTable.verifyEditIcon();

    }
}
