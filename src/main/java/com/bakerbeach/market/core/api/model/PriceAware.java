package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.List;

public interface PriceAware {

	List<Price> getPrices();

	void addPrice(Price price);

	Price getPrice(Currency currency, String priceGroup, Date date);

}
