package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public interface OrderItem {
	
	String getQualifier();

	String getGtin();
	
	String getBrand();

	String getTitle1();

	String getTitle2();

	String getTitle3();

	String getSize();

	String getColor();
	
	String getImageUrl1();
	
	String getImageUrl2();
	
	BigDecimal getUnitPrice();
	
	BigDecimal getQuantity();
	
	BigDecimal getDiscount();

	BigDecimal getTotalPrice();
	
	String getSupplier();
	
	TaxCode getTaxCode();
	
	BigDecimal getTaxPercent();

	boolean isVisible();
	
	boolean isVolatile();
	
	boolean isImmutable();
	
	Map<String, OrderItemComponent> getComponents();

	public static interface OrderItemComponent {

		String getName();

		Map<String, OrderItemOption> getOptions();

	}

	public static interface OrderItemOption {

		String getGtin();

		Integer getQuantity();

		void setQuantity(Integer quantity);

		BigDecimal getUnitPrice();

		void setUnitPrice(BigDecimal unitPrice);

		BigDecimal getTotalPrice();

		void setTotalPrice(BigDecimal totalPrice);

		String getTitle1();

		void setTitle1(String title1);

		String getTitle2();

		void setTitle2(String title2);

		String getTitle3();

		void setTitle3(String title3);
	}

	HashMap<String, Object> getAttributes();
	
}
