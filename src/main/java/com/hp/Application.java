package com.hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hp.mapper")
public class Application {

    //启动类
    public static void main(String[] args) {
        //启动
        SpringApplication.run(Application.class,args);
    }
}
