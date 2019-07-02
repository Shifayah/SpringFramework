package com.example.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.SpringAnno")
public class AppConfig {

	//without @Component we need to create bean
	@Bean
	public AirConditioner getDefinition() {
		return new AirConditioner();
	}
	
}
