package com.sophia;

public class HowManyVowels {
        public static int getCount(String str) {
            int vowelsCount = 0;
            // Your code here
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }
    }

    //https://edabit.com/challenge/GBKphScsmDi9ek3ra
