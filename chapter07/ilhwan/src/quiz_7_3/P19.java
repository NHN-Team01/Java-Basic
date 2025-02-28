package com.nhnacademy.quiz_7_3;

import java.util.ArrayList;

public class P19 {
public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // TODO: ArrayList의 모든 요소를 합산하여 출력하세요.

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("합계: " + sum);
    }
}
