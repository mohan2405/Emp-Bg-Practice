package com.example.EmpBgPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpBgPractice.Entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate ,Integer>{

}
