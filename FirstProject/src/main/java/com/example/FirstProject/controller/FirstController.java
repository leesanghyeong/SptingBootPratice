package com.example.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greeting")
    public String niceToMeetYou (Model model) {
        model.addAttribute("username","LeeSangHyeong");
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String byebye (Model model) {
        model.addAttribute("username","LeeSangHyeong");
        return "byebye"; //templates/byebye.mustache
    }

}
