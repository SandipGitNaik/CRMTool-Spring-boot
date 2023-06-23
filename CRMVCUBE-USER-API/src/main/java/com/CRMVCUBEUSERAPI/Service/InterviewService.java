package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.Interview;
import com.CRMVCUBEUSERAPI.Repository.InterviewRepository;

@Service
public class InterviewService {
	@Autowired
	private InterviewRepository interviewRepository;
	
	public Interview save(Interview i) {
		return interviewRepository.save(i);
	}
	public List<Interview> get(){
		return interviewRepository.findAll();
	}
	public Interview update(Interview u) {
		return interviewRepository.save(u);
	}
	public void deleteById(long interview_id) {
		interviewRepository.deleteById(interview_id);
	}

}
