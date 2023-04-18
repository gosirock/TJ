package com.javalec.function;

public class Add {
	int startNum;
	int endNum;
	int sum;
	
	
	public Add() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Add(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	
	
	
	public int Add() {
		// TODO Auto-generated method stub
		sum = startNum+endNum;
		return sum;
	}
	public int Sub() {
		// TODO Auto-generated method stub
		sum = startNum-endNum;
		return sum;
	}
	
	
}
