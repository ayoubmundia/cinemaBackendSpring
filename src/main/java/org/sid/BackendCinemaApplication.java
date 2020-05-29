package org.sid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendCinemaApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendCinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Spring cinema Application");
		
	}

}
