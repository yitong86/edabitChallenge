package com.sophia;

public class ReverseOrderOfString {

        public static String reverse(final String str) {
            String result = "";
            for(int i = str.length()-1;i >= 0;i--){
                result +=  str.charAt(i);
            }
            return result;
        }
    }
//https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
