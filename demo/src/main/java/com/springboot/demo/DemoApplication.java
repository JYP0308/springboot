package com.springboot.demo;

import com.springboot.demo.entity.TestConfigBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TestConfigBean.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.setAddCommandLineProperties(false);
		app.run(args);
	}

}
