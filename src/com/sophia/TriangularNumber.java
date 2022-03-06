package com.sophia;

public class TriangularNumber {

    public static int triangle(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {//n =2//6
            int result = n + triangle(n - 1);//2+triangle(2-1)->2+1=3//6+triangle(5)=>

            return result;//3
        }
    }
}
