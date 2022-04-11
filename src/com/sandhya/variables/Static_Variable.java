package com.sandhya.variables;

public class Static_Variable {
	int x = 10;
	static int y = 20;// static variables need to preceded by static keyword
	
public static void main (String []args	)
	{
	Static_Variable sv = new Static_Variable();
	  System.out.println(sv.x);
	  System.out.println(sv.y);//static v accessed by using reference variable
	  System.out.println(Static_Variable.y);//SV can be accessed by using class name
	  //Static_Variable.y=40;
		
	}

}
