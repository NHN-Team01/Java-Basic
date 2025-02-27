package com.nhnacademy.quiz_4_3;

import java.util.ArrayList;
import java.util.Arrays;

public class P2 {
    /*
     * N의 모든 약수를 출력합니다.
     * @param N 양의 정수
     */
    public static int[] getDivisors(int N) {
        // TODO: N이 양수가 아니면 IllegalArgumentException 던지기
        // TODO: N의 모든 약수를 배열로 반환
        if(N <= 0) {
            throw new IllegalArgumentException("N은 양의 정수여야 합니다.");
        }

        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                divisors.add(i);
            }
        }
    
        return divisors.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int number = 28; // 테스트할 숫자
        // TODO: 결과 출력
        int[] divisors = getDivisors(number);

        System.out.println(number + "의 약수: " + Arrays.toString(divisors));
    }

}
