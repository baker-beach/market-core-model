package com.bakerbeach.market.core.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public interface Address extends Serializable {

	String getId();
	
	void setId(String id);
	
	String getPrefix();

	void setPrefix(String prefix);

	String getFirstName();

	void setFirstName(String firstName);

	String getLastName();

	void setLastName(String lastName);

	String getMiddleName();

	void setMiddleName(String middleName);

	String getStreet1();

	void setStreet1(String street1);

	String getStreet2();

	void setStreet2(String street2);

	String getPostcode();

	void setPostcode(String postcode);

	String getCity();

	void setCity(String city);

	String getRegion();

	void setRegion(String region);

	String getCountryCode();

	void setCountryCode(String countryCode);

	String getEmail();

	void setEmail(String email);

	String getTelephone();

	void setTelephone(String telephone);

	Date getCreatedAt();

	void setCreatedAt(Date createdAt);

	Date getUpdatedAt();

	void setUpdatedAt(Date updatedAt);

	String getSuffix();

	void setSuffix(String suffix);

	String getCompany();

	void setCompany(String company);

	void setFax(String fax);

	String getFax();

	Set<String> getTags();

	void setTags(Set<String> tags);
	
}
