package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.Batches;
import com.CRMVCUBEUSERAPI.Repository.BatchesRepository;

@Service

public class BatchesService {
	@Autowired
	private BatchesRepository batchesRepository;
	public Batches save(Batches b) {
		return batchesRepository.save(b);
	}
	public List<Batches> get(){
		return batchesRepository.findAll();
	}
	public Batches update(Batches u) {
		return batchesRepository.save(u);
	}
	public void deleteById(long batch_id) {
		batchesRepository.deleteById(batch_id);
	}

}
