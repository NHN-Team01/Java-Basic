package com.nhnacademy.quiz_3_8;

import java.util.Scanner;

public class P11 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("배열의 요소를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("회전수를 입력하세요: ");
        int rotate = sc.nextInt();

        //TODO: 배열의 요소를 주어진 횟수만큼 오른쪽으로 회전시켜 출력하세요.

        // 직접 작성
        for(int i = 0; i < rotate; i++) {
            int temp = numbers[size-1];
            for(int j = size-1; j > 0; j--) {
                numbers[j] = numbers[j-1];
            }
            numbers[0] = temp;
        }

        // GPT
        // rotate = rotate % size;
        // int[] result = new int[size];

        // for(int i = 0; i < size; i++) {
        //     result[(i + rotate) % size] = numbers[i];
        // }
        
        System.out.print("회전 결과: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        sc.close();
    }

}
