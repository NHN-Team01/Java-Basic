package com.nhnacademy.quiz_3_3;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 1: ");
        String input1 = scanner.nextLine();
        System.out.print("문자열 2: ");
        String input2 = scanner.nextLine();

        int i, j;
        i = 0;
        bigloop: while(i < input2.length()) {
            j = 0;
            while(j < input1.length()) {
                if(input2.charAt(i) == input1.charAt(j)) {
                    System.out.println("공통 문자: " + input2.charAt(i));
                    break bigloop;
                }
                j++;
            }
            i++;
        }

        scanner.close();
    }
}
