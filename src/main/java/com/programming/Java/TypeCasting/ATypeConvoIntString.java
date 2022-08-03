package com.programming.Java.TypeCasting;

public class ATypeCasting {
  //  Type conversion from int to String

        public static void main(String[] args) {
            // create int type variable
            int num = 10;
            System.out.println("Teh integer value is: " + num);

            // converts int to string type
            String data = String.valueOf(num);
            System.out.println("Teh string value is: " + data);
        }
    // Type conversion from String to int

        // create string type variable
        String data1 = "10";
        System.out.println("The string value is: " + data1);

        // convert string variable to int
        int num1 = Integer.parseInt(data1);
        System.out.println("The integer value is: " + num1);
    }
}