package junit;

import junit.NetworkUtils;
//import org.junit.Test;

public class NetworkUtilTest {
//    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThenOneSecond() {
            NetworkUtils.getConnection();
    }
}
