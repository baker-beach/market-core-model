package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface Cart {

	boolean add(CartItem cartItem);

	boolean addAll(Collection<CartItem> cartItems);

	void set(CartItem item);

	@Deprecated
	List<CartItem> getCartItems();

	Map<String, CartItem> getItems();

	boolean remove(CartItem item);

	boolean remove(String id);

	void clear();

	boolean isEmpty();

	CartItem findItemById(String id);

	List<CartItem> findItemsByQualifier(String... qualifiers);

	List<CartItem> findItemsByQualifier(List<String> qualifiers);

	List<Coupon> getCoupons();

	BigDecimal getValueOfGoods();

	void setValueOfGoods(BigDecimal valueOfGoods);

	BigDecimal getValueOfShippingGoods();

	void setValueOfShippingGoods(BigDecimal gross);

	BigDecimal getShipping();

	void setShipping(BigDecimal totalPrice);

	Total getTotal();

	void setTotal(Total total);

	BigDecimal getGrandTotal();

	BigDecimal getPayment();

	void setPayment(BigDecimal payment);

	Total getDiscount();

	void setDiscount(Total discount);

	String getStatus();

	void setStatus(String status);

	Date getCreatedAt();

	void setCreatedAt(Date createdAt);

	String getCreatedBy();

	void setCreatedBy(String createdBy);

	Date getUpdatedAt();

	void setUpdatedAt(Date updatedAt);

	String getUpdatedBy();

	void setUpdatedBy(String updatedBy);

	String getId();

	void setId(String id);

	String getCustomerId();

	void setCustomerId(String customerId);

	String getClientId();

	void setClientId(String clientId);

	String getName();

	void setName(String name);

	String getWorkflow();

	void setWorkflow(String workflow);

	Map<String, Object> getAttributes();

	String getShopCode();

	void setShopCode(String shopCode);

}
