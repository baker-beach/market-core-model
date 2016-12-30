package com.bakerbeach.market.core.api.model;

import java.util.List;
import java.util.Map;

public interface Assets extends Map<String, List<AssetGroup>> {

	List<Asset> get(String tag, String size);

	void add(String tag, AssetGroup assetGroup);

}