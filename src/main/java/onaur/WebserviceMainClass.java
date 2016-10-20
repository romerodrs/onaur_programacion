package onaur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class WebserviceMainClass{

	public static void main(String[] args) {
		SpringApplication.run(WebserviceMainClass.class, args);
	}
	
}
