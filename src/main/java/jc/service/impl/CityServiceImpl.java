package jc.service.impl;

import jc.dao.ICityDao;
import jc.dao.entity.City;
import jc.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 金成 on 2015/7/13.
 */
@Transactional
@Service("cityService")
public class CityServiceImpl implements ICityService {

    @Autowired
    private ICityDao cityDao;


    @Override
    public List<Map<String, Object>> findAllcities() {


        List<City> cityList = cityDao.findAllCities();
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();

        String className = City.class.getName();
        Field fields[] = null;
        try{

            fields = Class.forName(className).getDeclaredFields();

            for(City item:cityList) {
                Map<String, Object> map = new HashMap<String, Object>();
                for(Field field:fields){
                    field.setAccessible(true);
                    map.put(field.getName(), field.get(item));
                }
                mapList.add(map);
            }



        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }

        return mapList;
    }
}
