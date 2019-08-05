package com.zqxsober;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(value = "com.zqxsober")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
