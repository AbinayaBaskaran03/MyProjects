package com.java.demo;
public class Customer {
    int customerId;
    String name;
    String place;
    long customerno;
 //user defined constructor  
    Customer(int customerId,String name,String place,long customerno){
    this.customerId = customerId;
    this.name = name;
    this.place = place;
    this.customerno = customerno;
    }
    public String toString() {
    return customerId+","+name+","+place+","+customerno;
    }
    public static void main(String[] args) {
    	Customer detail1 = new Customer(1012,"Indhu","Kovilur",9751533126l);
    	Customer detail2 = new Customer(2545,"kalai","Thanjavur",6384156258l);
    	System.out.println(detail1);
    	System.out.println(detail2);

	}
}
