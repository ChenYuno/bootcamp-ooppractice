package com.afs.oopractice.enities;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class Vehicle {
    private int speed;

    private String name;

    public void showMessage() {
        if (name != null) {

            System.out.println(String.format("%s:speed up to max speed - %d km/h", name, speed));
        }
    }
}
