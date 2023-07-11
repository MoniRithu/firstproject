package org.cons1;

public class MyConstructor 
{
	MyConstructor()
	{
		this(23);
		System.out.println("I am a default construct");
	}
	
	public MyConstructor(int a)
	{
		this("monica");
		
		System.out.println("The integer value is:" + a);
	}
	
	public MyConstructor(String a)
	{
		
		System.out.println("I am a String construct" + a);
		
	}
	
	public static void main(String[] args) {
		MyConstructor my=new MyConstructor();
		
	}

}
