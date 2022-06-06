package com.sophia;
import java.util.*;
public record SortNumbersAscending() {
        public static int[] sortNumsAscending(int[] nums) {
            if(nums.length !=0){
                Arrays.sort(nums);
            }
            return nums;
        }
    }

//https://edabit.com/challenge/gd9Yw3H4qGEt5xksN