package com.sky.test;


import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.apache.commons.io.FileUtils.copyFile;


public class Utils extends BasePage {

    //Reusable Method for Click
    public static void clickElementBy(By by){
        driver.findElement(by).click();
    }

    //Reusable Method for Entering any Text/String (eg: entering name/password/email)
    public static void enterText(By by,String text){
        driver.findElement(by).sendKeys(text);
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

    //Reusable Method for date short
    public static String shortDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("mmddyyyyHHmmss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    //Reusable Method to do assert URL
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

    //Reusable Method to do expected = actual for element
    public static String getTextFromElement(By by)
    {
        String text = driver.findElement(by).getText();
        return text;
    }

    //Reusable Method to do expected = actual for String vs element
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

    //Reusable Method for takesscreenshot when test fail
    public static void screenShotCucumber(Scenario scenario){
        {
            String screenshotName = scenario.getName().replaceAll(".,:;?!", "") + shortDate() + ".png";
            try {
                //This takes a screenshot from the driver at save it to the location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'Screenshots' within the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/extent-reports/screenshots/" + screenshotName);
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
}
