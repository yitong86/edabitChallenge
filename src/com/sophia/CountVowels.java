package com.sophia;

public class CountVowels {

        public static int getCount(String str) {
            int vowelsCount = 0;
            // Your code here
            for (int i = 0;i<str.length();i++ ){
                System.out.println(str.charAt(i));
                if (str.charAt(i) == 'a'|| str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u'){
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }
    }

