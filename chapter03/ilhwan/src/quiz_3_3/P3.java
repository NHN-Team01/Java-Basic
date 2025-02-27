package com.nhnacademy.quiz_3_3;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자 입력: ");
        String input = scanner.nextLine();
        
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("뒤집힌 숫자: " + reverse);

        scanner.close();
    }
}
