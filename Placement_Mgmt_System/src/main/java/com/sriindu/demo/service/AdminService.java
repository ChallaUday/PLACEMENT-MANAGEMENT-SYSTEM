package com.sriindu.demo.service;

import java.util.List;

import com.sriindu.demo.entity.AdminEntity;

public interface AdminService {

	AdminEntity saveAdmin(AdminEntity admin);

	List<AdminEntity> fetchAdminList();

	AdminEntity fetchAdminById(Long adminId);

	void deleteAdminById(Long adminId);

	AdminEntity updateAdmin(Long adminId, AdminEntity admin);

}
