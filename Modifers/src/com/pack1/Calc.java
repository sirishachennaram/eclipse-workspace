package com.pack1;
public class Calc {
	//Default scope
	int x=10;
	//private scope=only within the class
	private int y=20;
	int z=30;
	//
	void findsquare(int num) {
		System.out.println(num*num);
	}
	private void findCube(int num) {
		System.out.println(num*num);
	
	}
	public void sumofthevalues(int num) {
		System.out.println(num+num);
	}
	public void productofthevalues(int num) {
		System.out.println(num*num);
	
	}

}
