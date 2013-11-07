package com.my.project.spring.intro;

/**
 * Generates sequence number on the basis of initial value, prefix and suffix
 * @author ivy4293
 *
 */

public class SequenceGenerator {

	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	
	public SequenceGenerator(){
	}
	
	public SequenceGenerator(String prefix, String suffix, int initial, int counter){
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
		this.counter = counter;
	}
	
	public SequenceGenerator(String prefix, String suffix,int initial){
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
	}
	
}
