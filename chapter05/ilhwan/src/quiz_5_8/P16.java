package com.nhnacademy.quiz_5_8;

public class P16 {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.addNumbers(3, 7)); // 10 출력
    }
}

class Main {
    public int addNumbers(int a, int b) {
        // TODO: 로컬 클래스를 정의하고 두 수의 합을 반환하세요.
        class Adder {
            public int add(int x, int y) {
                return x + y; // 수정 필요
            }
        }

        Adder adder = new Adder();
        return adder.add(a, b);
    }

}
