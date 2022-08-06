package com.alexncsr.lesson15;

import java.util.Arrays;

import static com.alexncsr.lesson15.ArrayChallenge.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 13, 6, 8, 14, 13, 8, 45, 22, 7,};
        System.out.println(returnIndex(array, 13));
        System.out.println(returnIndex(array, 100));
        System.out.println(sumElements(array));
//        System.out.println(evenElements(array));
        System.out.println(Arrays.toString(evenElements(array)));
    }
}
