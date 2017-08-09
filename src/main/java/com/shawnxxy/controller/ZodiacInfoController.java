package com.shawnxxy.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/zodiacInfo")
public class ZodiacInfoController {
    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("name", "Shawn");
        return "welcome";
    }
}
