package com.nhnacademy.quiz_5_8;

public class P10 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display(); // "Hello from Outer" 출력
    }
}

class Outer {
    private String message = "Hello from Outer";

    class Inner {
        public void display() {
            // TODO: 외부 클래스의 message를 출력하세요.
            System.out.println(message);
        }
    }
}
