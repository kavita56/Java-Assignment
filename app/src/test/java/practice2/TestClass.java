package practice2;

import org.testng.annotations.*;

public class TestClass {
    @BeforeMethod

    public void test1()
    {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void test2()
    {
        System.out.println("After Method");
    }
    @BeforeClass
    public void test3()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public void test4()
    {
        System.out.println("After Class");
    }
    @BeforeTest
    public void test5()
    {
        System.out.println("Before Test");
    }
    @AfterTest
    public void test6()
    {
        System.out.println("After Test");
    }
    @Test
    public void test7()
    {
        System.out.println("In the test 1");
    }
    @Test
    public void test8()
    {
        System.out.println("In the test 2");
    }
    @BeforeSuite
    public void test9()
    {
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void test10()
    {
        System.out.println("After Suite");
    }
}
