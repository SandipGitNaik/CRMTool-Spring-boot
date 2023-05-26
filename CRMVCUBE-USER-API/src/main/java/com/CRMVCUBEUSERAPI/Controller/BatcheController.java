package com.CRMVCUBEUSERAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRMVCUBEUSERAPI.Entity.BatcheEntity;
import com.CRMVCUBEUSERAPI.Service.BatcheService;

@RestController
@RequestMapping("/batch/")
public class BatcheController {

	@Autowired
	private BatcheService batcheService;
	
	@PostMapping("save")
	public BatcheEntity OneSave(@RequestBody BatcheEntity b) {
		return batcheService.save(b);
	}
	@GetMapping("get")
	public List<BatcheEntity> getAll(){
		return batcheService.get();
		
	}
}
