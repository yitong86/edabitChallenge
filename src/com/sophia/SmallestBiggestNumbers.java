package com.sophia;
import java.util.*;
public class SmallestBiggestNumbers {

        public static double[] minMax(double[] arr) {
            double biggest = arr[0];
            double smallest =arr[0];

            for(int i = 1;i<arr.length;i++){
                if(arr[i] > biggest){
                    biggest = arr[i];
                }else if(arr[i] < smallest){
                    smallest = arr[i];
                }
            }
            double[] array = {smallest,biggest};
            return array;

        }
    }
//    minMax([1, 2, 3, 4, 5]) ➞ [1, 5]
//
//        minMax([2334454, 5]) ➞ [5, 2334454]
//
//        minMax([1]) ➞ [1, 1]