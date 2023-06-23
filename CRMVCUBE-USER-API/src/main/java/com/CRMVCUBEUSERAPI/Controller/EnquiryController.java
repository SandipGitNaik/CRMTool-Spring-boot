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

import com.CRMVCUBEUSERAPI.Entity.Enquiry;
import com.CRMVCUBEUSERAPI.Service.EnquiryService;


@CrossOrigin("*")
@RestController
@RequestMapping("/enquiry/")
public class EnquiryController {
	@Autowired
	private EnquiryService enquiryService;
	 @PostMapping("post")
	 public Enquiry oneSave(@RequestBody Enquiry e) {
		 return enquiryService.save(e);
	 }
	 @GetMapping("get")
	 public List<Enquiry> getAll(){
		 	return enquiryService.get();
	 }
	 @DeleteMapping("delete/{id}")
	 public void delete(@PathVariable("id") long enquiry_id) {
		 enquiryService.deleteById(enquiry_id);
	 }
	 @PutMapping("update")
	 public Enquiry update(@RequestBody Enquiry u) {
		 return enquiryService.update(u);
	 }
 

}
