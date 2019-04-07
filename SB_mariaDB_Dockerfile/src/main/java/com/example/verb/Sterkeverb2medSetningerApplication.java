package com.example.verb;

/**
 * This program accesses MariaDB
 * via DBeaver, an SQL client.
 * The data can be fed to the database
 * from the application opened in 
 * a localhost. It contains a Dockerfile 
 * which can sent image to docker.
 * The code structure (the crud and
 * pagination part) is inspired by
 * another github user: varuncbv.
 * 
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sterkeverb2medSetningerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sterkeverb2medSetningerApplication.class, args);
	}

}
