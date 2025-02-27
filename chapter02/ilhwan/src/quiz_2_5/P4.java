package com.nhnacademy.quiz_2_5;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("첫 번째 값이 두 번째 값보다 큰가? " +  (a > b));
        System.out.println("첫 번째 값이 두 번째 값보다 작은가? " + (a < b));
        System.out.println("두 값이 같은가? " + (a == b));

        scanner.close();
    }
}
