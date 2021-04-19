package practice2.PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver = null;
    By SignInLink = By.xpath("//a[normalize-space()='Sign in']");
    By ContactUsLink = By.xpath("//a[normalize-space()='Contact Us]");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickSignIn()
    {
        driver.findElement(SignInLink).click();
    }
    public void contactUs()
    {
        driver.findElement(ContactUsLink).click();
    }
}
