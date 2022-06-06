package com.sophia;

public class WordCount {
    public static void main(String[] args) {
        countWords("This is a test");
    }
        public static int countWords(String s) {
            String[] array = s.split(" ");
            return array.length;
        }
    }
//https://edabit.com/challenge/hBFo8jAu5E7824esW
