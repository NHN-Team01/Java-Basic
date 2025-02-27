package com.nhnacademy.quiz_4_5;

import java.util.Arrays;

public class P10 {
public static void main(String[] args) {
        String[] words = {"java", "lambda", "functional"};

        // TODO: 람다와 스트림 API를 사용하여 대문자로 변환
        Arrays.stream(words)
            .map(String::toUpperCase) // TODO: 대문자 변환 람다 작성
            .forEach(System.out::println);
    }

}
