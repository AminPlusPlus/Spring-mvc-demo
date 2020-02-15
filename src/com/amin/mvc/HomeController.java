package com.amin.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
      return "index";
    }

    @RequestMapping("/next")
    public String showSecond(){
        return "Next";
    }
}
