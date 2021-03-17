package com.ruiheng.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ruiheng.boot.bean.Pet;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		//返回ioc容器
		ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
		//查看容器里的组件
		String[] names = run.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println(name);
		}
		
		//从容器获取组件
		Pet tom01 = run.getBean("tomcat", Pet.class);
		Pet tom02 = run.getBean("tomcat", Pet.class);
		
		System.out.println(tom01 == tom02);
		//System.out.println(tom02);
	}
}
