package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;

public class ShippingFee {

	private BigDecimal basePrice = BigDecimal.ZERO;
	private BigDecimal surchargeInternationalDelivery = BigDecimal.ZERO;
	private BigDecimal surchargeSplitDelivery = BigDecimal.ZERO;

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getSurchargeInternationalDelivery() {
		return surchargeInternationalDelivery;
	}

	public void setSurchargeInternationalDelivery(BigDecimal surchargeInternationalDelivery) {
		this.surchargeInternationalDelivery = surchargeInternationalDelivery;
	}

	public BigDecimal getSurchargeSplitDelivery() {
		return surchargeSplitDelivery;
	}

	public void setSurchargeSplitDelivery(BigDecimal surchargeSplitDelivery) {
		this.surchargeSplitDelivery = surchargeSplitDelivery;
	}

	public BigDecimal getTotal() {
		return basePrice.add(surchargeInternationalDelivery).add(surchargeSplitDelivery);
	}
}
