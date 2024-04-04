package com.example.EmpBgPractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpBgPractice.Entity.LoginDTO;
import com.example.EmpBgPractice.Repository.AadhaarStaffRepository;
import com.example.EmpBgPractice.Repository.AdminRepository;
import com.example.EmpBgPractice.Repository.CandidateRepository;
import com.example.EmpBgPractice.Repository.CompanyRepository;
import com.example.EmpBgPractice.Repository.PoliceRepository;

@RestController
public class LoginController {
	
//	Creating instances for Repositories
	
	@Autowired
	AadhaarStaffRepository aadhaarStaffRepo;
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	CandidateRepository candidateRepo;
	
	@Autowired
	CompanyRepository companyRepo;
	
	@Autowired
	PoliceRepository policeRepo;
	
	
//	Method to Verify the User
	
	@PostMapping("/LoginVerify")
	public ResponseEntity<?> VerifyLogin(@RequestBody LoginDTO obj){
		
//		Admin
		if(obj.getUserType().equals("Admin")) {
			var user = adminRepo.findById(obj.getId()).orElseThrow(() -> new RuntimeException("User Not Found"));
			if(user.getPassword().equals(obj.getPassword())) {
				return new ResponseEntity<>("Admin Login Success",HttpStatus.OK);
			}
			else {
				throw new RuntimeException("Invalid Password...!");
			}
		}
		
//		Aadhaar Staff
		else if(obj.getUserType().equals("Aadhaar Staff")) {
			var user = aadhaarStaffRepo.findById(obj.getId()).orElseThrow(()-> new RuntimeException("User Not Found"));
			if(user.getPassword().equals(obj.getPassword())) {
				return new ResponseEntity<>("Aadhaar Staff Login Success",HttpStatus.OK);
			}
			else {
				throw new RuntimeException("Invalid Password...!");
			}
		}
		
//		Candidate
		else if(obj.getUserType().equals("Candidate")) {
			var user = candidateRepo.findById(obj.getId()).orElseThrow(()-> new RuntimeException("User Not Found"));
			if(user.getPassword().equals(obj.getPassword())) {
				return new ResponseEntity<>("Candidate Login Success",HttpStatus.OK);
			}
			else {
				throw new RuntimeException("Invalid Password...!");
			}
		}
		
//		Company
		else if(obj.getUserType().equals("Company")) {
			var user = companyRepo.findById(obj.getId()).orElseThrow(()-> new RuntimeException("User Not Found"));
			if(user.getPassword().equals(obj.getPassword())) {
				return new ResponseEntity<>("Company Login Success",HttpStatus.OK);
			}
			else {
				throw new RuntimeException("Invalid Password");
			}
		}
		
//		Police
		else if(obj.getUserType().equals("Police")) {
			var user = policeRepo.findById(obj.getId()).orElseThrow(()-> new RuntimeException("User Not Found"));
			if(user.getPassword().equals(obj.getPassword())) {
				return new ResponseEntity<>("Police Login Success",HttpStatus.OK);
			}
			else {
				throw new RuntimeException("Invalid Password");
			}
		}
		
//		Main Else for UserType
		else {
			throw new RuntimeException("Login Failed");
		}
	}
	

}
