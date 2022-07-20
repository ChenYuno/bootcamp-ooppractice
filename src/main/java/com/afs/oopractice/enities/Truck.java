package com.afs.oopractice.enities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Truck extends Vehicle{
    public Truck(){
        this.setName("Truck").setSpeed(80);
    }

}
