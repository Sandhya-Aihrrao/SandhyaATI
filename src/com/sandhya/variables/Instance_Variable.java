package com.sandhya.variables;

//how to declare instance variable
public class Instance_Variable {
	int a=2;// int a;
	float b= (float) 2.4;//float b;
	double c= 25;//double c;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+c);
	}

	public static void main(String[] args) {
		Instance_Variable iv = new Instance_Variable();
		iv.display();
		
		
	}

}
