package com.example.EmpBgPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpBgPractice.Entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
