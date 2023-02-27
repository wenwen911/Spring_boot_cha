package org.qingqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.qingqiao.mapper")
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

}
