package com.my.project.spring.intro.pojos;

import java.util.Set;

public class POJOWithSet {
	
	private Set<String> names;

	/**
	 * @return the names
	 */
	public Set<String> getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(Set<String> names) {
		this.names = names;
	}

	
	public String toString(){
		return "POJOWithSet [ names="+names+"]";
	}
}
