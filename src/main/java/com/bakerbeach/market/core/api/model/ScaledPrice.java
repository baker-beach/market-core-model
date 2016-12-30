package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class ScaledPrice extends StdPrice {
	private Date start;

	public ScaledPrice() {}
	
	public ScaledPrice(String group, BigDecimal value, Currency currency, Date start) {
		this.group = group;
		this.value = value;
		this.currency = currency;
		this.start = start;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

}
