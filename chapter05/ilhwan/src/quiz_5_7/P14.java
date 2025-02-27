package com.nhnacademy.quiz_5_7;

public class P14 {
    public static void main(String[] args) {
        System.out.println(MathOperations.square(5));
    }
}

interface MathOperations {
    static int square(int x) {
        // TODO: 정수의 제곱을 반환하세요.
        return x * x;
    }
}