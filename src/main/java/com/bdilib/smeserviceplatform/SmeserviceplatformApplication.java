package com.bdilib.smeserviceplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdilib.smeserviceplatform.mapper")

public class SmeserviceplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmeserviceplatformApplication.class, args);

    }

}
