package com.agp.qa.pages.master;

import com.agp.qa.base.TestBase;
import com.agp.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MasterBankMaster extends TestBase {

    public MasterBankMaster() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Bank Master')]")
    public static WebElement masterBankMasterMainHeader;

    static String bankName = data.getProperty("masterBankName");


    public void clickEditIconFromTheTableList(List<WebElement> listOfBankNameElement) {

        int size = listOfBankNameElement.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            String get_text = listOfBankNameElement.get(i).getText();
            System.out.println(get_text);
            if (bankName.equals(get_text)) {
                System.out.println("++++++++++++++++++++++++++++" + "Text verified");

                // Edit Icon Click List of WebElements of the Tabled
                List<WebElement> finalElements = driver.findElements(By.xpath("//tr//td[6]//button[@type='button']//i[@class='fa fa-pencil']"));

                System.out.println(finalElements.get(i));

                TestUtil.waiting(2000);
                finalElements.get(i).click();
                ;
                System.out.println("verified");
                break;

            }
        }

    }

    public void verifyBankNameFoeEdit() {

        TestUtil.waiting(2000);
        TestUtil.highlightElement(masterBankMasterMainHeader);
        TestUtil.waiting(1000);

        List<WebElement> namesElements = driver.findElements(By.xpath("//tr//td[3]"));

        List<String> names = new ArrayList<String>();

        for (WebElement nameElement : namesElements) {

            names.add(nameElement.getText());

        }

        clickEditIconFromTheTableList(driver.findElements(By.xpath("//tr//td[3]")));


        while (!names.contains(bankName)) {

            WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
            String nextBtnDisable = driver.findElement(By.xpath("//a[contains(text(),'Next')]/..")).getAttribute("class");
            System.out.println(nextBtnDisable);
            if (nextBtnDisable.contains("disabled")) {
                System.out.println("No Such Element Found");
                break;
            }

            nextBtn.click();

            TestUtil.waiting(1000);

            namesElements = driver.findElements(By.xpath("//tr//td[3]"));

            for (WebElement namesElement : namesElements) {

                names.add(namesElement.getText());

            }

            clickEditIconFromTheTableList(driver.findElements(By.xpath("//tr//td[3]")));


        }


//    System.out.println(data.getProperty("masterBankName"));
    }
}