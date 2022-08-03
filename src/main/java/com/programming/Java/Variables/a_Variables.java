package com.programming.Java.Variables;

public class a_Variables
    {
        static int m=100;//static variable

        int data=50;//instance variable
        void method()
        {
            int n=90;//local variable
            System.out.println("Local Variable: " +n);
        }
        public static void main(String args[])
        {
            int var = 10; // Declared a Local Variable
            // This variable is local to this main method only
            System.out.println("Local Variable: " + var);

            System.out.println("Static Variable: " + m);

            a_Variables b = new a_Variables();
            b.method();

            System.out.println("Instance Variable: " +b.data);
        }
    }//end of class
