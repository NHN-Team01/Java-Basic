package com.nhnacademy.quiz_7_2;

import java.util.Arrays;

public class P8 {
    public static void fillArray(int[] array, int value) {
        // TODO: 배열의 모든 요소를 value로 설정
        Arrays.fill(array, value);
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        fillArray(numbers, 7);

        System.out.println(Arrays.toString(numbers));
    }
}
