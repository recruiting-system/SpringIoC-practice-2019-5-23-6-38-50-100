package com.example.SpringIoCpractice;

import com.example.SpringIoCpractice.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Main {
    public static void Main(String[] args){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("hello.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HelloWorldBean");
        helloWorld.getHello();
    }
}
