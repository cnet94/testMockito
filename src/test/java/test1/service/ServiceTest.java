package test1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import test1.dao.Dao;
import test1.entity.User;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

    @Mock
    Dao dao;

    Service service;

    @Test
    public void getUserById() {
        User testUser = new User(6,"Jack",55);
        when(dao.getById(1)).thenReturn(testUser);
        service = new Service();
        User actualUser = service.getUserById(1);

        assertEquals(testUser, actualUser);
    }
}