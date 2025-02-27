package com.nhnacademy.quiz_3_7;

import java.util.Scanner;

public class P3 {
 public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("인덱스를 입력하세요: ");
            String input = sc.nextLine();

            int index = Integer.parseInt(input);

            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[index]); // ArrayIndexOutOfBoundsException 발생
            sc.close();
        } catch(NumberFormatException e) {
        // TODO: NumberFormatException과 ArrayIndexOutOfBoundsException을 처리하여 예외 메시지를 출력하기
        // catch가 추가로 필요한 경우, 추가해 주세요요.
            System.out.println("숫자로 변환할 수 없는 문자열입니다.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 잘못되었습니다.");
        } 

    }

}
