package org.unskilled.intjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:/spring/si-config.xml")
public class SpringIntJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntJmsApplication.class, args);
	}
}
