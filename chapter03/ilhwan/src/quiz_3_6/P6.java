package com.nhnacademy.quiz_3_6;

import java.util.Scanner;

public class P6 {
    enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요일을 입력하세요(예: MONDAY): ");
        String input = scanner.nextLine();
        DayOfWeek dayofweek = DayOfWeek.valueOf(input);

        switch(dayofweek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("주중입니다.");
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("주말입니다.");
            }
        }

        scanner.close();
    }
}
