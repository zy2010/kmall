package com.kgc.kmall.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class
KmallUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KmallUserWebApplication.class, args);
    }

}
