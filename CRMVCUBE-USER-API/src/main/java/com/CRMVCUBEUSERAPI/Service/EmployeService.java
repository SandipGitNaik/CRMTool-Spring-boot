package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.EmployeEntity;
import com.CRMVCUBEUSERAPI.Repository.EmployeRepository;

@Service
public class EmployeService {
@Autowired
  private EmployeRepository employeRepository;

public EmployeEntity oneSave(EmployeEntity e) {
	// TODO Auto-generated method stub
	return employeRepository.save(e);
}

public List<EmployeEntity> getAll() {
	// TODO Auto-generated method stub
	return employeRepository.findAll();
}

public EmployeEntity update(EmployeEntity em) {
	// TODO Auto-generated method stub
	return employeRepository.save(em);
}

public void deleteById(Integer emp_ID) {
	// TODO Auto-generated method stub
	employeRepository.deleteById(emp_ID);
}

}
