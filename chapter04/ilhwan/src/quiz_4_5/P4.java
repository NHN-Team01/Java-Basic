package com.nhnacademy.quiz_4_5;

public class P4 {
    public static void main(String[] args) {
        // TODO: BiFunction 인터페이스를 사용하여 두 숫자의 합을 반환하는 람다 작성
        java.util.function.BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        // 테스트
        System.out.println("5 + 10 = " + add.apply(5, 10)); // 출력: 15
    }
}
