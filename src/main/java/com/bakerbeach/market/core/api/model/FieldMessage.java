package com.bakerbeach.market.core.api.model;

public interface FieldMessage extends Message {
	String getName();

	public void setName(String name);

	public Object getRejectedValue();

	public void setRejectedValue(Object rejectedValue);

}
