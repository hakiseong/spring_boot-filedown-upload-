package ssg.com.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SampleBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleBoot2Application.class, args);
	}

}
