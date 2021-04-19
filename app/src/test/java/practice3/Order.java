package practice3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice2.PAGES.HomePage;
import practice2.PAGES.LoginClass;

public class Order extends BaseTest{
    @Test
    public void orderValid() {
        Assert.assertEquals(driver.getTitle().trim(), "My Store", "Verification for Page title");
        HomePage homepage = new HomePage(driver);
        LoginClass loginpage = new LoginClass(driver);
        homepage.clickSignIn();
        loginpage.userName("harrinemp@gmail.com");
        loginpage.password("harrine");
        loginpage.submitClick();
        driver.findElement(By.xpath("//span[normalize-space()='Order history and details']")).click();
    }
}
