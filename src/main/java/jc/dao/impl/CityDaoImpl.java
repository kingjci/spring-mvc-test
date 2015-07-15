package jc.dao.impl;

import jc.dao.ICityDao;
import jc.dao.entity.City;
import jc.dao.mapper.CityRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 金成 on 2015/7/13.
 */

@Repository("cityDao")
public class CityDaoImpl implements ICityDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @SuppressWarnings("unchecked")
    public List<City> findAllCities() {
        String sql = "select * from city";

        return jdbcTemplate.query(sql, new CityRowMapper());
    }
}
