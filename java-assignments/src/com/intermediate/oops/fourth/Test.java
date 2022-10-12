package com.intermediate.oops.fourth;

public   class Test extends MyAbstract {

	public static void main(String[] args) {

		Test t=new Test();
		System.out.print(t.display());
		
	}

	@Override
	public  String display() {
		
		return "I am Abstract method!!!";
	}

}
