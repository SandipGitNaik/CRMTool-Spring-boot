package com.CRMVCUBEUSERAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.FeedbackEntiry;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackEntiry, Long>{

}
