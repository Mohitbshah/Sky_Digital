package PageObject;

import com.sky.test.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class DealsPage extends Utils {
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    private By _deals = By.xpath("(//*[contains(text(),'Deals')])[2]");
    private By _assertSkyDeals = By.xpath("//*[contains(text(),'Sky Deals')]");
    private By _tvDealsVisible = By.cssSelector(".text__Text-sc-1u9gciq-0.hXUHxS");
    private By _tvAndBroadband = By.xpath("(//*[contains(text(),'TV & Broadband')])[6]");
    private By _tvAndBroadbandDealsVisible = By.cssSelector(".text__Text-sc-1u9gciq-0.jfgXKe");
    private By _mobile = By.xpath("(//*[contains(text(),'Mobile')])[4]");
    private By _mobileDealsVisible = By.cssSelector(".text__Text-sc-1u9gciq-0.TLShW");
    private By _dealsPricesLoop = By.cssSelector(".box__Box-eb0ezq-0.fXhodv");


    public void clickOnDeals(){
        clickElementBy(_deals);
    }
    public void navigatingToDealsPage(){
        assertURL("https://www.sky.com/deals");
    }
    public void ableToSeeAllProductsOfSkyDeals(){
        assertTextMessage("Sky Deals",_assertSkyDeals);
    }
    public void tvFunctionalityUsability(){
        waitForElementDisplay(_tvDealsVisible,10);
        assertTextMessage("TV Deals",_tvDealsVisible);
    }
    public void tvAndBroadbandUsability(){
        clickElementBy(_tvAndBroadband);
        waitForElementDisplay(_tvAndBroadbandDealsVisible,10);
        assertURL("https://www.sky.com/deals/tvandbroadband");
        assertTextMessage("TV & Broadband Deals",_tvAndBroadbandDealsVisible);
    }
    public void mobileFunctionalityUsability(){
        clickElementBy(_mobile);
        waitForElementDisplay(_mobileDealsVisible,10);
        assertURL("https://www.sky.com/deals/mobile");
        assertTextMessage("Mobile Deals",_mobileDealsVisible);
    }
    public void dealsWithThePrice(){
        jse.executeScript("window.scrollBy(0,100)","");
        waitForElementDisplay(_dealsPricesLoop,10);
        List<WebElement> tvDeals = driver.findElements(_dealsPricesLoop);
        System.out.println("The Total TV Deals are Displayed: " + tvDeals.size());
        String totalTvDeals = String.valueOf(tvDeals.size());
        assertEquals("6",totalTvDeals);
        List<String> list = new ArrayList<String>();
        List<WebElement> dealsPriceInOffer = driver.findElements(_dealsPricesLoop);
        for (int i = 0; i < dealsPriceInOffer.size(); i = i+1)
        {
            String price = dealsPriceInOffer.get(i).getText();
            String poundPrice = price.replace("Now,","");
            list.add(poundPrice);
        }
        String[] expect = {"\n£25","\n£41","\n£37","\n£58","\n£31","\n£25"};
        List<String> expectedPrice = Arrays.asList(expect);
        assertEquals(list,expectedPrice);
    }
}
