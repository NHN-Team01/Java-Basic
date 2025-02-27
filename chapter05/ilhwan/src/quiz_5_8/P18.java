package com.nhnacademy.quiz_5_8;

public class P18 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.new Inner(10);
        Outer.Inner inner2 = outer.new Inner(20);

        inner1.display(); // "Data: 10" 출력
        inner2.display(); // "Data: 20" 출력
    }
}

class Outer {
    class Inner {
        private int data;

        public Inner(int data) {
            // TODO: data를 저장하세요.
            this.data = data;
        }

        public void display() {
            // TODO: 저장된 data를 출력하세요.
            System.out.println("Data: " + data);
        }
    }
}