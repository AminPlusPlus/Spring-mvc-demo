package com.amin.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return  "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFromTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        String name =request.getParameter("studentName");
        String result = "Yo  :" + name.toUpperCase();
        model.addAttribute("message",result);

        return "helloworld";
    }

    @RequestMapping("/processFormThree")
    public String processFromThree(@RequestParam("studentName") String name, Model model) {
        String result = "Yo  :" + name.toUpperCase();
        model.addAttribute("message",result);
        return "helloworld";
    }


}
