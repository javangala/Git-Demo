package com.sample3;

public class Child extends Parent{
	
	String s="manbao";
	int i=23;
	public static void main(String[] args) {
		
		
		System.out.println(Parent.wheel);
		//Parent p=new Parent();
		method1();
		method2();
	}
	
	public static void method2() {
		Child c=new Child();
		Parent c2=new Child();
		System.out.println(c.s);
		System.out.println(c.i);
		System.out.println(c2.wheel);
	}

}
