package com.sophia;

import java.util.Arrays;

public class DifferenceMaxMin {
    public static int differenceMaxMin(int[] arr) {


        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (max - min);
    }
}
//https://edabit.com/challenge/hymPkXdhmDQLe87QT