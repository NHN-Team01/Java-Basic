package com.nhnacademy.quiz_2_4;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요 (공백으로 구분): ");
        // TODO: 두 수를 입력 받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // TODO: 두 수의 합을 출력합니다.
        System.out.printf("합: %d\n", a + b);
        
        // TODO: 두 수의 곱을 출력합니다.
        System.out.printf("곱: %d\n", a * b);
        
        scanner.close();
    }

}
