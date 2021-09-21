package com.sonar.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        new HelloWorld().sayHello();
    }

    /*@Test
    public void notCovered() {
        new HelloWorld().notCovered();
    }*/
}