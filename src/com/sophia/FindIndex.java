package com.sophia;

import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int element = 3;
    }
        public static int search(int arr[], int item) {
                    for(int i = 0;i <arr.length;i++){
                        if(arr[i] == item){
                            return i++;
                        }
                    }
                    return -1;
                }
            }

//https://edabit.com/challenge/3NowS55XTdfWtKh9n