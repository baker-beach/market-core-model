package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Map;

public interface CartItem {

	Map<String, Object> getAttributes();

	String getId();
	
	void setId(String id);

	String getCode();

	void setCode(String code);

	String getGtin();

	String getName();

	void setName(String name);

	String getBrand();

	void setBrand(String brand);

	String getSupplier();

	void setSupplier(String supplier);

	BigDecimal getQuantity();

	void setQuantity(BigDecimal quantity);

	void addQuantity(BigDecimal quantity);

	BigDecimal getDiscount();

	void setDiscount(BigDecimal zero);

	Boolean isVolatile();

	void setIsVolatile(Boolean isVolatile);

	Boolean isVisible();

	void setIsVisible(Boolean isVisible);

	Boolean isImmutable();

	void setIsImmutable(Boolean isImmutable);

	@Deprecated
	void setUnitPrice(BigDecimal unitPrice);

	@Deprecated
	BigDecimal getMonthlyUnitPrice();

	@Deprecated
	void setMonthlyUnitPrice(BigDecimal monthlyPrice);

	@Deprecated
	void setUnitPrices(Map<String, BigDecimal> unitPrices);

	@Deprecated
	void setTotalPrice(BigDecimal totalPrice);

	@Deprecated
	BigDecimal getMonthlyTotalPrice();

	@Deprecated
	void setMonthlyTotalPrice(BigDecimal monthlyTotalPrice);

	TaxCode getTaxCode();

	void setTaxCode(TaxCode taxCode);

	BigDecimal getTaxPercent();

	void setTaxPercent(BigDecimal taxPercent);

	String getQualifier();

	void setQualifier(String qualifier);

	Map<String, String> getTitle();

	String getTitle(String key);

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

	@Deprecated
	String getImageUrl1();

	@Deprecated
	void setImageUrl1(String imageUrl1);

	@Deprecated
	String getImageUrl2();

	@Deprecated
	void setImageUrl2(String imageUrl2);

	Map<String, String> getImages();

	String getImage(String key);

	String getSize();

	void setSize(String message);

	String getColor();

	void setColor(String color);

	Map<String, Option> getOptions();

	Option newOption(String code, String parentCode);

	Map<String, BigDecimal> getUnitPrices();

	@Deprecated
	BigDecimal getUnitPrice();

	BigDecimal getUnitPrice(String key);

	void setUnitPrice(String string, BigDecimal value);

	void addUnitPrices(Map<String, BigDecimal> unitPrices);

	void multiplyUnitPrices(BigDecimal multiplicand);

	Map<String, BigDecimal> getTotalPrices();

	@Deprecated
	BigDecimal getTotalPrice();

	BigDecimal getTotalPrice(String key);

	public interface Option {

		String getCode();

		BigDecimal getQuantity();

		void setQuantity(BigDecimal quantity);

		String getTag();

		void setTag(String tag);

		String getGtin();

		void setGtin(String gtin);

		Map<String, BigDecimal> getUnitPrices();

		BigDecimal getUnitPrice(String key);

		void setUnitPrice(String key, BigDecimal value);

		void addUnitPrices(Map<String, BigDecimal> unitPrices);

		void multiplyUnitPrices(BigDecimal multiplicand);

		Map<String, String> getTitle();

		String getTitle(String key);

	}

	@Deprecated
	Map<String, CartItemComponent> getComponents();

	@Deprecated
	public static interface CartItemComponent {

		String getName();

		Map<String, CartItemOption> getOptions();

	}

	@Deprecated
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
		
		Map<String, Object> getAttributes();
	}



}
