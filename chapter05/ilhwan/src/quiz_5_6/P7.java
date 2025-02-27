package com.nhnacademy.quiz_5_6;

public class P7 {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.append("Hello").append(" ").append("World!").print(); // Hello World! 출력
    }
}

class Builder {
    private String result = "";

    public Builder append(String text) {
        this.result += text;
        return this; // TODO: this를 리턴하여 메서드 체이닝 지원
    }

    public void print() {
        System.out.println(result);
    }
}
