package com.sophia;

import java.util.Arrays;

public class ReverseAList {
    public static void main(String[] args) {
        int[] list =  reverseArray(new int[]{1, 4, 3, 2});
        System.out.println(Arrays.toString(list));
    }
    public static int[] reverseArray(int[] a){
        for (int i = 0;i < (a.length/2);i++){
            int temp = a[i];//1//4
            a[i] = a[a.length-1-i];//2//3
            a[a.length-1-i] = temp;//1//4
            //i = 0=>2431
            //i=1=>2341
            //i=2=>condition false
        }
//public static int[] reverseArray(int[] a) {
//        for(int min = 0,max = a.length-1;min < max;min++,max--){
//            int temp = a[min];
//            a[min] = a[max];
//            a[max] = temp;
//
//    }
        return a;
    }
}
