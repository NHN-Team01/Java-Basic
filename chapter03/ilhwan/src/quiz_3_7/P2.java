package com.nhnacademy.quiz_3_7;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine();

        try {
            // TODO:  나이가 정상적으로 입력되었는지 확인하세요.
            int age = Integer.parseInt(input);
            if(age < 0) throw new IllegalArgumentException("나이는 음수일 수 없습니다.");
            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            sc.close();
        }

        sc.close();
    }

}
