package com.bakerbeach.market.core.api.model;


public class Text {
	
	private String type = "text";
	private String key;
	private Object[] parameter;
	
	public Text(String key){
		this.key = key;
	}
	
	public Text(String key, Object... args){
		this.key = key;
		parameter = args;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public Object[] getArguments(){
		return parameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
