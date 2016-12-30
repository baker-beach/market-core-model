package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CouponResult {
	private Map<String, BigDecimal> discounts = new HashMap<String, BigDecimal>();
	private BigDecimal discount = BigDecimal.ZERO;
	private List<CouponError> errors = new ArrayList<CouponError>();

	public Map<String, BigDecimal> getDiscounts() {
		return discounts;
	}
	
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public List<CouponError> getErrors() {
		return errors;
	}

	public void addError(CouponError error) {
		errors.add(error);
	}

	public boolean hasErrors() {
		return !errors.isEmpty();
	}
}
