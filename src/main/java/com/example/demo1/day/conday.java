package com.example.demo1.day;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class conday {
    @GetMapping("/day")
    public String day(@RequestParam(name="name")String name, Model model){
        model.addAttribute("name",name);
        return "day";
    }
}
