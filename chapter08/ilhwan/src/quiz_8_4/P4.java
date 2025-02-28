package com.nhnacademy.quiz_8_4;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExecutionTime {
    // TODO: 필요 시 매개변수를 추가하세요.
}

public class P4 {
    public static void main(String[] args) {
        // TODO: @ExecutionTime이 적용된 메서드의 실행 시간을 측정하세요.
        AnnotationExample example = new AnnotationExample();

        try {
            // 리플렉션을 사용하여 @ExecutionTime이 붙은 메서드 실행 시간 측정
            Method method = AnnotationExample.class.getMethod("performTask");

            if(method.isAnnotationPresent(ExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(example);
                long endTime = System.nanoTime();
    
                System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000);
            }
        } catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        
    }
}

class AnnotationExample {
    @ExecutionTime
    public void performTask() {
        // TODO: 간단한 작업을 수행하세요.
        for(int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }
    }
}