package com.deff.hellospring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(Model model) {

        String name = "Deff";
        model.addAttribute("name", name);
        model.addAttribute("className", "Java");
        model.addAttribute("classCode", 2545);
        return "hello";
    }

    @GetMapping("/about")
     public String about(){
        return "about";
    }

}
