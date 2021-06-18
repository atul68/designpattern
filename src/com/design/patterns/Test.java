package com.design.patterns;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

//    public static void main(String args[]) {
//        int a[] = { 10,2, 5, 12, 7, -3, 11, 8, -2, 15, 20, 6, 3, 18};
//        int sum =25;
//        List can
//        getPairs(a, sum);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.submit();
//
//
//
//        //output : {10, 15}, {5, 20}, {7, 18}
//
//    }




    public  static void getPairs(int a[], int sum) {
        Arrays.sort(a);
        int  low = 0;
        int high = a.length-1;

        while(low < high) {
            if(a[low] + a[high] == sum) {
                System.out.println("part is " + a[low] + ", " + a[high] );
            }
            if(a[low] + a[high] > sum) {
                high --;
            }
            else {
                low++;
            }
        }

    }
}
