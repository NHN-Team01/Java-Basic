package com.nhnacademy.quiz_2_5;

import java.util.Scanner;

public class P5 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("두 값이 모두 양수인가? " + (a > 0 && b > 0));
        System.out.println("두 값 중 하나라도 양수인가? " + (a > 0 || b > 0));

        scanner.close();
    }
}
