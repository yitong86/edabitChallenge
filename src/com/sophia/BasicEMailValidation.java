package com.sophia;

public class BasicEMailValidation {

        public static boolean validateEmail(String s) {
            for(int i = 0;i < s.length();i++){
                if(s.contains("@") && s.contains(".com") && !s.startsWith("@")){
                    return true;
                }
            }
            return false;
        }
    }