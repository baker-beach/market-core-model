package com.bakerbeach.market.core.api.model;

import java.io.Serializable;

public class Currency implements Serializable{
	
	private String isoCode;
	private String symbol;
	private Boolean currencySymbolAtFront;
	
	
	/**
	 * @return the currencySymbolAtFront
	 */
	public Boolean isCurrencySymbolAtFront() {
		return currencySymbolAtFront;
	}
	/**
	 * @param currencySymbolAtFront the currencySymbolAtFront to set
	 */
	public void setCurrencySymbolAtFront(Boolean currencySymbolAtFront) {
		this.currencySymbolAtFront = currencySymbolAtFront;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the isoCode
	 */
	public String getIsoCode() {
		return isoCode;
	}
	/**
	 * @param isoCode the isoCode to set
	 */
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

}
