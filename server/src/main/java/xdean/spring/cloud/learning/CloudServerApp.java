package xdean.spring.cloud.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudServerApp {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApp.class, args);
	}
}
