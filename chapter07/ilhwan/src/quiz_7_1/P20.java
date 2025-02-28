package com.nhnacademy.quiz_7_1;

import java.util.Arrays;

public class P20 {
    public static int[] combine(int[] array, int... values) {
        // TODO: 배열과 가변 인수를 병합한 새 배열 반환
        int newLength = array.length + values.length;
        int[] combinedArray = new int[newLength];
        
        System.arraycopy(array, 0, combinedArray, 0, array.length);
        System.arraycopy(values, 0, combinedArray, array.length, values.length);

        return combinedArray;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20};
        System.out.println(Arrays.toString(combine(numbers, 30, 40))); // 출력: [10, 20, 30, 40]
    }
}
