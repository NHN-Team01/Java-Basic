package com.nhnacademy.quiz_5_8;

public class P20 {
    public static void main(String[] args) {
        Outer instance = Outer.Factory.createInstance();
        System.out.println(instance != null ? "Instance created!" : "Creation failed.");
    }
}

class Outer {
    static class Factory {
        // TODO: createInstance 메서드를 작성하세요.
        public static Outer createInstance() {
            return new Outer(); // 수정 필요
        }
    }
}