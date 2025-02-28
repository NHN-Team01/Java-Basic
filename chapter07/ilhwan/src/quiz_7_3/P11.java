package com.nhnacademy.quiz_7_3;

import java.util.ArrayList;
import java.util.Collections;

public class P11 {
public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        // TODO: 인덱스 0과 2의 요소를 교환하고 출력하세요.
        Collections.swap(strings, 0, 2);

        System.out.println(strings);
    }
}
