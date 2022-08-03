package com.programming.Java.TypeCasting;

public class ATypeCasting2 {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // byte myNewByteValue =  (myMinByteValue / 2);
        // byte/Int = Int,     so Int cannot be saved into byte , so casting is required

        short myNewShortValue = (short) (myMinShortValue / 2);
        //   short myNewShortValue =  (myMinShortValue / 2);
        // Short/Int = Int,  so Int cannot be saved into Short , so casting is required

        System.out.println("bigShortLiteralValue = " + bigShortLiteralValue);
        System.out.println("myTotal = " + myTotal);
        System.out.println("myNewByteValue = " + myNewByteValue);
        System.out.println("myNewShortValue = " + myNewShortValue);
    }
}
