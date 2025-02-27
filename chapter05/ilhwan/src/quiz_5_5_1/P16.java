package com.nhnacademy.quiz_5_5_1;

public class P16 {
    public static void main(String[] args) {
        Drawable[] drawables = {new Rectangle(), new Circle()};

        for(Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
    
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
