package com.java.demo.Tasks;

interface Rx{
      void Rxcompanyname();
}
 interface RoyalEnfield{
	 void REcompanyname();
}
interface HeroHonda{
	 void HHcompanyname();
}
interface Pulsar{
	 void pulsarcompanyname();

}
interface parentclass extends Rx,RoyalEnfield,HeroHonda,Pulsar{
    void companyname();
}

public class Vehicle implements parentclass {
	
	public void companyname(){
		System.out.println("Enter companyname:");
	}
	public void Rxcompanyname() {
		System.out.println("YAMAHA");
	}
	public void HHcompanyname() {
		System.out.println("HeroHonda");
	}
	public void REcompanyname() {
		System.out.println("RoyalEnfield");
	}
	public void pulsarcompanyname() {
		System.out.println("Pulsar");
	}

	public static void main(String[] args) {
		Vehicle parentObj = new Vehicle();
		
		parentObj.companyname();
		parentObj.Rxcompanyname();
		parentObj.HHcompanyname();
		parentObj.REcompanyname();
		parentObj.pulsarcompanyname();

	}
}	
	
	
	

