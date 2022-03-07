package AbsinterfceDifference;

public abstract class AbsBank {

//Abstract:to hide the business logic we use abstraction--no method body--oops concept
		//it should have atleast one abstract method
		//we cannot create object for abstract class
		//abstraction can have variaables static ,final n normal variables
		//we can write abs n nonstatic abs methods
		//thats y it is called partial abstarction
		//to acheive 100% abstraction by interface
		//we only define abstract methods ,we cannot write logic
		// we should write all the methods business logic in child class
		//we dont write main method in bstract class
	
	//performance wise abstract classes re faster than interface
	//bcoz interface the traversing point of view (it goes from parent int n then child class 
	//where s in abstraction the abstract n nonabstract methods are present itself

	final int a=10;
		int b=20;
		
		public abstract void loan();
		
		
		//nonstatic methods
		
		public void studentloan() {
			System.out.println("AbsBank---studentloan");
		}
		public void homeLoan() {
			System.out.println("AbsBank---homeLoan");
		}
		public void eduLoan() {
			System.out.println("AbsBank--eduLoan");
		}
	}

