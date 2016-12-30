package com.bakerbeach.market.core.api.model;

import java.util.Locale;
import java.util.Map;

public interface Asset {
	static String TYPE_IMAGE = "image";
	static String TYPE_VIDEO = "video";
	static String TYPE_YOUTUBE = "youtube";
	static String TYPE_PDF = "pdf";

	String getType();

	void setType(String type);

	String getPath();

	void setPath(String path);

	Map<Locale, String> getAlt();

	String getAlt(Locale locale);

	void setAlt(Map<Locale, String> alt);

}