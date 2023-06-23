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

import com.CRMVCUBEUSERAPI.Entity.Batches;
import com.CRMVCUBEUSERAPI.Service.BatchesService;
@CrossOrigin(origins = "http://localhost:3000/") 
@RestController
@RequestMapping("/Batches/")

public class BatchesController {
	@Autowired
	private BatchesService batchesService;
	
	@PostMapping("save")
	public Batches onsave(@RequestBody Batches b) {
		return batchesService.save(b);
	}
	@GetMapping("get")
	public List<Batches> getAll(){
		return batchesService.get();
	
	}
	@PutMapping("update")
	public Batches update(@RequestBody Batches u) {
		return batchesService.update(u);
	}
	@DeleteMapping("delete/{id}")
	public void deletById(@PathVariable("id") long batch_id) {
		batchesService.deleteById(batch_id);
	}

}
