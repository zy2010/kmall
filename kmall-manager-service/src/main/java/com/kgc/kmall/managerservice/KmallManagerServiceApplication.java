package com.kgc.kmall.managerservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.kmall.managerservice.mapper")
@SpringBootApplication
@EnableDubbo
public class KmallManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KmallManagerServiceApplication.class, args);
    }

}
