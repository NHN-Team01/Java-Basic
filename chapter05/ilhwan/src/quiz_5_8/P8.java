package com.nhnacademy.quiz_5_8;

public class P8 {
    public static void main(String[] args) {
        // TODO: 람다 표현식을 사용하여 Drawable 구현체를 작성하세요.
        Drawable drawable = () -> {
            // "Drawing a shape" 출력
            System.out.println("Drawing a shape");
        };
        drawable.draw();
    }
}

interface Drawable {
    void draw();
}
