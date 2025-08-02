package com.example.uberauthservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass // used to handle inheritance in spring data JPA
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)// helps to get the created at and update at automatically (regulates the life cycle of event)
public abstract class BaseModel {
    @Id    // This annotations makes the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // the id will be generated automatically by db according to the strategy (identity is auto increment )
    protected Long Id;

    @Column(nullable=false)
    @CreatedDate  // tells spring that only handle it for object creation
    @Temporal(TemporalType.TIMESTAMP) // format of the date object to be stored
    protected Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // tells spring that only handle it for object updation
    @Column(nullable=false)
    protected Date updatedAt;
}

