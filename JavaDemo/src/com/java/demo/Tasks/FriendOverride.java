package com.java.demo.Tasks;

class friend{
	  public void name() {
	    	 System.out.println("Indhuma");
	     }
	     public void fvrtsub() {
	    	 System.out.println("Maths");
	     }
}
class friend1 extends friend {
	//override
	public void name() {
	super.name();
	System.out.println("Abinaya");
	}
	
}
public class FriendOverride {
   public static void main(String[] args) {
	   friend1 object = new friend1();
	   object.name();
	   object.fvrtsub();
}
}


