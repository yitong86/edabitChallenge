package com.sophia;

public class H4ck3rSp34k {
        public static String hackerSpeak(String str) {
            for(int i = 0;i < str.length();i++){
                switch(str.charAt(i)){
                    case'a':
                        str=str.replaceAll("a","4");
                        break;
                    case'e':
                        str=str.replaceAll("e","3");
                        break;
                    case'i':
                        str=str.replaceAll("i","1");
                        break;
                    case'o':
                        str=str.replaceAll("o","0");
                        break;
                    case's':
                        str= str.replaceAll("s","5");
                        break;
                }
            }
            return str;

        }
    }

//https://edabit.com/challenge/nPdPSgSsGfdyRbHkd