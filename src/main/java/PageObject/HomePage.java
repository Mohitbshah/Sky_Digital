package PageObject;

import com.sky.test.LoadProperties;
import com.sky.test.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utils {
    LoadProperties loadProperties = new LoadProperties();

    private By _acceptcookies = By.xpath("//button[.='Agree']");
    private By _searchBar = By.cssSelector("button#masthead-search-toggle");
    private By _enterTextInSearch = By.cssSelector("input[type='search']");
    private By _editorialSection = By.cssSelector("div.c-text-body.svelte-16jvqu2");

    public void acceptCookies(){
        try {
            driver.switchTo().frame("sp_message_iframe_474555");
            Utils.waitForElementClickable(_acceptcookies, 15);
            driver.findElement(_acceptcookies).click();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println("Cookies pop up is not visible");
        }
    }
    public void clickOnSearch(){
        Utils.clickElementBy(_searchBar);
    }
    public void enterTextInSearch(){
        Utils.enterText(_enterTextInSearch,loadProperties.getProperty("enterTextInSearch"));
    }
    public void editorialSection(){
        Utils.waitForElementDisplay(_editorialSection,20);
        System.out.println(Utils.getTextFromElement(_editorialSection));
        Assert.assertEquals("Unlock the UK’s widest range of Ultra HD entertainment with Sky Q and multiscreen. Take a look at our best broadband deals and discover our range of Mobile phones and data plans.",getTextFromElement(_editorialSection));
    }
}
