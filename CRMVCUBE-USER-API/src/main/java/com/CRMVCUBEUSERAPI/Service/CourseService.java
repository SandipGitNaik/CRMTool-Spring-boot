package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.Course;
import com.CRMVCUBEUSERAPI.Repository.CoursesRepository;

@Service
public class CourseService {
	@Autowired
	private CoursesRepository coursesRepository;
	
	public Course save(Course c) {
		return coursesRepository.save(c);
	}
	
	public List<Course> get(){
		return coursesRepository.findAll();
	}
	
	public Course update(Course u) {
		return coursesRepository.save(u);
	}
	
	public void deleteById(long course_Id) {
		coursesRepository.deleteById(course_Id);
	}

}
