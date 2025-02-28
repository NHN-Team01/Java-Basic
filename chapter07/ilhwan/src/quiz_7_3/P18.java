package com.nhnacademy.quiz_7_3;

import java.util.ArrayList;

public class P18 {
public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");

        // TODO: 인덱스 1의 값을 "Three"로 변경하고 출력하세요.

        strings.set(1, "Three");

        System.out.println(strings);
    }
}
