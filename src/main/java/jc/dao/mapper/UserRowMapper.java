package jc.dao.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import jc.dao.entity.User;

/**
 * Created by ½ð³É on 2015/7/14.
 */
public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();
        user.setID(resultSet.getLong("ID"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }
}
