package br.dev.luizdev.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
    
    @GetMapping("/create")
    public String getCreateString(){
        return "Create";
    }

}
