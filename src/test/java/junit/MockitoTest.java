package junit;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {
    @Mock
    List<String> mockList;
    @Spy
    List<String> spyList = new ArrayList<>();

    @Test
    public void initMockList() {
        //these methods will NOT work
        mockList.add("one");
        mockList.add("two");
    }

    @Test
    public void initSpyList() {
        //these methods will work
        spyList.add("three");
        spyList.add("four");
    }
}
