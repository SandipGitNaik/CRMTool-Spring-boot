package com.CRMVCUBEUSERAPI.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.EmployeEntity;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer> {

	

}
