package com.bakerbeach.market.core.api.model;

import java.util.List;


/**
 * @author: patrick.walser@gmail.com
 * Date: 10.04.12
 */

public interface Category {
	
	String getId();
	
    List<String> getAncestorKeys();

    void setAncestorKeys(List<String> ancestors);

    String getName();

    void setName(String name);

    String getSort();

    void setSort(String sort);

    void addAncestorKey(String ancestorId);

    String getShop();

    void setShop(String shop);

    String getParentKey();

    void setParentKey(String parentKey);

    String getKey();

    void setKey(String key);
}
