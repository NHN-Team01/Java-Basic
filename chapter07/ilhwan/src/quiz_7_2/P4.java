package com.nhnacademy.quiz_7_2;

import java.util.Arrays;

public class P4 {

    public static int[] copyArray(int[] original) {
        // TODO: 주어진 배열을 복사하여 새 배열을 반환하세요.
        return Arrays.copyOf(original, original.length);
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copy = copyArray(original);
    }
}
