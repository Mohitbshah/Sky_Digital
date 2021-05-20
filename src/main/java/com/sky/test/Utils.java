package com.sky.test;


import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.sun.deploy.cache.Cache.copyFile;

public class Utils extends BasePage {
    //Reusable Method for Click
    public static void clickElementBy(By by){
        driver.findElement(by).click();
    }

    //Get Current URL
    public static void currentUrl(String text){
        driver.get(text);
    }

    //Reusable Method for Entering any Text/String (eg: entering name/password/email)
    public static void enterText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    //Reusable method for Assert equals where we want to know expected = actual
    public static String textGet(By by)
    {
        return driver.findElement(by).getText();
    }

    //Reusable method to clear the text from input box
    public static void textClear(By by) {
        driver.findElement(by).clear();
    }

    //Reusable method to check if element is present and element is not present
    public static void webElementPresent(By by) {
        if (driver.findElement(by).isDisplayed()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
    }

    //Reusable method to check if element is displayed and element is not displayed
    public static void webElementDisplayed(By by) {
        if (driver.findElement(by).isDisplayed()) {
            System.out.println("Element is Displayed");
        } else {
            System.out.println("Element is not Displayed");
        }
    }

    //Reusable method to try to click element three times if not available in first go
    public static void elementThreeTimes(By by) {
        if (driver.findElement(by).isDisplayed()) {
            driver.findElement(by).click();
        } else if (driver.findElement(by).isDisplayed()) {
            driver.findElement(by).click();
        } else if (driver.findElement(by).isDisplayed()) {
            driver.findElement(by).click();
        } else {
            System.out.println("Element is not Visible");
        }
    }


    // Method to confirm webelement is displayed
    public static void elementDisplayed(By by)
    {
        boolean element = driver.findElement(by).isDisplayed();
        Assert.assertEquals(by,element);
    }


    //Method for Implicit wait for element to be displayed
    public static void implicitWait(int time)

    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //Method for Explicit wait for element to be displayed/visible
    public static void waitForElementDisplay(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Reusable method for Explicit wait for element to be clickable
    public static void waitForElementClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //Method for Explicit wait for locator to be clickable
    public static void waitForLocatorClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //Method for Explicit wait for element to be invisible
    public static void waitForInvisibilityOfElement(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //Method for date short
    public static String shortDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("mmddyyyyHHmmss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    public static int cal(){

        int maths = 1+1;

        return maths;
    }


    //Method for date long
    public static void longDate() {
        Date ts = new Date(System.currentTimeMillis());
        Date date = new Date(ts.getTime());
        System.out.println("Current date and time is = " + date);
    }

    //Method for selecting any text/string from dropdown or list (eg: dropdown menu for month/week etc)
    public static void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Method for selecting any value i.e.numbers (eg: dropdown menu for selecting numbers)
    public static void selectTextByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }


    //Method for selecting any value i.e.numbers (eg: dropdown menu for selecting numbers)
    public static void selectByNumberDropdown(By by, int number) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(number);
    }

    //Method for selecting value from dropdown
    public static void selectByValueDropdown(By by) {
        WebElement select = new Select(driver.findElement(by)).getFirstSelectedOption();
        // WebElement option = select.getFirstSelectedOption();
        String selectedValue = select.getText();
        System.out.println(selectedValue);
    }

    //Method used for scroll to view element
    public static void scrollViewElement(By by) {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        je.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //Method used for scroll to view element
    public static void scrollViewElementFalse(By by) {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        je.executeScript("arguments[0].scrollIntoView(false);", element);
        System.out.println(element.getText());
    }

    //Method for Scroll to view element and click
    public static void scrollElementClick(By by) {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        System.out.println(element.getText());
    }

    //Method for alert to display
    public static void alertDisplay(By by, int time) {
        try {

            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            System.out.println("Alert box text " + alert.getText());
            alert.accept();

        } catch (NoAlertPresentException noAlert) {
            noAlert.getMessage();
        }
    }

    //Method to get attribute of element
    public static void attributeGet(By by, String text, int number) {
        driver.findElement(by).getAttribute(text);
    }

    //Method to get css property of element
    public static void propertyOfCss(By by, String text) {
        driver.findElement(by).getCssValue(text);
    }

    //Method to get screenshot of browser
    public static void takeScreenshot(WebDriver driver, String testName)
    {
        try {
            File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File destinationPath = new File("./src/Screenshots/" + testName + ".png");
            copyFile(sourcepath, destinationPath);
            System.out.println("screenshot saved in desired folder");
        }
        catch(Exception e)
        {
            System.out.println("Exception while taking Screenshot" + e.getMessage());
        }
    }

    //Method to get screenshot of current display full
    public static void fullDisplayScreenshot() {
        Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File("src\\Screenshot"));
        } catch (IOException ex) {
            System.out.println("There is a problem in taking a screenshot");

        }
    }

