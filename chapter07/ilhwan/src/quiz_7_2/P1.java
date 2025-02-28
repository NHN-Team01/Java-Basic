package com.nhnacademy.quiz_7_2;

public class P1 {
    public static void main(String[] args) {
        String[] lines = {"apple", "banana", "banana", "cherry", "apple"};

        // TODO: 연속된 중복 요소가 있는지 확인하고 결과를 출력하세요.

        boolean hasDuplicate = false;

        for(int i = 1; i < lines.length; i++) {
            if(lines[i].equals(lines[i-1])) { // 연속된 요소 비교
                System.out.println("Consecutive duplicate found: " + lines[i]);
                hasDuplicate = true;
            }
        }

        if(!hasDuplicate) {
            System.out.println("No consecutive duplicates");
        }
    }
}
