package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Map;

public interface CartItem {

	Map<String, Object> getAttributes();

	String getId();

	void setId(String id);

	String getGtin();

	String getName();

	void setName(String name);

	String getBrand();

	void setBrand(String brand);

	String getSupplier();

	void setSupplier(String supplier);

	BigDecimal getQuantity();

	void setQuantity(BigDecimal quantity);

	BigDecimal getDiscount();

	void setDiscount(BigDecimal zero);

	Boolean isVolatile();

	Price getUnitPrice();

	void setUnitPrice(Price unitPrice);

	void setUnitPrice(String currency, Map<String, BigDecimal> values);

	BigDecimal getTotalPrice();

	void setTotalPrice(BigDecimal totalPrice);

	BigDecimal getMonthlyTotalPrice();

	void setMonthlyTotalPrice(BigDecimal monthlyTotalPrice);

	TaxCode getTaxCode();

	void setTaxCode(TaxCode taxCode);

	BigDecimal getTaxPercent();

	void setTaxPercent(BigDecimal taxPercent);

	String getQualifier();

	@Deprecated
	String getTitle1();

	@Deprecated
	void setTitle1(String title1);

	@Deprecated
	String getTitle2();

	@Deprecated
	void setTitle2(String title2);

	@Deprecated
	String getTitle3();

	@Deprecated
	void setTitle3(String title3);

	String getImageUrl1();

	void setImageUrl1(String imageUrl1);

	String getImageUrl2();

	void setImageUrl2(String imageUrl2);

	@Deprecated
	String getSize();

	@Deprecated
	void setSize(String message);

	@Deprecated
	String getColor();

	@Deprecated
	void setColor(String color);

	Map<String, CartItemComponent> getComponents();

	public static interface CartItemComponent {

		String getName();

		Map<String, CartItemOption> getOptions();

	}

	public static interface CartItemOption {

		String getGtin();

		Integer getQuantity();

		void setQuantity(Integer quantity);

		BigDecimal getUnitPrice();

		void setUnitPrice(BigDecimal unitPrice);

		BigDecimal getMonthlyUnitPrice();

		void setMonthlyUnitPrice(BigDecimal monthlyPrice);

		Map<String, BigDecimal> getUnitPrices();

		void setUnitPrices(Map<String, BigDecimal> unitPrices);

		BigDecimal getTotalPrice();

		void setTotalPrice(BigDecimal totalPrice);

		BigDecimal getMonthlyTotalPrice();

		void setMonthlyTotalPrice(BigDecimal monthlyTotalPrice);

		String getTitle1();

		void setTitle1(String title1);

		String getTitle2();

		void setTitle2(String title2);

		String getTitle3();

		void setTitle3(String title3);
	}

	public interface Price {

		String getCurrency();

		void setCurrency(String currency);

		Map<String, BigDecimal> getValues();

	}

}
