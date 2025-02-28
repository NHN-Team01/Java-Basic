package com.nhnacademy.quiz_7_3;

import java.util.ArrayList;

public class P15 {
public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // TODO: 인덱스 1부터 3까지의 부분 리스트를 출력하세요.
        System.out.println(numbers.subList(1, 4));
    }
}
