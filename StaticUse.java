package com.brainmentors.java.oops;

class Enemy
{
	private String name;
	private boolean weapon;
	private int attack;
	static int counter; // static variable
	
	Enemy(String name, boolean weapon, int attack)
	{
		this.name = name;
		this.weapon = weapon;
		this.attack = attack;
		counter++;
		System.out.println("Enemy Created "+counter+" "+name+" "+weapon+" "+attack);
		//System.out.println("Enemy Created "+counter);
	}
}

public class StaticUse {

	static void print()
	{
		main(null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StackOverflow
		//main(null);
		
		print(); // function calling
		
		for(int i = 1; i <= 10; i++)
		{
			Enemy obj = new Enemy("L"+i, true, i);
		}
	}
}
