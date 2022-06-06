package com.sophia;

public class ReverseTheNumber {
    public static void main(String[] args) {
        rev(123);
    }

        public static String rev(int n) {
            n = Math.abs(n);//123
            int revNumber = 0;
            int reminder = 0;
            while(n != 0){//123->12->1
                reminder = n % 10;//3->2->1
                n = n/10;//12->1->0
                revNumber = revNumber *10 + reminder;//3->32->321
            }
            return Integer.toString(revNumber);

        }
    }
