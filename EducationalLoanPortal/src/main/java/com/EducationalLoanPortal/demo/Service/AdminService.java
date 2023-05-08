package com.EducationalLoanPortal.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoanPortal.demo.Repository.LoanApplicationModelRepository;
import com.EducationalLoanPortal.demo.model.LoanApplicationModel;

@Service
public class AdminService {
	
	    @Autowired
	    LoanApplicationModelRepository loanApp;
	    public List<LoanApplicationModel> getAdmin()
	{

	    return loanApp.findAll();
	}
	public LoanApplicationModel saveDeatils(LoanApplicationModel lm)
	{

	return loanApp.save(lm);
	}

	    
	

}
