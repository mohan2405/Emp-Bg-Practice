package com.example.EmpBgPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpBgPractice.Entity.Police;

@Repository
public interface PoliceRepository extends JpaRepository<Police, Integer>{

}
