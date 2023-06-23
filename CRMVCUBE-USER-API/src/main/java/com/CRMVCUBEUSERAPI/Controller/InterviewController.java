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

import com.CRMVCUBEUSERAPI.Entity.Interview;
import com.CRMVCUBEUSERAPI.Service.InterviewService;
@CrossOrigin("*")
@RestController
@RequestMapping("/interview/")
public class InterviewController {
	@Autowired
	private InterviewService interviewService;
	@PostMapping("save")
	public Interview Save(@RequestBody Interview i) {
		return interviewService.save(i);
	}
	@GetMapping("get")
	public List<Interview> getAll(){
		return interviewService.get();
	}
	@PutMapping("update")
	public Interview update(@RequestBody Interview u) {
		return interviewService.save(u);
	}
	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable("id") long interview_id) {
		interviewService.deleteById(interview_id);
	}

}
