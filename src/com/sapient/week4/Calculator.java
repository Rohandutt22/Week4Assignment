package com.sapient.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	System.out.println(" Enter the numbers:");
    	int p=sc.nextInt();
    	int q=sc.nextInt();
    	System.out.println(" Enter 1 for Add, 2 for Subtract,3 for Multiply,4 for Divide");

    	int r=sc.nextInt();
    	Map<Integer,Num_Process> m=new HashMap<Integer,Num_Process>();
    	m.put(1,  new Addition());
    	m.put(2,   new Substract());
    	m.put(3, new Multiplication());
    	m.put(4,  new Division());
    	System.out.println("Output of your calculation is:");
    	 System.out.println(m.get(r).cal(p, q));
    	 sc.close();
	}

}
