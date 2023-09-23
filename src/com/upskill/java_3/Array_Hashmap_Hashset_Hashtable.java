package com.upskill.java_3;

import java.util.HashMap;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		//Array store multiple data using index
		int age = 30; 
		int[] ageVision = new int[]{21, 26, 28, 30, 35};
		
		//Array index                [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageVision[2]);
		System.out.println("Total student : " + ageVision.length);

	
	 
	     String [] nameVision = new String [] { "Mizan", "Fahim", "Hafiz", "Jabed"};
	     
	           System.out.println("Student Name : " + nameVision[3]);
	           System.out.println("Total Student : " + nameVision.length);
	           


	           
	           
	     	
             //Array store multiple data using key-value pair, Implementaion of interface
                HashMap<String, Integer> Student = new HashMap<String, Integer>();
                
                Student.put("Tayeba", 21);
                Student.put("Samul", 19);
                Student.put("Mili", 23);	
                Student.put("Riyan", 22);
                Student.put("jabed", 26);
                
                System.out.println("Hashmap Student Age : " + Student.get("Mili"));
                	
	}
	      

   }

	
	


