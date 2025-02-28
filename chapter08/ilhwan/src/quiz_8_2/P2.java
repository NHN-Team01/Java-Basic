package com.nhnacademy.quiz_8_2;

public class P2 {
    public static int findMax(int[] array) {
        // TODO: 배열에서 가장 큰 값을 반환하세요.
        int max = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        // 후속 조건: 반환된 값이 배열의 요소 중 가장 큰 값임을 확인
        // 배열의 모든 값이 max보다 작거나 같아야 함
        for(int num : array) {
            if (num > max) {
                throw new AssertionError("Returned value is not the maximum.");
            }
        }
        return max; // 임시 반환값
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8};
        int max = findMax(array);
        System.out.println("Max: " + max); // 8을 출력해야 합니다.
    }
}
