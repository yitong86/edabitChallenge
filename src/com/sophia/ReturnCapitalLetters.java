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
            //create arrayList to store the index of Capital letters

            ArrayList<Integer> str2 = new ArrayList<>();

            //itterate through s
            for (int i = 0;i < s.length();i++) {
                if (s.charAt(i) == string1.charAt(i) && Character.isAlphabetic(s.charAt(i))) {//"eDaBiT"
                    int index = s.indexOf(s.charAt(i));
                   // System.out.println(arr);
                    str2.add(index);

                }
            }
            // System.out.println(str2);
            //arraylist covert to array
            int[] array = new int[str2.size()];
            for(int i = 0;i < str2.size();i++){
                array[i] = str2.get(i);


        }
            System.out.println(Arrays.toString(array));
            return array;

    }
}
