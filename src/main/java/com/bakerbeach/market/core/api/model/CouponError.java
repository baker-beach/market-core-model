package com.bakerbeach.market.core.api.model;

public class CouponError {
	
	private String key;
	private Object[] objects;

	public CouponError() {
	}
	
	public CouponError(String key, Object...objects) {
		this.key = key;
		this.objects = objects;
	}
	
	public String getKey() {
		return key;
	}
	
	public Object[] getObjects() {
		return objects;
	}

}
