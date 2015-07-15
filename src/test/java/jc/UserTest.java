package jc;


import static org.junit.Assert.*;
import jc.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

/**
 * Created by ½ð³É on 2015/7/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( "file:src/main/webapp/WEB-INF/xml/*")
public class UserTest {


    @Autowired
    private IUserService userService;

    @Test
    public void testUserService(){

        boolean result = userService.login("admin", "admin");
        assertEquals(result, true);

        result = userService.login("admin", "123456");
        assertEquals(result, false);

    }

}
