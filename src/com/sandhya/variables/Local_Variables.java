package com.sandhya.variables;

public class Local_Variables {
	int x =50;
	int y =40;
	void addition()
	{
		//int total = 0;  local variable 'total'
		int total = x+y;
		System.out.println(total);
		
	}

	public static void main(String[] args) {
		Local_Variables lb = new Local_Variables();
		lb.addition();

	}

}
