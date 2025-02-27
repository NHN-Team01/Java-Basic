package com.nhnacademy.quiz_5_8;

public class P7 {
    public void printUpperCase(String input) {
        // TODO: 로컬 클래스를 정의하고, 대문자로 변환한 문자열을 출력하세요.
        class UpperCaseConverter {
            public String convert(String str) {
                return str.toUpperCase();
            }
        }

        UpperCaseConverter converter = new UpperCaseConverter();
        System.out.println(converter.convert(input));
    }

    public static void main(String[] args) {
        P7 main = new P7();
        main.printUpperCase("hello"); // "HELLO" 출력
    }

}
