package com.nhnacademy.quiz_5_8;

public class P9 {
    public static void main(String[] args) {
        Calculator.Adder adder = new Calculator.Adder();
        System.out.println(adder.add(5)); // 15 출력
    }
}

class Calculator {
    static int base = 10;

    static class Adder {
        // TODO: add 메서드를 작성하여 base 값을 더한 결과를 반환하세요.
        public int add(int x) {
            return base + x; // 수정 필요
        }
    }
}