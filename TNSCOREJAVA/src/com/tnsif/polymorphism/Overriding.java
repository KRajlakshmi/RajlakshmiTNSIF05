package com.tnsif.polymorphism;
//demo for method overriding
//same method name/signature but diff implementation
public class Overriding {
  public static void main(String args[]) {
	  RBI ob = new RBI();
	  ob.rateOfInterest();
	 HDFC ob1 = new HDFC();
	  ob1.rateOfInterest();
//	  Axis ob2 =  new Axis();
//	  ob2.rateOfInterest();
  }
}
