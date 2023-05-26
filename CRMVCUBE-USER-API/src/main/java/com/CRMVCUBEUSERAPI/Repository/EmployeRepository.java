package com.CRMVCUBEUSERAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.EmployeEntity;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer> {

	@Query(value="Select '*' from employe where Emp_Email=userId AND Emp_Pass=password",nativeQuery=true)
	public List<EmployeEntity> findByEmp_Email(String Emp_Email, String Emp_Pass );

}
