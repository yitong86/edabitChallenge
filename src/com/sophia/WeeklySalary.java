package com.sophia;
import java.util.*;
public class WeeklySalary {
    public static void main(String[] args) {

    }

    public static int WeeklySalary(int[] hours) {
        int totalSalary = 0;
        for (int i = 0; i < hours.length; i++) {
            //index 5 ->weekday 0,1,2,3,4

            if (i < 5) {
                if (hours[i] > 8) {
                    totalSalary += 10 * 8 + (hours[i] - 8) * 15;
                } else {
                    totalSalary += 10 * 8;
                }
            } else {
                if (hours[i] > 8) {
                    totalSalary += 20 * 8 + (hours[i] - 8) * 30;
                } else {
                    totalSalary += 20 * 8;
                }

            }
        }
        return totalSalary;

    }
}


//int totalSal = 0;
//for(int i = 0;i < hours.length;i++){
//        boolean isWeekend=1>4;
//        int numOfHours=hours[i];
//        totalSal+=getPayDay(numOfHours,isWeekend);
//        }
//return 0 ;
//        }
//        public  static int getPayDay (int hours,boolean isWeekend){
//
//    int payDay = 0;
//    int extraHours = hours -8;
//    if(extraHours > 0){
//        hours -= extraHours;//=8
//        payDay +=extraHours * 15;
//        }
//    payDay+=hours * 10;
//
//        if(isWeekend) payDay *=2
//return payDay;
//}