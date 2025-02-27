package com.nhnacademy.quiz_3_8;

import java.util.HashSet;
import java.util.Scanner;

public class P5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // TODO: 중복된 값을 출력합니다.
        HashSet<Integer> seen = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();

        // 배열을 순회하면서 중복된 값 찾기
        for(int number : numbers) {
            if(!seen.add(number)) {
                duplicates.add(number); // 이미 seen에 존재하는 값은 duplicates에 추가
            }
        }

        // 중복된 값 출력
        if(duplicates.isEmpty()) {
            System.out.println("중복된 값이 없습니다.");
        } else {
            System.out.print("중복된 값: ");
            for(int duplicate : duplicates) {
                System.out.print(duplicate + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }

}
