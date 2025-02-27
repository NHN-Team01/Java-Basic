package com.nhnacademy.quiz_2_3;

public class P10 {
    public static void main(String[] args) {
        // TODO: 시작 시간 저장
        long startTime = System.nanoTime();

        // 작업: 1부터 100까지 출력
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // TODO: 종료 시간 저장
        long endTime = System.nanoTime();
        // TODO: 소요 시간 계산
        long currentTime = endTime - startTime;
        // TODO: 소요 시간 출력
        System.out.println("작업 소요 시간(초): " + (double)currentTime / 1000_000);
    }

}
