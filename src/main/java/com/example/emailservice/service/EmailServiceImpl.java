package com.example.emailservice.service;

import com.example.emailservice.domain.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleEmail(Email email ){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("abe.habesha@gmail.com");
        message.setTo(email.getSendTo());
        message.setText(email.getEmailBody());
        message.setSubject(email.getEmailSubject());
        mailSender.send(message);
        System.out.println("Mail send....");
    }
}
