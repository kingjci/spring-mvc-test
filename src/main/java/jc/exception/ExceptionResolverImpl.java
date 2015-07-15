package jc.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by ½ð³É on 2015/7/14.
 */
public class ExceptionResolverImpl implements HandlerExceptionResolver{

    private static final Logger logger = LoggerFactory.getLogger(ExceptionResolverImpl.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {



        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String exception = sw.toString();

        ModelAndView modelAndView = new ModelAndView("exception");
        modelAndView.addObject("exception", exception);
        return modelAndView;
    }
}
