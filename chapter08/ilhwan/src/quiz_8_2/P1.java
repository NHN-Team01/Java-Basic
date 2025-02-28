package com.nhnacademy.quiz_8_2;

public class P1 {
    public static int divide(int a, int b) {
        // TODO: b가 0이 아니면 몫을 반환하고, 그렇지 않으면 예외를 던지세요.
        if (b == 0) {
            throw new IllegalArgumentException("The divisor cannot be zero.");
        }
        return a / b; // 임시 반환값
    }

    public static void main(String[] args) {
        int result = divide(10, 2); // 5를 반환해야 합니다.
        System.out.println("Result: " + result);
    }
}
