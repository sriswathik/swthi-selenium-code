package AbsinterfceDifference;

public class CarInterfa {

	public static void main(String[] args) {
		//we cannot create object for instance
				BmwInterface bmw=new BmwInterface();
				bmw.drive();
				bmw.go();
				bmw.stop();
				bmw.refuel();
				
				//dynamic polymorphism
				//interface=parent
						
				CarInterface c	=new BmwInterface();
				
				c.stop();
				c.drive();
				c.go();
				
			}
	}


