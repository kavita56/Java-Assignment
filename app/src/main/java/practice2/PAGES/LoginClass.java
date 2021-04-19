package practice2.PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
    WebDriver driver = null;
    By UserName = By.id("email");
    By Password = By.id("passwd");
    By SubmitClickIn = By.xpath("//i[@class='icon-lock left']");
    public LoginClass(WebDriver driver)
    {
        this.driver = driver;
    }
    public void userName(String username)
    {
        driver.findElement(UserName).sendKeys(username);
    }
    public void password(String paswd)
    {
        driver.findElement(Password).sendKeys(paswd);
    }
    public void submitClick()
    {
        driver.findElement(SubmitClickIn).click();
    }
}
