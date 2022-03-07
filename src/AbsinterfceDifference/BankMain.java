package AbsinterfceDifference;

public class BankMain {

	public static void main(String[] args) {
		//we cannot create obj of abstract class
		absSbiBank ab=new absSbiBank();
		
		ab.studentloan();
		ab.eduLoan();
		ab.hbuyg();
		ab.homeLoan();
		ab.loan();
		
		//we can access all the abstract methods n child own methods;
		
		//but if u want to hide 1method business logic
		

		//dynamic polymorphism
		//creating the child obj n refer it to parent ref var;
		
		AbsBank abs=new absSbiBank();
		//we cant access child own methods
		abs.homeLoan();
		abs.loan();
		abs.eduLoan();
		abs.studentloan();
		
		//can we create abstract AbsBank class object
		//npo bcoz we cannot create objct for abstract.
	}

}
