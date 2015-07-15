package jc;

import jc.service.ICityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by 金成 on 2015/7/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( "file:src/main/webapp/WEB-INF/xml/*")
public class DaoTest{

    @Autowired
    protected ICityService cityService;

    @Test
    public void testCityService(){

        List<Map<String, Object>> list = cityService.findAllcities();
        for(Map<String, Object> item : list){
            System.out.println(item.get("ID").toString()+','+item.get("Name")+','+item.get("Population")+','+item.get("CountryCode").toString()+','+item.get("District"));
        }
    }

}
