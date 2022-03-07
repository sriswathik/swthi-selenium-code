package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
//Important
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("selenium");
		l.add("java");
		l.add("test");
		l.add("qtp");
		//print
		System.out.println("contents of linkedlist"+l);
		//addfirst
		l.addFirst("swathi");
		//addlast
		l.addLast("automation");
		System.out.println("contents of linkedlist"+l);
       //get
		System.out.println(l.get(0));
		//set
		l.set(0,"pavan");
		System.out.println(l.get(0));
		//remove first n last
		l.removeFirst();
		l.removeLast();
		System.out.println("contents of linkedlist"+l);
 
		l.remove(3); 
		
		//how to iteraate/print all values of linkedlist
		
		//for loop
		
		//advance for loop
		
		//while loop
		
		//iterator
		System.out.println("*****using for loop*******8");
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("********using advance forloop");
		
		for(String str : l)
		{
			System.out.println(str);
		}
		//iterator
		
		System.out.println("*********using iterataor");
		
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		//while loop
		System.out.println("**********while loop");
		int num=0;
		while(l.size()>num) {
			System.out.println(l.get(num));
			num++;
		}
	}

}
