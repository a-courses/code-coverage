package com.sonar.example;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        new HelloWorld().sayHello();
//        new HelloWorld().notCovered();
    }
}