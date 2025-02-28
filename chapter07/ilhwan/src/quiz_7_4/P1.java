package com.nhnacademy.quiz_7_4;

public class P1 {
    public static void main(String[] args) {
        // TODO: 이름(String)과 나이(int)를 필드로 가지는 Person 레코드를 정의하세요.
        record Person(String name, int age) { }
        // TODO: Person 객체를 생성하고 필드 값을 출력하세요.

        Person person = new Person("John Doe", 25);
        
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
    }
}
