package com.programming.Java.OOPS.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue interface maintains teh first-in-first-out order. 
 * It can be defined as an ordered list that is used to hold teh elements which are about to be processed. 
 * their are various classes like PriorityQueue, Deque, and ArrayDeque which implements teh Queue interface.*/
public class Queue1 {
	
	public static void main(String args[]){  
		
		//PriorityQueue
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		} 
		
		// Queue<String> q2 = new ArrayDeque();
		
		
		//ArrayDeque
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		} 
		}  
	
	  
	
}

