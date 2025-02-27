package com.nhnacademy.quiz_5_8;

public class P19 {
    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 ClickListener 구현체를 작성하세요.
        ClickListener listener = new ClickListener() {
            @Override
            public void onClick() {
                // "Button clicked!" 출력
                System.out.println("Button clicked!");
            }
        };

        listener.onClick();
    }
}

interface ClickListener {
    void onClick();
}
