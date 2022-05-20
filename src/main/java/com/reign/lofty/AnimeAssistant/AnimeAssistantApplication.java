package com.reign.lofty.AnimeAssistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AnimeAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeAssistantApplication.class, args);
		System.err.println("API Online!");
	}

}