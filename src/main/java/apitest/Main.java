package apitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.GreetingController;

@SpringBootApplication
@ComponentScan(basePackageClasses = GreetingController.class)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		SpringApplication.run(Main.class, args);

	}

}
