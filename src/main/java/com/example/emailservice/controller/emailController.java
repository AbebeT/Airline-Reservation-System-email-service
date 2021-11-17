package com.example.emailservice.controller;


import com.example.emailservice.domain.Email;
import com.example.emailservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/sendEmail")
    public String sendEmail(@RequestBody Email email) {
        System.out.println("inside sendEmail service controller");
        emailService.sendSimpleEmail(email);
            return "Email sent successfully";
    }
}
