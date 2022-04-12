package com.springboot.libraryOrg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.springboot.libraryOrg.properties.StorageProperties;
import com.springboot.libraryOrg.services.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class LibraryOrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryOrgApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
