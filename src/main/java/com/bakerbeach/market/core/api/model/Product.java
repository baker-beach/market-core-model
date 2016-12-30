package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface Product extends Map<String, Object> {
	String getGtin();

	void setGtin(String gtin);

	Status getStatus();

	void setStatus(Status status);

	String getBrand();

	void setBrand(String brand);

	String getName();

	void setName(String name);

	String getDescription1();

	void setDescription1(String description1);

	String getDescription2();

	void setDescription2(String description2);

	String getDescription3();

	void setDescription3(String description3);

	String getDescription4();

	void setDescription4(String description4);

	String getDescription5();

	void setDescription5(String description5);

	String getPrimaryGroup();

	String getSecondaryGroup();

	String getMainCategory();

	void setMainCategory(String mainCategory);

	List<String> getCategories();

	void setCategories(List<String> categories);

	Boolean getVisible();

	Boolean isVisible();

	void setVisible(Boolean visible);

	TaxCode getTaxCode();

	void setTaxCode(TaxCode taxCode);

	BigDecimal getStdPrice();

	void setStdPrice(BigDecimal stdPrice);

	BigDecimal getPrice();

	void setPrice(BigDecimal price);

	BigDecimal getMonthlyPrice();

	void setMonthlyPrice(BigDecimal monthlyPrice);

	BigDecimal getDiscountOnStandardPrice();

	BigDecimal getBasePrice1();

	BigDecimal getBasePrice1Divisor();

	String getBasePrice1Unit();

	BigDecimal getBasePrice2();

	BigDecimal getBasePrice2Divisor();

	String getBasePrice2Unit();

	String getMaterialText();

	void setMaterialText(String materialText);

	List<String> getMaterialCodes();

	void setMaterialCodes(List<String> materialCodes);

	String getTechnologyText();

	void setTechnologyText(String technologyText);

	List<String> getTechnologyCodes();

	void setTechnologyCodes(List<String> technologyCodes);

	String getCareText();

	void setCareText(String careText);

	List<String> getCareCodes();

	void setCareCodes(List<String> careCodes);

	String getSize();

	void setSize(String size);

	String getColor();

	void setColor(String color);

	BigDecimal getNetWeight();

	void setNetWeight(BigDecimal netWeight);

	BigDecimal getGrossWeight();

	void setGrossWeight(BigDecimal grossWeight);

	Map<String, List<String>> getLogos();

	void setLogos(Map<String, List<String>> logos);

	Map<String, List<String>> getTags();

	void setTags(Map<String, List<String>> tags);

	Assets getAssets();

	void setAssets(Assets assets);

	Asset getAsset(String string, int i, String string2);

	String getAdditionalText1();

	void setAdditionalText1(String additionalText1);

	String getAdditionalText2();

	void setAdditionalText2(String additionalText2);

	String getAdditionalText3();

	void setAdditionalText3(String additionalText3);

	String getAdditionalText4();

	void setAdditionalText4(String additionalText4);

	String getAdditionalText5();

	void setAdditionalText5(String additionalText5);

	Boolean getAvailable();

	Boolean isAvailable();

	void setAvailable(Boolean available);

	Integer getOutOfStockLimit();

	void setOutOfStockLimit(Integer outOfStockLimit);

	Integer getMoq();

	void setMoq(Integer moq);

	String getVariant1();

	String getVariant2();

	String getVariant1Sort();

	String getVariant2Sort();

	Map<String, BigDecimal> getPrices();

}
