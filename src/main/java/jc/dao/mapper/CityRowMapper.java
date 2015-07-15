package jc.dao.mapper;

import jc.dao.entity.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 金成 on 2015/7/13.
 */
public class CityRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        City item = new City();
        item.setID(resultSet.getLong("id"));
        item.setName(resultSet.getString("Name"));
        item.setCountryCode(resultSet.getString("CountryCode"));
        item.setDistrict(resultSet.getString("District"));
        item.setPopulation(resultSet.getLong("Population"));
        return item;
    }
}