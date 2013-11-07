package com.my.project.spring.intro;

import java.util.Properties;

public class POJOWithProperty {
	
	private Properties properties;

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "POJOWithProperty [properties=" + properties + "]";
	}
	
}
