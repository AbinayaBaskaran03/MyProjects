package com.java.demo;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Assingnment6 {
	
	  private String name;
	  private String district;
      private String state;
	  private String country;
	  
 public Assingnment6(String name,String district, String state, String country) {
		 this.name = name;
		 this.district = district;
		 this.state = state;
		 this.country = country;
	}
	 public static void main(String[] args) {
		  Scanner value = new Scanner(System.in);
		  System.out.println("Enter no of customers:");
		  int a = value.nextInt();
			  
		 ArrayList<Assingnment6> cus = new ArrayList<Assingnment6>();
				 
		    for( int i = 0;i<a;i++) {
				System.out.printf("Enter customer %d:%n",i+1);
				System.out.println("Name:");
				String name = value.next();
				System.out.println("District:");
				String district = value.next();
				System.out.println("State:");
				String state = value.next();
				System.out.println("Country:");
				String country = value.next();
	Assingnment6 cusObj = new Assingnment6(name,district,state,country);
	cus.add(cusObj);
				 }
	System.out.println("Customer Details:");
	for(Assingnment6 x:cus) {
System.out.println("Name:"+x.name +" "+"District:"+ x.district +" "+"State:"+ x.state +" "+"Country:"+ x.country);
	}
			  
	 Map<String, Map<String, Map<String, List<Assingnment6>>>> groupCustomers = new HashMap<>();
	 for (Assingnment6 x:cus)
	 {
		 String country =x.country;
		 String state = x.state;
		 String district = x.district;
		 groupCustomers.computeIfAbsent(country, k-> new HashMap<>()).computeIfAbsent
	  (state, k -> new HashMap<>()).computeIfAbsent(district,k-> new ArrayList<>()).add(x);
				  }
	 System.out.println("Country wise total customer:");
for (Map.Entry<String, Map<String, Map<String, List<Assingnment6>>>> countryEntry : groupCustomers.entrySet()) {
	 
     String country = countryEntry.getKey();
     int total = 0;
     for(Map.Entry<String, Map<String, List<Assingnment6>>> stateEntry : countryEntry.getValue().entrySet()) {
	for (List<Assingnment6> districtList : stateEntry.getValue().values()) {
						    		  total += districtList.size();
						    		  }
						    	  }
     System.out.println(country + ": " + total + " customers");

}
       System.out.println("Country and State-wise Customers:");
       
for (Map.Entry<String, Map<String, Map<String, List<Assingnment6>>>> countryEntry : groupCustomers.entrySet()) {
       String country = countryEntry.getKey();
for (Map.Entry<String, Map<String, List<Assingnment6>>> stateEntry : countryEntry.getValue().entrySet()) {
       String state = stateEntry.getKey();
      int stateTotCustomers = 0;
      for (List<Assingnment6> districtList : stateEntry.getValue().values()) {
    	  stateTotCustomers += districtList.size();
	 }
 	   System.out.println(country + ", " + state + ":" +stateTotCustomers + "customers");
}
       System.out.println("Country, State and district-wise Customers");
       
  Map<String, Map<String, Map<String, List<Assingnment6>>>> Map = new HashMap<>();
  for (Assingnment6 cusObj:cus) {
	  String country1 =cusObj.country;
      String state = cusObj.state;
      String district =  cusObj.district;
     if (!Map.containsKey(country1)) {
    	  Map.put(country1, new HashMap<>());
      }
      if (!Map.get(country1).containsKey(state)) {
    	  Map.get(country1).put(state, new HashMap<>());
      }
      if (!Map.get(country1).get(state).containsKey(district)) {
    	  Map.get(country1).get(state).put(district, new ArrayList<>());
      }
      Map.get(country1).get(state).get(district).add(cusObj);
  }
for (Map.Entry<String, Map<String, Map<String, List<Assingnment6>>>> countryEntry1:Map.entrySet() )
  {
      String country1 = countryEntry1.getKey();
      int countryCustomerCount = 0;
      System.out.println("Country: " + country1);
      for (Map.Entry<String, Map<String, List<Assingnment6>>> stateEntry : countryEntry1.getValue().entrySet())
      {
          String state = stateEntry.getKey();
          int stateCustomerCount = 0;
          System.out.println("State: " + state);
          for (Map.Entry<String, List<Assingnment6>> districtEntry : stateEntry.getValue().entrySet())
          {
              String district = districtEntry.getKey();
              List<Assingnment6> customersInDistrict = districtEntry.getValue();
              int districtCustomerCount = customersInDistrict.size();
              System.out.println("District: " + district + " (" + districtCustomerCount + " customers)");
              stateCustomerCount += districtCustomerCount;
              countryCustomerCount += districtCustomerCount;
          }
          System.out.println("Total customers in " + state + ": " + stateCustomerCount);
      }
      System.out.println("Total customers in " + country1 + ": " + countryCustomerCount);
      System.out.println();
  }
}
value.close();
}
}




  	
     
       

