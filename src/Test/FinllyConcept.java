package Test;

public class FinllyConcept {

	public static void main(String[] args) {
//test1();
		//test2();
		division();
		division1(); 
	}
 public static void test1() {//by using static method we can call directly by method name
	 System.out.println("test1");
	  try {
		 System.out.println("try");
		 throw new RuntimeException("swathi");
		 
		 //we can throw an exception deliberately
		 
	 }
	 catch(Exception e) {
		 System.out.println("catch");
	 }
	 
	 finally//will write finally block after try n catch,whaatever the exception it goes to finally 
	 //block n it will get executed.
	 {
		 System.out.println("finally ");
	 }
	 
 }
 //one more example
 
 public static void test2()
 {
	 System.out.println("test2");
	 try {
		 System.out.println("test2try");
	 }
	 finally {
		 System.out.println("test2 finally");
	 }
	 
	 //Realtime exception-----Interview Question
	 
	 //in java anything cannot bedivided by zero 
 } 
	 public static void division(){
		int x=10;
		
		try {
			System.out.println("inside try method");
			int k=x/0;
		}
		catch(ArithmeticException e) {
			
			System.out.println("catch block");
			System.out.println("cannot be divided");
			}
		finally {
			System.out.println("finally block");
		}
		
	 }
		 public static void division1(){
				int m=10;
				
				try {
					System.out.println("inside try method");
					int j=m/0;
				}
				catch(NullPointerException e) {
					
					System.out.println("catch block");
					System.out.println("cannot be divided");//we are expecting arithmetic exception so it wont go catch block
					}//exception is thrown but nodbody is going to catch it so jump into finally
				finally {
					System.out.println("finally block");
				}
				 }
 
 
 //ex:database connectivity we connect to database to terieve the data we write close the connection method in finally.
 
}
