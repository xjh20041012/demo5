package mocked;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import static org.mockito.Mockito.*;


public class mockedlist {

    @Test
    public void test1() {
        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();

    }
    @Test
    public void test2(){
        LinkedList mockedList=mock(LinkedList.class);
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
        System.out.println(mockedList.get(999));
        verify(mockedList).get(0);
    }
   /* @Test
    public void test3(){
        List<String> mockedList = Mockito.mock(List.class);
        when(mockedList.get(anyInt())).thenReturn("element");
        when(mockedList.contains(argThat(isValid()))).thenReturn(true);
        System.out.println(mockedList.get(999));
        verify(mockedList).get(anyInt());
    }*/
}
