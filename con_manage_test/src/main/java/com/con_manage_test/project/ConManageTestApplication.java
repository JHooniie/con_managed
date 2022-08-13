package com.con_manage_test.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.con_manage_test.project"})
@MapperScan(basePackages = {"com.con_manage_test.project"})
public class ConManageTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConManageTestApplication.class, args);
	}

}
