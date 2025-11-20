package com.practiceJDBC;

public class practiceTwo {
	public static void main(String args[] ) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//		pqr obj=new pqr();
		Class.forName("com.practiceJDBC.pqr").newInstance();
	}

}
class pqr{
	static {
		System.out.println("In static");
	}
	//Instance Block
	{
		System.out.println("In Instance");
	}
}
