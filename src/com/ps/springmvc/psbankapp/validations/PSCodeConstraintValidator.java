package com.ps.springmvc.psbankapp.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PSCodeConstraintValidator implements ConstraintValidator<PSCode,String>{
    public String CodePrefix;
	
    @Override
    public void initialize(PSCode code){
    	CodePrefix = code.value();
    }
    @Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
    	boolean result;
    	
    	if( code!= null)
    		result= code.startsWith("codePrefix");
    	else
    		result=false;
		return result;
	}
    
	
}
