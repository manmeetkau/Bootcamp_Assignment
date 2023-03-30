package com.javabytes.springh2demo;

import com.javabytes.springh2demo.Model.Employee;
import com.javabytes.springh2demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringH2DemoApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepository repository;
	public static void main(String[] args) {

		SpringApplication.run(SpringH2DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
repository.save(new Employee("Trainee","Manmeet",1));
repository.save(new Employee("Trainee","Kritika",2));
	}
}
