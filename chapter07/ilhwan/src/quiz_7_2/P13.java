package com.nhnacademy.quiz_7_2;

import java.util.Arrays;

public class P13 {
 public static int[] mergeArrays(int[] array1, int[] array2) {
        // TODO: 두 배열을 합병
        int[] mergedArray = Arrays.copyOf(array1, array1.length + array2.length);

        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
}
