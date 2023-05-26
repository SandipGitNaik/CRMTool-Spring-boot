package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.BatcheEntity;
import com.CRMVCUBEUSERAPI.Repository.BatcheRepository;
@Service
public class BatcheService {
	@Autowired
	 private BatcheRepository batcheRepository;

	public BatcheEntity save(BatcheEntity b) {
		// TODO Auto-generated method stub
		return batcheRepository.save(b);
	}

	public List<BatcheEntity> get() {
		// TODO Auto-generated method stub
		return batcheRepository.findAll();
	}
}
