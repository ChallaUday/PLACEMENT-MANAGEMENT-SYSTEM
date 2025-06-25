package com.sriindu.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sriindu.demo.entity.AdminEntity;
import com.sriindu.demo.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


 

@RestController
@CrossOrigin("*")
public class AdminController {
	@Autowired
	AdminService as;
	@PostMapping("/admins")
	public AdminEntity saveAdmin(@RequestBody AdminEntity admin) {
		//TODO: process POST request
		
		return as.saveAdmin(admin) ;
	}
	
	
	
	@GetMapping("/admins")
    public List<AdminEntity> fetchAdminList() {
        //LOGGER.info("Inside fetchAdminList of AdminController");
        return as.fetchAdminList();
    }
	
	
	
	@GetMapping("/admins/{id}")
    public AdminEntity fetchAdminById(@PathVariable("id") Long adminId)
            {  
        return as.fetchAdminById(adminId);
    }
	
	
	
	@DeleteMapping("/admins/{id}")
    public String deleteAdminById(@PathVariable("id") Long adminId) {
        as.deleteAdminById(adminId);
        return "Department deleted Successfully!!";
    }
	
	@PutMapping("/admins/{id}")
    public AdminEntity updateAdmin(@PathVariable("id") Long adminId,
                                       @RequestBody AdminEntity admin) {
        return as.updateAdmin(adminId,admin);
    }
}
