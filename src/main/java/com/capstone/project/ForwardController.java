package com.capstone.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardController {

    @GetMapping(value = "/register")
    public String forward(){
        return "forward:/";
    }

}
///**/{path:^\.]*}