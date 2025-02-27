package com.nhnacademy.quiz_3_7;

import java.util.Scanner;

public class P4 {
public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.next();
        // TODO: input이 정수가 아닌 경우, Exception이 발생합니다.
        // 이를 IllegalArgumentException로 변경해 던집니다.

        try {
            int age = Integer.parseInt(input);
            System.out.println("나이: " + age);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("유효한 숫자를 입력해야 합니다.", e);
        } finally {
            sc.close();
        }
    }
}
