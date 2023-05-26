package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.FeedbackEntiry;
import com.CRMVCUBEUSERAPI.Repository.FeedbackRepository;

@Service
public class FeedbackService {
@Autowired
  private FeedbackRepository feedbackRepository;



public List<FeedbackEntiry> get() {
	// TODO Auto-generated method stub
	return feedbackRepository.findAll();
}

public FeedbackEntiry updatetd(FeedbackEntiry up) {
	// TODO Auto-generated method stub
	return feedbackRepository.save(up);
}



public FeedbackEntiry oneSave(FeedbackEntiry feed) {
	// TODO Auto-generated method stub
	return feedbackRepository.save(feed);
}

public void deleteById(long fedback_id) {
	// TODO Auto-generated method stub
	feedbackRepository.deleteById(fedback_id);
}


  }
