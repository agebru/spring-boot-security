package com.map;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DriverTest {
	
	  public static Vehicle[] vehicles = {
			    new Vehicle("Toyota-01","Toyota"), 
			    new Vehicle("Yaris-02","Yaris"),
			    new Vehicle("Isuzu-03","Isuzu") 
			  };

	    public static Driver[][] drivers = { 
	     {new Driver("001","Amanuel", "Kahsay", 28),new Driver("002","Abebe", "Hagos", 30) },
	      { new Driver("005","Belay", "Haftu", 36),new Driver("006","Melaku", "Tegegne", 32),
	    	 new Driver("007","Tetemke", "Gebru", 29) }, 
	      { new Driver("010","Pete", "Cherkos", 40), new Driver("011","Yonas", "Kidane", 37)} 
	     };


	public static void main(String[] args) {
		
		Map<Vehicle, Set<Driver>> personnel = new HashMap<Vehicle, Set<Driver>>();

        for (int i = 0; i < vehicles.length; i++) 
        {
            Vehicle vehicle = vehicles[i];
            Driver[] driversList = drivers[i];

            Set<Driver> driverSet = new LinkedHashSet<Driver>();

            for (Driver driver : driversList) {
                driverSet.add(driver);
            }

            personnel.put(vehicle, driverSet);
        }
        
        
          { // Brackets just to scope driversList variable so can use again later
            // Example usage
        	  
        	  System.out.println("\n ====Inside Block scope ====\n");
        	for(Vehicle v:personnel.keySet()){        		
            Set<Driver> driversList = personnel.get(v);

            for (Driver driver : driversList) {
                System.out.println(driver);
            }
         }
       }
		
          
          // Iterate through whole thing
          System.out.println("\n ====Iterating through Whole thing ====\n");
          for (Vehicle vehicle : personnel.keySet()) {
              System.out.print(vehicle);
              System.out.print(": ");
              Set<Driver> driversList = personnel.get(vehicle);

              for (Driver driver : driversList) {
                  System.out.print(driver);
                  System.out.print(" ");
              }
              
              System.out.println();
          }

	}

}
