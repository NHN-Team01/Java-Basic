package com.nhnacademy.quiz_7_2;

import java.util.Arrays;

public class P12 {
public static int[] extractSubArray(int[] array, int start, int end) {
        // TODO: 배열의 start부터 end-1까지 추출
        return Arrays.copyOfRange(array, start, end);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(extractSubArray(numbers, 1, 4)));
    }
}
