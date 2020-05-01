package com.sapient.week4;


import java.util.Scanner;

public class Int_Arr_Process {
    int[] int_arr;
    int size;
    Int_Arr_Process()
    {
    	size=10;
    	int_arr=new int[10];
    }
    Int_Arr_Process(int size)
    {
    	this.size=size;
    	int_arr=new int[size];
    }
    Int_Arr_Process(int[] a)
    {
    	this.size=a.length;
    	int_arr=a;
    }
    Int_Arr_Process(Int_Arr_Process a)
    {
    	size=a.int_arr.length;
    	int_arr=new int[size];
    	for(int i=0;i<a.int_arr.length;i++)
    	{
    		int_arr[i]=a.int_arr[i];
    	}
    }
    public void sort_array()
    {
    	for(int i=0;i<size-1;i++)
    	{
    		for(int j=i+1;j<size;j++)
    		{
    			if(int_arr[i]>int_arr[j])
    			{
    				int temp=int_arr[i];
    				int_arr[i]=int_arr[j];
    				int_arr[j]=temp;
    			}
    		}
    	}
    }
    public int getSum()
    {
    	int sum=0;
    	for(int i=0;i<size;i++)
    		sum+=int_arr[i];
    	return sum;
    }
    public int getBiggest()
    {
    	int biggest=Integer.MIN_VALUE;
    	for(int i=0;i<size;i++)
    		if(biggest<int_arr[i])
    			biggest=int_arr[i];
    	return biggest;
    }
    public int getSmallest()
    {
    	int smallest=Integer.MAX_VALUE;
    	for(int i=0;i<size;i++)
    		if(smallest>int_arr[i])
    			smallest=int_arr[i];
    	return smallest;
    }
    public void readArray()
    {
    	Scanner scanner= new Scanner(System.in);
    	for(int i=0;i<size;i++)
    	{
    		int_arr[i]=scanner.nextInt();
    	}
    	scanner.close();
    }
    public void displayHorizontal()
    {
    	for(int i=0;i<size;i++)
    		System.out.print(int_arr[i]+" ");
    			System.out.println("\n");
    }
    public void displayVertical()
    {
    	for(int i=0;i<size;i++)
    		System.out.println(int_arr[i]+" ");
    			
    }
    public int getSecondBiggest()
    {
    	sort_array();
    	int secondBiggest=int_arr[size-1];
    	for(int i=size-2;i>=0;i--)
    	{
    		if(int_arr[i]<int_arr[i+1])
    			return int_arr[i];
    	}
    	
    	return secondBiggest;
      
    }
   public void finalize()
    {
    	int_arr=null;
    	System.gc();
    }
}
