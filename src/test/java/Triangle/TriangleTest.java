package Triangle;

import ParameterTesting.CharUtils;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TriangleTest {
    TriangleInterface tr=new TriangleInterfaceImpl();
    @DataProvider
    public Object[][] ValidDataProvider() {
        return new Object[][]{
                { 2,3,4,"一般三角形" },
                { 0,2,6,"无效输入" },
                { 101,30,40,"无效输入" },
                { 10,0,15,"无效输入" },
                { 10,101,12,"无效输入" },
                { 10,10,0,"无效输入" },
                { 10,10,101,"无效输入" },
                { 1,2,4,"不能构成三角形" },
                { 1,4,2,"不能构成三角形" },
                { 5,2,1,"不能构成三角形" },
                { 3,3,2,"等腰三角形" },
                { 2,3,3,"等腰三角形" },
                { 3,2,3,"等腰三角形" },
                { 2,5,4,"一般三角形" },
                { 6,6,6,"等边三角形" },
                { 5,6,11,"不能构成三角形" },
                { 6,9,17,"不能构成三角形" },
        };
    }
    /*@Test(dataProvider = "ValidDataProvider")*/
    @Test(dataProvider = "testData")
    public void TriangleTest(int a,int b,int c,String result){
       String rs=tr.Triangle(a, b, c);
        Assert.assertEquals(result, rs);
    }
}


