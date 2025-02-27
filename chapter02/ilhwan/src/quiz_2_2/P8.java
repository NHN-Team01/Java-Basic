package com.nhnacademy.quiz_2_2;

public class P8 {
    public static void main(String[] args) {
        char[] chars = {'A', '가', '☺'}; // 'A', '가', '☺'
    
        for (char ch : chars) {
            System.out.println("문자: " + ch + ", 유니코드 값: " + Integer.toHexString(ch));
        }
    }
}
