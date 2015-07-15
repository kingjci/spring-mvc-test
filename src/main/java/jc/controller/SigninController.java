package jc.controller;

import jc.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by 金成 on 2015/7/14.
 */

@Controller
@RequestMapping("/signin")
public class SigninController {

    static final Logger logger = LoggerFactory.getLogger(SigninController.class);


    @RequestMapping("")
    public ModelAndView signin(HttpSession session){

        ModelAndView modelAndView = new ModelAndView("signin");
        Boolean sessionLogin = (Boolean)session.getAttribute("signin");
        if (sessionLogin != null && sessionLogin){
            modelAndView.setViewName("signresult");
            modelAndView.addObject("result", "已登录，无需重复登陆");
        }

        return modelAndView;
    }


    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/action", method = RequestMethod.POST)
    public ModelAndView login(
                                @RequestParam(value = "inputUsername") String inputUsername,
                                @RequestParam(value = "inputPassword") String inputPassword,
                                HttpSession session
    ){

        ModelAndView modelAndView = new ModelAndView("signresult");

        boolean loginResult = userService.login(inputUsername, inputPassword);

        if (loginResult){
            modelAndView.addObject("result", "登陆成功");
            session.setAttribute("signin", true);
            session.setMaxInactiveInterval(60*60);
        }
        else{
            modelAndView.addObject("result", "登录失败");
        }

        return modelAndView;
    }

    @RequestMapping("/signoff")
    public ModelAndView signoff(HttpSession session){

        session.removeAttribute("signin");

        ModelAndView modelAndView = new ModelAndView("redirect:/signin");

        return modelAndView;
    }


}
