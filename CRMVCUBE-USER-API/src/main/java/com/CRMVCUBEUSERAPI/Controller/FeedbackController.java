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

import com.CRMVCUBEUSERAPI.Entity.FeedbackEntiry;
import com.CRMVCUBEUSERAPI.Service.FeedbackService;
@CrossOrigin("*")
@RestController
@RequestMapping("/Feedback/")
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping("save")
	public FeedbackEntiry onesave(@RequestBody FeedbackEntiry feed) {
		return feedbackService.oneSave(feed);
	}
		
	@GetMapping("get")
	 public List<FeedbackEntiry>getAll(){
		return feedbackService.get();
	}
	@PutMapping("put")
	public FeedbackEntiry update(@RequestBody FeedbackEntiry up) {
		return feedbackService.updatetd(up);
	}
   @DeleteMapping("del/{id}")
	   public void delete(@PathVariable("id")long fedback_id) {
	   feedbackService.deleteById(fedback_id);
   }
}
