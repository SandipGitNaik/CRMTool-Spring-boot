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

import com.CRMVCUBEUSERAPI.Entity.RegisterEntity;
import com.CRMVCUBEUSERAPI.Service.RegisterService;
@CrossOrigin("*")
@RestController
@RequestMapping("/reg/")
public class RegisterController {
@Autowired
   private RegisterService registerService;

@PostMapping("save")
public RegisterEntity oneSave(@RequestBody RegisterEntity E) {
	return registerService.oneSave(E);
}
@GetMapping("get")
public List<RegisterEntity>getAll(){
	return registerService.getAll();
}
@PutMapping("put")
public RegisterEntity update(@RequestBody RegisterEntity re) {
	return registerService.update(re);
}
@DeleteMapping("delete/{id}")
public void delete (@PathVariable("id") Integer reg_Id) {
	registerService.deleteById(reg_Id);
}

}
