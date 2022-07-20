package com.afs.oopractice;

import com.afs.oopractice.enities.Car;
import com.afs.oopractice.enities.Driver;
import com.afs.oopractice.enities.Engine;
import com.afs.oopractice.enities.Truck;

public class HelloWorld {

    public static void main(String[] args) {
        //case1:- AC1: A car can show message with name and speed when speedup like: Car:speed up to max speed - 120 km/h
        new Car(Engine.Gasoline).showMessage();

        //case2:- AC2: A truck can show message with name and speed when speedup like:Truck: speed up to max speed - 80 km/h
        new Truck().showMessage();

        //case3:- AC3: A driver can drive multiple types of vehicles,and can show message with the name and speed when speedup
        //- 1. when drive a car the message is: Car: speed up to max speed - 120 km/h·
        //- 2.when drive a truck the message is: Truck: speed up to max speed - 80 km/h·
        new Driver(new Car(Engine.Gasoline) ).drive();
        new Driver(new Truck() ).drive();

        // AC4: The speed of the car depends on the engine, with gasoline engine the speed is 120 km/h,and with an electric engine the speed is 200 km/h.
        new Car(Engine.Gasoline).showMessage();
        new Car(Engine.Electric).showMessage();
    }
}
