package com.nhnacademy.quiz_2_5;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        // TODO: 첫 번째 정수를 입력 받습니다.
        int a = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        // TODO: 두 번째 정수를 입력 받습니다.
        int b = scanner.nextInt();

        try {
            // TODO: 두 정수간 나누셈을 출력합니다.
            System.out.printf("정수 나눗셈 결과: %d\n", a / b);
            // TODO: 정수를 실수로 변환하여 나누셈을 출력합니다.
            System.out.println("실수 나눗셈 결과: " + (double)a / b);
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            scanner.close();
            return;
        }
        

        scanner.close();
    }

}
