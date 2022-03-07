package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListConcept {

	public static void main(String[] args) {	
		
		//int i[]=new int[3];//static array size is fixed
	
		//dynamic array---arrayList
		//can contain duplicate values
		//maintains insertion order
		//Synchronized
		//allows random access to fetch the element because it stores values on the basis of indexes.
		
		ArrayList ar=new ArrayList();//arraylist is the predefined class
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("swathi");
		ar.add('M');
        ar.add(12.33);		
		
        System.out.println(ar.size());//to know the size of arraylist
		System.out.println(ar.get(1));//to get the value from an index
		
		//to print /retrieve all the values from arraylist
		
		for(int i1=0; i1<ar.size(); i1++) {
			System.out.println(ar.get(i1));
		}
		
		//generic vs non generic
		
		//17th line is showing some warning--ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		//b4 jdk 1.5 generics was not supported after jdk1.5 it is
		//ar2 is defined with integer.
		//we use generics in java----<datatype>
		ArrayList<Integer> ar2=new ArrayList<Integer>();//now warning is not showing for arraylist
		
		//we can use only integer
		
		ar2.add(29);
		ar2.add(899);
		//ar2.add("swathi");//cant add other datatypes 
		//this concept is called generics in java
		
	//we can store diff datatypes and also specific dtatypes
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("Swathi");
		
		
		//if u dont know what type of data we get during runtime ot sure about the dtatype then use "E"

		//ArrayList<E> ar4=new ArrayList<E>();//generally we dont use bcoz we re awre of what data will come
	//inside this arraylist object we can store diff class objs.	
		//we can store dtatypes primitive n nonprimitive n we can store some class object also//no69
		//***********************************************
		//see classname employee
		//employee class objects
		employee e1=new employee("swathi",25,988);
			employee e2=new employee("sam",54,8787);
			employee e3=new employee("dan",87,9800);
			
			
		ArrayList<employee> ar5=new ArrayList<employee>();
		ar5.add(e1);
		ar5.add(e2);
		ar5.add(e3);
        
		//iterator to transverse the values
		
		Iterator<employee> it=ar5.iterator();
		while(it.hasNext()) {
			employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
            System.out.println(emp.marks);			
		}
		
//**************
		
		//addall();

		ArrayList<String> ar0=new ArrayList<String>();
		ar0.add("Swathi");
		ar0.add("selenium");
        ar0.add("qtp");
        
		ArrayList<String> ar9=new ArrayList<String>();
		ar9.add("Swathi");
		ar9.add("selenium");
        ar9.add("qtp");
        
        //we can add 1st arraylist to 2nd list
ar0.addAll(ar9);	//to print all values:for loop
        
        for(int i=0;i<ar9.size();i++)
        {
        	System.out.println(ar9.get(i));
        }
		System.out.println("***************");
        //removeall
        ar0.removeAll(ar9);
        for(int i=0;i<ar9.size();i++)
        {
        	System.out.println(ar9.get(i));
        }
		//retain all---if u want to check common value
        ArrayList<String> r=new ArrayList<String>();
		r.add("Swathi");
		r.add("selenium");
        r.add("qtp");
        System.out.println("***********");
        ArrayList<String> r0=new ArrayList<String>();
		r0.add("Swathi");
        r0.add("qtp");
        
        r.retainAll(r0);
        for(int j=0;j<r0.size();j++)
        {
        	System.out.println(r0.get(j));
        }
        
	}

}











































