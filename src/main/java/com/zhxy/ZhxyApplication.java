package com.zhxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@MapperScan("com.zhxy.dao")
@SpringBootApplication
@EnableScheduling
public class ZhxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhxyApplication.class, args);
	}

}

