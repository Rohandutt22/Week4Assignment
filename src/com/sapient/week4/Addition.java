package com.sapient.week4;

public class Addition implements Num_Process{

	@Override
	public int cal(int a, int b) {

       Num_Process num_process=(int x,int y)->x+y;
      int sum= num_process.cal(a, b);
		return sum;
	}
	

}
