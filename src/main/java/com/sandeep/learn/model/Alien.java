package com.sandeep.learn.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Component
//@Scope(value="prototype")
@Entity
@Getter
@Setter
@ToString
public class Alien {

    @Id
    private int aid;

    private String aname;
    private String tech;
//    private String tech;
//
//    @Autowired
//    @Qualifier("Lappy")
//    private Laptop lappy;
//
//    public Alien() {
//        System.out.println("Object Created ");
//    }
//
//    public void show(){
//        System.out.println("Show is on ");
//        lappy.compile();
//    }

}

