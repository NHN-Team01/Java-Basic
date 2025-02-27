package com.nhnacademy.quiz_5_8;

public class P5 {
    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 Runnable 구현체를 작성하세요.
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // "Running in a thread" 출력
                System.out.println("Running in a thread");
            }
        });
        thread.start();
    }
}
