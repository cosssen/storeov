package com.store;



import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.store.Mapper")
public class LzStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzStoreApplication.class, args);
    }

}