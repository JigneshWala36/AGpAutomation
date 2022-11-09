package com.agp.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TrailClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\Jignesh\\Driver\\Chrome 107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();
        long PageLoadTimeOut = 0;
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

        // Launch Website
        driver.get("https://uatmonthly.agppratham.com/#");

        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("jignesh");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("153246");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(8000);

        driver.findElement(By.xpath("//span[contains(text(),'Master')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Bank Master')]")).click();
        Thread.sleep(3000);

//        String before_xpath = //tr//td[3];
//        String after_xpath = ;

        String bankName = "KALUPUR COMMERCIAL CO-OP BANK LTD";

        List<WebElement> namesElements = driver.findElements(By.xpath("//tr//td[3]"));

        List<String> names = new ArrayList<String>();

        for (WebElement nameElement : namesElements) {

            names.add(nameElement.getText());

        }

//        WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));

        while (!names.contains(bankName)) {

            WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));

            nextBtn.click();

            Thread.sleep(1000);

            namesElements = driver.findElements(By.xpath("//tr//td[3]"));

            for (WebElement namesElement : namesElements) {

                names.add(namesElement.getText());

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
//                    break;

                }
            }

        }

    }
}
