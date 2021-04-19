package practice3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import practice2.PAGES.HomePage;

import java.util.concurrent.TimeUnit;
public class SignUp extends BaseTest {
    @Test
    public void signUpTest()  {

        Assert.assertEquals(driver.getTitle().trim(), "My Store", "Verification for Page title");
        HomePage homepage = new HomePage(driver);
        homepage.clickSignIn();

        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kavitaagarwal@gmail.com");
        driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("K");

        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("A");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("kavitha");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("abcd");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("xyz");
        Select se = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
        se.selectByVisibleText("Alaska");
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("123");
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//span[normalize-space()='K A']")).getText(),"K A","Verifying login");

    }
}
