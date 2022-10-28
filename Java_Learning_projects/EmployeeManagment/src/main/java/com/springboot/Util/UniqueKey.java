package com.springboot.Util;

public class UniqueKey {

	public static String uniqueKey(int  noEmp) {
		String empId="E";
		int nDigits =0;
		noEmp=noEmp+1;
		if(noEmp!=0) {
			nDigits = (int) (Math.floor(Math.log10(Math.abs(noEmp))) + 1);
		}
		
		if(nDigits>=2 && nDigits<3 ) {	
			empId=empId+"0"+noEmp;
		}else if(nDigits==1 || noEmp==0 ) {
			empId=empId+"00"+noEmp;
		}else {
			empId=empId+noEmp;
		}
		return empId;
	}
}
