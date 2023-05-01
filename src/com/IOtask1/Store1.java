package com.IOtask1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class Store1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		PrimeNo p=new PrimeNo();
		//	p.task1();
		// Above Object details Write/Store into File DB .
		
		FileOutputStream fo=new FileOutputStream("PrimeNo1.ser");
		
		
		ObjectOutputStream O=new ObjectOutputStream(fo);
		O.writeObject(p);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
		
}
