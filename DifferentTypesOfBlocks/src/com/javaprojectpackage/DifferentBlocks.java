package com.javaprojectpackage;

public class DifferentBlocks
{
	//static block
	static
	{
		System.out.println("static executes before main");
	}
	//normal block
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor");
	}
	//default block
	DifferentBlocks(){
		System.out.println("Constructor block");
	}
    //main block
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MainBlock");
		DifferentBlocks ob=new DifferentBlocks();

	}

}
