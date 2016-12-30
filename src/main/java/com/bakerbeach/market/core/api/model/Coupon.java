package com.bakerbeach.market.core.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public interface Coupon extends Serializable {
	public static final String NATURE_SAVINGPLAN = "natureSavingPlan";
	public static final String NATURE_RULECOUPON = "natureRuleCoupon";
	public static final String NATURE_ONETIMECOUPON = "natureOneTimeCoupon";

	public static final String DISCOUNT_TYPE_LINE = "discountTypeLine";
	public static final String DISCOUNT_TYPE_CART = "discountTypeCart";
	public static final String DISCOUNT_TYPE_SAVINGPLAN = "discountTypeSavingPlan";
	public static final String DISCOUNT_TYPE_ADDITIONAL_PRODUCT = "discountTypeAdditionalProduct";

	Coupon getInstance();

	Boolean checkTime(Date date);

	CouponResult apply(ShopContext shopContext, Customer customer, Cart cart);

	CouponResult apply(Map<String, Object> context);

	String getNature();

	String getDiscountType();

	BigDecimal getCartDiscount();

	String getCode();

	Integer getMaxIndividualUse();

	Long getMaxUsesPerCoupon();

	void setMaxUsesPerCoupon(Long maxUsesPerCoupon);

	Long getMaxUsesPerCustomer();

	void setMaxUsesPerCustomer(Long maxUsesPerCustomer);

	String getExtProvider();

	void setExtProvider(String extProvider);

	CouponError getError();

	void setError(CouponError error);

	Date getEnd();

	Date getStart();

}
