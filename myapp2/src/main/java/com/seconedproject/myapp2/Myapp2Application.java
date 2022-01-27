package com.seconedproject.myapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Myapp2Application {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 9090 );
		SpringApplication.run(Myapp2Application.class, args);
		System.out.println("started..................");
	}

}
