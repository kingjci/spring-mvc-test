package jc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 金成 on 2015/7/14.
 */

@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/404")
    public ModelAndView error_404(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return modelAndView;
    }

}
