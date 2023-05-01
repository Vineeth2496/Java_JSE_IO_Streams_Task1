package com.IOtask1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PrimeIOop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream fi=new FileInputStream("PrimeNo1.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		PrimeNo p=(PrimeNo) oi.readObject();
		p.task1();
		//System.out.println(p.toString());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}

}
