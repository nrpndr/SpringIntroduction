package com.my.project.spring.intro;

import java.util.List;

public class POJOWithList {
	
	private List<String> names;

	/**
	 * @return the names
	 */
	public List<String> getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "POJOWithList [names=" + names + "]";
	}
	
}
