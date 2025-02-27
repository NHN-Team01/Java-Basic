package com.nhnacademy.quiz_4_3;

public class P1 {
    /*
    * 주어진 양의 정수 startingValue로부터 3N+1 시퀀스를 출력하고,
    * 시퀀스에 포함된 항의 개수를 반환합니다.
    */
   public static int print3NSequence(int startingValue) {
       // TODO: 시작 값이 양수가 아니면 IllegalArgumentException 던지기
       // TODO: 3N+1 시퀀스 출력 및 시퀀스 길이 계산
       int n = startingValue;
       int count = 0;
       System.out.printf("시작값 %d의 3N+1 시퀀스:\n", n);
       System.out.println(n);
       count++;

        while(n != 1) {
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            System.out.println(n);
            count++;
        }
        System.out.printf("시퀀스에는 %d개의 항이 포함되어 있습니다.\n", count);

       return count; // TODO: 시퀀스 길이를 반환
   }

   public static void main(String[] args) {
       int startingValue = 7; // 테스트할 시작 값
       int sequenceLength = print3NSequence(startingValue);
       System.out.println("시퀀스 길이: " + sequenceLength);
   }

}
