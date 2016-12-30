package com.bakerbeach.market.core.api.model;

import java.util.Collection;
import java.util.List;

public interface FilterList {

	Collection<Filter> getAvailable();

	Collection<Filter> getActive();

	Collection<Filter> getActive(Boolean url);

	Collection<Filter> getUrlRelevant();

	Collection<Filter> getUrlRelevantExcluding(Filter _filter);

	Collection<Filter> getActiveFiltersWithGetParamtersIncluding(Filter _filter);

	Collection<Filter> getActiveFiltersWithGetParamtersExcluding(Filter _filter);

	Collection<Filter> getInactive();

	boolean containsId(String id);

	Filter get(String id);

	void add(Filter filter);

	void remove(String filterId);

	Collection<Filter> getUrlRelevantIncluding(Filter _filter);

	List<String> getHeadlineKeywords();

}