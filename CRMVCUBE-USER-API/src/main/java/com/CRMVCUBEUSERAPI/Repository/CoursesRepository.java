package com.CRMVCUBEUSERAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.Course;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Long>{

}
