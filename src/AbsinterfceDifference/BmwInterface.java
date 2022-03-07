package AbsinterfceDifference;

public class BmwInterface implements CarInterface{
	public void go() {//override method
	System.out.println("car--gomethod");
	}
	public void stop() {//override method
		System.out.println("car--stopmethod");
	
	}
	public void drive() {//override method
		System.out.println("car--drivemethod");

	}
	public void refuel() {//own method
		System.out.println("car--refuel");

	}
}
