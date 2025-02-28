package com.nhnacademy.quiz_7_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P11 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40};

        // TODO: 중복 값을 제거한 후 출력하세요.
        
        // 중복 제를 위한 HashSet 사용
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int num : numbers) {
            uniqueNumbers.add(num);
        }

        // Set을 배열로 변환
        Integer[] result = uniqueNumbers.toArray(new Integer[0]);

        // 결과 출력
        System.out.println(Arrays.toString(result));
    }
}
