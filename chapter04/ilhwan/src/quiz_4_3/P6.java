package com.nhnacademy.quiz_4_3;

public class P6 {
    /*
    * 배열에서 가장 큰 값을 반환합니다.
    * @param list 정수 배열
    * @return 배열의 최대값
    * @throws IllegalArgumentException 배열이 비어 있을 경우 예외를 던집니다.
    */
   public static int findMax(int[] list) {
       // TODO: 배열에서 가장 큰 값을 찾아 반환
       // TODO: 배열이 비어 있으면 IllegalArgumentException 던지기
       if(list == null) throw new IllegalArgumentException("배열이 비어있습니다.");

       int max = list[0];
       for(int i = 1; i < list.length; i++) {
            if(list[i] > max) max = list[i];
       }

       return max;
   }

   public static void main(String[] args) {
       int[] numbers = {3, 5, 7, 2, 8};
       int max = findMax(numbers);
       System.out.println("최대값: " + max); // 출력: 최대값: 8
   }

}
