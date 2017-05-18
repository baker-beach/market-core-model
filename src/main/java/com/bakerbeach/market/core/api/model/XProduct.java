package com.bakerbeach.market.core.api.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface XProduct extends com.bakerbeach.market.core.api.model.PriceAware {
	enum Type {
		PRODUCT, VPRODUCT, PROPERTY, CHOICE
	}

	enum Status {
		UNDEFINED, WORK, PUBLISHED, ARCHIVED
	}

	String getCode();

	String getName();

	void setName(String name);

	String getGtin();

	List<String> getShopCode();

	void addShopCode(String shopCode);

	Status getStatus();

	void setStatus(Status status);

	String getParentCode();

	Type getType();

	void setType(Type type);

	String getBrand();

	String getPrimaryGroup();

	String getSecondaryGroup();

	Map<String, Component> getComponents();

	Map<String, Option> getOptions();

	Boolean isRequired();

	Boolean isAvailable();

	List<Asset> getAssets(String tag, String size);

	BigDecimal getBasePrice1Divisor();

	String getBasePrice1Unit();

	BigDecimal getBasePrice2Divisor();

	String getBasePrice2Unit();

	String getSizeCode();

	String getColorCode();

	String getDietCode();

	List<String> getMaterialCodes();

	List<String> getTechnologyCodes();

	BigDecimal getNetWeight();

	BigDecimal getGrossWeight();

	Map<String, List<String>> getLogos();

	Map<String, List<String>> getTags();

	TaxCode getTaxCode();

	Option getOption(String code);

	Component getComponent(String code);

	List<String> getCategories();

	public interface Component {

		String getCode();

		void setCode(String code);

		String getParentCode();

		void setParentCode(String parentCode);

		BigDecimal getMinQty();

		void setMinQty(BigDecimal minQty);

		BigDecimal getMaxQty();

		void setMaxQty(BigDecimal maxQty);

		Boolean isMultiselect();

		void setIsMultiselect(Boolean isMultiselect);

		Boolean isRequired();

	}

	public interface Option extends PriceAware {

		String getCode();

		void setCode(String code);

		String getComponentCode();

		void setComponentCode(String componentCode);

		String getTag();

		void setTag(String tag);

		BigDecimal getMinQty();

		void setMinQty(BigDecimal minQty);

		BigDecimal getMaxQty();

		void setMaxQty(BigDecimal maxQty);

		Boolean getIsMultiselect();

		void setIsMultiselect(Boolean isMultiselect);

		boolean isRequired();

		Boolean isDefault();

		void setIsDefault(Boolean isDefault);

		BigDecimal getDefaultQty();

		void setDefaultQty(BigDecimal defaultQty);

		String getGtin();

		void setGtin(String gtin);

	}

}
