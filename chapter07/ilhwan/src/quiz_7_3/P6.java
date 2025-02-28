package com.nhnacademy.quiz_7_3;

import java.util.ArrayList;

public class P6 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");

        // TODO: "Cherry" 문자열의 인덱스를 출력하세요.
        int index = strings.indexOf("Cherry");

        System.out.println("The index of 'Cherry' is: " + index);
    }
}
