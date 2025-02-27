package com.nhnacademy.quiz_5_8;

public class P12 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(42);
        inner.display(); // "Value: 42" 출력
    }
}

class Outer {
    class Inner {
        private int value;

        public Inner(int value) {
            // TODO: 전달받은 값을 변수에 저장하세요.
            this.value = value;
        }

        public void display() {
            // TODO: 저장된 값을 출력하세요.
            System.out.println("Value: " + value);
        }
    }
}