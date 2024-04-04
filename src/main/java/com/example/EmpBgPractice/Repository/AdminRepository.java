package com.example.EmpBgPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpBgPractice.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
