package com.sandeep.learn.controller;

import com.sandeep.learn.model.Alien;
import com.sandeep.learn.repo.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class AlienController {
    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("home")
    public  String home(){
        return  "home";
    }

    @RequestMapping("/addAlien")
    public  String addAlien(Alien alien){
        alienRepo.save(alien);
        return  "home";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv = new ModelAndView("showalien");
        Optional<Alien> alien = alienRepo.findById(aid);
        List<Alien> alien2 = alienRepo.findByTech("Java");
        System.out.println(alien);
//        alien2.stream().forEach(System.out::println);
        mv.addObject(alien);
        return  mv;
    }

    @RequestMapping(path="/aliens") //, produces = "application/xml"
    @ResponseBody
    public List<Alien> getAliens(){
//        return alienRepo.findAll().toString();
        return alienRepo.findAll();
    }

    @RequestMapping(value = "/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAliens(@PathVariable int aid){
//        return alienRepo.findById(aid).toString();
        return alienRepo.findById(aid);
    }
}
