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
		
		
		System.out.println("\nAn array of Vehicles:");
		Vehicle[] vehicles=new Vehicle[]{
			new Vehicle("T001","Toyota"),
			new Vehicle("C005","Corolla"),
			new Vehicle("L008","Lamburgini")
		};
		
		for(Vehicle v:vehicles){
			System.out.println(v.getPlateNo()+" "+v.getModel());
		}
		
		// List of an Array of Vehicles
		System.out.println("\n List of Veicle Array");
		List<Vehicle[]> vehicleList=new ArrayList<Vehicle[]>();
				vehicleList.add(new Vehicle[]{new Vehicle("N","Nissan"),new Vehicle("T","Toyota")});
				vehicleList.add(new Vehicle[]{new Vehicle("I","Isuzu"),new Vehicle("F","FSR")});
				vehicleList.add(new Vehicle[]{new Vehicle("B","Public Bus")});
				vehicleList.add(new Vehicle[]{new Vehicle("S","Students Bus"),new Vehicle("Tr","Truck")});
				
			//display each Array of the list
				for(Vehicle[] vArray:vehicleList){
					for(Vehicle v:vArray){
						System.out.println(v.getPlateNo()+" ==> "+v.getModel());
					}
					System.out.println();
				}
		
		
		
		
		
		
	}

}
