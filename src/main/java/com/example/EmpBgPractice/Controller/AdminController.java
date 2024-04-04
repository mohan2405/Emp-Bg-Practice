package com.example.EmpBgPractice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpBgPractice.Entity.Admin;
import com.example.EmpBgPractice.Repository.AdminRepository;

@RestController
public class AdminController {
	
	@Autowired
	AdminRepository adminRepo;
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin() {
		return adminRepo.findAll();
	}
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin newAdmin) {
		
	adminRepo.save(newAdmin);
		return newAdmin;
	}

}
