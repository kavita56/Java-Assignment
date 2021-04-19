package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice2.PAGES.HomePage;
import practice2.PAGES.LoginClass;

public class Search extends BaseTest{
    int flag =0;
    @Test
    public void SearchCheckIn()
    {
        Assert.assertEquals(driver.getTitle().trim(),"My Store","Verification for Page title");
        HomePage homepage = new HomePage(driver);
        LoginClass loginpage = new LoginClass(driver);
        homepage.clickSignIn();
        loginpage.userName("harrinemp@gmail.com");
        loginpage.password("harrine");
        loginpage.submitClick();
        driver.findElement(By.id("search_query_top") ).sendKeys("black top");
        driver.findElement(By.xpath(" //button[@name='submit_search']")).click();
        try{
            driver.findElement(By.xpath("//span[@class='heading-counter']")).isDisplayed();

        }
        catch(NoSuchElementException e)
        {
            Assert.assertEquals(driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText(),"No results were found for your search","Verifying login");
            flag = 1;
        }
        if(flag ==1)
        {
        //p[@class='alert alert-warning']
        driver.findElement(By.xpath(" //i[@class='icon-th-list']")).click();
       // driver.findElement(By.xpath("//img[@title='Printed Dress']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();

        try
        {

            driver.findElement(By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']")).isDisplayed();
        }catch (NoSuchElementException e) {
            driver.findElement(By.xpath(" //dt[@class='first_item last_item']")).click();
            Assert.assertEquals(driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText(), "Your shopping cart is empty.", "Verifying login");

        }   }
    }
}
