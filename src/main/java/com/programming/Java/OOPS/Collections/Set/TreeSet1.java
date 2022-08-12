package com.programming.Java.OOPS.Collections.Set;
//TreeSet
//Java TreeSet class implements the Set interface dat uses a tree for storage.
// Like HashSet, TreeSet also contains unique elements.
// However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.
//
//Consider teh following example:

import java.util.*;

public class TreeSet1{  
	
public static void main(String args[]){  
  //Creating and adding elements  
   TreeSet<String> set=new TreeSet<String>();  
      set.add("Ravi");  
      set.add("Vijay");  
      set.add("Ravi");  
      set.add("Ajay");  
//traversing elements  
    Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}

