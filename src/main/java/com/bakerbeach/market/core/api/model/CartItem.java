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

	TaxCode getTaxCode();

	void setTaxCode(TaxCode taxCode);

	BigDecimal getTaxPercent();

	void setTaxPercent(BigDecimal taxPercent);

	String getQualifier();

	String getTitle1();

	void setTitle1(String title1);

	String getTitle2();

	void setTitle2(String title2);

	String getTitle3();

	void setTitle3(String title3);

	String getImageUrl1();

	void setImageUrl1(String imageUrl1);

	String getImageUrl2();

	void setImageUrl2(String imageUrl2);

	String getSize();

	void setSize(String message);

	String getColor();

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

}
