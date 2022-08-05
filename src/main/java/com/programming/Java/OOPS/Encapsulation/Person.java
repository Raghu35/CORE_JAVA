package com.programming.Java.OOPS.Encapsulation;

/*
Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 To achieve this, you must:

1.declare class variables/attributes as private
2.provide public get and set methods to access and update the value of a private variable
**/
public class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
