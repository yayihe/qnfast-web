package com.qn.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.qn.web.*.mapper")
public class QnfastWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(QnfastWebApplication.class, args);
    }

}
