package com.sandeep.learn.controller;

import com.sandeep.learn.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

//    @RequestMapping("home")
//    public String home(HttpServletRequest httpServletRequest){
//        HttpSession session = httpServletRequest.getSession();
//        String name = httpServletRequest.getParameter("name");
//        session.setAttribute("name", name);
//        System.out.println("home called " );
//        return "home";
//    }

//    @RequestMapping("home")
//    public ModelAndView home(@RequestParam("name") String nam){
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", nam);
//        mv.setViewName("home");
//        return mv;
//    }

    @RequestMapping("home_temp")
    public ModelAndView home(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");
        return mv;
    }
}
