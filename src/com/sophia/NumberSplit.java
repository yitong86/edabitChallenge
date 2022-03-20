package com.sophia;

import java.util.ArrayList;
import java.util.*;

public class NumberSplit {
    public static void main(String[] args) {
        System.out.println(numberSplit(10)); ;
    }

   // public class HalfSplit {
        public static int[] numberSplit(int n) {
            if( n % 2 == 0 ){
                int[] array = {n/2,n/2};
                return array;
            }else{//-5
                if(n>0){
                    int[] arrays ={(int) Math.floor(n/2),(int)Math.floor(n/2)+1};
                    return arrays;
                }else{
                    int[] arr = {(int) Math.floor(n/2)-1,((int)Math.floor(n/2))};

                    return arr;
                }
            }
        }
    }