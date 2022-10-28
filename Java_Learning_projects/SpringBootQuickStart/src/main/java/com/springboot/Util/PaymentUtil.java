package com.springboot.Util;

import java.util.HashMap;
import java.util.Map;

import com.springboot.Exception.InsuffientBalance;

public class PaymentUtil {

	private static Map<String,Double> paymentMap=new HashMap<>();
	{
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc2", 10000.0);
		paymentMap.put("acc3", 5000.0);
		paymentMap.put("acc4", 8000.0);
		
	}
	
	public static boolean isValidAmount(double amount,String acc1) {
		
		if(amount>paymentMap.get(acc1)) {
			throw new InsuffientBalance("Insuffient Fund");
		}else {
			return true;
		}
	}
}
