package com.nhnacademy.quiz_7_3;

import java.util.ArrayList;
import java.util.HashSet;

public class P10 {
public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Apple");

        // TODO: 중복 항목을 제거하고 출력하세요.
        HashSet<String> set = new HashSet<>(strings);
        ArrayList<String> uniqueStrings = new ArrayList<>(set);

        System.out.println(uniqueStrings);
    }
}
