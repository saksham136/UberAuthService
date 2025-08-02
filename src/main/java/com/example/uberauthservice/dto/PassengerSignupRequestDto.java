package com.example.uberauthservice.dto;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassengerSignupRequestDto {

    private String name;
    private String email;
    private String password;
    private String phoneNumber; //encrypted



}
