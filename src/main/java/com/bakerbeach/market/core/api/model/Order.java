package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface Order {
	
	public final static String STATUS_SUBMIT = "submit";
	public final static String STATUS_ACCEPTED = "accepted";
	public final static String STATUS_CANCELED = "canceled";

	String getId();
	
	String getShopCode();
	
	String getCurrency();
	
	BigDecimal getTotal();
	
	String getCustomerId();
	
	Address getShippingAddress();
	
	Address getBillingAddress();
	
	List<OrderItem> getItems();
	
	HashMap<String,Object> getAttributes();
	
	HashMap<String,Object> getAdditionalInformations();
	
	String getOrderStatus();

	String getCustomerEmail();
	
	Date getUpdatedAt();
	
	Date getCreatedAt();
	
	void setUpdatedAt(Date date);
	
	String getPaymentCode();
	
	void setPaymentCode(String paymentCode);

}