    //Method to convert date into String
    public static void StringDate()
    {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
    }

    //Method to do assert URL

    public static void assertURL(String expected)
    {
        try {
            String URL = driver.getCurrentUrl();
            Assert.assertEquals(URL, expected);
            System.out.println("Expected Result : " + expected);
            System.out.println("Actual Result : " + URL);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void getTextFromElements(By by)
    {
        String text = driver.findElement(by).getText();
    }

    //Method to do expected = actual

    public static String getTextFromElement(By by)
    {
        String text = driver.findElement(by).getText();
        return text;
    }

    public static void assertTextMessage(String expected, By by) {
        try {
            String actual = getTextFromElement(by);
            Assert.assertEquals(expected, actual);
            System.out.println("Expected Result : " + expected);
            System.out.println("Actual Result : " + actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void assertDropDown(By by, String text,By by1)
//    {
//
//        Select quantityOfProduct = new Select(driver.findElement(by));
//        String dropdownValue = quantityOfProduct.getFirstSelectedOption().getText();
//        Assert.assertEquals(text, dropdownValue);
//        System.out.println("The quantity of the " + driver.findElement(by1) + " is = " + dropdownValue);
//    }

    //Method for Hover action
    public  static void hoverAndClickOnElement (By by,By by1)
    {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.moveToElement(element).moveToElement(driver.findElement(by1)).click().build().perform();
    }

    public static void verifyPriceIsAscendingOrDescendingOrder (By by)

    {
        java.util.List<WebElement> price = driver.findElements(by);
        //  System.out.println(price.size());
        //List ourAl = new ArrayList<>();
        for (int i = 0; i<price.size(); i=i+1)
        {
            System.out.println(price.get(i).getText());
        }

    }

    public static void screenShotCucumber(Scenario scenario){
        {
            String screenshotName = scenario.getName().replaceAll(".,:;?!", "") + shortDate() + ".png";
            try {
                //This takes a screenshot from the driver at save it to the location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'Screenshots' within the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "target/cucumber-reports/screenshots" + screenshotName);
                //Copy taken sceenshot from source location to destination location
                copyFile(sourcePath, destinationPath);
                scenario.write("!!!!!!....Scenario Failed....!!!!Please see attached screenshot for the error/issue");
                //attach the screenshot to our report
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public  static void scrollUpORDown(int pixels) {
        try {
            // Scroll down to view displayed games
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0," + pixels + ")", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method to count all elements on a page by using common locator of one product
    public static void listOfElements(By by)
    {
        List all = driver.findElements(by);
        System.out.println("Total numbers are = " + all.size());
    }


    //Method to hoover /action multiple times in one menu

    public static void multipleHover(By by,By by1,By by2)
    {
        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement '1st option' to perform mouse hover
        //Use locator with contains text
        WebElement menuOption = driver.findElement(by);
        //Mouse hover menuOption '1st option'
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on '1st option' from Menu");

        //Now Select '2nd option' from sub menu which has got displayed on mouse hover of 'Music'
        WebElement subMenuOption = driver.findElement(by1);
        //Mouse hover menuOption '2nd option'
        //Use locator with contains text
        actions.moveToElement(subMenuOption).perform();
        System.out.println("Done Mouse hover on '2nd option' from Menu");

        //Now , finally, it displays the desired menu list from which required option needs to be selected
        //Now Select '3rd option' from sub menu which has got displayed on mouse hover of 'Rock'
        //Use locator with contains text
        WebElement selectMenuOption = driver.findElement(by2);
        selectMenuOption.click();
        System.out.println("Selected 'final option' from Menu");
    }
}
