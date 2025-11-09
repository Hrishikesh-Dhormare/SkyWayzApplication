package com.bookmyflight;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyFlightApplication {

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BookMyFlightApplication.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);
		
		System.out.println("server running...");
	}

}
