package com.afs.oopractice.enities;

import lombok.Data;

@Data
public class Driver {

    private Vehicle vehicle;
    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.showMessage();
    }
}
