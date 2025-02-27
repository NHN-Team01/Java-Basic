package com.nhnacademy.quiz_5_8;

public class P1 {
    // TODO: 정적 중첩 클래스 NestedClass를 작성하고, 메서드 printMessage를 구현하세요.

    public static void main(String[] args) {
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.printMessage(); // "Hello from NestedClass"
    }
}

class OuterClass {
    static class NestedClass {
        void printMessage() {
            System.out.println("Hello from NestedClass");
        }
    }
}