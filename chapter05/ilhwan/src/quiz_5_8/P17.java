package com.nhnacademy.quiz_5_8;

public class P17 {
    public static void main(String[] args) {
        // TODO: 람다 표현식을 사용하여 Square 구현체를 작성하세요.
        Square square = x -> x * x; // 수정 필요

        System.out.println(square.calculate(5)); // 25 출력
    }
}

@FunctionalInterface
interface Square {
    int calculate(int x);
}
