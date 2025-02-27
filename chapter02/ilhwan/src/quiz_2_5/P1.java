package com.nhnacademy.quiz_2_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        try {
            System.out.print("첫 번째 정수를 입력하세요: ");
            // TODO: 첫 번째 정수를 입력 받습니다.
            a = scanner.nextInt();

            System.out.print("두 번째 정수를 입력하세요: ");
            // TODO: 두 번째 정수를 입력 받습니다.
            b = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("올바르지 않은 정수가 입력되었습니다: null");
            scanner.close();
            return;
        }

        // TODO : 입력된 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산 결과를 출력합니다.
        System.out.printf("덧셈 결과: %d\n", a + b);
        System.out.printf("뺄셈 결과: %d\n", a - b);
        System.out.printf("곱셈 결과: %d\n", a * b);
        System.out.printf("나눗셈 결과: %d\n", a / b);
        System.out.printf("나머지 연산 결과: %d\n", a % b);

        scanner.close();
    }

}
