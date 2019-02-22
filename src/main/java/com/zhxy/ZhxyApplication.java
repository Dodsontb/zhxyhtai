package com.zhxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
@MapperScan("com.zhxy.mapper")
@SpringBootApplication

@EnableScheduling
@EnableWebSocket // 开启 socket通信
public class ZhxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhxyApplication.class, args);
	}
	
	@Bean
	public ThreadPoolTaskScheduler taskScheduler() {

		ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
		taskScheduler.setPoolSize(10);
		taskScheduler.initialize();
		return taskScheduler;
	}

}

