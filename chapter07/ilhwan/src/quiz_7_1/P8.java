package com.nhnacademy.quiz_7_1;

public class P8 {
    public static String concatenateStrings(String... strings) {
        // TODO: 문자열 연결 로직 작성
        StringBuilder stringbuilder = new StringBuilder();

        for(String string : strings) {
            stringbuilder.append(string);
        }
        return stringbuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenateStrings("Java", " ", "is", " ", "fun!"));
    }
}
