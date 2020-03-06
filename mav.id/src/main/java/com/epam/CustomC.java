package com.epam;

public class CustomC  {
	public static void main(String args[])
	{
		Custmeth<String> c=new Custmeth<String>(3);
		c.add("apple");
		c.add("orange");
		c.add("grapes");
		c.add("peaches");
		c.add("guava");
		c.add("lychee");
		c.add("banana");
		c.add("pineapple");
		c.add("strawberry");
		c.add("blueberry");
		System.out.println(c.get(5));
		String a=c.remove(4);
		System.out.println("Removed element from list is: "+a);
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
		
	}

}
