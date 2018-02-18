package com.map;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] ids=new int[]{10,20,30};// Arrays are Objects
		/*ids[0]=1;
		ids[1]=3;
		ids[2]=5;*/
		
		for(int i:ids){
			System.out.print(i+" ");
		}
		
		
		//collection of Arrays
		System.out.println("\n Collection of Arrays:");
		List<Integer[]>ints=new ArrayList<>();
		ints.add(new Integer[]{40,50});
		ints.add(new Integer[]{80,90,100});
		ints.add(new Integer[]{200,250,300,350});
		
		for(Integer[]values:ints){
			for(int i=0;i<values.length;i++){
				System.out.print(values[i]+" ");
			}
			
			System.out.println();
			
		}
		
	}

}
