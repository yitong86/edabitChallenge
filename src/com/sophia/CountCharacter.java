package com.sophia;

public class CountCharacter {

        public static int charCount(char c, String str) {
            int sum =0;

            for (int i =0;i<str.length();i++){
                if(c == str.charAt(i)){
                    sum++;
                }
            }
            return sum;
        }
    }
//
//    charCount('a', "edabit") ➞ 1
//
//        charCount('c', "Chamber of secrets") ➞ 1
//
//        charCount('b', "big fat bubble") ➞ 4