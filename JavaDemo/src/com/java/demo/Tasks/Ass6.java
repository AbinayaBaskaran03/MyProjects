package com.java.demo.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
public class Ass6 {
	
		    private String name;
		    private String email;
		    private String city;
		    private String state;
		    private String country;
		    public Ass6(String name, String email, String city, String state, String country) {
		        this.name = name;
		        this.email = email;
		        this.city = city;
		        this.state = state;
		        this.country = country;
		        }

				public static void main(String[] args) {
		    	    Scanner sc = new Scanner(System.in);
					System.out.print("Enter the number of customers: ");
				    int n = sc.nextInt();
					
					 ArrayList<Ass6> ll = new ArrayList<Ass6>();
					
					 for (int i = 0; i < n; i++)
					 {
						  System.out.printf("Enter details for customer %d:%n", i+1);
					      System.out.print("Name: ");
					      String name = sc.next();
					      System.out.print("Email: ");
					      String email = sc.next();
					      System.out.print("City: ");
					      String city = sc.next();
					      System.out.print("State: ");
					      String state = sc.next();
					      System.out.print("Country: ");
					      String country = sc.next();
					      Ass6 obj = new Ass6(name, email, city, state, country);
					      ll.add(obj);
			         }
				     System.out.println("Customer Details");
					 for(Ass6 a1 : ll) {
					 System.out.println("Name:"+a1.name +"    "+"Email:"+ a1.email +"    "+"City:"+ a1.city +"    "+"State:"+ a1.state +"    "+"Country:"+ a1.country);
					 }
					
					  Map<String, Map<String, Map<String, List<Ass6>>>> groupedCustomers = new HashMap<>();
					  for (Ass6 a1:ll)
					  {
						  String country =a1.country;
					      String state = a1.state;
					      String city = a1.city;
					      groupedCustomers.computeIfAbsent(country, k-> new HashMap<>()).computeIfAbsent
					      (state, k -> new HashMap<>()).computeIfAbsent(city,k-> new ArrayList<>()).add(a1);
					  }
					// Print country-wise total customers
					  System.out.println("Country-wise Total Customers:");
					  for (Map.Entry<String, Map<String, Map<String, List<Ass6>>>> countryEntry : groupedCustomers.entrySet()) {
						 
					      String country = countryEntry.getKey();
					      int totalCustomers = 0;
					      for (Map.Entry<String, Map<String, List<Ass6>>> stateEntry : countryEntry.getValue().entrySet()) {
					    	  for (List<Ass6> cityList : stateEntry.getValue().values()) {
					    		  totalCustomers += cityList.size();
					    		  }
					    	  }
					      System.out.println(country + ": " + totalCustomers + " customers");
					      }
				
				// Print country-wise and state-wise customers
				System.out.println("Country and State-wise Customers:");
				for (Map.Entry<String, Map<String, Map<String, List<Ass6>>>> countryEntry : groupedCustomers.entrySet()) {
				  String country = countryEntry.getKey();
						  for (Map.Entry<String, Map<String, List<Ass6>>> stateEntry : countryEntry.getValue().entrySet()) {
					      String state = stateEntry.getKey();
					      int stateTotalCustomers = 0;
					      for (List<Ass6> cityList : stateEntry.getValue().values()) {
					    	  stateTotalCustomers += cityList.size();
					    	  }
					      System.out.println(country + ", " + state + ":" +stateTotalCustomers + "customers");
					      }
						  
					// Print country-wise, state-wise, and district-wise customers
					  System.out.println("Country, State and City-wise Customers");
					  // Group customers by country, state, and district
					  Map<String, Map<String, Map<String, List<Ass6>>>> countryStateCityMap = new HashMap<>();
					  for (Ass6 a1:ll) {
						  String country1 =a1.country;
					      String state = a1.state;
					      String city = a1.city;
					      // Group customers by district
					      if (!countryStateCityMap.containsKey(country1)) {
					          countryStateCityMap.put(country1, new HashMap<>());
					      }
					      if (!countryStateCityMap.get(country1).containsKey(state)) {
					          countryStateCityMap.get(country1).put(state, new HashMap<>());
					      }
					      if (!countryStateCityMap.get(country1).get(state).containsKey(city)) {
					          countryStateCityMap.get(country1).get(state).put(city, new ArrayList<>());
					      }
					      countryStateCityMap.get(country1).get(state).get(city).add(a1);
					  }
					  // Print country-wise, state-wise, and district-wise customers
					  for (Map.Entry<String, Map<String, Map<String, List<Ass6>>>> countryEntry1 :  countryStateCityMap.entrySet())
					  {
					      String country1 = countryEntry1.getKey();
					      int countryCustomerCount = 0;
					      System.out.println("Country: " + country1);
					      for (Map.Entry<String, Map<String, List<Ass6>>> stateEntry : countryEntry1.getValue().entrySet())
					      {
					          String state = stateEntry.getKey();
					          int stateCustomerCount = 0;
					          System.out.println("State: " + state);
					          for (Map.Entry<String, List<Ass6>> districtEntry : stateEntry.getValue().entrySet())
					          {
					              String district = districtEntry.getKey();
					              List<Ass6> customersInDistrict = districtEntry.getValue();
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
		}
	}


