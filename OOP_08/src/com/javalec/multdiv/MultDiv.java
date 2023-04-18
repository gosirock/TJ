package com.javalec.multdiv;

public class MultDiv {
	
	public int first = 0;
	public int second = 0;
	public int calc = 0;
	
	
	public MultDiv(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	
	
	public int mult() {
		calc = first * second;
		return calc;
	}
	public int div() {
		calc = first / second;
		return calc;
	}
	

}
