package com.nhnacademy.quiz_4_3;

public class P4 {
    /*
    * str의 각 문자에 대해 해당 문자를 N번 반복 출력합니다.
    * @param str 입력 문자열
    * @param n 반복 횟수
    */
   public static void printRowsFromString(String str, int n) {
       // TODO: 각 문자의 반복은 printRow 서브루틴 사용
       for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(str.charAt(i));
            }
        System.out.println();
       }
   }

   public static void main(String[] args) {
       int n = 25;
       String input = "Java";
       printRowsFromString(input, n);
   }

}
