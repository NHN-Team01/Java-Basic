package com.nhnacademy.quiz_7_1;

public class P5 {
    public static double calculateAverage(double... values) {
        // TODO: 평균 계산 로직 작성
        double sum = 0;
        for(double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(10, 20, 30));
        System.out.println(calculateAverage(5, 15));
    }
}
