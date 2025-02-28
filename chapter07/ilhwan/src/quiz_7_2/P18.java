package com.nhnacademy.quiz_7_2;

import java.util.Arrays;

public class P18 {
    public static void rotate(int[] array, int steps) {
        // TODO: 배열을 steps만큼 오른쪽으로 회전하세요.
        int n = array.length;

        // 배열 길일가 0 또는 1일 경우 회전할 필요 없음
        if(n <= 1) return;

        // steps가 배열 길이보다 크면 steps를 n으로 나눈 나머지로 조정
        steps = steps % n;

        // 배열을 회전시키는 방법: 배열 뒤쪽 부분과 앞쪽 부분을 합치기
        if(steps > 0) {
            // 뒤쪽 부분
            int[] temp = Arrays.copyOfRange(array, n - steps, n);
            // 앞쪽 부분
            System.arraycopy(array, 0, array, steps, n - steps);
            // 뒤쪽 부분을 앞에 복사
            System.arraycopy(temp, 0, array, 0, steps);
        }

        steps = steps % n;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        rotate(numbers, 2);
        // 회전 후 배열 출력
        System.out.println(Arrays.toString(numbers));
    }
}
