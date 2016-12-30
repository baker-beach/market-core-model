package com.bakerbeach.market.core.api.model;

import java.util.List;

public interface Filter {

	String getId();

	String getIndexFieldName();

	String getLabel();

	void setLabel(String label);

	Boolean isActive();

	void setActive(Boolean active);

	List<Option> getOptions();

	void addOption(Option option);

	List<Option> getSelectedOptions();

	Boolean hasOptions();

	Option getOption(String translationKey);

	Boolean isMultiSelect();

	void setMultiSelect(Boolean multiSelect);

	Boolean isUrlRelevant();

	void setUrlRelevant(Boolean urlRelevant);

	String toUrl(Option currentOption);
//	String toUrl(Option currentOption, Locale locale,
//			MessageSource messageSource);

	Object toGetParameter(Option currentOption);
//	String toGetParameter(Option currentOption, Locale locale,
//			MessageSource messageSource);

	Boolean getMultiValue();

	void setMultiValue(Boolean multiValue);


}
