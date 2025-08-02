package com.example.uberauthservice.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel{

    private String name;

    @Column(nullable=false, unique=true)
    private String licenseNumber;

    //1:n Driver : Booking
    @OneToMany(mappedBy="driver")
    private List<Booking> bookings=new ArrayList<>();



}
