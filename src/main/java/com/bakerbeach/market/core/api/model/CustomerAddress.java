package com.bakerbeach.market.core.api.model;

public interface CustomerAddress extends Address {
	
	public final static String TAG_DEFAULT_BILLING_ADDRESS = "TAG_DEFAULT_BILLING_ADDRESS"; 
	
	public final static String TAG_DEFAULT_SHIPPING_ADDRESS = "TAG_DEFAULT_SHIPPING_ADDRESS"; 
	
	String getCustomerId();
	
	void setCustomerId(String customerId);

}
