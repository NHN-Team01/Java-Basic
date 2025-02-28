package com.nhnacademy.quiz_7_2;

public class P7 {
    public static int binarySearch(int[] array, int value) {
        // TODO: 이진 검색 구현
        int left = 0; // 왼쪽 끝 인덱스
        int right = array.length - 1; // 오른쪽 끝 인덱스

        while (left <= right) {
            int mid = left + (right - left) / 2; // 중간 인덱스 계산

            // 중간 값과 찾고자 하는 값 비교
            if(array[mid] == value) {
                return mid; // 값을 찾으면 인덱스 반환
            }
            if(array[mid] < value) {
                left = mid + 1; // 오른쪽 절반으로 이동
            } else {
                right = mid - 1;
            }
        }
        return -1; // 값을 찾지 못하면 -1 반환
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(sortedArray, 3));
    }

}
