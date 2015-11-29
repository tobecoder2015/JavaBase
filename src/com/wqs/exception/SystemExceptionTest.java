package com.wqs.exception;

import java.util.ResourceBundle;

public class SystemExceptionTest {
	 private static final int MIN_LENGTH = 10;  
	  
	    public static void main(String[] args) {  
	       // validate("email", "abc");  
	    	System.out.println(getUserText(ValidationCode.VALUE_TOO_SHORT)); 
	    }  
	  
	    public static void validate(String field, String value) {  
	        if (value == null || value.length() < MIN_LENGTH) {  
	            throw new SystemException("异常",ValidationCode.VALUE_TOO_SHORT)  
	            .set("field", field).set("value", value).set("min-length", MIN_LENGTH);   
	        } 
	    }  
	    
	    public static String getUserText(ErrorCode errorCode) {  
	        if (errorCode == null) {  
	            return null;  
	        }  
	        String key = errorCode.getClass().getSimpleName() + "__" + errorCode;  
	        ResourceBundle bundle = ResourceBundle.getBundle("com.wqs.exception.MyResource");  
	        return bundle.getString(key);  
	    }  

}
