package com.CRMVCUBEUSERAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.BatcheEntity;

@Repository
public interface BatcheRepository extends JpaRepository<BatcheEntity, Integer> {

}
