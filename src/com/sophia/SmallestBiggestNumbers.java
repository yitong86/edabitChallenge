package com.sophia;
import java.util.*;
public class SmallestBiggestNumbers {


    public static boolean testJackpot(String[] result) {
        String first = result[0];
        for (int i = 0; i < result.length;i++){
            if(result[i] != first){
                return false;
            }
        }
        return true;
    }
}