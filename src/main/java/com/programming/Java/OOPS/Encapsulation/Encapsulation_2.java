package com.programming.Java.OOPS.Encapsulation;


public class Encapsulation_2 {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
