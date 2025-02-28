package com.nhnacademy.quiz_7_2;

import java.util.Arrays;

public class P15 {

}

class DynamicArray {
    private int[] array;
    private int size;

    public DynamicArray() {
        // TODO: 초기 배열 설정
        array = new int[10];
        size = 0;
    }

    public void add(int value) {
        // TODO: 배열에 값 추가 및 크기 증가
        if(size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = value;
        size++;
    }

    public int get(int index) {
        // TODO: 특정 인덱스의 값 반환
        if(index >= 0 && index < size) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Index "  + index + " out of bounds.");
    }

    public int size() {
        // TODO: 현재 배열 크기 반환
        return size;
    }
}
