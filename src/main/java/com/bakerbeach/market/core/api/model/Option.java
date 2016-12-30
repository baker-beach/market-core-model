package com.bakerbeach.market.core.api.model;

public interface Option {

	Filter getFilter();

	void setFilter(Filter filter);

	String getCode();

	String getValue();

	void setValue(String value);

	Long getCount();

	void setCount(Long count);

	String getSort();

	void setSort(String sort);

	Boolean isSelected();

	void setSelected(Boolean selected);

	Boolean isTranslated();

}