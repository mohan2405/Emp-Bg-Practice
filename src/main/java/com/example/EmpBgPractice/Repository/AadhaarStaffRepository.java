package com.example.EmpBgPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmpBgPractice.Entity.AadhaarStaff;

@Repository
public interface AadhaarStaffRepository extends JpaRepository<AadhaarStaff, Integer>{

}
