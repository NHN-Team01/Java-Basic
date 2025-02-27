package com.nhnacademy.quiz_5_8;

public class P13 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display(); // "Static Hello" 출력
    }
}

class Outer {
    private static String staticMessage = "Static Hello";

    class Inner {
        public void display() {
            // TODO: 외부 클래스의 staticMessage를 출력하세요.
            System.out.println(staticMessage);
        }
    }
}
