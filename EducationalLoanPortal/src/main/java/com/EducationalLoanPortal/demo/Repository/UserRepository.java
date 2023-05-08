package com.EducationalLoanPortal.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationalLoanPortal.demo.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer>{
	UserModel findByEmail(String email);

}
