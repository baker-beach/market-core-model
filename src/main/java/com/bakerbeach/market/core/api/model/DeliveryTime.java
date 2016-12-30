package com.bakerbeach.market.core.api.model;

import java.util.Date;

public interface DeliveryTime {
	
	Text getDeliveryTimeText();
	
	Date getDeliveryDate();
	
	Boolean isBackorderTime();
	
	Boolean isContinuesTime();

}
