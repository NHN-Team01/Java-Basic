package com.nhnacademy.quiz_5_5_1;

import java.util.Arrays;

public class P9 {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(10), new Rectangle(5), new Rectangle(20)};

        Arrays.sort(shapes, (a, b) -> Integer.compare(a.getSize(), b.getSize()));

        for(Shape shape : shapes) {
            shape.draw();
        }
    }
}

abstract class Shape {
    int size;

    public Shape(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle(int size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle of size " + size);
    }
}
