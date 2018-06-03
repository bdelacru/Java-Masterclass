package com.company;

public class Main {

    public static void main(String[] args) {
        //These are fix numbers
	    // add ' _ ' to make large numbers readable. This is new feature included after Java 7
        /* Int has a width of 32 */
	    int myMinValue = -2_147_483_648; //-2147483649 exceeds the boundaries of int
	    int myMaxValue = 2_147_483_647; //2147483648 exceeds the boundaries of int

        int myTotal = (myMinValue/2);
        /*byte has a width of 8*/
        byte myByteValue = 10; //allocated by the computer. Can be small number.

        byte myNewByteValue = (byte) (myByteValue/2); // we cast the right had side to byte because Java by default
        //assigns everything to int.

        System.out.println("myNewByteValue= " + myNewByteValue);

        /* short has a width of 16*/
        short myShortValue= 32767; // twice the amount of space of a byte and half of an integer
        short myNewShortValue = (short) (myShortValue /2);

        /*long has a width of 64*/
        long myLongValue = 9_223_372_036_854_775_807L; //larger than an int. -9_223_372_036_854_775_809L to 9_223_372_036_854_775_808L

        //create a byte, short, int, and long to 50,0000plus 10 times
        // the sum of the byte plus the short plus the integer values
        int a=50;
        byte b=10;
        short c=20;
        long d = 50_000L +(10L *(b + c +a)); // we don't need to cast because long
        // will convert int to long
        short d2 = (short)(1000 +(10 *(b + c +a))); // short and byte will need to be casted

        System.out.println("The sum is " + d);
        System.out.println("The sum is in short variable: " + d2);
    }
}
