package com.nhnacademy.quiz_2_5;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수를 입력하세요: ");
        double input = scanner.nextDouble();

        System.out.println("정수로 타입 변환된 값: " + (int)input);

        scanner.close();
    }
}
