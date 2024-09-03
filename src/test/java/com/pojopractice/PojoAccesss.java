package com.pojopractice;

public class PojoAccesss {
	
	public static void main(String[] args) {
		
		PojoPractice pp = new PojoPractice();
		
		System.out.println(pp.getName());

		System.out.println(pp.getPlace());
		
		pp.setName("James");
		
		pp.setPlace("Chennai");
		
		System.out.println(pp.getName());

		System.out.println(pp.getPlace());
		
	}

}
