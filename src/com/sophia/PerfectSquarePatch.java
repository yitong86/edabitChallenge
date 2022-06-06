package com.sophia;

import java.util.Arrays;

public class PerfectSquarePatch {
    public static void main(String[] args) {
        int num = 3;
        int[][] square = squarePatch(num);//call this method and signe the value
        System.out.println("SquarePatch(" +num+") ->[");
        for (int i = 0; i < square.length; i++) {
            System.out.println("\t" + Arrays.toString(square[i]));
        }
        System.out.println("]");
    }


    public static int[][] squarePatch(int n) {//param

        //n will determine the number of sub-arrays
        //n will determine the element value within each sub array
        // n will determine the value of each element within each sub-array

        int numOfSubArr = n;
        int numOfArrElms = n;
        int valueOfElms = n;
        int[][] squareArray = new int[n][n];

        for (int i = 0; i < squareArray.length; i++) {

            System.out.println(Arrays.toString(squareArray[i]));
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.println(squareArray[i][j]);
                squareArray[i][j] = valueOfElms;
            }
        }

//        for(int[] subarr:squareArray){
//            Arrays.fill(subarr,n);
//        }
//        for(int[] subarr:squareArray){
//            for(int i = 0;i<subarr.length;i++){
//                subarr[i]=n;
//            }
//        }
           return squareArray;
    }
}

  //implement
