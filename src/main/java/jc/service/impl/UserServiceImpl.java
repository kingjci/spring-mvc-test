package jc.service.impl;

import jc.dao.IUserDao;
import jc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ½ð³É on 2015/7/14.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public boolean login(String username, String password) {

        String passwordFromDB = userDao.login(username);


        if (password.equals(passwordFromDB)){
            return true;
        }
        else{
            return false;
        }



    }
}
