package com.sapient.week4;

import java.util.Scanner;

public class Matrix {
	 int[][] matrix_array;
	    int m,n;
	    Matrix()
	    {
	    	m=n=3;
	    	matrix_array=new int[3][3];
	    	for(int i=0;i<3;i++)
	    		matrix_array[i]=new int[3];
	    	
	    }
	    Matrix(int a)
	    {
	    	m=n=a;
	    	matrix_array=new int[m][n];
	    	for(int i=0;i<m;i++)
	    		matrix_array[i]=new int[n];
	    	
	    }
	    Matrix(int a,int b)
	    {
	    	m=a;
	    	n=b;
	    	matrix_array=new int[m][n];
	    	for(int i=0;i<m;i++)
	    		matrix_array[i]=new int[n];
	    	
	    }
	    Matrix(int[][] a)
	    {
	    	m=a.length;
	    	n=a[0].length;
	    	matrix_array=a;
	    }
	    Matrix(Matrix a)
	    {
	    	m=a.m;
	    	n=a.n;
	    	
	    	matrix_array=new int[m][n];
	    	for(int i=0;i<m;i++)
	    		matrix_array[i]=new int[n];
	    	for(int i=0;i<m;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    			matrix_array[i][j]=a.matrix_array[i][j];
	    	}
	    }
	    public void readMatrix()
	    {
	    	Scanner scanner= new Scanner(System.in);
	    	for(int i=0;i<m;i++)
	    	{
	    		for(int j=0;j<n;j++)
	    		matrix_array[i][j]=scanner.nextInt();
	    	}
	    	scanner.close();
	    }
	    public void displayMatrix()
	    {
	    	for(int i=0;i<m;i++) {
	    		for(int j=0;j<n;j++)
	    			System.out.print(matrix_array[i][j]+" ");	
	    		System.out.println("\n");
	    	}
	    		
	    			
	    }
       public boolean isScalar()
       {
    	   for(int i=0;i<m;i++) {
	    		for(int j=0;j<n;j++)
	    			if(i==j&&matrix_array[i][j]!=matrix_array[0][0])
	    				return false;
	    			else if(matrix_array[i][j]!=0)
	    				return false;
	    			
	    	}
    	   return true;
    	   
       }
       public Matrix addMatrix(Matrix a)
       {
    	   if(m==a.m&&n==a.n) {
    		   Matrix result =new Matrix(this);
        	   for(int i=0;i<m;i++)
        	   {
        		   for(int j=0;j<n;j++)
        			   result.matrix_array[i][j]+=a.matrix_array[i][j];
        	   }  
        	   return result;
    	   }
    	   else return null;
    	  
       }
       public Matrix multiplyMatrix(Matrix a)
       {
    	   if(n==a.m)
    	   {
    		   Matrix result =new Matrix(m,a.n);
    		   for(int i=0;i<m;i++)
        	   {
    			  
        		   for(int j=0;j<n;j++) {
        			   
        			   for(int k=0;k<a.n;k++)
        			   {
        				   result.matrix_array[i][k]+=matrix_array[i][j]*a.matrix_array[j][k];

        			   }
        		   }
        			          	   }  
        	   return result;
    	   }
    	   else
    		   return null;
       }
	   public void finalize()
	    {
		   for(int i=0;i<m;i++) {
			   matrix_array[i]=null;
		   }
		   matrix_array=null;
	    	System.gc();
	    }
}
