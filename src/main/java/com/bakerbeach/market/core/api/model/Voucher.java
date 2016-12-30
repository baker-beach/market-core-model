package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;

public interface Voucher {
	
	String getId();
	
	long getVoucherId();
	
	void setVoucherId(long id);

	public String getCode();

	public void setCode(String code);

	public String getStatus();

	public void setStatus(String status);

	public String getToName();

	public void setToName(String toName);

	public String getFromName();

	public void setFromName(String fromName);

	public String getDeliveryName();

	public void setDeliveryName(String deliveryName);

	public String getText();

	public void setText(String text);

	public String getEmail();

	public void setEmail(String email);

	public String getStreet();

	public void setStreet(String street);

	public String getCity();

	public void setCity(String city);

	public String getPostcode();

	public void setPostcode(String postcode);

	public String getCountry();

	public void setCountry(String country);

	String getDeliveryType();

	void setDeliveryType(String deliveryType);

	String getTaxCode();

	BigDecimal getAmount();

	void setAmount(BigDecimal amount);
	
	String getCustomerId();
	
	void setCustomerId(String customerId);
	
	String getOrderId();
	
	void setOrderId(String orderId);
	
	String getShopId();
	
	void setShopId(String shopId);
	

}
