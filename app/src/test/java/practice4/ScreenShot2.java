package practice4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class ScreenShot2 {
    public WebDriver driver;
    @Test
    public void captureScreenshot() throws Exception
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");


    }
@AfterMethod
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        try
        {
            TakesScreenshot ts=(TakesScreenshot)driver;

            File source=ts.getScreenshotAs(OutputType.FILE);

            FileHandler.copy(source, new File("/Users/kavitaagarwal/"+result.getName()+".png"));
            System.out.println("Screenshot taken");

        }
        catch (Exception e)
        {
            System.out.println("Exception while taking screenshot "+e.getMessage());
        }
        driver.quit();

    }
}
