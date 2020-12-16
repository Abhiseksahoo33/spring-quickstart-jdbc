package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import java.util.Arrays;

public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext("org.example");
        String beansNames[] = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beansNames));
    }
}