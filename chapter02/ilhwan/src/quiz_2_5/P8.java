package com.nhnacademy.quiz_2_5;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열로 숫자를 입력하세요: ");
        String data = scanner.nextLine();

        System.out.println("정수 값: " + Integer.parseInt(data));
        System.out.println("실수 값: " + Double.parseDouble(data));

        scanner.close();
    }
}
