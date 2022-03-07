package AbsinterfceDifference;

public interface CarInterface {

	
	//we can only define method-no method body
	//we cannot create object for interface
	//by default its abstract in nature --no need to mention abstract method
	//we acheive 100% abstraction.--we can write only abstract methods,we cnnot write normal methods.
	//class-interface-->implements//in interface we hide complete business logic just method prototype 
	
	//in interface we can define only final and static variables
	 int wheels=4;//by default its static n final
	 
			
	public void go();
	public void stop();
	public void drive();
	//like abstraction we cnnot write normal methods with business logic 
	

	//when to use abstract class n when to use interface
	//whenever we want to ACHEIVE partial abs in that case use abs
	//when we want to define common logic for few methods,n some features/methods we want to hide some features
	//then create as abstract methods
	
	//but when we hide all the methods business logic write interface.
}
