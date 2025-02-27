package com.nhnacademy.quiz_5_3_1;

import java.util.Date;
import java.util.Random;

public class P10 {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        int randomNumber = random.nextInt(100);
        builder.append("Random Number: ").append(randomNumber).append("\n");

        Date currentDate = new Date();
        builder.append("Current Date: ").append(currentDate);

        System.out.println(builder.toString());
    }
}
