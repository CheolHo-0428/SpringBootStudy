package com.rubypaper;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.rubypaper", "com.ruby"})
public class Chapter01Application {

	public static void main(String[] args) {
		SpringApplication application = 
				new SpringApplication(Chapter01Application.class);
		// application.setWebApplicationType(WebApplicationType.NONE); // 자바 어플리케이션으로 실행
		// application.setWebApplicationType(WebApplicationType.REACTIVE); // 스프링 5.0에서 추가된 비동기 처리와 논블로킹 입출력을 지원하는 웹플러스를 적용할때 사용
		application.setWebApplicationType(WebApplicationType.SERVLET); // 웹 애플리케이션(톰캣)으로 실행
		application.setBannerMode(Banner.Mode.OFF); //배너 출력 관련
		application.run(args);
	}
}
