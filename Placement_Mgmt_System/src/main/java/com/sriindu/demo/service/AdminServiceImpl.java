package com.sriindu.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriindu.demo.entity.AdminEntity;
import com.sriindu.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository ar;

	@Override
	public AdminEntity saveAdmin(AdminEntity admin) {
		// TODO Auto-generated method stub
		return ar.save(admin);
	}

	@Override
	public List<AdminEntity> fetchAdminList() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public AdminEntity fetchAdminById(Long adminId) {
		// TODO Auto-generated method stub
		return ar.findById(adminId).get();
	}

	@Override
	public void deleteAdminById(Long adminId) {
		// TODO Auto-generated method stub
		ar.deleteById(adminId);
	}

	@Override
	   public AdminEntity updateAdmin(Long adminId, AdminEntity admin) {
	       AdminEntity admDB = ar.findById(adminId).get();

	       if(Objects.nonNull(admin.getName()) &&
	       !"".equalsIgnoreCase(admin.getName())) {
	           admDB.setName(admin.getName());
	       }

	       if(Objects.nonNull(admin.getPassword()) &&
	               !"".equalsIgnoreCase(admin.getPassword())) {
	           admDB.setPassword(admin.getPassword());
	       }

	       return ar.save(admDB);
	   }
	
	
	

}
