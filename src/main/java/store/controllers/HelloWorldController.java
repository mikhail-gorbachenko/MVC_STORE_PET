package store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

   @GetMapping({"/", "/welcome"})
    public String hello(ModelMap model){
        model.addAttribute("message", "Strike the earth!");
        return "hello";
    }

}
