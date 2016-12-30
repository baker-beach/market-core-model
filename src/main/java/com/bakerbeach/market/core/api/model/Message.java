package com.bakerbeach.market.core.api.model;

import java.util.List;

public interface Message {
	
	public final static String TYPE_INFO = "info";
	public final static String TYPE_ERROR = "error";
	public final static String TYPE_COMMAND = "command";

	String getType();

	void setType(String type);

	String getCode();

	void setCode(String code);

	Object[] getArgs();

	void setArgs(List<Object> args);

	void setArgs(Object... args);

	String toString();

}