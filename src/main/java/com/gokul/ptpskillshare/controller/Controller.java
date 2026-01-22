package com.gokul.ptpskillshare.controller;


import com.gokul.ptpskillshare.model.Skill;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello")
    String greet(){
        return "Hello world";
    }

    @GetMapping("/hi")
    int num(){return 7;}

    @PostMapping("/learning")
    Skill addLearningSkill(@RequestBody Skill skill) {
        return skill;
    }

}