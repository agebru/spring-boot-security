package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		List<String> brothers=new ArrayList<>();
		brothers.add("Amanuel");
		brothers.add("Hagos");
		brothers.add("Belay");
		brothers.add("Zeru");
		
		List<String> EuropeCountries=new ArrayList<>();
		EuropeCountries.add("Germany");
		EuropeCountries.add("France");
		EuropeCountries.add("Italy");
		EuropeCountries.add("Nedtherlands");
		EuropeCountries.add("Norway");
		EuropeCountries.add("Georgia");
		
		List<Double> salaries=new ArrayList<>();
		salaries.add(550000.5);
		salaries.add(52000.6);
		salaries.add(100000.0);
		salaries.add(36000.0);
		
		
		
		//
		Map<String,List<?>>peopleMap=new HashMap<>();
		peopleMap.put("Europe", EuropeCountries);
		peopleMap.put("Average-Salaries", salaries);
		peopleMap.put("Brothers", brothers);
		
		
		// displaying contents of the map:
		
		for(String key: peopleMap.keySet()){
			System.out.println(key+" ==> "+peopleMap.get(key));
		}
		
		// display European countries their name starts with N
		
		if(peopleMap.containsKey("Europe")){
		List<?> europe=peopleMap.get("Europe");
			//System.out.println("Europen Countries: "+europe);
		        System.out.println("\nEuropen Countries With starting name N: ");
			for(Object country:europe){
				if(country.toString().startsWith("N")){
					System.out.print("\t"+country+" , ");
				}
			}
		}
		
		
		System.out.println("\nUnsorted Map:"+peopleMap);
		// Sorting map	based on keys	
		Map<?, List<?>> sortedMap=new TreeMap<>(peopleMap);
		System.out.println("\nSotred Map:"+sortedMap);
		
	}

}
