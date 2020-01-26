package org.bn.testproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView modelAndView(ModelAndView modelAndView){
        modelAndView.addObject("user",new User("biser","biser@abv.bg",31));
        modelAndView.setViewName("index");
        return  modelAndView;
    }
    @GetMapping("/{name}")
    @ResponseBody
    public String home(@PathVariable(name="name") String name){
        return "HELLO," + name;
    }
}
