package com.nhnacademy.quiz_5_8;

public class P6 {
    interface Button {
        void click();
    }

    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 Button 구현체를 작성하세요.
        Button button = new Button() {
            @Override
            public void click() {
                // "Button clicked" 출력
                System.out.println("Button clicked");
            }
        };
        button.click();
    }

}
