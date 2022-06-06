package com.sophia;
import java.util.Arrays;
public class ExitsNumberHigher {
    public static void main(String[] args) {
        int[] array ={5, 3, 15, 22, 4};
        existsHigher(array,10);
    }
        public static boolean existsHigher(int[] arr, int n) {
            Arrays.sort(arr);
            if (arr.length !=0 && arr[arr.length-1] >= n ){
                return true;
            }
            return false;
        }
    }
