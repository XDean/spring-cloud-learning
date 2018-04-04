package xdean.spring.cloud.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class CloudClientApp {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApp.class, args);
	}
	
  @RequestMapping("/")
  public String home() {
      return "Hello world";
  }
}
