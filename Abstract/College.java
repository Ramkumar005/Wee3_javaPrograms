package com.Abstract;

public class College extends University{
	
	public void ug() {
		System.out.println("Completed B.Tech");
	}

	public static void main(String[] args) {
		
		College clg = new College();
		clg.ug();
		clg.pg();
		
	}
	
}
