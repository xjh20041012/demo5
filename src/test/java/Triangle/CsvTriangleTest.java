package Triangle;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    /**
     *
     * @author LTao 使用TestNG和CSV文件进行数据驱动
     */
    public class CsvTriangleTest {
        TriangleInterface tr=new TriangleInterfaceImpl();

        //TestNG定义一个DataProvider
        @DataProvider(name = "testData")
        public static Object[][] words() throws Exception {

            return getData("src/main/resources/testDate.csv");

        }

        //利用TestNG的特性，可以直接在方法中传入参数，这些参数从DataProvider中数据化传进来
        @Test(dataProvider = "testData")
        public void testDtaa(String a, String b, String c,String result) {

            String rs=tr.Triangle(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(c));
            Assert.assertEquals(result, rs);
        }
        public static Object[][] getData(String filePath) throws Exception {

            String line;

            //定义list来存放CSV中的数据，数组存放的是每行的数据
            List<String[]> list = new ArrayList<String[]>();

            //定义一个BufferedReader方便一行一行来读取csv中的数据
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(filePath)));

            //先读一行，第一行定义的是关键字对应的解释语言，不用存放到list中，
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] fileds = line.split(","); //获取每行的数据
                list.add(fileds);
            }
            br.close();

            //定义object[][]二维数组，用list.size()定义二维数组行的限度
            Object[][] result = new Object[list.size()][];

            for (int i = 0; i < list.size(); i++) {

                result[i] = list.get(i); //将CSV每行中的数据存放到二维数组中

            }

            return result;
        }

    }

