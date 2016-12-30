package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Currency;

public class StdPrice {
	protected String group;
	protected BigDecimal value;
	protected BigDecimal monthlyValue;
	protected Currency currency;
	
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getMonthlyValue() {
		return monthlyValue;
	}
	
	public void setMonthlyValue(BigDecimal monthlyValue) {
		this.monthlyValue = monthlyValue;
	}
	
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
