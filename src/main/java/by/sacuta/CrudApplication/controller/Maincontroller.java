package by.sacuta.CrudApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Maincontroller {

    @GetMapping("/me")
    public String AboutMe(){

        return "me";
    }
    @GetMapping("/my_contact")
    public String Contact(){

        return "contact";
    }
}

