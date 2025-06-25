package com.sriindu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriindu.demo.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity , Long> {

}
