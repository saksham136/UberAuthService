package com.example.uberauthservice.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassengerDto {

    private String name;
    private String email;
    private String password;
    private String phoneNumber; //encrypted
    private Date createdAt;
}
