package com.angularkeycloak.keycloak;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * Spring boot application start up class. You may run this class to start the application.
 * <p>
 * We are excluding {@link SecurityAutoConfiguration} and {@link UserDetailsServiceAutoConfiguration}
 * to disable spring default basic authentication.
 * </p>
 * Note: If you are using Spring 1.x you may exclude only {@link SecurityAutoConfiguration}.
 */
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class,
//		UserDetailsServiceAutoConfiguration.class})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}

