package com.EducationalLoanPortal.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationalLoanPortal.demo.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer>{

}
