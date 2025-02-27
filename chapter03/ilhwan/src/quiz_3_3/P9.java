package com.nhnacademy.quiz_3_3;


import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = (int)(Math.random() * 100 + 1);

        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");
        while(true) {
            System.out.print("숫자 입력: ");
            int n = scanner.nextInt();
            if(n == r) {
                System.out.println("정답입니다.");
                break;
            } else if(n < r) {
                System.out.println("더 큰 숫자를 입력하세요.");
            } else if(n > r) {
                System.out.println("더 작은 숫자를 입력하세요.");
            }
        }
        
        scanner.close();
    }
}
