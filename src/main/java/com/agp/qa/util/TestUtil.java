package com.agp.qa.util;

import com.agp.qa.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class TestUtil extends TestBase {

    public static long PAGE_LOAD_TIMEOUT = 60;
    public static long IMPLICIT_WAIT = 10;

    public static void takeScreenshotAtEndOfTest() throws IOException {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir");
            FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Original
        File file = new File(System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png");
        FileUtils.copyFile(source, file);

        return System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";

        // Trying ----
//        String destination = System.getProperty("user.dir") + "\\reports\\" + testCaseName + System.currentTimeMillis() + ".png";
//        File finalDestination = new File(destination);
//        FileUtils.copyFile(source, finalDestination);
//        return destination;
    }

//    public static String capture(WebDriver driver) throws IOException {
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
//                + ".png");
//        String errflpath = Dest.getAbsolutePath();
//        FileUtils.copyFile(scrFile, Dest);
//        return errflpath;
//    }

    // URL Video ->  https://www.youtube.com/watch?v=7xh371gk2ho


    // Use the Below code method for swtiching between the multiple Tab

    //    Set<String> handles = driver.getWindowHandles();
//    List<String> hList = new ArrayList<String >(handles);
//    if(switchToRightWindow(""), hList){
//        System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());
//    }
    public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String e : hList) {
            String title = driver.switchTo().window(e).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window");
                return true;
            }
        }
        return false;
    }

    public static void switchToParentWindowId(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    public static void closeAllWindows(List<String> hList, String parentWindowId) {
        for (String e : hList) {
            if (!e.equals(parentWindowId)) {
                driver.switchTo().window(e).close();
            }
        }
    }

//    public ExtentTest addScreenCaptureFromPath(String imagePath, String title) throws IOException {
//        if (imagePath == null || imagePath.isEmpty())
//            throw new IllegalArgumentException("imagePath cannot be null or empty");
//
//        ScreenCapture screenCapture = new ScreenCapture();
//        screenCapture.setPath(imagePath);
//        if (title != null) {
//            screenCapture.setName(title);
//        }
//        screenCapture.setMediaType(MediaType.IMG);
//        if (test.getObjectId() != null) {
//            screenCapture.setTestObjectId(test.getObjectId());
//        }
//        extent.addScreenCapture(test, screenCapture);
//        return addScreenCapture(screenCapture);
//    }

    public static void waiting(int timeInMilliSecond) {
        try {
            Thread.sleep(timeInMilliSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollTo(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript(Script,Arguments);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void scrollToTop(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,0)");
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript(Script,Arguments);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void scrollToTop() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(1000,0)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void isSelected(WebElement webElement) {
        try {
            if (!webElement.isSelected()) {
                webElement.click();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void isSelectedExcel(WebElement webElement, String value) {
        try {
            if (!webElement.isSelected()) {
                webElement.click();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void actionMethod(WebElement webElement) {
        try {
            Actions action = new Actions(driver);
            action.moveToElement(webElement).click().build().perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void actionMethodDropDown(WebElement webElement) {
        try {
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void selectMethodExcelString(WebElement webElement, String value) {
        try {
            Select select = new Select(webElement);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    public static void selectMethod(WebElement webElement){
//        try {
//            Select select = new Select(webElement);
//            select.selectByVisibleText();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }


    public static void javaScriptClick(WebElement webElement) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
//            JavascriptExecutor js = (JavascriptExecutor)driver;
//            js.executeScript("arguments[0].click();", webElement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void explicitWait(WebElement waitWebElement) {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOf(waitWebElement));

//        wait.until(ExpectedConditions.visibilityOfElementLocated((By) waitWebElement));
    }

    public static void clickOnExplicitWait(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }

    public static void click(WebElement clickWebElement) {
        try {
            clickWebElement.click();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clickWebElement);
        }
    }

    public static void clickExcel(WebElement clickWebElement, String value) {
        try {
            clickWebElement.click();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clickWebElement);
        }
    }


    public static void sendKeyNormalExcel(WebElement sendKeyNormalElement, String value) {
        try {
            sendKeyNormalElement.sendKeys(value);
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + sendKeyNormalElement);
        }
    }

    //
    public static void sendKeyNormal(WebElement sendKeyNormalElement) {
        try {
            sendKeyNormalElement.sendKeys();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + sendKeyNormalElement);
        }
    }

    public static String getTextFromUI(WebElement getTextUI) {
        String value = null;
        try {
            value = getTextUI.getText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return value;
    }

    public static String getSplitStringOfFirstArray(WebElement getStringForStill) {
        String fullString = TestUtil.getTextFromUI(getStringForStill);
//            System.out.println("----------------" + fullString);
        String[] splitingAtringIntoArrays = fullString.split(": ");
        String finalSplitStringToBeUse = splitingAtringIntoArrays[1];
        String verifyFinalString = finalSplitStringToBeUse;
        return verifyFinalString;
    }


    public static void sendKeyWithDataProperties(WebElement sendKeyWithDataElementWebElement, String str) {
        try {
            sendKeyWithDataElementWebElement.sendKeys(prop.getProperty(str));
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator input " + sendKeyWithDataElementWebElement.getTagName());
        }
    }

    public static void clearElement(WebElement clearElement) {
        try {
            clearElement.clear();
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clearElement);
        }
    }
    // companyListSearch.sendKeys(Keys.CONTROL, "a",Keys.BACK_SPACE);

    public static void clearElementThroughKeys(WebElement clearElement) {
        try {
            clearElement.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clearElement);
        }
    }

    public static void useTabElementThroughKeys(WebElement clearElement) {
        try {
            clearElement.sendKeys(Keys.CONTROL, "a", Keys.TAB);
        } catch (NoSuchElementException e) {
            System.out.println("Bad Luck! No Such Element Found for the Locator " + clearElement);
        }
    }

    // Date Format  with Slash
//    public static Object fetchCurrentDateFormatSlash() {
//        try {
//
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDateTime now = LocalDateTime.now();
//            String dateInString = dtf.format(now);
//
//
//        } catch (NoSuchElementException e) {
//            System.out.println("Bad Luck! fetchCurrentDateFormatSlash not Fetch " );
//        }
//
//        return dateInString;
//
//    }

    // Date Format  with Hiphen

//    public static Object fetchCurrentDateFormatHiphen() {
//        try {
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//            LocalDateTime now = LocalDateTime.now();
//            String dateInString = dtf.format(now);
//
//        } catch (NoSuchElementException e) {
//            System.out.println("Bad Luck! fetchCurrentDateFormatHiphen not Fetch " );
//        }
//
//        return dateInString;
//    }

    public static Integer generateRandomNumber() {
        Random random = new Random();
        Integer randomNumberGenerated = random.nextInt();
        return randomNumberGenerated;
    }


    public static void keyboardActionMethodPressEsc() {
        try {
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ESCAPE).build().perform();
        } catch (Exception ae) {
            ae.printStackTrace();
        }

    }


    public static void keyboardActionRobotPressEsc() {
        try {

            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);

        } catch (Exception ae) {
            ae.printStackTrace();
        }

    }

    public static void highlightElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);

        try {
            Thread.sleep(500);
        } catch (Exception ex) {
            ex.getMessage();
        }
        jse.executeScript("arguments[0].style.border=''", element);
    }

    public static boolean isElementPresent(WebElement locator) {
        boolean flag = false;
        try {
            flag = locator.isDisplayed();
            if (flag) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean isElementPresent(List<WebElement> locator, int index) {
        boolean flag = false;
        try {
            flag = locator.get(index).isDisplayed();
            if (flag) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static void isDisplayed() {

    }

    public static ArrayList<String> getDataFromExcel(String sheetName, String firstRowColumnName, String rowDataFetchFromExcel) throws IOException {

        ArrayList<String> a;

        {
            a = new ArrayList<>();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\excel\\qa\\testdata\\TestData.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            int sheets = workbook.getNumberOfSheets();
            for (int i = 0; i < sheets; i++) {
                if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                    XSSFSheet sheet = workbook.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator(); // sheet is the collection of the rows
                    Row firstRow = rows.next();
                    Iterator<Cell> ce = firstRow.cellIterator(); // row is collection of the cells
                    int k = 0;
                    int column = 0;
                    while (ce.hasNext()) {
                        Cell value = ce.next();
                        if (value.getStringCellValue().equalsIgnoreCase(firstRowColumnName)) {
                            column = k;
                        }
                        k++;
                    }
                    System.out.println(column);
                    while (rows.hasNext()) {
                        Row r = rows.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(rowDataFetchFromExcel)) {
                            Iterator<Cell> cv = r.cellIterator();
                            while (cv.hasNext()) {
                                Cell c = cv.next();
                                if (c.getCellType() == CellType.STRING) {
                                    a.add(cv.next().getStringCellValue());
                                } else {
                                    a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                                }
                            }
                        }
                    }
                }
            }
            return a;
        }

    }

    public void editIconOfAdded(String addedDataName, String tableDataColumnNameXpath, String nextBtnXapthValue, String editIconXpathValue) {

        List<WebElement> namesElements = driver.findElements(By.xpath(tableDataColumnNameXpath));

        List<String> names = new ArrayList<String>();

        for (
                WebElement nameElement : namesElements) {
                 names.add(nameElement.getText());
        }

//        public void loopingForValidData(){
//
//            int size = namesElements.size();
//            System.out.println(size);
//            for (int i = 0;i < size; i++) {
//                String get_text = namesElements.get(i).getText();
//                System.out.println(get_text);
//                if (bankName.equals(get_text)) {
//                    System.out.println("++++++++++++++++++++++++++++" + "Text verified");
//
//                    // Edit Icon Click List of WebElements of the Tabled
//                    List<WebElement> finalElements = driver.findElements(By.xpath(editIconXpathValue));
//
//                    System.out.println(finalElements.get(i));
//
//                    Thread.sleep(1000);
//                    finalElements.get(i).click();
//                    ;
//                    System.out.println("verified");
////                    break;
//
//                }
//            }
//
//        }

    }

    public void editIconClickInDynamicValueTable() {

    }

//    public void editDataFromDynamicTable() throws InterruptedExceptionString {
//
//        bankName = "STATE BANK OF TRAVANCORE";
//
//        List<WebElement> namesElements = driver.findElements(By.xpath("//tr//td[3]"));
//
//        List<String> names = new ArrayList<String>();
//
//        for (
//                WebElement nameElement : namesElements) {
//
//            names.add(nameElement.getText());
//
//        }
//
//        int size = namesElements.size();
//        System.out.println(size);
//        for (int i = 0;i < size; i++) {
//            String get_text = namesElements.get(i).getText();
//            System.out.println(get_text);
//            if (bankName.equals(get_text)) {
//                System.out.println("++++++++++++++++++++++++++++" + "Text verified");
//
//                // Edit Icon Click List of WebElements of the Tabled
//                List<WebElement> finalElements = driver.findElements(By.xpath("//tr//td[6]//button[@type='button']//i[@class='fa fa-pencil']"));
//
//                System.out.println(finalElements.get(i));
//
//                Thread.sleep(1000);
//                finalElements.get(i).click();
//                ;
//                System.out.println("verified");
////                    break;
//
//            }
//        }
//
////        WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
//
//        while (!names.contains(bankName)) {
//
//            WebElement nextBtn = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
//
//            nextBtn.click();
//
//            Thread.sleep(1000);
//
//            namesElements = driver.findElements(By.xpath("//tr//td[3]"));
//
//            for (WebElement namesElement : namesElements) {
//
//                names.add(namesElement.getText());
//
//            }
//
//            int size1 = namesElements.size();
//            System.out.println(size1);
//            for (int i = 0; i < size1; i++) {
//                String get_text = namesElements.get(i).getText();
//                System.out.println(get_text);
//                if (bankName.equals(get_text)) {
//                    System.out.println("++++++++++++++++++++++++++++" + "Text verified");
//
//                    // Edit Icon Click List of WebElements of the Tabled
//                    List<WebElement> finalElements = driver.findElements(By.xpath("//tr//td[6]//button[@type='button']//i[@class='fa fa-pencil']"));
//
//                    System.out.println(finalElements.get(i));
//
//                    Thread.sleep(1000);
//                    finalElements.get(i).click();
//                    ;
//                    System.out.println("verified");
////                    break;
//
//                }
//            }
//
//        }
//
//
//    }


}
