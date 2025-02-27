package com.nhnacademy.quiz_4_3;

public class P3 {
    /*
     * N번 반복되는 ch 문자를 포함하는 한 줄을 출력합니다.
     * @param ch 반복할 문자
     * @param N 반복 횟수
     */
    public static String makeRow(char ch, int N) {
        // TODO: N이 0 이하이면 빈 문자열
        // TODO: 주어진 문자를 N번 반복하는 문자열
        if(N <= 0) return "";
        
        return String.valueOf(ch).repeat(N);
    }

    public static void main(String[] args) {
        System.out.println(makeRow('*', 5));  // 출력: *
        System.out.println(makeRow('#', 0));  // 출력: (빈 줄)
        System.out.println(makeRow('!', 8));  // 출력: !!!!!!!!
    }

}
