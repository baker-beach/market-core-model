package com.bakerbeach.market.core.api.model;

import java.util.List;

public interface BundleComponent {

	String getName();
	
	void setName(String name);

	String getParent();

	void setParent(String parent);

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

	Boolean isRequired();

	Integer getMinQty();

	void setMinQty(Integer minQty);

	Integer getMaxQty();

	void setMaxQty(Integer maxQty);

	List<BundleOption> getOptions();

	BundleOption getOption(String gtin);

	Boolean isMultiselect();

	void setIsMultiselect(Boolean isMultiselect);

}
