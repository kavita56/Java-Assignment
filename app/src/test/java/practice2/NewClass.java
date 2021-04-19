package practice2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
public class NewClass {



@Test
    public void loginClass()
    {
        System.out.println("Hello");
Assert.assertTrue(true);
    }
    @DataProvider(name = "login")
    public  static Object[][] getValue()
    {
        return new Object[][]{{1},{3}};

    }
@Test(dataProvider = "login")
    public void printValue(int a)
{
    System.out.println(a);
}
}
