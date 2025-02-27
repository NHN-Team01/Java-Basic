package com.nhnacademy.quiz_5_7;

public class P8 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10)); // 15 출력
        System.out.println(calculator.multiply(5, 10)); // 50 출력
    }

}

interface Calculable {
    int add(int a, int b);

    default int multiply(int a, int b) {
        // TODO: 곱셈 로직을 추가하세요.
        return a * b;
    }
}

class Calculator implements Calculable {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
