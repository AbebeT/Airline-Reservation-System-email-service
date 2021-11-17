package com.example.emailservice.domain;


import lombok.Data;

@Data
public class Email {
    private String sendTo;
    private String emailBody;
    private String emailSubject;
}

