package com.nhnacademy.quiz_5_8;

public class P2 {
    // TODO: 정적 중첩 클래스 Addition을 작성하고, add 메서드를 구현하세요.

    public static void main(String[] args) {
        MathOperations.Addition addition = new MathOperations.Addition();
        System.out.println(addition.add(5, 3)); // 8 출력
    }
}

class MathOperations {
    static class Addition {
        String add(int a, int b) {
            return String.valueOf(a + b);
        }
    }
}