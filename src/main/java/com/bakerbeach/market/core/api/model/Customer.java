package com.bakerbeach.market.core.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Customer extends Serializable {

	String getId();

	String getPassword();
	
	String getEmail();
	
	void setDateOfBirth(Date dateOfBirth);
	
	Date getDateOfBirth();

	void setSuffix(String suffix);

	String getSuffix();

	void setLastName(String lastName);

	String getLastName();

	void setMiddleName(String middleName);

	String getMiddleName();

	void setFirstName(String firstName);

	String getFirstName();

	void setPrefix(String prefix);

	String getPrefix();

	Date getCreatedAt();

	void setCreatedAt(Date createdAt);

	Date getUpdatedAt();

	void setUpdatedAt(Date updatedAt);

	void setPriceGroup(String priceGroup);

	String getPriceGroup();

	void setTaxCode(TaxCode taxCode);

	TaxCode getTaxCode();
	
	Map<String,Object> getAttributes();
	
	Object getAttribute(String key);

	void setAttribute(String key, Object value);
	
	Set<String> getValidShopCodes();

	void setPassword(String string);
	
	Boolean isAnonymousCustomer();
	
}
