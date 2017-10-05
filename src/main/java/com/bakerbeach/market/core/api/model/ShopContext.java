package com.bakerbeach.market.core.api.model;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ShopContext {

	static final String FLASH_TYPE = "FLASH";
	static final String REGULAR_TYPE = "REGULAR";

	String getShopType();

	void setShopType(String type);

	ShopContext refine(Customer customer);

	String getShopCode();

	void setShopCode(String shopCode);

	List<String> getGroupCodes();

	void setGroupCodes(List<String> groupCodes);

	void setGroupCodesString(String groupCodesString);

	void setOrderSequenceRandomOffset(Long orderSequenceRandomOffset);

	Long getOrderSequenceRandomOffset();

	void setOrderSequenceCode(String orderSequenceCode);

	String getOrderSequenceCode();

	String getHost();

	void setHost(String host);

	Integer getPort();

	void setPort(Integer port);

	Integer getSecurePort();

	void setSecurePort(Integer securePort);

	String getPath();

	void setPath(String path);

	String getProtocol();

	void setProtocol(String protocol);

	String getPageId();

	void setPageId(String pageId);

	FilterList getFilterList();

	void setFilterList(FilterList filterList);

	Map<String, Object> getRequestData();

	Map<String, Currency> getCurrencies();

	String getDefaultCurrency();

	String getCartCode();

	void setCartCode(String cartCode);

	Currency getCurrentCurrency();

	List<Locale> getLocales();

	void setLocales(List<Locale> locales);

	Locale getDefaultLocale();

	void setDefaultLocale(Locale defaultLocale);

	Locale getCurrentLocale();

	void setCurrentLocale(Locale currentLocale);

	List<String> getPriceGroups();

	void setPriceGroups(List<String> priceGroups);

	String getDefaultPriceGroup();

	void setDefaultPriceGroup(String defaultPriceGroup);

	String getCurrentPriceGroup();

	void setCurrentPriceGroup(String currentPriceGroup);

	List<String> getValidCountries();

	void setValidCountries(List<String> validCountries);

	boolean isCountryValid(String countryCode);

	String getCountryOfDelivery();

	String getDefaultCountryOfDelivery();

	void setDefaultCountryOfDelivery(String defaultCountryOfDelivery);

	String getDeviceClass();

	void setDeviceClass(String deviceClass);

	Address getBillingAddress();

	void setBillingAddress(Address billingAddress);

	Address getShippingAddress();

	void setShippingAddress(Address shippingAddress);

	String getOrderStatus();

	void setOrderStatus(String orderStatus);

	String getOrderId();

	void setOrderId(String orderId);

	Set<Integer> getValidSteps();

	void setValidSteps(Set<Integer> validSteps);

	String getRemoteIp();

	void setRemoteIp(String remoteIp);

	void setSolrUrl(String solrUrl);

	String getSolrUrl();

	String getAssortmentCode();

	void setAssortmentCode(String assortmentCode);

	String getDevice();

	void setDevice(String device);

	List<String> getNewsletterIds();

	void setGtmId(String gtmId);

	String getGtmId();

	String getRightCurrencySymbol();

	String getLeftCurrencySymbol();

	void setCurrency(String currency);
	
	HttpServletRequest getHttpServletRequest();
	
	HttpServletResponse getHttpServletResponse();
	
	String getApplicationPath();

}
