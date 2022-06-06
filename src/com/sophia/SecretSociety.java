package com.sophia;
import java.util.*;
public class SecretSociety {

    //  public class Challenge {
    public static String societyName(String[] friends) {
        ArrayList<String> array = new ArrayList<String>();
        String finalWord = "";

        Arrays.sort(friends);
        for (int i = 0; i < friends.length; i++) {
            // System.out.println(friends[i]);
            finalWord += friends[i].charAt(0);

        }
        return finalWord;

    }
}

