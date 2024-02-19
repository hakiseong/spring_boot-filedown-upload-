package ssg.com.a;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//	접속허가
@Configuration
public class WebConfigurer implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**").allowedOrigins("*");							// 모든 port 접속 허용
	//	registry.addMapping("/**").allowedOrigins("http://localhost:3000");		// port 3000만 접속 허용
	}
	
}
