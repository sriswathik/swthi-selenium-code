package SingletonConecpt;

	//in oop,a single class is aclass that can have only ONE object at a time
	//how to design singleton class
	//1.make constructor as private
	//2.write a public static method(getInstance) that has return type of object of this singlrton class(Lady Initialization)


//diff bet singleton and normal class

//for normal class we use constructor  method to  create the object
//for singleton class we use getInstance() method to  create the object

public class Singleton {
	public static Singleton singleton_instance=null;
	public String str;
	//create  constructor
	private Singleton() {
		str="Selenium training";
	}
	//create getInstance method,same in selenium if driver is null then create an object
	//this below is imp at the time of int  //its called lazy initilization.
	public static Singleton getInstance() {
		if(singleton_instance==null)
			singleton_instance =new Singleton();
		return singleton_instance;
		
	}
	
	public static void main(String[] args) {
		
		Singleton x= Singleton.getInstance();//only one object at a time.	pointed by x
		Singleton y= Singleton.getInstance();//it checks the cond its not equal to null it wont create object and goes to return statement;
		Singleton z= Singleton.getInstance();

		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		//if u mke change sin x,then y and z will be affected.
		
		//x,y,z points to the same object.
		z.str=(z.str.toLowerCase());
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
	}

}
