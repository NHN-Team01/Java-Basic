package com.nhnacademy.quiz_5_7;

public class P18 {
    public static void main(String[] args) {
        // TODO: 익명 클래스를 사용하여 Speaker 인터페이스를 구현하세요.
        Speaker speaker = new Speaker() {
            @Override
            public void speak() {
                System.out.println("Hello from an anonymous class!");
            }
        };

        speaker.speak(); // "Hello from an anonymous class!" 출력
    }
}

interface Speaker {
    void speak();
}
