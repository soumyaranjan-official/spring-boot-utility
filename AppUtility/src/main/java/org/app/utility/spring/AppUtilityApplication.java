package org.app.utility.spring;

import org.app.utility.spring.util.PrintUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppUtilityApplication {

	public static void main(String[] args) {
		PrintUtil.print("Hello World");
		SpringApplication.run(AppUtilityApplication.class, args);
	}

}
