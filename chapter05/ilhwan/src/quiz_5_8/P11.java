package com.nhnacademy.quiz_5_8;

import java.util.Arrays;
import java.util.Comparator;

public class P11 {
public static void main(String[] args) {
        Integer[] numbers = {3, 1, 4, 1, 5};

        // TODO: 익명 내부 클래스를 사용하여 내림차순 Comparator를 작성하세요.
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // 수정 필요
            }
        });

        System.out.println(Arrays.toString(numbers)); // [5, 4, 3, 1, 1] 출력
    }
}
