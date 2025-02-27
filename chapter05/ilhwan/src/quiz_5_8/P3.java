package com.nhnacademy.quiz_5_8;

public class P3 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayMessage(); // "Hello from OuterClass" 출력
    }
}

class OuterClass {
    private String message = "Hello from OuterClass";

    class InnerClass {
        // TODO: 외부 클래스의 message를 출력하는 메서드 displayMessage를 작성하세요.
        void displayMessage() {
            System.out.println(message);
        }
    }
}