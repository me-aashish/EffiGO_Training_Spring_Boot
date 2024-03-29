package com.aashish.springboot.springbootgettingstarted;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/")
	public String message() {
		return "Welcome to demo courses website";
	}

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {

		return Arrays.asList(new Course(1, "Learn Spring Framework", "Aashish"),
				new Course(2, "Learn Spring Boot", "RK"), new Course(3, "Learn Spring JPA", "XYZ"),
				new Course(4, "Learn Spring Hibernate", "ABC"));
	}
}
