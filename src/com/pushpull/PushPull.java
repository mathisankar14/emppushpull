package com.pushpull;

public class PushPull {
	private void empName() {
		System.out.println("EmpName: Mathi");
	}

	private void empID() {
		System.out.println("EmpID: 123");
	}

	private void empMail() {
		System.out.println("EmpMail: mathis@gmail.com");
	}

	private void empAddress() {
		System.out.println("EmpAddress: chennai");
	}

	public static void main(String[] args) {
		PushPull pp = new PushPull();
		pp.empName();
		pp.empID();
		pp.empMail();
		pp.empAddress();

	}

}
