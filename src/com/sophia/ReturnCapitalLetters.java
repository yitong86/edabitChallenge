package com.sophia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ReturnCapitalLetters {
    public static void main(String[] args) {
        indexOfCaps("eDaBiT");
    }

        public static int[] indexOfCaps(String s) {
            String string1 = s.toUpperCase();//"EDABIT"
            ArrayList<Integer> str2 = new ArrayList<>();
            for (int i = 0;i < s.length();i++) {
                if (s.charAt(i) == string1.charAt(i) && Character.isAlphabetic(s.charAt(i))) {//"eDaBiT"
                    int arr = s.indexOf(s.charAt(i));
                   // System.out.println(arr);
                    str2.add(arr);

                }
            }
            System.out.println(str2);
            int[] array = new int[str2.size()];
            for(int i = 0;i < str2.size();i++){
                array[i] = str2.get(i);

        }
            return array;
    }
}
