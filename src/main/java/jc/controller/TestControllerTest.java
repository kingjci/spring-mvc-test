package jc.controller;

import jc.dao.entity.City;
import jc.service.ICityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


/**
 * Created by 金成 on 2015/7/11.
 */

@Controller
@RequestMapping("/test")
public class TestControllerTest {

    static final Logger logger = LoggerFactory.getLogger(TestControllerTest.class);

    @RequestMapping("")
    public String printWelcome(ModelMap modelMap) throws Exception{
        modelMap.addAttribute("message","请输入参数");
        logger.error("this is a logger");


        System.out.println("this is a test");
        List<City> list;
        return "index";
    }

    @RequestMapping("/{what}")
    public ModelAndView printTest(@PathVariable("what") String what){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("message",what);
        return modelAndView;
    }

    @Autowired
    private ICityService cityService;
    @RequestMapping("/city")
    public ModelAndView queryCity(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("city");


        List<Map<String, Object>> list =cityService.findAllcities();

        modelAndView.addObject("cities", list);
        return modelAndView;
    }

}
