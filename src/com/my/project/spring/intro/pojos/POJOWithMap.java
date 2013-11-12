package com.my.project.spring.intro.pojos;

import java.util.Map;

public class POJOWithMap {

	private Map<String, String> names;

	/**
	 * @return the names
	 */
	public Map<String, String> getNames() {
		return names;
	}

	@Override
	public String toString() {
		return "POJOWithMap [names=" + names + "]";
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(Map<String, String> names) {
		this.names = names;
	}
	
	
}
