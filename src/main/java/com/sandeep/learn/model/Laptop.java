package com.sandeep.learn.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Lappy")
@Data
public class Laptop {
    private int id;
    private String name;

    public void compile(){
        System.out.println("Compiling laptop");
    }
}
