package org.bn.testproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class dogController {
    @GetMapping("/dog")
    @ResponseBody
    public String getDog(){
        return "I am dog page";
    }
}
