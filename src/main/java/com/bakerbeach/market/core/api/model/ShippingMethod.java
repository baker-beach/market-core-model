package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Date;

public interface ShippingMethod {

	static String DEFAULT = "DEFAULT";

	String getId();

	String getDescription();

	Date getDeliveryDate();

	public int getDeliveryWorkingDays();

	@Deprecated
	BigDecimal getValueOfGoodsLimit();

	String getEan();

	String getTitle();

	String getTaxCode();

	ShippingFee getShippingFee(String countryCode, BigDecimal valueOfShippingGoods, Boolean splitDelivery, Date now);
}
