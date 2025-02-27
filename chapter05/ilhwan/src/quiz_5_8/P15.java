package com.nhnacademy.quiz_5_8;

public class P15 {
    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 Comparable 구현체를 작성하세요.
        Comparable<String> comparator = new Comparable<>() {
            @Override
            public int compareTo(String other) {
                String str = "Hello";

                return str.compareTo(other); // 수정 필요
            }
        };

        System.out.println(comparator.compareTo("Hello")); // "0" 또는 비교 결과
    }
}
