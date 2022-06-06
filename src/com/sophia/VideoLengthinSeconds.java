package com.sophia;

public class VideoLengthinSeconds {
        public static int minutesToSeconds(String tm) {
            int sumSeconds = 0;
            String[] array = tm.split(":");
            if(Integer.parseInt(array[1]) < 60){
                sumSeconds = Integer.parseInt(array[1])+(Integer.parseInt(array[0]) * 60);
            }else{
                return -1;
            }
            return sumSeconds;
        }
    }

//https://edabit.com/challenge/9D39q2q9yAFCDM9da