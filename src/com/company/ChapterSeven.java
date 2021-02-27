package com.company;

import java.util.Arrays;

public class ChapterSeven {
    //Exercise 7.3
    public static int indexOfMax(int[] arr){
        int largest = 0;
        int largestIndex = 0;
        int index = 0;
        for (int i : arr){
            if(i > largest){
                largest = i;
                largestIndex = index;
            }
            index++;

        }
        return largestIndex;
    }
    //Exercise 7.4
    public static boolean[] sieve(int n){
        boolean[] boolArr = new boolean[n-1];
        Arrays.fill(boolArr, true);
        for (int i = 0; i < Math.sqrt(n); i++){
            if(i == 0 || i == 1){
                boolArr[i] = false;
            }
            else if(boolArr[i]){
                for (int j = i*i; j < n; j+=i){

                    boolArr[j] = false;
                }
            }
        }
        return boolArr;
    }

    //Exercise 7.5
    public static boolean areFactors(int n, int[] arr){
        for (int elm : arr){
            if (n%elm != 0){
                return false;
            }
        }
        return true;
    }

    //Exercise 7.5

    public static boolean isPrime(int[] arr){
        for(int elm : arr){
            for(int i = 2; i < elm/2; i++){
                if(elm%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    //Exercise 7.5
    public static boolean arePrimeFactors(int n, int[] arr){
        boolean factors = areFactors(n, arr);
        if(factors){
            if(isPrime(arr)){
                return true;
            }
        }
        return false;
    }
}
