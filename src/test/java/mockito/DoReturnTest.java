package mockito;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class DoReturnTest {
    static List mockList = mock(List.class);

    @Test
    public void test1() {
        when(mockList.get(1)).thenReturn("alex");
        assertEquals("alex", mockList.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void test2() {
        when(mockList.get(1)).thenThrow(new RuntimeException());
        mockList.get(1);

    }

    @Test
    public void test3() {
        when(mockList.get(anyInt())).thenReturn("Oleg");
        assertEquals("Oleg", mockList.get(999));
    }

    @Test
    public void test4() {
        doAnswer(a -> {
            int num = a.getArgument(0);
            return num * num;
        }).when(mockList).get(anyInt());

        assertEquals(25, mockList.get(5));
    }

    @Test
    public void test5() {
        String a = String.valueOf(mockList.get(1));
        mockList.clear();
        verify(mockList).get(1);
        verify(mockList, times(3)).clear();

    }
}
