package com.sophia;

public class HittingTheJackpot {

    public static void main(String[] args) {

        //testJackpot(["SS", "SS", "SS", "Ss"]);
    }
    public static boolean testJackpot(String[] result) {
        String first = result[0];
        for (int i = 0; i < result.length;i++){
            if(result[i] != first){
                return false;
            }
        }
        return true;
    }
    public static boolean isEveryElementEqual(String[] array){

        String firstElm = array[0];

        for(int i = 1; i < array.length; i++){
         if(!firstElm.equals(array[i])){
             return false;
             //if(Objects.equales(result[i],result[0])
         }
        }
        return true;
    }
}