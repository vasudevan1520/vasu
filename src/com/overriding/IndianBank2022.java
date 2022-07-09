package com.overriding;

public class IndianBank2022 extends IndianBank2021 {

	@Override
	public void interset() {

		super.interset();
		System.out.println("interset 45");
		this.deposite();
	}

	public void deposite() {
		System.out.println("deposite 50000");

	}

	public static void main(String[] args) {
		IndianBank2022 ind = new IndianBank2022();
		ind.interset();
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("vasu");
		System.out.println("deva");
	}

}
