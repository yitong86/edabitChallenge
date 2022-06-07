package com.sophia;

public class lastSecondLetter {
    public static void main(String[] args) {
        System.out.println(last("bn"));
    }
    public static String last(String word){
        String secondLetter = word.substring(word.length()-2);
        String lastTwoLetter= secondLetter.charAt(secondLetter.length()-1) + " " + secondLetter.charAt(0);

        return lastTwoLetter;
    }
}
