package com.company;

public class Main {

    public static void main(String[] args) {
        chapterSevenExercises();

    }

    public static void chapterSevenExercises(){
        int[] intArr = {10, 30, 1, 23, 9, 25, 1, 20};
        System.out.print(ChapterSeven.indexOfMax(intArr));
        boolean[] boolArr = ChapterSeven.sieve(30);
        for (boolean bool : boolArr){
            System.out.println(bool);
        }
        int[] intArr2 = {1, 2, 3, 4, 6, 8, 12, 24};
        System.out.println(ChapterSeven.areFactors(24, intArr2));

        int[] intArr3 = {2,5};
        System.out.print(ChapterSeven.arePrimeFactors(10, intArr3));

    }
}
