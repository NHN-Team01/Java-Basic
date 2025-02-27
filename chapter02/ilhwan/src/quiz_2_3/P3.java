package com.nhnacademy.quiz_2_3;

import java.util.Scanner;

public class P3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // 문자열 입력 받기
        String line = scanner.nextLine();

        // TODO: 입력 받은 문자열 길이 출력하기
        System.out.println("문자열의 길이: " + line.length());

        scanner.close();
    }

}
