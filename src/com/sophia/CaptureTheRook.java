package com.sophia;

public class CaptureTheRook {
    public static void main(String[] args) {
       String[] list= {"A8", "E8"};
        System.out.println(canCapture(list));
        }
    public static boolean canCapture(String[] rooks) {
        //canCapture(["A8", "E8"]) ➞ true
        for(int i = 0;i < rooks.length;i++){
            if(rooks[i].charAt(0) == rooks[i+1].charAt(0) || rooks[i].charAt(1) == rooks[i+1].charAt(1)){
                return true;
            }
        }
        return false;
    }
    }

