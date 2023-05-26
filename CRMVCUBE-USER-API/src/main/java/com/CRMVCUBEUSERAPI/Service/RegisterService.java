package com.CRMVCUBEUSERAPI.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRMVCUBEUSERAPI.Entity.RegisterEntity;
import com.CRMVCUBEUSERAPI.Repository.RegisterRepository;

@Service
public class RegisterService {
@Autowired
   private RegisterRepository registerRepository;

public RegisterEntity oneSave(RegisterEntity e) {
	// TODO Auto-generated method stub
	return registerRepository.save(e);
}

public List<RegisterEntity> getAll() {
	// TODO Auto-generated method stub
	return registerRepository.findAll();
}

public RegisterEntity update(RegisterEntity re) {
	// TODO Auto-generated  stub
	return registerRepository.save(re);
}

public void deleteById(Integer reg_Id) {

	registerRepository.deleteById(reg_Id);
}



}
