package com.ruiheng.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ruiheng.boot.bean.Pet;
import com.ruiheng.boot.bean.User;

@Configuration//这是一个配置类
public class MyConfig {
	
	@Bean //给容器添加组件，以方法名作为组件的id。 返回类型就是组件类型。返回的值就是组件在容器中的实例
	public User user01() {
		return new User("zhangsan", 18);
	}
	
	@Bean
	public Pet tomcat() {
		return new Pet("Tom");
	}
}
