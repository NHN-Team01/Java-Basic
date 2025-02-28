package com.nhnacademy.quiz_8_3;

public class P9 {
    public static void recursiveMethod() {
        // TODO: 무한 재귀 호출
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError 발생! 스택 추적:");
            e.printStackTrace();
        }
    }
}
