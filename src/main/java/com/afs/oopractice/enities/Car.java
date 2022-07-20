package com.afs.oopractice.enities;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Car extends Vehicle {


    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        this.setName("Car");
        if (this.engine == Engine.Gasoline) {
            this.setSpeed(120);
        } else {
            this.setSpeed(200);
        }
    }

}
