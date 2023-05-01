package com.IOtask1;

import java.io.Serializable;

public class PrimeNo implements Serializable 
{
	private Integer temp=0;

	public void task1()
	{
		System.out.println("Prime Numbers in between from 1 to 100 ");
	for(int no=1; no<=100; no++)
	{
		for(Integer i=2; i<=no-1; i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}			
		}
		if(temp==0)
		{
			System.out.print(no+ ", ");
		}
		else
		{
			temp=0;
		}
	}
	}
}
