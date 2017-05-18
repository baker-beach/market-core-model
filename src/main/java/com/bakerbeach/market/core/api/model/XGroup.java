package com.bakerbeach.market.core.api.model;

import java.util.Currency;
import java.util.Date;
import java.util.List;

public interface XGroup {
	String getCode();

	void setCode(String code);

	String getShopCode();

	void setShopCode(String shopCode);

	Status getStatus();

	void setStatus(Status status);

	String getDim1();

	void setDim1(String dim1);

	String getDim2();

	void setDim2(String dim2);

	String getTemplate();

	void setTemplate(String template);

	Price getMinPrice(Currency currency, String priceGroup, Date date);

	List<Product> getMembers();

	void setMembers(List<Product> members);
}
