package chapter7test;

import chapter7.CifClient;
import chapter7.PayImpl;
import chapter7.UserInf;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockCifTest {
    private PayImpl payImpl=new PayImpl();
    private CifClient cifClientMock=mock(CifClient.class);
    public String userID="2055*****";

/*正常用例*/
    @Test
    public void payNorTest() {
        UserInf userInfMock = new UserInf(userID,"lilei",10);
        userInfMock.setUserId(userID);
        userInfMock.setAge(10);
        userInfMock.setName("LiLei");

        payImpl.setCifClient(cifClientMock);

        when(cifClientMock.userQuery(anyString())).thenReturn(userInfMock);
        boolean result = payImpl.pay(userID);
        Assert.assertEquals(result, true);

    }
    /*异常用例*/
    @Test
    public void payExTest(){
        payImpl.setCifClient(cifClientMock);
        when(cifClientMock.userQuery(anyString())).thenThrow(new RuntimeException());

        boolean result= payImpl.pay(userID);
        Assert.assertEquals(result,false);
    }
}
