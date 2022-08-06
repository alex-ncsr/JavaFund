package com.alexncsr.lesson15;

public class ArrayChallenge {
    /**
     * 1. Creati o metoda care primeste un array de int, si un parametru de tip int.
     * Metoda trebuie sa returneze indexul elementului din array sub care se afla
     * valoarea argumentului transmis. Daca asa element nu exista in array, sa returneze -1;
     * De ex. daca ii dau metodei un un arr {1,2,3,4,5} si argumentul 4, metoda trebuie sa-mi returneze 3;
     * Daca ii dau ca argument 100, sa-mi returneze -1;
     */
    public static int returnIndex(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                System.out.println("Index of coincidence - " + index);
            }
        }
        return index;
    }


    /**
     * 2. Creati o metoda care primeste un array de int si returneaza suma
     * tuturor elementelor De ex. : Ii dau {1,2,3,4}, returneaza 10
     */
    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 3. Creati o metoda care primeste un arr de int, si returneaza ul alt array
     * doar cu elementele pare din primul array De ex. {1,2,3,4,5,6}, va returna {2,4,6}
     */
    public static int[] evenElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
