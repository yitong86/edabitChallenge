package com.sophia;

public class RemoveVowels {
    public static void main(String[] args) {
        System.out.println(removeVowels("I have never seen a thin person drinking Diet Coke."));
    }

    public static String removeVowels(String s) {
            String test ="";
            String vowl = "aeiou";
            for (int i = 0; i < s.length(); i++) {

               test = s.replace("A", "").replace("a", "").replace("E", "").replace("e", "").replace("I", "").replace("i", "").replace("O", "").replace("o", "").replace("U", "").replace("u", "");
                //test1 = s.replaceAll("[AEIOUaeiou}",");
            }
            return test;
        }
    }


