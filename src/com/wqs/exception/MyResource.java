package com.wqs.exception;

import java.util.ListResourceBundle;

public class MyResource extends ListResourceBundle{

	public Object[][] getContents() { 
		return contents;
		} 
	static final Object[][] contents = {
		
		{"ValidationCode__VALUE_REQUIRED", "非缺省值"}, {"ValidationCode__INVALID_FORMAT", "格式不对"},{"ValidationCode__VALUE_TOO_SHORT", "太短"},{"ValidationCode__VALUE_TOO_LONGS", "太长"},
		
	};
	

}
 