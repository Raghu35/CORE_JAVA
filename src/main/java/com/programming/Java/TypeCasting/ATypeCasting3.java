package com.programming.Java.TypeCasting;

public class ATypeCasting3 {

    public static void main(String[] args) {

        //  int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        //   int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //  long myLongValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        //  long bigLongLiteralValue = 2_147_483_647_234;
      /* Please look into above two lines where L is included ,
                             if not included number will treated as Integer */

        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        // short bigShortLiteralValue1 = 32768;
        // here 32767 is max value for short and if 32768 is overflow

        System.out.println(bigShortLiteralValue);
    }
}
