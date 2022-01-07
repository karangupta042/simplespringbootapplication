package org.tcs.springbootassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssignmentApplication.class, args);
	}

}
