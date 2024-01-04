package com.java.demo;

public class Assingment1 {
	private Integer rollno;
    private String name;
    private String fathername;
    private double percentage;
    private char grade;
    private boolean isGraduated;
    private static long mobileno; //static variable
    private final static String collegename  = "AVVM"; //final static variable
    
    public void setRollno(Integer  number ) { 
    	this.rollno = number;
    }
    public Integer getRollno() {
       return this.rollno;
    }
   /* public static void mobileno(){ //static method
    	System.out.println(9751533125l);
    }*/
    public final static  void collegeid() {
    	System.out.println("Emailid:sripushpamcollege@gmail.com");
    }
    //default
    public Assingment1() {
    	
    }
   // User defined
    public Assingment1(String name,Integer rollno,String fathername,double percentage, char grade,boolean isGraduated,long mobileno) {	
    	this. name = name; 
    	this.rollno =rollno;
    	this.fathername = fathername;
    	this.percentage = percentage;
    	this.grade =  grade;
    	this.isGraduated = isGraduated;
    	//this.mobileno = mobileno;
    }

    public static void main(String[] args) {
    	   Assingment1 indhraObj=new Assingment1(); //object r instance variable
    	   
    	  
    	   
    	   indhraObj.setRollno(1012);
    	   
    	   System.out.println("Roll no:"+indhraObj.getRollno());
    	    
    	//studentObj.rollno=1012;
    	   indhraObj.name="Indhra";
    	   indhraObj.fathername="Ramadass";
    	   indhraObj.percentage=89.02;
    	   indhraObj.grade='A';
    	   indhraObj.isGraduated=true;
    	//   indhraObj.mobileno=9751533125l;
    	
    Assingment1 abinayaObj = new Assingment1("Abhinaya",8902,"Baskaran",98.20,'B',false,6384162478l);
    
    	//method variable
 String studentDetails=indhraObj.name+" "+indhraObj.rollno+" "+indhraObj.fathername+" "+indhraObj.percentage+" "+indhraObj.grade+" "+indhraObj.isGraduated+" "+/*indhraObj.mobileno*/" "+indhraObj.collegename;
     
     System.out.println(studentDetails);
     System.out.println("*************************************************************");
     System.out.println(abinayaObj.name+" "+abinayaObj.rollno+" "+abinayaObj.fathername+" "+abinayaObj.percentage+" "+abinayaObj.grade+" "+abinayaObj.isGraduated+" "+/*abinayaObj.mobileno*/" "+abinayaObj.collegename);
       //  Student.mobileno();
           Assingment1.collegeid();
      
	}
}
