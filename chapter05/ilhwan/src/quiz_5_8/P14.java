package com.nhnacademy.quiz_5_8;

public class P14 {
    public static void main(String[] args) {
        Utility.Converter converter = new Utility.Converter();
        System.out.println(converter.celsiusToFahrenheit(0)); // 32.0 출력
    }
}

class Utility {
    static class Converter {
        // TODO: celsiusToFahrenheit 메서드를 작성하세요.
        public double celsiusToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32; // 수정 필요
        }
    }
}
