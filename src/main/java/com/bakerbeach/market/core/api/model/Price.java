package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public interface Price {

	Currency getCurrency();

	void setCurrency(Currency currency);

	BigDecimal getValue();

	void setValue(BigDecimal value);

	String getTag();

	void setTag(String tag);
	
	String getGroup();
	
	void setGroup(String group);

	Date getStart();

	void setStart(Date start);

}
