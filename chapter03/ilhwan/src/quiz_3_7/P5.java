package com.nhnacademy.quiz_3_7;

import java.util.Scanner;

public class P5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();

            System.out.println("나이: " + age);
        } finally {
            sc.close();
        }
        
    }
}
