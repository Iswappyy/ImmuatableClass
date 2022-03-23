package com.mutablefields;

public class TestMutable {
	public static void main(String[] args) {
		Address add = new Address("Pune","India",1234);
		Employee emp = new Employee(453,"Swapnil",add);
		
		System.out.println("Employee details before change: "+emp);
		
		add.setCity("Mumbai");
		
		
		System.out.println("Employee details After change: "+emp);
		
		
	}

}
