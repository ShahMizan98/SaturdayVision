package com.upskill.java_3;

public class Loops {
		
		 /* 	
		 Types of Loops 
			1. For Loop
			2. While Loop
			3. Do While Loop  
			4. Infinite Loop
 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestedForLoop();
		
		
    }
	
	public static void practiceForLoop(){
		int i;
		for(i =1; i <=100; i++){
			System.out.println(i);
		}
			
	}




     public static void practiceWhileLoop() {
    	 int i = 1;
    	 while(i<=10){	 
    		 System.out.println("While Loops Number = " + i);
    		 i++;
    		 
    	 }
    	 
    	  
    }
     
     public static void practiceDoWhileLoop() {
    	 int i = 1;
    	 do {
    		 System.out.println("Do While Loops Number = " + i);
    		 i++;
    	 } while (i<=0);
    	 
     }
    	 
    	 public static void practiceInfiniteLoop(){
    			int i ;
    			for(i =1;  ; i++){
    				System.out.println("Infinite Loops Number");
    				
    			}
         }
    	 
    	 
    	 
    	 public static void practiceNestedForLoop(){
 			int i ;
 			int j ;
 			
 			for(i=1; i<=10; i++){
 				for (j = 1; j<10; j++){
 					int multipicationTable = i * j;
 					System.out.print(multipicationTable + " ");
 				}
 				System.out.println(" ");
 				
 			}
    	 }
}
    	 
    	 
