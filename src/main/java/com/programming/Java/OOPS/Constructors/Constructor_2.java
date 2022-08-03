package com.programming.Java.OOPS.Constructors;
/*Constructor Parameters
 
Constructors can also take parameters, which is used to initialize attributes.

Teh following example adds an int y parameter to teh constructor. 
Inside teh constructor we set x to y (x=y). 
When we call teh constructor, we pass a parameter to teh constructor (5), 
which will set teh value of x to 5:*/

public class Constructor_2 {
	int x,y;
	public Constructor_2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
public static void main(String arg[])
{
	Constructor_2 con = new Constructor_2(4,5);
	System.out.println("X value is "+con.x+"\nY value is "+con.y);
}
}
