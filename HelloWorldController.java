package demo.controller;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Employee;
@RestController
@CrossOrigin
public class HelloWorldController {
	 @RequestMapping("/")
	 List<String> home() {

		 List<String> res = new ArrayList<>();
		 res.add("hello");
		 res.add("world");
		//	Employee emp1 = new Employee();
//			emp1.setName("emp1");
//			emp1.setDesignation("manager");
//			emp1.setEmpId("1");
//			emp1.setSalary(3000);
//
//			Employee emp2 = new Employee();
//			emp2.setName("emp2");
//			emp2.setDesignation("developer");
//			emp2.setEmpId("2");
//			emp2.setSalary(3000);
//			tempEmployees.add(emp1);
//			tempEmployees.add(emp2);
//			return tempEmployees;
		 return res;
		 }
}
