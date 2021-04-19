package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import practice2.PAGES.HomePage;
import practice2.PAGES.LoginClass;

public class NewClass3 extends BaseTest{
    @DataProvider(name = "login")
    public static Object[][] test1()
    {
        return new Object[][]{{"harrinemp@gmail.com","harrine"},{"harrinemp@gmail.com","harrinemp"}};
    }
    @Test(dataProvider = "login")
    public void signTest(String username,String password)
    {
        Assert.assertEquals(driver.getTitle().trim(),"My Store","Verification for Page title");
        HomePage homepage = new HomePage(driver);
        LoginClass loginpage = new LoginClass(driver);
        homepage.clickSignIn();
        loginpage.userName(username);
        loginpage.password(password);
        loginpage.submitClick();

        try
        {

             driver.findElement(By.xpath("//a[@title='View my customer account']")).isDisplayed();
        }catch (NoSuchElementException e)
        {

            Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='There is 1 error']")).getText(),"There is 1 error","Verifying login");

        }
    }
}
