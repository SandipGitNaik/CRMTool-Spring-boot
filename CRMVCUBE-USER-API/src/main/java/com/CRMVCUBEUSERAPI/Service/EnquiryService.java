package com.CRMVCUBEUSERAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.Enquiry;
import com.CRMVCUBEUSERAPI.Repository.EnquiryRepository;



@Service
public class EnquiryService {
	@Autowired
	private EnquiryRepository enquiryRepository;
	
	public Enquiry save(Enquiry e) {
		return enquiryRepository.save(e);
	}
	public List<Enquiry> get(){
		return enquiryRepository.findAll();
	}
	public Enquiry update(Enquiry u) {
		return enquiryRepository.save(u);
	}
	
	public void deleteById(long enquiry_id) {
		// TODO Auto-generated method stub
		enquiryRepository.deleteById(enquiry_id);
	}
		
}
