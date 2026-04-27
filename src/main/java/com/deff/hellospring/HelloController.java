package com.deff.hellospring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(Model model, RedirectAttributes redirectAttributes) {

        String name = "Deff";
        model.addAttribute("name", name);

        return "hello";
    }

    @GetMapping("/about")
     public String about(){
        return "about";
    }

}
