package com.nhnacademy.quiz_5_7;

public class P17 {
    public static void main(String[] args) {
        Task task = new Task();

        // TODO: 익명 클래스 또는 람다를 사용하여 Callback을 구현하세요.
        task.runTask(() -> System.out.println("Callback executed."));
    }
}

interface Callback {
    void execute();
}

class Task {
    public void runTask(Callback callback) {
        System.out.println("Task started.");
        callback.execute();
        System.out.println("Task completed.");
    }
}
