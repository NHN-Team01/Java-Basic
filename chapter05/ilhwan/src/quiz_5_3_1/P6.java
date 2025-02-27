package com.nhnacademy.quiz_5_3_1;

public class P6 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.toString());
    }
}

class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
