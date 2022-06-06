package com.sophia;

public class DoubleLetter {
    public static boolean doubleLetters(String word) {
            for (int i = 0; i < word.length() - 1; i++) {//loop
                if (word.charAt(i) == word.charAt(i + 1)) {
                    return true;
                }
            }
            return false;
        }
    }
//https://edabit.com/challenge/EaWY5d2pYBckrkAnS

