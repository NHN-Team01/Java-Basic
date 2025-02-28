package com.nhnacademy.quiz_8_2;

public class P3 {
    public static int sumArray(int[] array) {
        // TODO: 루프 불변식을 사용하여 배열 합계를 계산하세요.
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];

            assert sum == partialSum(array, i) : "Loop invariant broken at index " + i; 
        }

        return sum; // 임시 반환값
    }

    private static int partialSum(int[] array, int index) {
        int partialSum = 0;
        for(int i = 0; i <= index; i++) {
            partialSum += array[i];
        }
        return partialSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println("Sum: " + sum); // 15를 출력해야 합니다.
    }
}
