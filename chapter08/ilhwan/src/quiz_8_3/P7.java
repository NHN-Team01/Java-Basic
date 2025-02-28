package com.nhnacademy.quiz_8_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P7 {
    public static void main(String[] args) {
        // TODO: try-with-resources를 사용해 파일 읽기
        String filePath = "numbers.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String firstLine = br.readLine();
            System.out.println("첫 번째 줄: " + firstLine);
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류 발생: " + e.getMessage());
        }

    }

}
