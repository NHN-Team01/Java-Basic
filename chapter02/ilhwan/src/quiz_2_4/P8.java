package com.nhnacademy.quiz_2_4;

import java.util.Scanner;

public class P8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("CSV 형식 데이터를 입력하세요: ");
        // TODO: CSV 형식의 문자열을 입력 받습니다.
        String input = scanner.nextLine();

        // TODO: 문자열의 ','를 이용해 분립합니다. 분리 후 반환되는 값의 형태에 주의합니다.
        String[] values = input.split(",");
        for (String value : values) {
            // TODO: 각 값의 좌우 공백을 제거하고 출력합니다.
            System.out.println(value.trim());
        }

        scanner.close();
    }

}
