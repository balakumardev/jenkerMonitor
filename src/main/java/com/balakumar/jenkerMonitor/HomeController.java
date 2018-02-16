package com.balakumar.jenkerMonitor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	EmployeeRepo empRepo;
	@Autowired
	RestService rServe;
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee emp) {
		System.out.println("Recieved Object : " + "\nName: " + emp.firstName + " " + emp.lastName + "\nEmail: " + emp.email);
		return empRepo.save(emp);
	}
	
	@RequestMapping(value="/all", method =RequestMethod.GET)
	public Iterable<Employee> getAllEmployee() {
		return empRepo.findAll();
	}
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello World! ";
	}
}
