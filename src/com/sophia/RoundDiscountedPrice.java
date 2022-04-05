package com.sophia;

public class RoundDiscountedPrice {


    public static void main(String[] args) {
        double num = number(123.456);
        System.out.println(num);
    }
    public static double number(double n ) {

        //double input = ((123.45678f *100) % 1) /100;
        //input =123.456->123.45
//        input = input * 100;//12345.67
//        input = input % 1; //12345
//        input = input/100;//123.45
        //round Math.round.floor
        return Math.round(n);
    }
}
