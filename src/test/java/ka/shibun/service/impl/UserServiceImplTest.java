package ka.shibun.service.impl;

import ka.shibun.domain.User;
import ka.shibun.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void findOne() {
        User one = userService.selectByPrimaryKey(1L);
    }
}