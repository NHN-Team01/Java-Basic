package com.nhnacademy.quiz_2_2;

public class P5 {
    public static void main(String[] args) {
        // TODO: 초기 잔액
        double balance = 100;
        // TODO: 월 이율
        double rate = 1.05;

        for (int month = 1; month <= 12; month++) {
            // TODO: 매달 이자 추가
            balance *= rate;
        }

        // TODO: 최종 balance를 "최종 잔액: " 뒤에 출력합니다.
        System.out.println("최종 잔액: " + balance);
    }
}
