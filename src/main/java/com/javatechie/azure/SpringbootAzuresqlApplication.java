package com.javatechie.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringbootAzuresqlApplication {
	@Autowired
    private EmployeeRepository repository;

 @GetMapping("/satyam")
	public String data()
	{
		return "hello satyam";
	}

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

 

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

}
