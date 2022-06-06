package com.sophia;

public class CaseInsensitiveComparison {
        public static boolean match(String str1, String str2) {
            if(str1.toLowerCase().equals(str2.toLowerCase())){
                return true;
            } else{
                return false;
            }
        }
    }

//https://edabit.com/challenge/D6Lcut2s2gEzdCPvv