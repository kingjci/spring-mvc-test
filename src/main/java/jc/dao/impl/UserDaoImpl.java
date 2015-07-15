package jc.dao.impl;

import jc.dao.IUserDao;
import jc.dao.entity.User;
import jc.dao.mapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ½ð³É on 2015/7/14.
 */


@Repository("userDao")
public class UserDaoImpl implements IUserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public String login(String username) {

        String sql = "select password from helloworld_users where username=?";

        return jdbcTemplate.queryForObject(sql, new Object[]{username}, String.class);
    }

}
