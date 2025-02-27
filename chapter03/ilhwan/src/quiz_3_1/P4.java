package com.nhnacademy.quiz_3_1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int result = 0;
        while(true) {
            int n = scanner.nextInt();
            if (n < 0) continue;
            if (n == 0) break;
            
            result += n;
        }
        System.out.println("합: " + result);

        scanner.close();
    }
}
