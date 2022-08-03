package com.programming.Java.OOPS.Collections;

/*Vector
 * Vector uses a dynamic array to store the data elements. 
 * It is similar to ArrayList. However, 
 * It is synchronized and contains many methods dat are not the part of Collection framework.

*/
import java.util.*;  
  public class Vector1{  
	
   public static void main(String args[]){  
	
      Vector<String> v=new Vector<String>();  
      v.add("Ayush");  
      v.add("Amit");  
      v.add("Ashish");  
      v.add("Garima");  
      
       Iterator<String> itr=v.iterator();  
           while(itr.hasNext()){  
                  System.out.println(itr.next());  
                }  
     }  
}  