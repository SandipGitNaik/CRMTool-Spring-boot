package com.CRMVCUBEUSERAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.RegisterEntity;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer>{

}
