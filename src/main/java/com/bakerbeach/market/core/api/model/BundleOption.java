package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Map;

public interface BundleOption {

	String getGtin();

	BigDecimal getPrice();

	BigDecimal getMonthlyPrice();

	Map<String, BigDecimal> getPrices();

	Integer getDefaultQty();

	Integer getMinQty();

	Integer getMaxQty();

	Integer getUserDefinedQty();

	Boolean isPreset();

	Boolean isDefault();

	Boolean isRequired();

}
