package com.CRMVCUBEUSERAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRMVCUBEUSERAPI.Entity.Course;
import com.CRMVCUBEUSERAPI.Service.CourseService;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/course/")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("post")
	public Course save(@RequestBody Course c) {
		return courseService.save(c);
	}
	@GetMapping("get")
	public List<Course> getAll(){
		return courseService.get();
	}
	@PutMapping("update")
		public Course update(@RequestBody Course u) {
			return courseService.update(u);
		}
		@DeleteMapping("delete/{id}")
		public void deleteById(@PathVariable("id") long course_Id) {
			courseService.deleteById(course_Id);
		}
	

}
