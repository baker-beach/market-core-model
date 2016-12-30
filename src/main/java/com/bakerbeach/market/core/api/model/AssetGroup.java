package com.bakerbeach.market.core.api.model;

import java.util.Map;

public interface AssetGroup extends Map<String, Asset> {
	public static String SIZE_SMALL = "s";
	public static String SIZE_MEDIUM = "m";
	public static String SIZE_LARGE = "l";
	public static String SIZE_XLARGE = "xl";
}