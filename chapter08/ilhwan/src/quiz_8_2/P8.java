package com.nhnacademy.quiz_8_2;

public class P8 {
    public static void sort(int[] array) {
        // TODO: 삽입 정렬 알고리즘을 구현하세요.
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;

            assert isSorted(array, i);
        }
    }

    private static boolean isSorted(int[] array, int i) {
        for(int k = 0; k < i; k++) {
            if(array[k] > array[k + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        sort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        // 출력: 1 2 3 4 5 6
    }
}
