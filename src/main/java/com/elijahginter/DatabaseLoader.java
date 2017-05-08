package com.elijahginter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.elijahginter.dao.EmployeeRepository;
import com.elijahginter.entities.Employee;

/**
 * Implements Spring Boot’s CommandLineRunner so that it gets run after all the beans are created and registered.
 * Uses constructor injection and autowiring to get Spring Data’s automatically created EmployeeRepository.
 * The run() method is invoked with command line arguments, loading up your data.
 * @author eginter
 *
 */
@Component // automatically picked up by @SpringBootApplication
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}