package com.nhnacademy.quiz_2_4;

import java.util.ArrayList;
import java.util.Scanner;

public class P10 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("텍스트를 입력하세요 (종료하려면 빈 줄을 입력):");
        int maxLength = 0;

        while (true) {
            // TODO: 문자열을 입력받습니다.
            String line = scanner.nextLine();

            // TODO: 입력된 문자열이 빈 문자열인 경우, 입력을 종료합니다.
            if (line.length() == 0) {
                break;
            }

            // 입력된 문자열을 저장합니다.
            lines.add(line);

            //  출력 길이를 최대 길이 문자열에 맞추기 위해 길이를 계산해 둡니다.
            if(line.length() > maxLength) maxLength = line.length();
        }

        System.out.println("\n오른쪽 정렬된 텍스트:");
        for (String line : lines) {
            // TODO: 각 문자열을 정렬된 형태로 출력합니다.
            System.out.printf("%" + maxLength + "s\n", line);
        }

        scanner.close();
    }

}
