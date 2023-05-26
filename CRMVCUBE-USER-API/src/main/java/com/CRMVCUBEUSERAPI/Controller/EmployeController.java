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

import com.CRMVCUBEUSERAPI.Entity.EmployeEntity;
import com.CRMVCUBEUSERAPI.Entity.RegisterEntity;
import com.CRMVCUBEUSERAPI.Service.EmployeService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Emp/")
public class EmployeController {
@Autowired
   private EmployeService employeService;
@PostMapping("save")
public EmployeEntity oneSave(@RequestBody EmployeEntity E) {
	
	return employeService.oneSave(E);
}
@GetMapping("get")
public List<EmployeEntity>getAll(){
	return employeService.getAll();
}
@PutMapping("put")
public EmployeEntity update(@RequestBody EmployeEntity em) {
	return employeService.update(em);
}
@DeleteMapping("del/{id}")
public void delete(@PathVariable("id") Integer Emp_ID) {
	employeService.deleteById(Emp_ID);
}
@PostMapping("login")
public void loginInfo(@RequestBody EmployeEntity lo) {
	//employeService.loginInfo(lo.getEmp_Email(),lo.getEmp_Pass());}
}
}
