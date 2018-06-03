package com.company;

public class Main {

    public static void main(String[] args) {
	//floating point = numbers that have decimal numbers
        //Float is single precision and double is double precision
        //double twice the about of detail than float
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue= 5d/ 3d;
        //when there is a decimal assign, java sets it to double NOT float by default
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //width of int is 32 ( 4 bytes)
        // width of float = 32 (4 bytes)
        //width of double = 64 (8 bytes)
        //double is more precise and faster on modern computers

        // Convert a given number of pounds to kilograms
        /* 1. Create a variable to store the number of pounds
        *  2. Calculate the number of Kilograms for the number
        *  above and store in a variable.
        *  3. Print out the result.
        *
        *  NOTES: 1 pound is equal to 0.45359237 kilograms */

        int pound = 1;
        double kilogram = 0.45359237;
        double converter = pound/kilogram;
        System.out.println("pound to kilogram is " + converter);

    }
}
