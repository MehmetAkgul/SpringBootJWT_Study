package com.springbootjwt_study.springbootjwt_study;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class StudentController {

    @GetMapping(path = "/student")
    public String getStudent(String student){
        return "Mehmet Akgül'e Hayırlı offer'lar";
    }
}
