package PageObject;

import com.sky.test.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SignInPage extends Utils {

    private By _signIn = By.cssSelector("a.tab-focus.sign-in-link");
    private By _emailOrUserName = By.cssSelector("#username");
    private By _password = By.cssSelector("#password");
    private By _signInButton = By.cssSelector("#signinButton");
    private By _errorMessage = By.cssSelector(".globalErrors");


    public void clickOnSignIn(){
        Utils.clickElementBy(_signIn);
    }
    public void assertSignInPageUrl(){
        assertURL("https://skyid.sky.com/signin?successUrl=https%3A%2F%2Fwww.sky.com%2F&cancelUrl=https%3A%2F%2Fwww.sky.com%2F");
    }
    public void enterCredentials(String emailOrUsername, String password) {
        enterText(_emailOrUserName,emailOrUsername);
        enterText(_password,password);
    }
    public void clickOnSignInButton(){
        clickElementBy(_signInButton);
    }
    public void errorMessage(){
        waitForElementDisplay(_errorMessage,10);
        System.out.println(getTextFromElement(_errorMessage));
        Assert.assertEquals("Sorry, we did not recognise either your username or password",getTextFromElement(_errorMessage));
    }
}
