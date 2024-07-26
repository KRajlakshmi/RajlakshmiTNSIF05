package com.tnsif.polymorphism;
//Same method name but different parameters
public class MethodOverloading {
	
	public void add(int x, int y) {
		System.out.println("The addition of two numbers: "+(x+y));
	}
	public void add(int x, int y, int z) {
		System.out.println("The addition of two numbers: "+(x+y+z));
	}
	public void add(float x, float y) {
		System.out.println("The addition of two numbers: "+(x+y));
	}
	
}
